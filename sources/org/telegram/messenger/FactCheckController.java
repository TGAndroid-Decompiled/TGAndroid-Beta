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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.zt;
import org.telegram.ui.LaunchActivity;
public class FactCheckController {
    private static org.telegram.ui.ActionBar.b2 currentDialog;
    private boolean clearedExpiredInDatabase;
    public final int currentAccount;
    private static volatile FactCheckController[] Instance = new FactCheckController[4];
    private static final Object[] lockObjects = new Object[4];
    private final LongSparseArray<TLRPC.TL_factCheck> localCache = new LongSparseArray<>();
    private final LongSparseArray<HashMap<Key, Utilities.Callback<TLRPC.TL_factCheck>>> toload = new LongSparseArray<>();
    private final ArrayList<Key> loading = new ArrayList<>();
    private final Runnable loadMissingRunnable = new d1(this, 19);

    public static class Key {
        public final long dialogId;
        public final long hash;
        public final int messageId;

        private Key(long j3, int i10, long j10) {
            this.dialogId = j3;
            this.messageId = i10;
            this.hash = j10;
        }

        public static Key of(MessageObject messageObject) {
            TLRPC.Message message;
            if (messageObject == null || (message = messageObject.messageOwner) == null || message.factcheck == null) {
                return null;
            }
            return new Key(messageObject.getDialogId(), messageObject.getId(), messageObject.messageOwner.factcheck.hash);
        }

        public int hashCode() {
            long j3 = this.hash;
            return (int) (j3 ^ (j3 >>> 32));
        }
    }

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            lockObjects[i10] = new Object();
        }
    }

    private FactCheckController(int i10) {
        this.currentAccount = i10;
    }

    private void clearExpiredInDatabase() {
        if (this.clearedExpiredInDatabase) {
            return;
        }
        this.clearedExpiredInDatabase = true;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new e2(messagesStorage, 0));
    }

    private void getFromDatabase(ArrayList<Key> arrayList, Utilities.Callback<ArrayList<TLRPC.TL_factCheck>> callback) {
        if (callback == null) {
            return;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            messagesStorage.getStorageQueue().postRunnable(new f0((BaseController) messagesStorage, (ArrayList) arrayList, (Object) callback, 19));
            return;
        }
        callback.run(new ArrayList<>());
    }

    public static FactCheckController getInstance(int i10) {
        FactCheckController factCheckController;
        FactCheckController factCheckController2 = Instance[i10];
        if (factCheckController2 == null) {
            synchronized (lockObjects[i10]) {
                try {
                    factCheckController = Instance[i10];
                    if (factCheckController == null) {
                        FactCheckController[] factCheckControllerArr = Instance;
                        FactCheckController factCheckController3 = new FactCheckController(i10);
                        factCheckControllerArr[i10] = factCheckController3;
                        factCheckController = factCheckController3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return factCheckController;
        }
        return factCheckController2;
    }

    public void lambda$applyFactCheck$14(TLObject tLObject) {
        MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
    }

    public void lambda$applyFactCheck$15(TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, org.telegram.ui.ActionBar.b2 b2Var) {
        boolean z11;
        int i10;
        int i11;
        if (tLObject instanceof TLRPC.Updates) {
            Utilities.stageQueue.postRunnable(new b2(1, this, (TLRPC.Updates) tLObject));
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U != null) {
                if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11 || !z10) {
                    org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(U);
                    if (z11) {
                        i10 = R.raw.ic_delete;
                    } else {
                        i10 = R.raw.contact_check;
                    }
                    if (z11) {
                        i11 = R.string.FactCheckDeleted;
                    } else {
                        i11 = R.string.FactCheckEdited;
                    }
                    w1.o(i11, a02, i10, 36);
                }
            }
        }
        b2Var.dismiss();
    }

    public void lambda$applyFactCheck$16(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new di.u1(this, tLObject, tL_textWithEntities, z10, b2Var, 4));
    }

    public static void lambda$clearExpiredInDatabase$7(MessagesStorage messagesStorage) {
        try {
            SQLiteDatabase database = messagesStorage.getDatabase();
            database.executeFast("DELETE FROM fact_checks WHERE expires > " + System.currentTimeMillis()).stepThis().dispose();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public void lambda$getFactCheck$0(Key key, MessageObject messageObject, TLRPC.TL_factCheck tL_factCheck) {
        this.localCache.put(key.hash, tL_factCheck);
        messageObject.messageOwner.factcheck = tL_factCheck;
    }

    public static void lambda$getFromDatabase$5(MessagesStorage messagesStorage, ArrayList arrayList, Utilities.Callback callback) {
        ArrayList arrayList2 = new ArrayList();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase database = messagesStorage.getDatabase();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    arrayList3.add(Long.valueOf(((Key) obj).hash));
                    arrayList2.add(null);
                }
                sQLiteCursor = database.queryFinalized("SELECT data FROM fact_checks WHERE hash IN (" + TextUtils.join(", ", arrayList3) + ")", new Object[0]);
                while (true) {
                    if (!sQLiteCursor.next()) {
                        break;
                    }
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    TLRPC.TL_factCheck TLdeserialize = TLRPC.TL_factCheck.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    if (TLdeserialize != null) {
                        int i11 = -1;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            if (TLdeserialize.hash == ((Key) arrayList.get(i12)).hash) {
                                i11 = i12;
                            }
                        }
                        if (i11 >= 0 && i11 < arrayList2.size()) {
                            arrayList2.set(i11, TLdeserialize);
                        }
                    }
                }
                sQLiteCursor.dispose();
            } catch (Exception e7) {
                FileLog.e(e7);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
            }
            AndroidUtilities.runOnUIThread(new d2(callback, arrayList2, 0));
        } catch (Throwable th2) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th2;
        }
    }

    public void lambda$loadMissing$1(TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        ArrayList arrayList2 = new ArrayList();
        if (tLObject instanceof Vector) {
            ArrayList<T> arrayList3 = ((Vector) tLObject).objects;
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                if (arrayList3.get(i10) instanceof TLRPC.TL_factCheck) {
                    arrayList2.add((TLRPC.TL_factCheck) arrayList3.get(i10));
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        for (int i11 = 0; i11 < Math.min(tL_getFactCheck.msg_id.size(), arrayList2.size()); i11++) {
            Integer num = tL_getFactCheck.msg_id.get(i11);
            num.intValue();
            hashMap2.put(num, (TLRPC.TL_factCheck) arrayList2.get(i11));
        }
        int i12 = 0;
        for (int i13 = 0; i13 < tL_getFactCheck.msg_id.size(); i13++) {
            Key key = (Key) arrayList.get(i13);
            Integer num2 = tL_getFactCheck.msg_id.get(i13);
            num2.intValue();
            TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) hashMap2.get(num2);
            Utilities.Callback callback = (Utilities.Callback) hashMap.get(key);
            if (tL_factCheck != null && !tL_factCheck.need_check && callback != null) {
                callback.run(tL_factCheck);
                i12++;
                this.loading.remove(key);
            }
        }
        if (i12 > 0) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.factCheckLoaded, new Object[0]);
        }
    }

    public void lambda$loadMissing$2(TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new a5(this, tLObject, tL_getFactCheck, arrayList, hashMap));
    }

    public void lambda$loadMissing$3(long j3, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2) {
        TLRPC.TL_getFactCheck tL_getFactCheck = new TLRPC.TL_getFactCheck();
        tL_getFactCheck.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j3);
        ArrayList arrayList3 = new ArrayList();
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            Key key = (Key) arrayList.get(i11);
            TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) arrayList2.get(i11);
            if (tL_factCheck == null) {
                arrayList3.add(key);
                tL_getFactCheck.msg_id.add(Integer.valueOf(key.messageId));
            } else {
                this.loading.remove(key);
                Utilities.Callback callback = (Utilities.Callback) hashMap.get(key);
                if (callback != null) {
                    callback.run(tL_factCheck);
                    i10++;
                }
            }
        }
        if (i10 > 0) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.factCheckLoaded, new Object[0]);
        }
        if (!tL_getFactCheck.msg_id.isEmpty()) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_getFactCheck, new h2(this, tL_getFactCheck, arrayList3, hashMap, 0));
        }
    }

    public static void lambda$openFactCheckEditor$10(View view, DialogInterface dialogInterface) {
        currentDialog = null;
        view.requestFocus();
    }

    public static void lambda$openFactCheckEditor$11(zt ztVar, DialogInterface dialogInterface) {
        ztVar.requestFocus();
        AndroidUtilities.showKeyboard(ztVar);
    }

    public static void lambda$openFactCheckEditor$13(zt ztVar, DialogInterface dialogInterface) {
        ztVar.requestFocus();
        AndroidUtilities.showKeyboard(ztVar);
    }

    public void lambda$openFactCheckEditor$8(zt ztVar, int i10, MessageObject messageObject, boolean z10, org.telegram.ui.ActionBar.b2 b2Var, int i11) {
        String charSequence;
        if (ztVar.getText().toString().length() > i10) {
            AndroidUtilities.shakeView(ztVar);
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {ztVar.getText()};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        applyFactCheck(messageObject, tL_textWithEntities, z10);
        b2Var.dismiss();
    }

    public static void lambda$saveToDatabase$6(MessagesStorage messagesStorage, TLRPC.TL_factCheck tL_factCheck) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = messagesStorage.getDatabase().executeFast("REPLACE INTO fact_checks VALUES(?, ?, ?)");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindLong(1, tL_factCheck.hash);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_factCheck.getObjectSize());
                tL_factCheck.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                sQLitePreparedStatement.bindLong(3, System.currentTimeMillis() + 889032704);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e7) {
                FileLog.e(e7);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th2) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th2;
        }
    }

    public void loadMissing() {
        while (this.toload.size() > 0) {
            long keyAt = this.toload.keyAt(0);
            HashMap<Key, Utilities.Callback<TLRPC.TL_factCheck>> valueAt = this.toload.valueAt(0);
            this.toload.removeAt(0);
            ArrayList<Key> arrayList = new ArrayList<>(valueAt.keySet());
            this.loading.addAll(arrayList);
            getFromDatabase(arrayList, new f2(this, keyAt, arrayList, valueAt, 0));
        }
        this.toload.clear();
    }

    private void saveToDatabase(TLRPC.TL_factCheck tL_factCheck) {
        if (tL_factCheck == null) {
            return;
        }
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new b2(2, messagesStorage, tL_factCheck));
        clearExpiredInDatabase();
    }

    private void scheduleLoadMissing() {
        AndroidUtilities.cancelRunOnUIThread(this.loadMissingRunnable);
        AndroidUtilities.runOnUIThread(this.loadMissingRunnable, 80L);
    }

    public void applyFactCheck(MessageObject messageObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10) {
        TLRPC.TL_deleteFactCheck tL_deleteFactCheck;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            TLRPC.TL_editFactCheck tL_editFactCheck = new TLRPC.TL_editFactCheck();
            tL_editFactCheck.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
            tL_editFactCheck.msg_id = messageObject.getId();
            tL_editFactCheck.text = tL_textWithEntities;
            tL_deleteFactCheck = tL_editFactCheck;
        } else if (z10) {
            return;
        } else {
            TLRPC.TL_deleteFactCheck tL_deleteFactCheck2 = new TLRPC.TL_deleteFactCheck();
            tL_deleteFactCheck2.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
            tL_deleteFactCheck2.msg_id = messageObject.getId();
            tL_deleteFactCheck = tL_deleteFactCheck2;
        }
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
        b2Var.q(320L);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_deleteFactCheck, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                FactCheckController.this.lambda$applyFactCheck$16(tL_textWithEntities, z10, b2Var, tLObject, tL_error);
            }
        });
    }

    public TLRPC.TL_factCheck getFactCheck(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.TL_factCheck tL_factCheck;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (tL_factCheck = message.factcheck) != null) {
            if (!tL_factCheck.need_check) {
                if (this.localCache.get(tL_factCheck.hash) == null) {
                    LongSparseArray<TLRPC.TL_factCheck> longSparseArray = this.localCache;
                    TLRPC.TL_factCheck tL_factCheck2 = messageObject.messageOwner.factcheck;
                    longSparseArray.put(tL_factCheck2.hash, tL_factCheck2);
                    saveToDatabase(messageObject.messageOwner.factcheck);
                }
                return messageObject.messageOwner.factcheck;
            }
            Key of2 = Key.of(messageObject);
            if (of2 != null && of2.messageId >= 0) {
                TLRPC.TL_factCheck tL_factCheck3 = this.localCache.get(of2.hash);
                if (tL_factCheck3 != null) {
                    messageObject.messageOwner.factcheck = tL_factCheck3;
                    return tL_factCheck3;
                } else if (this.loading.contains(of2)) {
                    return messageObject.messageOwner.factcheck;
                } else {
                    HashMap<Key, Utilities.Callback<TLRPC.TL_factCheck>> hashMap = this.toload.get(of2.dialogId);
                    if (hashMap == null) {
                        LongSparseArray<HashMap<Key, Utilities.Callback<TLRPC.TL_factCheck>>> longSparseArray2 = this.toload;
                        long j3 = of2.dialogId;
                        HashMap<Key, Utilities.Callback<TLRPC.TL_factCheck>> hashMap2 = new HashMap<>();
                        longSparseArray2.put(j3, hashMap2);
                        hashMap = hashMap2;
                    }
                    if (!hashMap.containsKey(of2)) {
                        hashMap.put(of2, new g2(this, of2, messageObject, 0));
                        scheduleLoadMissing();
                    }
                    return messageObject.messageOwner.factcheck;
                }
            }
            return null;
        }
        return null;
    }

    public void openFactCheckEditor(Context context, final org.telegram.ui.ActionBar.f6 f6Var, final MessageObject messageObject, boolean z10) {
        final View view;
        boolean z11;
        AlertDialog$Builder alertDialog$Builder;
        boolean z12;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        if (R != null && (R.getFragmentView() instanceof ov0) && ((ov0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f) && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        final org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        if (z11) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        final TextView[] textViewArr = new TextView[1];
        if (messageObject != null && (message = messageObject.messageOwner) != null && message.factcheck != null) {
            z12 = false;
        } else {
            z12 = true;
        }
        String string = LocaleController.getString(R.string.FactCheckDialog);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.f20198a;
        b2Var.R = string;
        final int i10 = MessagesController.getInstance(this.currentAccount).factcheckLengthLimit;
        final zt ztVar = new zt(context, f6Var) {
            org.telegram.ui.Components.p6 limit;
            org.telegram.ui.Components.h5 limitColor = new org.telegram.ui.Components.h5(this);
            private int limitCount;

            {
                FactCheckController.this = this;
                org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true, false);
                this.limit = p6Var;
                p6Var.k(0.2f, 160L, pr.h);
                this.limit.t(AndroidUtilities.dp(15.33f));
                this.limit.setCallback(this);
                this.limit.f29285b = 5;
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                int i11;
                super.dispatchDraw(canvas);
                org.telegram.ui.Components.p6 p6Var = this.limit;
                org.telegram.ui.Components.h5 h5Var = this.limitColor;
                if (this.limitCount < 0) {
                    i11 = org.telegram.ui.ActionBar.j6.f20880p7;
                } else {
                    i11 = org.telegram.ui.ActionBar.j6.P5;
                }
                p6Var.r(h5Var.a(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), false));
                this.limit.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                this.limit.draw(canvas);
            }

            @Override
            public void extendActionMode(ActionMode actionMode, Menu menu) {
                if (menu.findItem(R.id.menu_bold) != null) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    menu.removeItem(16908341);
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
                spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 6, spannableStringBuilder);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
                spannableStringBuilder2.setSpan(new e51(AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
                menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 7, spannableStringBuilder2);
                menu.add(R.id.menu_groupbolditalic, R.id.menu_link, 8, LocaleController.getString(R.string.CreateLink));
                menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 9, LocaleController.getString(R.string.Regular));
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
                super.onTextChanged(charSequence, i11, i12, i13);
                if (this.limit != null) {
                    this.limitCount = i10 - charSequence.length();
                    this.limit.b();
                    org.telegram.ui.Components.p6 p6Var = this.limit;
                    String str = "";
                    if (this.limitCount <= 4) {
                        str = "" + this.limitCount;
                    }
                    p6Var.q(str, true, true);
                }
            }

            @Override
            public boolean verifyDrawable(Drawable drawable) {
                if (drawable != this.limit && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            }
        };
        ztVar.lineYFix = true;
        final boolean z13 = z12;
        ztVar.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            {
                FactCheckController.this = this;
            }

            @Override
            public boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                String charSequence;
                if (i11 != 6) {
                    return false;
                }
                if (ztVar.getText().toString().length() > i10) {
                    AndroidUtilities.shakeView(ztVar);
                    return true;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                CharSequence[] charSequenceArr = {ztVar.getText()};
                tL_textWithEntities2.entities = MediaDataController.getInstance(FactCheckController.this.currentAccount).getEntities(charSequenceArr, true);
                CharSequence charSequence2 = charSequenceArr[0];
                if (charSequence2 == null) {
                    charSequence = "";
                } else {
                    charSequence = charSequence2.toString();
                }
                tL_textWithEntities2.text = charSequence;
                FactCheckController.this.applyFactCheck(messageObject, tL_textWithEntities2, z13);
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr[0];
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                }
                if (b2VarArr[0] == FactCheckController.currentDialog) {
                    org.telegram.ui.ActionBar.b2 unused = FactCheckController.currentDialog = null;
                }
                View view2 = view;
                if (view2 != null) {
                    view2.requestFocus();
                }
                return true;
            }
        });
        MediaDataController.getInstance(this.currentAccount).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        ztVar.setTextSize(1, 18.0f);
        ztVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20770j5, f6Var));
        ztVar.setHintColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xh, f6Var));
        ztVar.setHintText(LocaleController.getString(R.string.FactCheckPlaceholder));
        ztVar.setFocusable(true);
        ztVar.setInputType(147457);
        ztVar.setLineColors(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20791k6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20809l6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20880p7, f6Var));
        ztVar.setImeOptions(6);
        ztVar.setBackgroundDrawable(null);
        ztVar.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        final TLRPC.TL_factCheck factCheck = messageObject.getFactCheck();
        if (factCheck != null && (tL_textWithEntities = factCheck.text) != null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(tL_textWithEntities.text);
            MessageObject.addEntitiesToText(valueOf, factCheck.text.entities, false, true, false, false);
            ztVar.setText(valueOf);
        }
        ztVar.addTextChangedListener(new TextWatcher() {
            boolean ignoreTextChange;

            {
                FactCheckController.this = this;
            }

            @Override
            public void afterTextChanged(Editable editable) {
                int i11;
                int i12;
                if (!this.ignoreTextChange) {
                    int length = editable.length();
                    int i13 = i10;
                    boolean z14 = true;
                    if (length > i13) {
                        this.ignoreTextChange = true;
                        editable.delete(i13, editable.length());
                        AndroidUtilities.shakeView(ztVar);
                        try {
                            ztVar.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.ignoreTextChange = false;
                    }
                    if (textViewArr[0] != null) {
                        if (editable.length() <= 0 && factCheck != null) {
                            z14 = false;
                        }
                        TextView textView = textViewArr[0];
                        if (z14) {
                            i11 = R.string.Done;
                        } else {
                            i11 = R.string.Remove;
                        }
                        textView.setText(LocaleController.getString(i11));
                        TextView textView2 = textViewArr[0];
                        if (z14) {
                            i12 = org.telegram.ui.ActionBar.j6.H5;
                        } else {
                            i12 = org.telegram.ui.ActionBar.j6.f20898q7;
                        }
                        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    }
                }
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(ztVar, w7.x5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.c();
        alertDialog$Builder2.n(linearLayout);
        b2Var.f20224a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder2.k(LocaleController.getString(R.string.Done), new j2(this, ztVar, i10, messageObject, z13));
        alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), new b(9));
        if (z11) {
            currentDialog = b2Var;
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    switch (r1) {
                        case 0:
                            FactCheckController.lambda$openFactCheckEditor$10(view, dialogInterface);
                            return;
                        default:
                            AndroidUtilities.hideKeyboard((zt) view);
                            return;
                    }
                }
            });
            currentDialog.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            FactCheckController.lambda$openFactCheckEditor$11(ztVar, dialogInterface);
                            return;
                        default:
                            FactCheckController.lambda$openFactCheckEditor$13(ztVar, dialogInterface);
                            return;
                    }
                }
            });
            currentDialog.q(250L);
        } else {
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    switch (r1) {
                        case 0:
                            FactCheckController.lambda$openFactCheckEditor$10(ztVar, dialogInterface);
                            return;
                        default:
                            AndroidUtilities.hideKeyboard((zt) ztVar);
                            return;
                    }
                }
            });
            b2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            FactCheckController.lambda$openFactCheckEditor$11(ztVar, dialogInterface);
                            return;
                        default:
                            FactCheckController.lambda$openFactCheckEditor$13(ztVar, dialogInterface);
                            return;
                    }
                }
            });
            b2VarArr[0].show();
        }
        org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr[0];
        b2Var2.f20238h0 = false;
        View d = b2Var2.d(-1);
        if (d instanceof TextView) {
            textViewArr[0] = (TextView) d;
        }
        ztVar.setSelection(ztVar.getText().length());
    }
}
