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
import java.util.Iterator;
import kotlinx.coroutines.CoroutineId$$ExternalSyntheticBackport0;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$TL_deleteFactCheck;
import org.telegram.tgnet.TLRPC$TL_editFactCheck;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_factCheck;
import org.telegram.tgnet.TLRPC$TL_getFactCheck;
import org.telegram.tgnet.TLRPC$TL_textWithEntities;
import org.telegram.tgnet.TLRPC$Updates;
import org.telegram.tgnet.TLRPC$Vector;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialogDecor;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.LaunchActivity;

public class FactCheckController {
    private static AlertDialog currentDialog;
    private boolean clearedExpiredInDatabase;
    public final int currentAccount;
    private static volatile FactCheckController[] Instance = new FactCheckController[4];
    private static final Object[] lockObjects = new Object[4];
    private final LongSparseArray<TLRPC$TL_factCheck> localCache = new LongSparseArray<>();
    private final LongSparseArray<HashMap<Key, Utilities.Callback<TLRPC$TL_factCheck>>> toload = new LongSparseArray<>();
    private final ArrayList<Key> loading = new ArrayList<>();
    private final Runnable loadMissingRunnable = new Runnable() {
        @Override
        public final void run() {
            FactCheckController.this.loadMissing();
        }
    };

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
    }

    public static FactCheckController getInstance(int i) {
        FactCheckController factCheckController = Instance[i];
        if (factCheckController == null) {
            synchronized (lockObjects[i]) {
                factCheckController = Instance[i];
                if (factCheckController == null) {
                    FactCheckController[] factCheckControllerArr = Instance;
                    FactCheckController factCheckController2 = new FactCheckController(i);
                    factCheckControllerArr[i] = factCheckController2;
                    factCheckController = factCheckController2;
                }
            }
        }
        return factCheckController;
    }

    private FactCheckController(int i) {
        this.currentAccount = i;
    }

    public TLRPC$TL_factCheck getFactCheck(final MessageObject messageObject) {
        TLRPC$Message tLRPC$Message;
        TLRPC$TL_factCheck tLRPC$TL_factCheck;
        if (messageObject == null || (tLRPC$Message = messageObject.messageOwner) == null || (tLRPC$TL_factCheck = tLRPC$Message.factcheck) == null) {
            return null;
        }
        if (!tLRPC$TL_factCheck.need_check) {
            if (this.localCache.get(tLRPC$TL_factCheck.hash) == null) {
                LongSparseArray<TLRPC$TL_factCheck> longSparseArray = this.localCache;
                TLRPC$TL_factCheck tLRPC$TL_factCheck2 = messageObject.messageOwner.factcheck;
                longSparseArray.put(tLRPC$TL_factCheck2.hash, tLRPC$TL_factCheck2);
                saveToDatabase(messageObject.messageOwner.factcheck);
            }
            return messageObject.messageOwner.factcheck;
        }
        final Key of = Key.of(messageObject);
        if (of == null || of.messageId < 0) {
            return null;
        }
        TLRPC$TL_factCheck tLRPC$TL_factCheck3 = this.localCache.get(of.hash);
        if (tLRPC$TL_factCheck3 != null) {
            messageObject.messageOwner.factcheck = tLRPC$TL_factCheck3;
            return tLRPC$TL_factCheck3;
        }
        if (this.loading.contains(of)) {
            return messageObject.messageOwner.factcheck;
        }
        HashMap<Key, Utilities.Callback<TLRPC$TL_factCheck>> hashMap = this.toload.get(of.dialogId);
        if (hashMap == null) {
            LongSparseArray<HashMap<Key, Utilities.Callback<TLRPC$TL_factCheck>>> longSparseArray2 = this.toload;
            long j = of.dialogId;
            HashMap<Key, Utilities.Callback<TLRPC$TL_factCheck>> hashMap2 = new HashMap<>();
            longSparseArray2.put(j, hashMap2);
            hashMap = hashMap2;
        }
        if (!hashMap.containsKey(of)) {
            hashMap.put(of, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    FactCheckController.this.lambda$getFactCheck$0(of, messageObject, (TLRPC$TL_factCheck) obj);
                }
            });
            scheduleLoadMissing();
        }
        return messageObject.messageOwner.factcheck;
    }

    public void lambda$getFactCheck$0(Key key, MessageObject messageObject, TLRPC$TL_factCheck tLRPC$TL_factCheck) {
        this.localCache.put(key.hash, tLRPC$TL_factCheck);
        messageObject.messageOwner.factcheck = tLRPC$TL_factCheck;
    }

    private void scheduleLoadMissing() {
        AndroidUtilities.cancelRunOnUIThread(this.loadMissingRunnable);
        AndroidUtilities.runOnUIThread(this.loadMissingRunnable, 80L);
    }

    public void loadMissing() {
        while (this.toload.size() > 0) {
            final long keyAt = this.toload.keyAt(0);
            final HashMap<Key, Utilities.Callback<TLRPC$TL_factCheck>> valueAt = this.toload.valueAt(0);
            this.toload.removeAt(0);
            final ArrayList<Key> arrayList = new ArrayList<>(valueAt.keySet());
            this.loading.addAll(arrayList);
            getFromDatabase(arrayList, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    FactCheckController.this.lambda$loadMissing$3(keyAt, arrayList, valueAt, (ArrayList) obj);
                }
            });
        }
        this.toload.clear();
    }

    public void lambda$loadMissing$3(long j, ArrayList arrayList, final HashMap hashMap, ArrayList arrayList2) {
        final TLRPC$TL_getFactCheck tLRPC$TL_getFactCheck = new TLRPC$TL_getFactCheck();
        tLRPC$TL_getFactCheck.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        final ArrayList arrayList3 = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            Key key = (Key) arrayList.get(i2);
            TLRPC$TL_factCheck tLRPC$TL_factCheck = (TLRPC$TL_factCheck) arrayList2.get(i2);
            if (tLRPC$TL_factCheck == null) {
                arrayList3.add(key);
                tLRPC$TL_getFactCheck.msg_id.add(Integer.valueOf(key.messageId));
            } else {
                this.loading.remove(key);
                Utilities.Callback callback = (Utilities.Callback) hashMap.get(key);
                if (callback != null) {
                    callback.run(tLRPC$TL_factCheck);
                    i++;
                }
            }
        }
        if (i > 0) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.factCheckLoaded, new Object[0]);
        }
        if (tLRPC$TL_getFactCheck.msg_id.isEmpty()) {
            return;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_getFactCheck, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                FactCheckController.this.lambda$loadMissing$2(tLRPC$TL_getFactCheck, arrayList3, hashMap, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadMissing$2(final TLRPC$TL_getFactCheck tLRPC$TL_getFactCheck, final ArrayList arrayList, final HashMap hashMap, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                FactCheckController.this.lambda$loadMissing$1(tLObject, tLRPC$TL_getFactCheck, arrayList, hashMap);
            }
        });
    }

    public void lambda$loadMissing$1(TLObject tLObject, TLRPC$TL_getFactCheck tLRPC$TL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        ArrayList arrayList2 = new ArrayList();
        if (tLObject instanceof TLRPC$Vector) {
            ArrayList<Object> arrayList3 = ((TLRPC$Vector) tLObject).objects;
            for (int i = 0; i < arrayList3.size(); i++) {
                if (arrayList3.get(i) instanceof TLRPC$TL_factCheck) {
                    arrayList2.add((TLRPC$TL_factCheck) arrayList3.get(i));
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        for (int i2 = 0; i2 < Math.min(tLRPC$TL_getFactCheck.msg_id.size(), arrayList2.size()); i2++) {
            int intValue = tLRPC$TL_getFactCheck.msg_id.get(i2).intValue();
            hashMap2.put(Integer.valueOf(intValue), (TLRPC$TL_factCheck) arrayList2.get(i2));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < tLRPC$TL_getFactCheck.msg_id.size(); i4++) {
            Key key = (Key) arrayList.get(i4);
            TLRPC$TL_factCheck tLRPC$TL_factCheck = (TLRPC$TL_factCheck) hashMap2.get(Integer.valueOf(tLRPC$TL_getFactCheck.msg_id.get(i4).intValue()));
            Utilities.Callback callback = (Utilities.Callback) hashMap.get(key);
            if (tLRPC$TL_factCheck != null && !tLRPC$TL_factCheck.need_check && callback != null) {
                callback.run(tLRPC$TL_factCheck);
                i3++;
                this.loading.remove(key);
            }
        }
        if (i3 > 0) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.factCheckLoaded, new Object[0]);
        }
    }

    public static class Key {
        public final long dialogId;
        public final long hash;
        public final int messageId;

        private Key(long j, int i, long j2) {
            this.dialogId = j;
            this.messageId = i;
            this.hash = j2;
        }

        public int hashCode() {
            return CoroutineId$$ExternalSyntheticBackport0.m(this.hash);
        }

        public static Key of(MessageObject messageObject) {
            TLRPC$Message tLRPC$Message;
            if (messageObject == null || (tLRPC$Message = messageObject.messageOwner) == null || tLRPC$Message.factcheck == null) {
                return null;
            }
            return new Key(messageObject.getDialogId(), messageObject.getId(), messageObject.messageOwner.factcheck.hash);
        }
    }

    private void getFromDatabase(final ArrayList<Key> arrayList, final Utilities.Callback<ArrayList<TLRPC$TL_factCheck>> callback) {
        if (callback == null) {
            return;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            callback.run(new ArrayList<>());
        } else {
            final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            messagesStorage.getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    FactCheckController.lambda$getFromDatabase$5(MessagesStorage.this, arrayList, callback);
                }
            });
        }
    }

    public static void lambda$getFromDatabase$5(MessagesStorage messagesStorage, ArrayList arrayList, final Utilities.Callback callback) {
        final ArrayList arrayList2 = new ArrayList();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase database = messagesStorage.getDatabase();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList3.add(Long.valueOf(((Key) it.next()).hash));
                    arrayList2.add(null);
                }
                sQLiteCursor = database.queryFinalized("SELECT data FROM fact_checks WHERE hash IN (" + TextUtils.join(", ", arrayList3) + ")", new Object[0]);
                while (true) {
                    if (!sQLiteCursor.next()) {
                        break;
                    }
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    TLRPC$TL_factCheck TLdeserialize = TLRPC$TL_factCheck.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    if (TLdeserialize != null) {
                        int i = -1;
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            if (TLdeserialize.hash == ((Key) arrayList.get(i2)).hash) {
                                i = i2;
                            }
                        }
                        if (i >= 0 && i < arrayList2.size()) {
                            arrayList2.set(i, TLdeserialize);
                        }
                    }
                }
                sQLiteCursor.dispose();
            } catch (Exception e) {
                FileLog.e(e);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    Utilities.Callback.this.run(arrayList2);
                }
            });
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    private void saveToDatabase(final TLRPC$TL_factCheck tLRPC$TL_factCheck) {
        if (tLRPC$TL_factCheck == null) {
            return;
        }
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                FactCheckController.lambda$saveToDatabase$6(MessagesStorage.this, tLRPC$TL_factCheck);
            }
        });
        clearExpiredInDatabase();
    }

    public static void lambda$saveToDatabase$6(MessagesStorage messagesStorage, TLRPC$TL_factCheck tLRPC$TL_factCheck) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = messagesStorage.getDatabase().executeFast("REPLACE INTO fact_checks VALUES(?, ?, ?)");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindLong(1, tLRPC$TL_factCheck.hash);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$TL_factCheck.getObjectSize());
                tLRPC$TL_factCheck.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                sQLitePreparedStatement.bindLong(3, System.currentTimeMillis() + 889032704);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e) {
                FileLog.e(e);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    private void clearExpiredInDatabase() {
        if (this.clearedExpiredInDatabase) {
            return;
        }
        this.clearedExpiredInDatabase = true;
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                FactCheckController.lambda$clearExpiredInDatabase$7(MessagesStorage.this);
            }
        });
    }

    public static void lambda$clearExpiredInDatabase$7(MessagesStorage messagesStorage) {
        try {
            messagesStorage.getDatabase().executeFast("DELETE FROM fact_checks WHERE expires > " + System.currentTimeMillis()).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void openFactCheckEditor(Context context, final Theme.ResourcesProvider resourcesProvider, final MessageObject messageObject, boolean z) {
        AlertDialog.Builder builder;
        ?? r1;
        TLRPC$TL_textWithEntities tLRPC$TL_textWithEntities;
        TLRPC$Message tLRPC$Message;
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        Activity findActivity = AndroidUtilities.findActivity(context);
        final View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z2 = (lastFragment != null && (lastFragment.getFragmentView() instanceof SizeNotifierFrameLayout) && ((SizeNotifierFrameLayout) lastFragment.getFragmentView()).measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) && !z;
        final AlertDialog[] alertDialogArr = new AlertDialog[1];
        if (z2) {
            builder = new AlertDialogDecor.Builder(context, resourcesProvider);
        } else {
            builder = new AlertDialog.Builder(context, resourcesProvider);
        }
        AlertDialog.Builder builder2 = builder;
        final TextView[] textViewArr = new TextView[1];
        boolean z3 = messageObject == null || (tLRPC$Message = messageObject.messageOwner) == null || tLRPC$Message.factcheck == null;
        builder2.setTitle(LocaleController.getString(R.string.FactCheckDialog));
        final int i = MessagesController.getInstance(this.currentAccount).factcheckLengthLimit;
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
            protected boolean verifyDrawable(Drawable drawable) {
                return drawable == this.limit || super.verifyDrawable(drawable);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                super.onTextChanged(charSequence, i2, i3, i4);
                if (this.limit != null) {
                    this.limitCount = i - charSequence.length();
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
            public void extendActionMode(ActionMode actionMode, Menu menu) {
                int i2 = R.id.menu_bold;
                if (menu.findItem(i2) != null) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    menu.removeItem(android.R.id.shareText);
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString("Bold", R.string.Bold));
                spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                int i3 = R.id.menu_groupbolditalic;
                menu.add(i3, i2, 6, spannableStringBuilder);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString("Italic", R.string.Italic));
                spannableStringBuilder2.setSpan(new TypefaceSpan(AndroidUtilities.getTypeface("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
                menu.add(i3, R.id.menu_italic, 7, spannableStringBuilder2);
                menu.add(i3, R.id.menu_link, 8, LocaleController.getString("CreateLink", R.string.CreateLink));
                menu.add(i3, R.id.menu_regular, 9, LocaleController.getString("Regular", R.string.Regular));
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                this.limit.setTextColor(this.limitColor.set(Theme.getColor(this.limitCount < 0 ? Theme.key_text_RedRegular : Theme.key_dialogSearchHint, resourcesProvider)));
                this.limit.setBounds(getScrollX(), 0, getScrollX() + getWidth(), getHeight());
                this.limit.draw(canvas);
            }
        };
        editTextCaption.lineYFix = true;
        final boolean z4 = z3;
        final View view = currentFocus;
        editTextCaption.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                if (i2 != 6) {
                    return false;
                }
                if (editTextCaption.getText().toString().length() > i) {
                    AndroidUtilities.shakeView(editTextCaption);
                    return true;
                }
                TLRPC$TL_textWithEntities tLRPC$TL_textWithEntities2 = new TLRPC$TL_textWithEntities();
                CharSequence[] charSequenceArr = {editTextCaption.getText()};
                tLRPC$TL_textWithEntities2.entities = MediaDataController.getInstance(FactCheckController.this.currentAccount).getEntities(charSequenceArr, true);
                tLRPC$TL_textWithEntities2.text = charSequenceArr[0] == null ? "" : charSequenceArr[0].toString();
                FactCheckController.this.applyFactCheck(messageObject, tLRPC$TL_textWithEntities2, z4);
                AlertDialog[] alertDialogArr2 = alertDialogArr;
                if (alertDialogArr2[0] != null) {
                    alertDialogArr2[0].dismiss();
                }
                if (alertDialogArr[0] == FactCheckController.currentDialog) {
                    AlertDialog unused = FactCheckController.currentDialog = null;
                }
                View view2 = view;
                if (view2 != null) {
                    view2.requestFocus();
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
        final TLRPC$TL_factCheck factCheck = messageObject.getFactCheck();
        if (factCheck != null && (tLRPC$TL_textWithEntities = factCheck.text) != null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(tLRPC$TL_textWithEntities.text);
            MessageObject.addEntitiesToText(valueOf, factCheck.text.entities, false, true, false, false);
            editTextCaption.setText(valueOf);
        }
        editTextCaption.addTextChangedListener(new TextWatcher() {
            boolean ignoreTextChange;

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (this.ignoreTextChange) {
                    return;
                }
                int length = editable.length();
                int i2 = i;
                boolean z5 = true;
                if (length > i2) {
                    this.ignoreTextChange = true;
                    editable.delete(i2, editable.length());
                    AndroidUtilities.shakeView(editTextCaption);
                    editTextCaption.performHapticFeedback(3, 2);
                    this.ignoreTextChange = false;
                }
                if (textViewArr[0] != null) {
                    if (editable.length() <= 0 && factCheck != null) {
                        z5 = false;
                    }
                    textViewArr[0].setText(LocaleController.getString(z5 ? R.string.Done : R.string.Remove));
                    textViewArr[0].setTextColor(Theme.getColor(z5 ? Theme.key_dialogButton : Theme.key_text_RedBold));
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(editTextCaption, LayoutHelper.createLinear(-1, -2, 24.0f, 0.0f, 24.0f, 10.0f));
        builder2.makeCustomMaxHeight();
        builder2.setView(linearLayout);
        builder2.setWidth(AndroidUtilities.dp(292.0f));
        final boolean z5 = z3;
        builder2.setPositiveButton(LocaleController.getString(R.string.Done), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                FactCheckController.this.lambda$openFactCheckEditor$8(editTextCaption, i, messageObject, z5, dialogInterface, i2);
            }
        });
        builder2.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
            }
        });
        if (z2) {
            AlertDialog create = builder2.create();
            currentDialog = create;
            alertDialogArr[0] = create;
            create.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    FactCheckController.lambda$openFactCheckEditor$10(currentFocus, dialogInterface);
                }
            });
            currentDialog.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    FactCheckController.lambda$openFactCheckEditor$11(EditTextCaption.this, dialogInterface);
                }
            });
            currentDialog.showDelayed(250L);
            r1 = 0;
        } else {
            r1 = 0;
            alertDialogArr[0] = builder2.create();
            alertDialogArr[0].setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    AndroidUtilities.hideKeyboard(EditTextCaption.this);
                }
            });
            alertDialogArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    FactCheckController.lambda$openFactCheckEditor$13(EditTextCaption.this, dialogInterface);
                }
            });
            alertDialogArr[0].show();
        }
        alertDialogArr[r1].setDismissDialogByButtons(r1);
        View button = alertDialogArr[r1].getButton(-1);
        if (button instanceof TextView) {
            textViewArr[r1] = (TextView) button;
        }
        editTextCaption.setSelection(editTextCaption.getText().length());
    }

    public void lambda$openFactCheckEditor$8(EditTextCaption editTextCaption, int i, MessageObject messageObject, boolean z, DialogInterface dialogInterface, int i2) {
        if (editTextCaption.getText().toString().length() > i) {
            AndroidUtilities.shakeView(editTextCaption);
            return;
        }
        TLRPC$TL_textWithEntities tLRPC$TL_textWithEntities = new TLRPC$TL_textWithEntities();
        CharSequence[] charSequenceArr = {editTextCaption.getText()};
        tLRPC$TL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        tLRPC$TL_textWithEntities.text = charSequenceArr[0] == null ? "" : charSequenceArr[0].toString();
        applyFactCheck(messageObject, tLRPC$TL_textWithEntities, z);
        dialogInterface.dismiss();
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

    public void applyFactCheck(MessageObject messageObject, final TLRPC$TL_textWithEntities tLRPC$TL_textWithEntities, final boolean z) {
        TLRPC$TL_deleteFactCheck tLRPC$TL_deleteFactCheck;
        if (tLRPC$TL_textWithEntities != null && !TextUtils.isEmpty(tLRPC$TL_textWithEntities.text)) {
            TLRPC$TL_editFactCheck tLRPC$TL_editFactCheck = new TLRPC$TL_editFactCheck();
            tLRPC$TL_editFactCheck.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
            tLRPC$TL_editFactCheck.msg_id = messageObject.getId();
            tLRPC$TL_editFactCheck.text = tLRPC$TL_textWithEntities;
            tLRPC$TL_deleteFactCheck = tLRPC$TL_editFactCheck;
        } else {
            if (z) {
                return;
            }
            TLRPC$TL_deleteFactCheck tLRPC$TL_deleteFactCheck2 = new TLRPC$TL_deleteFactCheck();
            tLRPC$TL_deleteFactCheck2.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
            tLRPC$TL_deleteFactCheck2.msg_id = messageObject.getId();
            tLRPC$TL_deleteFactCheck = tLRPC$TL_deleteFactCheck2;
        }
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final AlertDialog alertDialog = new AlertDialog(context, 3);
        alertDialog.showDelayed(320L);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_deleteFactCheck, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                FactCheckController.this.lambda$applyFactCheck$15(tLRPC$TL_textWithEntities, z, alertDialog, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$applyFactCheck$15(final TLRPC$TL_textWithEntities tLRPC$TL_textWithEntities, final boolean z, final AlertDialog alertDialog, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                FactCheckController.this.lambda$applyFactCheck$14(tLObject, tLRPC$TL_textWithEntities, z, alertDialog);
            }
        });
    }

    public void lambda$applyFactCheck$14(TLObject tLObject, TLRPC$TL_textWithEntities tLRPC$TL_textWithEntities, boolean z, AlertDialog alertDialog) {
        if (tLObject instanceof TLRPC$Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC$Updates) tLObject, false);
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                boolean z2 = tLRPC$TL_textWithEntities == null || TextUtils.isEmpty(tLRPC$TL_textWithEntities.text);
                if (z2 || !z) {
                    BulletinFactory.of(safeLastFragment).createSimpleBulletin(z2 ? R.raw.ic_delete : R.raw.contact_check, LocaleController.getString(z2 ? R.string.FactCheckDeleted : R.string.FactCheckEdited)).show();
                }
            }
        }
        alertDialog.dismiss();
    }
}
