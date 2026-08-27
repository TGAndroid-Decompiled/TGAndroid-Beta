package cg;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import gh.c6;
import gh.m6;
import gh.p5;
import hh.u7;
import hh.v6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jh.b4;
import jh.b6;
import jh.c5;
import jh.d4;
import jh.e4;
import jh.h9;
import jh.i9;
import jh.j3;
import jh.j6;
import jh.m4;
import jh.r3;
import jh.t3;
import jh.x3;
import lh.cc;
import lh.k9;
import lh.nb;
import lh.o9;
import lh.q9;
import lh.sb;
import lh.z7;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.k6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.dn;
import org.telegram.ui.do0;
import org.telegram.ui.dq;
import org.telegram.ui.f7;
import org.telegram.ui.id;
import org.telegram.ui.jo;
import org.telegram.ui.kb;
import org.telegram.ui.kr;
import org.telegram.ui.lr;
import org.telegram.ui.m7;
import org.telegram.ui.ma;
import org.telegram.ui.na;
import org.telegram.ui.qb;
import org.telegram.ui.rn;
import org.telegram.ui.s5;
import org.telegram.ui.s7;
import org.telegram.ui.xc;
import org.telegram.ui.xo;
import org.telegram.ui.yf;

public final class k0 implements Runnable {

    public final int f2743a;

    public final Object f2744b;

    public final Object f2745c;
    public final Object d;

    public final Object f2746e;

    public final Object f2747f;

    public k0(y2 y2Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        this.f2743a = 3;
        this.f2746e = y2Var;
        this.f2745c = tLObject;
        this.f2747f = userFull;
        this.d = tL_birthday;
        this.f2744b = tL_error;
    }

    private final void a() {
        id idVar = (id) this.f2746e;
        String str = (String) this.f2747f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f2744b;
        TLObject tLObject = (TLObject) this.f2745c;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.d;
        idVar.S = 0;
        String str2 = idVar.T;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            idVar.Q.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
            org.telegram.ui.Cells.w1 w1Var = idVar.Q;
            int i10 = g6.f23391w6;
            w1Var.setTag(Integer.valueOf(i10));
            idVar.Q.setTextColor(g6.w0(null, i10, false));
            idVar.V = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            idVar.Q.setText(LocaleController.getString(R.string.UsernameInvalidShort));
            idVar.Q.setTextColor(g6.w0(null, g6.f23269p7, false));
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                idVar.Q.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
            } else {
                idVar.Q.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
            }
            idVar.Q.setTextColor(g6.w0(null, g6.F6, false));
        } else if (tL_error == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            idVar.Q.setTextColor(g6.w0(null, g6.f23269p7, false));
            idVar.Q.setText(LocaleController.getString(R.string.LinkInUse));
        } else {
            idVar.Q.setTextColor(g6.w0(null, g6.f23269p7, false));
            idVar.f39039f0 = false;
            idVar.f0();
        }
        idVar.V = false;
    }

    private final void b() {
        xo xoVar = (xo) this.f2746e;
        String str = (String) this.f2747f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f2744b;
        TLObject tLObject = (TLObject) this.f2745c;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.d;
        xoVar.f44554d0 = 0;
        String str2 = xoVar.f44556e0;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            xoVar.f44557f.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
            xoVar.f44557f.setTextColorByKey(g6.f23391w6);
            xoVar.f44559g0 = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            xoVar.f44557f.setText(LocaleController.getString(R.string.UsernameInvalidShort));
            xoVar.f44557f.setTextColor(g6.w0(null, g6.f23269p7, false));
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                xoVar.f44557f.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
            } else {
                xoVar.f44557f.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
            }
            xoVar.f44557f.setTextColor(g6.w0(null, g6.F6, false));
        } else if (tL_error == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            xoVar.f44557f.setText(LocaleController.getString(R.string.LinkInUse));
            xoVar.f44557f.setTextColorByKey(g6.f23269p7);
        } else {
            xoVar.Y = false;
            xoVar.Z();
        }
        xoVar.f44559g0 = false;
    }

    private final void c() {
        dq.Y((dq) this.f2746e, (TLRPC.TL_error) this.f2744b, (TLRPC.InputCheckPasswordSRP) this.f2747f, (TwoStepVerificationActivity) this.f2745c, (TLRPC.TL_channels_editCreator) this.d);
    }

    @Override
    public final void run() {
        do0 do0Var;
        long jLongValue;
        int i10;
        int i11;
        boolean z10;
        ArrayList arrayList;
        int i12;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        long j10;
        h9 h9Var;
        int i13;
        int i14 = 22;
        int i15 = 4;
        int i16 = 2;
        do0 do0Var2 = 0;
        SQLiteCursor sQLiteCursor = null;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = null;
        do0 do0Var3 = null;
        savedStarGift = null;
        TL_stars.SavedStarGift savedStarGift = null;
        do0 do0Var4 = null;
        int i17 = 0;
        switch (this.f2743a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f2744b;
                Utilities.Callback callback = (Utilities.Callback) this.f2746e;
                TLObject tLObject = (TLObject) this.f2745c;
                MessagesController messagesController = (MessagesController) this.d;
                Utilities.Callback callback2 = (Utilities.Callback) this.f2747f;
                if (tL_error != null) {
                    callback.run(tL_error);
                    return;
                } else {
                    if (tLObject instanceof TL_stories.TL_premium_myBoosts) {
                        TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) tLObject;
                        messagesController.putUsers(tL_premium_myBoosts.users, false);
                        messagesController.putChats(tL_premium_myBoosts.chats, false);
                        callback2.run(tL_premium_myBoosts);
                        return;
                    }
                    return;
                }
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f2744b;
                org.telegram.messenger.w wVar = (org.telegram.messenger.w) this.f2746e;
                TLObject tLObject2 = (TLObject) this.f2745c;
                MessagesController messagesController2 = (MessagesController) this.d;
                org.telegram.messenger.h2 h2Var = (org.telegram.messenger.h2) this.f2747f;
                if (tL_error2 != null) {
                    wVar.run(tL_error2);
                    return;
                } else {
                    if (tLObject2 instanceof TL_stories.TL_premium_myBoosts) {
                        TL_stories.TL_premium_myBoosts tL_premium_myBoosts2 = (TL_stories.TL_premium_myBoosts) tLObject2;
                        messagesController2.putUsers(tL_premium_myBoosts2.users, false);
                        messagesController2.putChats(tL_premium_myBoosts2.chats, false);
                        h2Var.run(tL_premium_myBoosts2);
                        return;
                    }
                    return;
                }
            case 2:
                TLObject tLObject3 = (TLObject) this.f2745c;
                MessagesController messagesController3 = (MessagesController) this.d;
                e1 e1Var = (e1) this.f2746e;
                m mVar = (m) this.f2747f;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f2744b;
                if (tLObject3 instanceof TLRPC.TL_payments_checkedGiftCode) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) tLObject3;
                    messagesController3.putChats(tL_payments_checkedGiftCode.chats, false);
                    messagesController3.putUsers(tL_payments_checkedGiftCode.users, false);
                    e1Var.run(tL_payments_checkedGiftCode);
                }
                mVar.run(tL_error3);
                return;
            case 3:
                y2.R((y2) this.f2746e, (TLObject) this.f2745c, (TLRPC.UserFull) this.f2747f, (TL_account.TL_birthday) this.d, (TLRPC.TL_error) this.f2744b);
                return;
            case 4:
                m6 m6Var = (m6) this.f2746e;
                TLObject tLObject4 = (TLObject) this.f2745c;
                TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = (TLRPC.TL_inputStorePaymentGiftPremium) this.f2747f;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f2744b;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.d;
                int i18 = m6Var.U;
                org.telegram.ui.ActionBar.n2 n2Var = m6Var.f31855n;
                if (!(tLObject4 instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error4 != null) {
                        y4.f0(i18, tL_error4, n2Var, tL_payments_canPurchaseStore, new Object[0]);
                        return;
                    }
                    return;
                } else {
                    BillingController billingController = BillingController.getInstance();
                    Activity parentActivity = n2Var.getParentActivity();
                    AccountInstance accountInstance = AccountInstance.getInstance(i18);
                    g5.b bVar = new g5.b(i14);
                    bVar.t(m6Var.f7438a0.h);
                    billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentGiftPremium, Collections.singletonList(bVar.i()));
                    return;
                }
            case 5:
                hh.o0 o0Var = (hh.o0) this.f2746e;
                we.d dVar = (we.d) this.f2747f;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f2745c;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.f2744b;
                hh.v1 v1Var = o0Var.m0;
                if (v1Var != null) {
                    v1Var.run();
                }
                dVar.c(false);
                b2Var.dismiss();
                o0Var.dismiss();
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                if (n2VarU != null) {
                    if (updates == null) {
                        mc.a0(n2VarU).d0(tL_error5, false);
                        return;
                    }
                    ec ecVarM = mc.a0(n2VarU).M(LocaleController.getString(R.string.GiftOfferSentTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferSentText, o0Var.V, DialogObject.getShortName(o0Var.W))), R.raw.forward);
                    ecVarM.f28030t = true;
                    ecVarM.j();
                    return;
                }
                return;
            case 6:
                u7 u7Var = (u7) this.f2746e;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.f2744b;
                u0 u0Var = (u0) this.f2747f;
                TLObject tLObject5 = (TLObject) this.f2745c;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = (TLRPC.TL_inputInvoiceStars) this.d;
                if (tL_error6 != null) {
                    u0Var.run(Boolean.FALSE, tL_error6.text);
                    return;
                }
                if (tLObject5 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject5;
                    paymentForm.invoice.recurring = true;
                    MessagesController.getInstance(u7Var.f10151a).putUsers(paymentForm.users, false);
                    do0Var2 = new do0(paymentForm, tL_inputInvoiceStars, null);
                } else if (tLObject5 instanceof TLRPC.PaymentReceipt) {
                    do0Var = new do0((TLRPC.PaymentReceipt) tLObject5);
                }
                if (do0Var2 == 0) {
                    do0Var2 = do0Var;
                    u0Var.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                do0Var2 = do0Var;
                do0Var2.V0 = new h3.x(u0Var, 11);
                org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                if (n2VarR == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(n2VarR)) {
                    n2VarR.presentFragment(do0Var2);
                    return;
                }
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.f23619a = true;
                n2VarR.showAsSheet(do0Var2, l2Var);
                return;
            case 7:
                u7 u7Var2 = (u7) this.f2746e;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.f2744b;
                p5 p5Var = (p5) this.f2747f;
                TLObject tLObject6 = (TLObject) this.f2745c;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars2 = (TLRPC.TL_inputInvoiceStars) this.d;
                if (tL_error7 != null) {
                    p5Var.run(Boolean.FALSE, tL_error7.text);
                    return;
                }
                if (tLObject6 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject6;
                    paymentForm2.invoice.recurring = true;
                    MessagesController.getInstance(u7Var2.f10151a).putUsers(paymentForm2.users, false);
                    do0Var4 = new do0(paymentForm2, tL_inputInvoiceStars2, null);
                } else if (tLObject6 instanceof TLRPC.PaymentReceipt) {
                    do0Var4 = new do0((TLRPC.PaymentReceipt) tLObject6);
                }
                if (do0Var4 == null) {
                    p5Var.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                do0Var4.V0 = new h3.x(p5Var, 12);
                org.telegram.ui.ActionBar.n2 n2VarR2 = LaunchActivity.R();
                if (n2VarR2 == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(n2VarR2)) {
                    n2VarR2.presentFragment(do0Var4);
                    return;
                }
                org.telegram.ui.ActionBar.l2 l2Var2 = new org.telegram.ui.ActionBar.l2();
                l2Var2.f23619a = true;
                n2VarR2.showAsSheet(do0Var4, l2Var2);
                return;
            case 8:
                u7 u7Var3 = (u7) this.f2744b;
                boolean[] zArr = (boolean[]) this.f2746e;
                String str = (String) this.f2747f;
                TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.f2745c;
                Utilities.Callback2 callback3 = (Utilities.Callback2) this.d;
                zArr[0] = true;
                u7Var3.Z(str, chatInvite, new ch.c(callback3, 17));
                return;
            case 9:
                MessagesStorage messagesStorage = (MessagesStorage) this.f2744b;
                ArrayList arrayList2 = (ArrayList) this.f2746e;
                ArrayList<TLRPC.Chat> arrayList3 = (ArrayList) this.f2747f;
                ArrayList<TLRPC.User> arrayList4 = (ArrayList) this.f2745c;
                h3.x xVar = (h3.x) this.d;
                try {
                    try {
                        ?? r10 = 0;
                        SQLiteCursor sQLiteCursorQueryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT data, hash, time FROM star_gifts2 ORDER BY pos ASC", new Object[0]);
                        jLongValue = 0;
                        int iLongValue = 0;
                        while (sQLiteCursorQueryFinalized.next()) {
                            try {
                                NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(r10);
                                if (nativeByteBufferByteBufferValue != 0) {
                                    TL_stars.StarGift starGiftTLdeserialize = TL_stars.StarGift.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(r10), r10);
                                    if (starGiftTLdeserialize != null) {
                                        arrayList2.add(starGiftTLdeserialize);
                                    }
                                    nativeByteBufferByteBufferValue.reuse();
                                    iLongValue = (int) sQLiteCursorQueryFinalized.longValue(1);
                                    jLongValue = sQLiteCursorQueryFinalized.longValue(2);
                                }
                                r10 = 0;
                            } catch (Exception e9) {
                                e = e9;
                                i10 = iLongValue;
                                sQLiteCursor = sQLiteCursorQueryFinalized;
                                FileLog.e(e);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                i11 = i10;
                            }
                        }
                        ArrayList<Long> arrayList5 = new ArrayList<>();
                        ArrayList arrayList6 = new ArrayList();
                        int size = arrayList2.size();
                        int i19 = 0;
                        while (i19 < size) {
                            Object obj = arrayList2.get(i19);
                            i19++;
                            TLRPC.Peer peer = ((TL_stars.StarGift) obj).released_by;
                            if (peer != null) {
                                long peerDialogId = DialogObject.getPeerDialogId(peer);
                                if (peerDialogId > 0) {
                                    arrayList5.add(Long.valueOf(peerDialogId));
                                } else if (peerDialogId < 0) {
                                    arrayList6.add(Long.valueOf(-peerDialogId));
                                }
                            }
                        }
                        if (!arrayList6.isEmpty()) {
                            messagesStorage.getChatsInternal(TextUtils.join(",", arrayList6), arrayList3);
                        }
                        if (!arrayList5.isEmpty()) {
                            messagesStorage.getUsersInternal(arrayList5, arrayList4);
                        }
                        sQLiteCursorQueryFinalized.dispose();
                        i11 = iLongValue;
                    } catch (Throwable th) {
                        if (0 != 0) {
                            do0Var2.dispose();
                        }
                        throw th;
                    }
                    break;
                } catch (Exception e10) {
                    e = e10;
                    jLongValue = 0;
                    i10 = 0;
                }
                AndroidUtilities.runOnUIThread(new v6(xVar, arrayList2, i11, jLongValue, arrayList4, arrayList3));
                return;
            case 10:
                u7 u7Var4 = (u7) this.f2744b;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.f2747f;
                TLObject tLObject7 = (TLObject) this.f2745c;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.d;
                Utilities.Callback callback4 = (Utilities.Callback) this.f2746e;
                int i20 = u7Var4.f10151a;
                b2Var2.dismiss();
                if (tLObject7 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject7;
                    MessagesController.getInstance(i20).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i20).putChats(tL_payments_savedStarGifts.chats, false);
                    for (int i21 = 0; i21 < tL_payments_savedStarGifts.gifts.size(); i21++) {
                        TL_stars.SavedStarGift savedStarGift2 = tL_payments_savedStarGifts.gifts.get(i21);
                        if (((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) && ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id == savedStarGift2.msg_id) || ((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) && ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id == savedStarGift2.saved_id)) {
                            savedStarGift = savedStarGift2;
                        }
                    }
                }
                callback4.run(savedStarGift);
                return;
            case 11:
                u7 u7Var5 = (u7) this.f2746e;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.f2744b;
                Utilities.Callback2 callback5 = (Utilities.Callback2) this.f2747f;
                TLObject tLObject8 = (TLObject) this.f2745c;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars3 = (TLRPC.TL_inputInvoiceStars) this.d;
                if (tL_error8 != null) {
                    callback5.run(Boolean.FALSE, tL_error8.text);
                    return;
                }
                if (tLObject8 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm3 = (TLRPC.PaymentForm) tLObject8;
                    paymentForm3.invoice.recurring = true;
                    MessagesController.getInstance(u7Var5.f10151a).putUsers(paymentForm3.users, false);
                    do0Var3 = new do0(paymentForm3, tL_inputInvoiceStars3, null);
                } else if (tLObject8 instanceof TLRPC.PaymentReceipt) {
                    do0Var3 = new do0((TLRPC.PaymentReceipt) tLObject8);
                }
                if (do0Var3 == null) {
                    callback5.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                do0Var3.V0 = new h3.x(callback5, 10);
                org.telegram.ui.ActionBar.n2 n2VarR3 = LaunchActivity.R();
                if (n2VarR3 == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(n2VarR3)) {
                    n2VarR3.presentFragment(do0Var3);
                    return;
                }
                org.telegram.ui.ActionBar.l2 l2Var3 = new org.telegram.ui.ActionBar.l2();
                l2Var3.f23619a = true;
                n2VarR3.showAsSheet(do0Var3, l2Var3);
                return;
            case 12:
                List list = (List) this.f2744b;
                Utilities.Callback2 callback6 = (Utilities.Callback2) this.f2746e;
                TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = (TLRPC.TL_inputStorePaymentStarsTopup) this.f2747f;
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) this.f2745c;
                Activity activity = (Activity) this.d;
                if (list.isEmpty()) {
                    FileLog.d("StarsController.buy queryProductDetails done: no products");
                    AndroidUtilities.runOnUIThread(new hh.p5(2, callback6));
                    return;
                }
                n2.l lVar = (n2.l) list.get(0);
                n2.i iVarA = lVar.a();
                if (iVarA == null) {
                    FileLog.d("StarsController.buy queryProductDetails done: no details");
                    AndroidUtilities.runOnUIThread(new hh.p5(3, callback6));
                    return;
                }
                tL_inputStorePaymentStarsTopup.currency = iVarA.f18152c;
                tL_inputStorePaymentStarsTopup.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                BillingController.getInstance().addResultListener(lVar.f18163c, new c6(callback6, 1));
                BillingController.getInstance().setOnCanceled(new hh.p5(0, callback6));
                FileLog.d("StarsController.buy launchBillingFlow");
                BillingController billingController2 = BillingController.getInstance();
                AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                g5.b bVar2 = new g5.b(i14);
                bVar2.t((n2.l) list.get(0));
                billingController2.launchBillingFlow(activity, accountInstance2, tL_inputStorePaymentStarsTopup, Collections.singletonList(bVar2.i()));
                return;
            case 13:
                jh.o oVarE = (jh.o) this.f2744b;
                jh.p pVar = (jh.p) this.f2746e;
                Long l10 = (Long) this.f2747f;
                sb sbVar = (sb) this.f2745c;
                Runnable runnable = (Runnable) this.d;
                if (oVarE == null) {
                    oVarE = pVar.e(l10.longValue());
                }
                sbVar.Y(nb.c(oVarE));
                runnable.run();
                return;
            case 14:
                e4 e4Var = (e4) this.f2746e;
                Runnable runnable2 = (Runnable) this.f2747f;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.f2744b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f2745c;
                o9 o9Var = (o9) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = e4Var.f13290x0;
                j3 j3Var = e4Var.Y0;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (tL_error9 == null || "STORY_NOT_MODIFIED".equals(tL_error9.text)) {
                    storyItem.parsedPrivacy = o9Var;
                    ArrayList arrayList7 = o9Var.f16490b;
                    int i22 = o9Var.f16489a;
                    ArrayList arrayList8 = o9Var.f16491c;
                    ArrayList<TLRPC.PrivacyRule> arrayList9 = new ArrayList<>();
                    while (i17 < arrayList7.size()) {
                        TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList7.get(i17);
                        if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowAll) {
                            arrayList9.add(new TLRPC.TL_privacyValueAllowAll());
                        } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowCloseFriends) {
                            arrayList9.add(new TLRPC.TL_privacyValueAllowCloseFriends());
                        } else {
                            if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowContacts) {
                                arrayList9.add(new TLRPC.TL_privacyValueAllowContacts());
                            } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) {
                                TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = (TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule;
                                TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = new TLRPC.TL_privacyValueDisallowUsers();
                                int iF = 0;
                                while (iF < tL_inputPrivacyValueDisallowUsers.users.size()) {
                                    iF = com.google.android.recaptcha.internal.a.f(tL_inputPrivacyValueDisallowUsers.users.get(iF).user_id, tL_privacyValueDisallowUsers.users, iF, 1);
                                    i17 = i17;
                                    arrayList7 = arrayList7;
                                }
                                arrayList = arrayList7;
                                i12 = i17;
                                arrayList9.add(tL_privacyValueDisallowUsers);
                            } else {
                                arrayList = arrayList7;
                                i12 = i17;
                                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule;
                                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                    for (int iF2 = 0; iF2 < tL_inputPrivacyValueAllowUsers.users.size(); iF2 = com.google.android.recaptcha.internal.a.f(tL_inputPrivacyValueAllowUsers.users.get(iF2).user_id, tL_privacyValueAllowUsers.users, iF2, 1)) {
                                    }
                                    arrayList9.add(tL_privacyValueAllowUsers);
                                }
                            }
                            i17 = i12 + 1;
                            arrayList7 = arrayList;
                        }
                        arrayList = arrayList7;
                        i12 = i17;
                        i17 = i12 + 1;
                        arrayList7 = arrayList;
                    }
                    storyItem.privacy = arrayList9;
                    storyItem.close_friends = i22 == 1;
                    storyItem.contacts = i22 == 2;
                    storyItem.selected_contacts = i22 == 3;
                    MessagesController.getInstance(e4Var.f13296y2).getStoriesController().p0(storyItem.dialogId, storyItem, true);
                    e4Var.X3 = true;
                    if (i22 == 4) {
                        new mc(j3Var, c6Var).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToEveryone")).j();
                    } else if (i22 == 1) {
                        new mc(j3Var, c6Var).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToCloseFriends")).j();
                    } else {
                        if (i22 != 2) {
                            if (i22 == 3) {
                                HashSet hashSet = new HashSet();
                                hashSet.addAll(arrayList8);
                                Iterator it = o9Var.d.values().iterator();
                                while (it.hasNext()) {
                                    hashSet.addAll((ArrayList) it.next());
                                }
                                z10 = false;
                                new mc(j3Var, c6Var).Q(R.raw.contact_check, 36, LocaleController.formatPluralString("StorySharedToContacts", hashSet.size(), new Object[0])).j();
                            }
                            e4Var.f1(z10);
                            return;
                        }
                        if (arrayList8.isEmpty()) {
                            new mc(j3Var, c6Var).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToAllContacts")).j();
                        } else {
                            new mc(j3Var, c6Var).Q(R.raw.contact_check, 36, LocaleController.formatPluralString("StorySharedToAllContactsExcluded", arrayList8.size(), new Object[0])).j();
                        }
                    }
                } else {
                    org.telegram.messenger.y1.q(R.string.UnknownError, new mc(j3Var, c6Var), R.raw.error, 36);
                }
                z10 = false;
                e4Var.f1(z10);
                return;
            case 15:
                x3 x3Var = (x3) this.f2744b;
                Activity activity2 = (Activity) this.f2746e;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.f2747f;
                i9 i9Var = (i9) this.f2745c;
                b4 b4Var = (b4) this.d;
                sb sbVarE = sb.E(activity2, x3Var.f14128l.f13296y2);
                d4 d4Var = x3Var.f14128l.I2;
                long j11 = (d4Var == null || (h9Var = d4Var.f13192b) == null) ? 0L : h9Var.currentPosition;
                z7 z7VarN = z7.n(x3Var.f14128l.K1.h(), x3Var.f14128l.K1.f13141a);
                e4 e4Var2 = x3Var.f14128l;
                z7VarN.f17204e = e4Var2.f13291x1;
                TL_stories.StoryItem storyItem3 = e4Var2.K1.f13141a;
                if (storyItem3 == null || (messageMedia = storyItem3.media) == null || (document = messageMedia.document) == null) {
                    j10 = 0;
                } else {
                    for (int i23 = 0; i23 < document.attributes.size(); i23++) {
                        if (document.attributes.get(i23) instanceof TLRPC.TL_documentAttributeVideo) {
                            tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i23);
                            if (tL_documentAttributeVideo == null) {
                                j10 = 0;
                            } else {
                                j10 = (long) (tL_documentAttributeVideo.video_start_ts * 1000.0d);
                            }
                        }
                    }
                    if (tL_documentAttributeVideo == null) {
                        j10 = 0;
                    } else {
                        j10 = (long) (tL_documentAttributeVideo.video_start_ts * 1000.0d);
                    }
                }
                z7VarN.f17205e0 = j10;
                z7 z7VarG = z7VarN.g();
                z7VarG.f17197b0 = true;
                e4 e4Var3 = x3Var.f14128l;
                TL_stories.StoryItem storyItem4 = e4Var3.K1.f13141a;
                z7VarG.f17200c0 = storyItem4.media.document;
                z7VarG.f17202d0 = new gh.i(x3Var, storyItem4, storyItem2, 5);
                if (e4Var3.I0()) {
                    e4 e4Var4 = x3Var.f14128l;
                    z7VarG.J0 = e4Var4.f13291x1;
                    z7VarG.L0 = MessagesController.toInputMedia(e4Var4.K1.f13141a.media);
                    j6 j6Var = i9Var.K0;
                    if (j6Var instanceof b6) {
                        z7VarG.K0 = ((b6) j6Var).E;
                    }
                }
                sbVarE.S(nb.d(i9Var), z7VarG, j11);
                sbVarE.M = new r3(x3Var, i16);
                sbVarE.N = new t3(x3Var, b4Var, i17);
                return;
            case 16:
                m4 m4Var = (m4) this.f2744b;
                TLRPC.User user = (TLRPC.User) this.f2746e;
                String str2 = (String) this.f2747f;
                k6 k6Var = (k6) this.f2745c;
                TL_stories.StoryView storyView = (TL_stories.StoryView) this.d;
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                c5 c5Var = m4Var.f13655b;
                ContactsController.getInstance(c5Var.v).deleteContact(arrayList10, false);
                pa.r(R.string.DeletedFromYourContacts, new Object[]{str2}, new mc(c5Var, c5Var.f13157s), R.raw.ic_ban, 36);
                k6Var.a(c5Var.d(storyView) ? 1.0f : 0.5f, true);
                return;
            case 17:
                k9 k9Var = (k9) this.f2746e;
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) this.f2747f;
                TLObject tLObject9 = (TLObject) this.f2745c;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) this.d;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) this.f2744b;
                q9 q9Var = k9Var.S;
                b2Var3.dismiss();
                if (!(tLObject9 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    if (tL_error10 != null) {
                        new mc(q9Var.container, ((e3) q9Var).resourcesProvider).d0(tL_error10, true);
                        return;
                    }
                    return;
                } else {
                    ar[] arVarArr = new ar[1];
                    ar arVar = new ar(k9Var.getContext(), ((e3) q9Var).currentAccount, getgroupcallstreamrtmpurl, (TL_phone.groupCallStreamRtmpUrl) tLObject9, q9Var.H ? null : new gh.d1(14, k9Var, arVarArr), new jh.b());
                    arVarArr[0] = arVar;
                    arVar.show();
                    return;
                }
            case 18:
                cc.a((cc) this.f2744b, (ViewGroup) this.f2746e, (org.telegram.ui.ActionBar.c6) this.f2747f, (z9) this.f2745c, (View) this.d);
                return;
            case 19:
                ((CameraController) this.f2744b).lambda$open$10((CameraSession) this.f2746e, (Runnable) this.f2747f, (SurfaceTexture) this.f2745c, (Runnable) this.d);
                return;
            case 20:
                s7 s7Var = (s7) this.f2744b;
                ih.a aVar = (ih.a) this.f2746e;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) this.f2747f;
                String str3 = (String) this.f2745c;
                String str4 = (String) this.d;
                s7Var.getClass();
                aVar.f11479e.f4779a = false;
                tL_documentAttributeAudio.title = str3;
                tL_documentAttributeAudio.performer = str4;
                p71 p71Var = s7Var.h;
                for (int i24 = 0; i24 < p71Var.getViewPages().length; i24++) {
                    zk0 zk0Var = (zk0) p71Var.getViewPages()[i24];
                    if (zk0Var != null && ((f7) zk0Var.getAdapter()).d == 3) {
                        f7 f7Var = (f7) zk0Var.getAdapter();
                        for (int i25 = 0; i25 < f7Var.f37950e.size(); i25++) {
                            if (((m7) f7Var.f37950e.get(i25)).d == aVar) {
                                f7Var.m(i25);
                            }
                            break;
                        }
                    }
                }
                return;
            case 21:
                na naVar = (na) this.f2746e;
                String str5 = (String) this.f2747f;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) this.f2744b;
                TLObject tLObject10 = (TLObject) this.f2745c;
                TL_account.checkUsername checkusername = (TL_account.checkUsername) this.d;
                naVar.f40703e = 0;
                String str6 = naVar.f40704f;
                if (str6 == null || !str6.equals(str5)) {
                    return;
                }
                if (tL_error11 == null && (tLObject10 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.Cells.w1 w1Var = naVar.C;
                    if (w1Var != null) {
                        w1Var.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str5));
                        org.telegram.ui.Cells.w1 w1Var2 = naVar.C;
                        int i26 = g6.f23391w6;
                        w1Var2.setTag(Integer.valueOf(i26));
                        naVar.C.setTextColor(g6.w0(null, i26, false));
                        ma maVar = naVar.B;
                        if (maVar != null) {
                            ma.a(maVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (naVar.C != null) {
                    if (tL_error11 != null && "USERNAME_INVALID".equals(tL_error11.text) && checkusername.username.length() == 4) {
                        naVar.C.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                        org.telegram.ui.Cells.w1 w1Var3 = naVar.C;
                        int i27 = g6.f23269p7;
                        w1Var3.setTag(Integer.valueOf(i27));
                        naVar.C.setTextColor(g6.w0(null, i27, false));
                    } else if (tL_error11 == null || !"USERNAME_PURCHASE_AVAILABLE".equals(tL_error11.text)) {
                        naVar.C.setText(LocaleController.getString(R.string.UsernameInUse));
                        org.telegram.ui.Cells.w1 w1Var4 = naVar.C;
                        int i28 = g6.f23269p7;
                        w1Var4.setTag(Integer.valueOf(i28));
                        naVar.C.setTextColor(g6.w0(null, i28, false));
                    } else {
                        if (checkusername.username.length() == 4) {
                            naVar.C.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                        } else {
                            naVar.C.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                        }
                        org.telegram.ui.Cells.w1 w1Var5 = naVar.C;
                        int i29 = g6.F6;
                        w1Var5.setTag(Integer.valueOf(i29));
                        naVar.C.setTextColor(g6.w0(null, i29, false));
                    }
                    ma maVar2 = naVar.B;
                    if (maVar2 != null) {
                        ma.a(maVar2);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                kb kbVar = (kb) this.f2744b;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.f2746e;
                TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) this.f2747f;
                boolean[] zArr2 = (boolean[]) this.f2745c;
                org.telegram.ui.ActionBar.b2 b2Var4 = (org.telegram.ui.ActionBar.b2) this.d;
                qb qbVar = kbVar.f39685a.f40428n;
                qbVar.A0 = false;
                qbVar.f41624y0.put(tL_chatInviteExported.link, tL_messages_exportedChatInvite == null ? 0 : tL_messages_exportedChatInvite);
                if (zArr2[0]) {
                    return;
                }
                b2Var4.dismiss();
                if (tL_messages_exportedChatInvite != null) {
                    qb.A0(qbVar, tL_messages_exportedChatInvite, qbVar.f41625z0);
                    return;
                } else {
                    org.telegram.messenger.y1.q(R.string.LinkHashExpired, mc.a0(qbVar), R.raw.linkbroken, 36);
                    return;
                }
            case 23:
                xc xcVar = (xc) this.f2746e;
                boolean[] zArr3 = (boolean[]) this.f2747f;
                int[] iArr = (int[]) this.f2745c;
                int[] iArr2 = (int[]) this.d;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) this.f2744b;
                if (zArr3[0] || (i13 = iArr[0]) >= iArr2[0]) {
                    return;
                }
                if (tL_error12 != null) {
                    zArr3[0] = true;
                    if ("BOOSTS_REQUIRED".equals(tL_error12.text)) {
                        xcVar.getMessagesController().getBoostsController().userCanBoostChannel(xcVar.f44380a, xcVar.f44384c, new org.telegram.ui.cc(xcVar, i17));
                        return;
                    } else {
                        xcVar.L.setLoading(false);
                        pa.r(R.string.UnknownErrorCode, new Object[]{tL_error12.text}, mc.a0(xcVar), R.raw.error, 36);
                        return;
                    }
                }
                int i30 = i13 + 1;
                iArr[0] = i30;
                if (i30 == iArr2[0]) {
                    xcVar.finishFragment();
                    org.telegram.ui.ActionBar.n2 n2Var2 = xcVar.f44392h0;
                    if (n2Var2 != null) {
                        if (n2Var2 instanceof jo) {
                            ((jo) n2Var2).o0();
                        }
                        org.telegram.messenger.y1.q(xcVar.d ? R.string.GroupAppearanceUpdated : R.string.ChannelAppearanceUpdated, mc.a0(xcVar.f44392h0), R.raw.contact_check, 36);
                        xcVar.f44392h0 = null;
                    }
                    xcVar.L.setLoading(false);
                    return;
                }
                return;
            case 24:
                a();
                return;
            case 25:
                rn rnVar = (rn) this.f2744b;
                boolean[] zArr4 = (boolean[]) this.f2746e;
                boolean[] zArr5 = (boolean[]) this.f2747f;
                ImageView imageView = (ImageView) this.f2745c;
                ImageView imageView2 = (ImageView) this.d;
                if (zArr4[0]) {
                    return;
                }
                zArr4[0] = true;
                long[] jArr = {-1};
                yf yfVar = new yf(jArr, zArr5, imageView, imageView2, 2);
                TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
                tL_messages_rateTranscribedAudio.msg_id = rnVar.Z4.getId();
                tL_messages_rateTranscribedAudio.peer = rnVar.getMessagesController().getInputPeer(rnVar.Z4.messageOwner.peer_id);
                tL_messages_rateTranscribedAudio.transcription_id = rnVar.Z4.messageOwner.voiceTranscriptionId;
                tL_messages_rateTranscribedAudio.good = zArr5[0];
                rnVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new org.telegram.ui.z9(rnVar, yfVar, jArr, i15));
                AndroidUtilities.runOnUIThread(yfVar, 150L);
                return;
            case 26:
                dn dnVar = (dn) this.f2744b;
                TLRPC.Message message = (TLRPC.Message) this.f2746e;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.f2747f;
                MessageObject messageObject = (MessageObject) this.f2745c;
                s5 s5Var = (s5) this.d;
                rn rnVar2 = dnVar.f37446a;
                if (message.suggested_post.schedule_date != 0) {
                    rnVar2.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f22401id, 0);
                    return;
                }
                b2VarArr[0].setOnDismissListener(null);
                e3 e3Var = y4.T(rnVar2.getParentActivity(), 0L, new jh.z1(20, dnVar, messageObject), rnVar2.getResourceProvider(), 1).f23994a;
                e3Var.show();
                e3Var.setOnDismissListener(s5Var);
                return;
            case 27:
                b();
                return;
            case 28:
                c();
                return;
            default:
                kr krVar = (kr) this.f2744b;
                ArrayList arrayList11 = (ArrayList) this.f2746e;
                a0.h hVar = (a0.h) this.f2747f;
                ArrayList arrayList12 = (ArrayList) this.f2745c;
                ArrayList arrayList13 = (ArrayList) this.d;
                pf.j1 j1Var = krVar.h;
                lr lrVar = krVar.f39845y;
                if (lrVar.f40205k1) {
                    krVar.f39842s = false;
                    krVar.d = arrayList11;
                    krVar.f39838e = hVar;
                    krVar.f39839f = arrayList12;
                    j1Var.f(arrayList11, null);
                    if (!ChatObject.isChannel(lrVar.f40217r)) {
                        ArrayList arrayList14 = j1Var.f45841g;
                        arrayList14.clear();
                        arrayList14.addAll(arrayList13);
                    }
                    int i31 = krVar.f39841r;
                    krVar.l();
                    if (krVar.f39841r > i31) {
                        lrVar.y0(i31);
                    }
                    if (j1Var.e() || krVar.f39841r != 0) {
                        return;
                    }
                    lrVar.f40182b.e(false, true);
                    return;
                }
                return;
        }
    }

    public k0(m6 m6Var, TLObject tLObject, TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f2743a = 4;
        this.f2746e = m6Var;
        this.f2745c = tLObject;
        this.f2747f = tL_inputStorePaymentGiftPremium;
        this.f2744b = tL_error;
        this.d = tL_payments_canPurchaseStore;
    }

    public k0(u7 u7Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        this.f2743a = 10;
        this.f2744b = u7Var;
        this.f2747f = b2Var;
        this.f2745c = tLObject;
        this.d = inputSavedStarGift;
        this.f2746e = callback;
    }

    public k0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f2743a = i10;
        this.f2744b = obj;
        this.f2746e = obj2;
        this.f2747f = obj3;
        this.f2745c = obj4;
        this.d = obj5;
    }

    public k0(Object obj, Object obj2, Object obj3, Object obj4, TLRPC.TL_error tL_error, int i10) {
        this.f2743a = i10;
        this.f2746e = obj;
        this.f2747f = obj2;
        this.f2745c = obj3;
        this.d = obj4;
        this.f2744b = tL_error;
    }

    public k0(Object obj, Object obj2, TLRPC.TL_error tL_error, TLObject tLObject, Object obj3, int i10) {
        this.f2743a = i10;
        this.f2746e = obj;
        this.f2747f = obj2;
        this.f2744b = tL_error;
        this.f2745c = tLObject;
        this.d = obj3;
    }

    public k0(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, TLObject tLObject, int i10) {
        this.f2743a = i10;
        this.f2746e = obj;
        this.f2744b = tL_error;
        this.f2747f = obj2;
        this.f2745c = obj3;
        this.d = tLObject;
    }

    public k0(TLObject tLObject, MessagesController messagesController, e1 e1Var, m mVar, TLRPC.TL_error tL_error) {
        this.f2743a = 2;
        this.f2745c = tLObject;
        this.d = messagesController;
        this.f2746e = e1Var;
        this.f2747f = mVar;
        this.f2744b = tL_error;
    }

    public k0(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, MessagesController messagesController, Utilities.Callback callback2, int i10) {
        this.f2743a = i10;
        this.f2744b = tL_error;
        this.f2746e = callback;
        this.f2745c = tLObject;
        this.d = messagesController;
        this.f2747f = callback2;
    }
}
