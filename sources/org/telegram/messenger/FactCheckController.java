package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.LongSparseArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.DarkAlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda34;

public class FactCheckController {
    private static AlertDialog currentDialog;
    private boolean clearedExpiredInDatabase;
    public final int currentAccount;
    private static volatile FactCheckController[] Instance = new FactCheckController[4];
    private static final Object[] lockObjects = new Object[4];
    private final LongSparseArray<TLRPC.TL_factCheck> localCache = new LongSparseArray<>();
    private final LongSparseArray<HashMap<Key, Utilities.Callback<TLRPC.TL_factCheck>>> toload = new LongSparseArray<>();
    private final ArrayList<Key> loading = new ArrayList<>();
    private final Runnable loadMissingRunnable = new ANRDetector$$ExternalSyntheticLambda0(this, 19);

    public static class Key {
        public final long dialogId;
        public final long hash;
        public final int messageId;

        private Key(long j, int i, long j2) {
            this.dialogId = j;
            this.messageId = i;
            this.hash = j2;
        }

        public static Key of(MessageObject messageObject) {
            TLRPC.Message message;
            if (messageObject == null || (message = messageObject.messageOwner) == null || message.factcheck == null) {
                return null;
            }
            return new Key(messageObject.getDialogId(), messageObject.getId(), messageObject.messageOwner.factcheck.hash);
        }

        public int hashCode() {
            long j = this.hash;
            return (int) (j ^ (j >>> 32));
        }
    }

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
    }

    private FactCheckController(int i) {
        this.currentAccount = i;
    }

    private void clearExpiredInDatabase() {
        if (this.clearedExpiredInDatabase) {
            return;
        }
        this.clearedExpiredInDatabase = true;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new MessagesStorage$$ExternalSyntheticLambda1(messagesStorage, 1));
    }

    private void getFromDatabase(ArrayList<Key> arrayList, Utilities.Callback<ArrayList<TLRPC.TL_factCheck>> callback) {
        if (callback == null) {
            return;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            callback.run(new ArrayList<>());
        } else {
            MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            messagesStorage.getStorageQueue().postRunnable(new FileLoader$$ExternalSyntheticLambda0(messagesStorage, arrayList, callback, 19));
        }
    }

    public static FactCheckController getInstance(int i) {
        FactCheckController factCheckController;
        FactCheckController factCheckController2 = Instance[i];
        if (factCheckController2 != null) {
            return factCheckController2;
        }
        synchronized (lockObjects[i]) {
            try {
                factCheckController = Instance[i];
                if (factCheckController == null) {
                    FactCheckController[] factCheckControllerArr = Instance;
                    FactCheckController factCheckController3 = new FactCheckController(i);
                    factCheckControllerArr[i] = factCheckController3;
                    factCheckController = factCheckController3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return factCheckController;
    }

    public void lambda$applyFactCheck$14(TLObject tLObject) {
        MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
    }

    public void lambda$applyFactCheck$15(TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, AlertDialog alertDialog) {
        if (tLObject instanceof TLRPC.Updates) {
            Utilities.stageQueue.postRunnable(new FileLog$$ExternalSyntheticLambda3(2, this, (TLRPC.Updates) tLObject));
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                boolean z2 = tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text);
                if (z2 || !z) {
                    FactCheckController$$ExternalSyntheticOutline0.m(z2 ? R.string.FactCheckDeleted : R.string.FactCheckEdited, BulletinFactory.of(safeLastFragment), z2 ? R.raw.ic_delete : R.raw.contact_check);
                }
            }
        }
        alertDialog.dismiss();
    }

    public void lambda$applyFactCheck$16(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, AlertDialog alertDialog, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new MessagesStorage$$ExternalSyntheticLambda112(this, tLObject, tL_textWithEntities, z, alertDialog, 1));
    }

    public static void lambda$clearExpiredInDatabase$7(MessagesStorage messagesStorage) {
        try {
            messagesStorage.getDatabase().executeFast("DELETE FROM fact_checks WHERE expires > " + System.currentTimeMillis()).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$getFactCheck$0(Key key, MessageObject messageObject, TLRPC.TL_factCheck tL_factCheck) {
        this.localCache.put(key.hash, tL_factCheck);
        messageObject.messageOwner.factcheck = tL_factCheck;
    }

    public static void lambda$getFromDatabase$5(MessagesStorage messagesStorage, ArrayList arrayList, Utilities.Callback callback) {
        ArrayList arrayList2 = new ArrayList();
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                SQLiteDatabase database = messagesStorage.getDatabase();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    arrayList3.add(Long.valueOf(((Key) obj).hash));
                    arrayList2.add(null);
                }
                sQLiteCursorQueryFinalized = database.queryFinalized("SELECT data FROM fact_checks WHERE hash IN (" + TextUtils.join(", ", arrayList3) + ")", new Object[0]);
                while (sQLiteCursorQueryFinalized.next()) {
                    NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                    TLRPC.TL_factCheck tL_factCheckTLdeserialize = TLRPC.TL_factCheck.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                    if (tL_factCheckTLdeserialize != null) {
                        int i2 = -1;
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            if (tL_factCheckTLdeserialize.hash == ((Key) arrayList.get(i3)).hash) {
                                i2 = i3;
                            }
                        }
                        if (i2 >= 0 && i2 < arrayList2.size()) {
                            arrayList2.set(i2, tL_factCheckTLdeserialize);
                            break;
                        } else {
                            break;
                            break;
                        }
                    }
                }
                sQLiteCursorQueryFinalized.dispose();
            } catch (Exception e) {
                FileLog.e(e);
                if (sQLiteCursorQueryFinalized != null) {
                    sQLiteCursorQueryFinalized.dispose();
                }
            }
            AndroidUtilities.runOnUIThread(new MessagesStorage$$ExternalSyntheticLambda256(callback, arrayList2, 1));
        } catch (Throwable th) {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
            }
            throw th;
        }
    }

    public void lambda$loadMissing$1(TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap map) {
        ArrayList arrayList2 = new ArrayList();
        if (tLObject instanceof Vector) {
            ArrayList<T> arrayList3 = ((Vector) tLObject).objects;
            for (int i = 0; i < arrayList3.size(); i++) {
                if (arrayList3.get(i) instanceof TLRPC.TL_factCheck) {
                    arrayList2.add((TLRPC.TL_factCheck) arrayList3.get(i));
                }
            }
        }
        HashMap map2 = new HashMap();
        for (int i2 = 0; i2 < Math.min(tL_getFactCheck.msg_id.size(), arrayList2.size()); i2++) {
            Integer num = tL_getFactCheck.msg_id.get(i2);
            num.getClass();
            map2.put(num, (TLRPC.TL_factCheck) arrayList2.get(i2));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < tL_getFactCheck.msg_id.size(); i4++) {
            Key key = (Key) arrayList.get(i4);
            Integer num2 = tL_getFactCheck.msg_id.get(i4);
            num2.getClass();
            TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) map2.get(num2);
            Utilities.Callback callback = (Utilities.Callback) map.get(key);
            if (tL_factCheck != null && !tL_factCheck.need_check && callback != null) {
                callback.run(tL_factCheck);
                i3++;
                this.loading.remove(key);
            }
        }
        if (i3 > 0) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.factCheckLoaded, new Object[0]);
        }
    }

    public void lambda$loadMissing$2(TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap map, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new MessagesStorage$$ExternalSyntheticLambda84(this, tLObject, tL_getFactCheck, arrayList, map));
    }

    public void lambda$loadMissing$3(long j, ArrayList arrayList, HashMap map, ArrayList arrayList2) {
        TLRPC.TL_getFactCheck tL_getFactCheck = new TLRPC.TL_getFactCheck();
        tL_getFactCheck.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            Key key = (Key) arrayList.get(i2);
            TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) arrayList2.get(i2);
            if (tL_factCheck == null) {
                arrayList3.add(key);
                tL_getFactCheck.msg_id.add(Integer.valueOf(key.messageId));
            } else {
                this.loading.remove(key);
                Utilities.Callback callback = (Utilities.Callback) map.get(key);
                if (callback != null) {
                    callback.run(tL_factCheck);
                    i++;
                }
            }
        }
        if (i > 0) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.factCheckLoaded, new Object[0]);
        }
        if (tL_getFactCheck.msg_id.isEmpty()) {
            return;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_getFactCheck, new SecretChatHelper$$ExternalSyntheticLambda9(1, this, tL_getFactCheck, arrayList3, map));
    }

    public static void lambda$openFactCheckEditor$10(View view, DialogInterface dialogInterface) {
        currentDialog = null;
        view.requestFocus();
    }

    public static void lambda$openFactCheckEditor$11(EditTextCaption editTextCaption, DialogInterface dialogInterface) {
        editTextCaption.requestFocus();
        AndroidUtilities.showKeyboard(editTextCaption);
    }

    public static void lambda$openFactCheckEditor$13(EditTextCaption editTextCaption, DialogInterface dialogInterface) {
        editTextCaption.requestFocus();
        AndroidUtilities.showKeyboard(editTextCaption);
    }

    public void lambda$openFactCheckEditor$8(EditTextCaption editTextCaption, int i, MessageObject messageObject, boolean z, AlertDialog alertDialog, int i2) {
        if (editTextCaption.getText().toString().length() > i) {
            AndroidUtilities.shakeView(editTextCaption);
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {editTextCaption.getText()};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence = charSequenceArr[0];
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        applyFactCheck(messageObject, tL_textWithEntities, z);
        alertDialog.dismiss();
    }

    public static void lambda$saveToDatabase$6(MessagesStorage messagesStorage, TLRPC.TL_factCheck tL_factCheck) {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        try {
            try {
                sQLitePreparedStatementExecuteFast = messagesStorage.getDatabase().executeFast("REPLACE INTO fact_checks VALUES(?, ?, ?)");
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindLong(1, tL_factCheck.hash);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_factCheck.getObjectSize());
                tL_factCheck.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.bindByteBuffer(2, nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.bindLong(3, System.currentTimeMillis() + 889032704);
                sQLitePreparedStatementExecuteFast.step();
                sQLitePreparedStatementExecuteFast.dispose();
            } catch (Exception e) {
                FileLog.e(e);
                if (sQLitePreparedStatementExecuteFast != null) {
                    sQLitePreparedStatementExecuteFast.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            throw th;
        }
    }

    public void loadMissing() {
        while (this.toload.size() > 0) {
            long jKeyAt = this.toload.keyAt(0);
            HashMap<Key, Utilities.Callback<TLRPC.TL_factCheck>> mapValueAt = this.toload.valueAt(0);
            this.toload.removeAt(0);
            ArrayList<Key> arrayList = new ArrayList<>(mapValueAt.keySet());
            this.loading.addAll(arrayList);
            getFromDatabase(arrayList, new GiftSheet$$ExternalSyntheticLambda11(this, jKeyAt, arrayList, mapValueAt, 1));
        }
        this.toload.clear();
    }

    private void saveToDatabase(TLRPC.TL_factCheck tL_factCheck) {
        if (tL_factCheck == null) {
            return;
        }
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new FileLog$$ExternalSyntheticLambda3(3, messagesStorage, tL_factCheck));
        clearExpiredInDatabase();
    }

    private void scheduleLoadMissing() {
        AndroidUtilities.cancelRunOnUIThread(this.loadMissingRunnable);
        AndroidUtilities.runOnUIThread(this.loadMissingRunnable, 80L);
    }

    public void applyFactCheck(MessageObject messageObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z) {
        TLObject tLObject;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            TLRPC.TL_editFactCheck tL_editFactCheck = new TLRPC.TL_editFactCheck();
            tL_editFactCheck.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
            tL_editFactCheck.msg_id = messageObject.getId();
            tL_editFactCheck.text = tL_textWithEntities;
            tLObject = tL_editFactCheck;
        } else {
            if (z) {
                return;
            }
            TLRPC.TL_deleteFactCheck tL_deleteFactCheck = new TLRPC.TL_deleteFactCheck();
            tL_deleteFactCheck.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
            tL_deleteFactCheck.msg_id = messageObject.getId();
            tLObject = tL_deleteFactCheck;
        }
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final AlertDialog alertDialog = new AlertDialog(context, 3, null);
        AndroidUtilities.cancelRunOnUIThread(alertDialog.showRunnable);
        AndroidUtilities.runOnUIThread(alertDialog.showRunnable, 320L);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                this.f$0.lambda$applyFactCheck$16(tL_textWithEntities, z, alertDialog, tLObject2, tL_error);
            }
        });
    }

    public TLRPC.TL_factCheck getFactCheck(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.TL_factCheck tL_factCheck;
        if (messageObject == null || (message = messageObject.messageOwner) == null || (tL_factCheck = message.factcheck) == null) {
            return null;
        }
        if (!tL_factCheck.need_check) {
            if (this.localCache.get(tL_factCheck.hash) == null) {
                LongSparseArray<TLRPC.TL_factCheck> longSparseArray = this.localCache;
                TLRPC.TL_factCheck tL_factCheck2 = messageObject.messageOwner.factcheck;
                longSparseArray.put(tL_factCheck2.hash, tL_factCheck2);
                saveToDatabase(messageObject.messageOwner.factcheck);
            }
            return messageObject.messageOwner.factcheck;
        }
        Key keyOf = Key.of(messageObject);
        if (keyOf == null || keyOf.messageId < 0) {
            return null;
        }
        TLRPC.TL_factCheck tL_factCheck3 = this.localCache.get(keyOf.hash);
        if (tL_factCheck3 != null) {
            messageObject.messageOwner.factcheck = tL_factCheck3;
            return tL_factCheck3;
        }
        if (this.loading.contains(keyOf)) {
            return messageObject.messageOwner.factcheck;
        }
        HashMap<Key, Utilities.Callback<TLRPC.TL_factCheck>> map = this.toload.get(keyOf.dialogId);
        if (map == null) {
            LongSparseArray<HashMap<Key, Utilities.Callback<TLRPC.TL_factCheck>>> longSparseArray2 = this.toload;
            long j = keyOf.dialogId;
            HashMap<Key, Utilities.Callback<TLRPC.TL_factCheck>> map2 = new HashMap<>();
            longSparseArray2.put(j, map2);
            map = map2;
        }
        if (!map.containsKey(keyOf)) {
            map.put(keyOf, new FileRefController$$ExternalSyntheticLambda21(this, keyOf, messageObject, 1));
            scheduleLoadMissing();
        }
        return messageObject.messageOwner.factcheck;
    }

    public void openFactCheckEditor(Context context, final Theme.ResourcesProvider resourcesProvider, final MessageObject messageObject, boolean z) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message;
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        Activity activityFindActivity = AndroidUtilities.findActivity(context);
        final View currentFocus = activityFindActivity != null ? activityFindActivity.getCurrentFocus() : null;
        int i = 0;
        boolean z2 = lastFragment != null && (lastFragment.getFragmentView() instanceof SizeNotifierFrameLayout) && ((SizeNotifierFrameLayout) lastFragment.getFragmentView()).measureKeyboardHeight() > AndroidUtilities.dp(20.0f) && !z;
        final AlertDialog[] alertDialogArr = new AlertDialog[1];
        AlertDialog.Builder builder = z2 ? new DarkAlertDialog.Builder(context, i, resourcesProvider) : new AlertDialog.Builder(context, 0, resourcesProvider);
        final TextView[] textViewArr = new TextView[1];
        boolean z3 = messageObject == null || (message = messageObject.messageOwner) == null || message.factcheck == null;
        builder.setTitle(LocaleController.getString(R.string.FactCheckDialog));
        final int i2 = MessagesController.getInstance(this.currentAccount).factcheckLengthLimit;
        final EditTextCaption editTextCaption = new EditTextCaption(context, resourcesProvider) {
            AnimatedTextView.AnimatedTextDrawable limit;
            AnimatedColor limitColor = new AnimatedColor(this);
            private int limitCount;

            {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
                this.limit = animatedTextDrawable;
                animatedTextDrawable.setAnimationProperties(0.2f, 0L, 160L, CubicBezierInterpolator.EASE_OUT_QUINT);
                this.limit.setTextSize(AndroidUtilities.dp(15.33f));
                this.limit.setCallback(this);
                this.limit.setGravity(5);
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                this.limit.setTextColor(this.limitColor.set(Theme.getColor(this.limitCount < 0 ? Theme.key_text_RedRegular : Theme.key_dialogSearchHint, resourcesProvider)));
                this.limit.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                this.limit.draw(canvas);
            }

            @Override
            public void extendActionMode(ActionMode actionMode, Menu menu) {
                int i3 = R.id.menu_bold;
                if (menu.findItem(i3) != null) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    menu.removeItem(16908341);
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
                spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                int i4 = R.id.menu_groupbolditalic;
                menu.add(i4, i3, 6, spannableStringBuilder);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
                spannableStringBuilder2.setSpan(new TypefaceSpan(AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
                menu.add(i4, R.id.menu_italic, 7, spannableStringBuilder2);
                menu.add(i4, R.id.menu_link, 8, LocaleController.getString(R.string.CreateLink));
                menu.add(i4, R.id.menu_regular, 9, LocaleController.getString(R.string.Regular));
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                super.onTextChanged(charSequence, i3, i4, i5);
                if (this.limit != null) {
                    this.limitCount = i2 - charSequence.length();
                    this.limit.cancelAnimation();
                    AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.limit;
                    String str = "";
                    if (this.limitCount <= 4) {
                        str = "" + this.limitCount;
                    }
                    animatedTextDrawable.setText(str);
                }
            }

            @Override
            public boolean verifyDrawable(Drawable drawable) {
                return drawable == this.limit || super.verifyDrawable(drawable);
            }
        };
        editTextCaption.lineYFix = true;
        final boolean z4 = z3;
        editTextCaption.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                if (i3 != 6) {
                    return false;
                }
                if (editTextCaption.getText().toString().length() > i2) {
                    AndroidUtilities.shakeView(editTextCaption);
                    return true;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                CharSequence[] charSequenceArr = {editTextCaption.getText()};
                tL_textWithEntities2.entities = MediaDataController.getInstance(FactCheckController.this.currentAccount).getEntities(charSequenceArr, true);
                CharSequence charSequence = charSequenceArr[0];
                tL_textWithEntities2.text = charSequence == null ? "" : charSequence.toString();
                FactCheckController.this.applyFactCheck(messageObject, tL_textWithEntities2, z4);
                AlertDialog alertDialog = alertDialogArr[0];
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                if (alertDialogArr[0] == FactCheckController.currentDialog) {
                    AlertDialog unused = FactCheckController.currentDialog = null;
                }
                View view = currentFocus;
                if (view != null) {
                    view.requestFocus();
                }
                return true;
            }
        });
        MediaDataController.getInstance(this.currentAccount).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        editTextCaption.setTextSize(1, 18.0f);
        editTextCaption.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        editTextCaption.setHintColor(Theme.getColor(Theme.key_groupcreate_hintText, resourcesProvider));
        editTextCaption.setHintText(LocaleController.getString(R.string.FactCheckPlaceholder));
        editTextCaption.setFocusable(true);
        editTextCaption.setInputType(147457);
        editTextCaption.setLineColors(Theme.getColor(Theme.key_windowBackgroundWhiteInputField, resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated, resourcesProvider), Theme.getColor(Theme.key_text_RedRegular, resourcesProvider));
        editTextCaption.setImeOptions(6);
        editTextCaption.setBackgroundDrawable(null);
        editTextCaption.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        final TLRPC.TL_factCheck factCheck = messageObject.getFactCheck();
        if (factCheck != null && (tL_textWithEntities = factCheck.text) != null) {
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(tL_textWithEntities.text);
            MessageObject.addEntitiesToText(spannableStringBuilderValueOf, factCheck.text.entities, false, true, false, false);
            editTextCaption.setText(spannableStringBuilderValueOf);
        }
        editTextCaption.addTextChangedListener(new TextWatcher() {
            boolean ignoreTextChange;

            @Override
            public void afterTextChanged(Editable editable) {
                if (this.ignoreTextChange) {
                    return;
                }
                int length = editable.length();
                int i3 = i2;
                boolean z5 = true;
                if (length > i3) {
                    this.ignoreTextChange = true;
                    editable.delete(i3, editable.length());
                    AndroidUtilities.shakeView(editTextCaption);
                    try {
                        editTextCaption.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.ignoreTextChange = false;
                }
                if (textViewArr[0] != null) {
                    if (editable.length() <= 0 && factCheck != null) {
                        z5 = false;
                    }
                    textViewArr[0].setText(LocaleController.getString(z5 ? R.string.Done : R.string.Remove));
                    textViewArr[0].setTextColor(Theme.getColor(null, z5 ? Theme.key_dialogButton : Theme.key_text_RedBold, false));
                }
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(editTextCaption, LayoutHelper.createLinear(-1, -2, 24.0f, 0.0f, 24.0f, 10.0f));
        builder.makeCustomMaxHeight();
        builder.setView(linearLayout);
        builder.setWidth(AndroidUtilities.dp(292.0f));
        builder.setPositiveButton(LocaleController.getString(R.string.Done), new BotWebViewContainer$$ExternalSyntheticLambda34(this, editTextCaption, i2, messageObject, z4));
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), new SharedConfig$$ExternalSyntheticLambda5(4));
        if (z2) {
            AlertDialog alertDialogCreate = builder.create();
            currentDialog = alertDialogCreate;
            alertDialogArr[0] = alertDialogCreate;
            final int i3 = 0;
            alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    switch (i3) {
                        case 0:
                            FactCheckController.lambda$openFactCheckEditor$10(currentFocus, dialogInterface);
                            break;
                        default:
                            AndroidUtilities.hideKeyboard((EditTextCaption) currentFocus);
                            break;
                    }
                }
            });
            currentDialog.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i3) {
                        case 0:
                            FactCheckController.lambda$openFactCheckEditor$11(editTextCaption, dialogInterface);
                            break;
                        default:
                            FactCheckController.lambda$openFactCheckEditor$13(editTextCaption, dialogInterface);
                            break;
                    }
                }
            });
            currentDialog.showDelayed(250L);
        } else {
            AlertDialog alertDialogCreate2 = builder.create();
            alertDialogArr[0] = alertDialogCreate2;
            final int i4 = 1;
            alertDialogCreate2.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    switch (i4) {
                        case 0:
                            FactCheckController.lambda$openFactCheckEditor$10(editTextCaption, dialogInterface);
                            break;
                        default:
                            AndroidUtilities.hideKeyboard((EditTextCaption) editTextCaption);
                            break;
                    }
                }
            });
            alertDialogArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i4) {
                        case 0:
                            FactCheckController.lambda$openFactCheckEditor$11(editTextCaption, dialogInterface);
                            break;
                        default:
                            FactCheckController.lambda$openFactCheckEditor$13(editTextCaption, dialogInterface);
                            break;
                    }
                }
            });
            alertDialogArr[0].show();
        }
        AlertDialog alertDialog = alertDialogArr[0];
        alertDialog.dismissDialogByButtons = false;
        View button = alertDialog.getButton(-1);
        if (button instanceof TextView) {
            textViewArr[0] = (TextView) button;
        }
        editTextCaption.setSelection(editTextCaption.getText().length());
    }
}
