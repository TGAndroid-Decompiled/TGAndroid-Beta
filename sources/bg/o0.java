package bg;

import android.util.LongSparseArray;
import fh.u6;
import gh.v7;
import ih.v3;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.y4;
import org.telegram.ui.cn;
import org.telegram.ui.id;
import org.telegram.ui.qn;
import org.telegram.ui.r5;
import org.telegram.ui.vo;
public final class o0 implements Runnable {
    public final int f1898a;
    public final Object f1899b;
    public final Object f1900c;
    public final Object d;
    public final Object f1901e;
    public final Object f1902f;

    public o0(g3 g3Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        this.f1898a = 3;
        this.f1901e = g3Var;
        this.f1900c = tLObject;
        this.f1902f = userFull;
        this.d = tL_birthday;
        this.f1899b = tL_error;
    }

    private final void a() {
        id idVar = (id) this.f1901e;
        String str = (String) this.f1902f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f1899b;
        TLObject tLObject = (TLObject) this.f1900c;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.d;
        idVar.S = 0;
        String str2 = idVar.T;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                idVar.Q.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
                org.telegram.ui.Cells.x1 x1Var = idVar.Q;
                int i9 = f6.f23334w6;
                x1Var.setTag(Integer.valueOf(i9));
                idVar.Q.setTextColor(f6.w0(null, i9, false));
                idVar.V = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                idVar.Q.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                idVar.Q.setTextColor(f6.w0(null, f6.f23212p7, false));
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    idVar.Q.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                } else {
                    idVar.Q.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                }
                idVar.Q.setTextColor(f6.w0(null, f6.F6, false));
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                idVar.Q.setTextColor(f6.w0(null, f6.f23212p7, false));
                idVar.f39111f0 = false;
                idVar.e0();
            } else {
                idVar.Q.setTextColor(f6.w0(null, f6.f23212p7, false));
                idVar.Q.setText(LocaleController.getString(R.string.LinkInUse));
            }
            idVar.V = false;
        }
    }

    private final void b() {
        cn cnVar = (cn) this.f1899b;
        org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.f1902f;
        MessageObject messageObject = (MessageObject) this.f1900c;
        r5 r5Var = (r5) this.d;
        qn qnVar = cnVar.f37236a;
        if (((TLRPC.Message) this.f1901e).suggested_post.schedule_date == 0) {
            c2VarArr[0].setOnDismissListener(null);
            org.telegram.ui.ActionBar.f3 f3Var = y4.T(qnVar.getParentActivity(), 0L, new v3(20, cnVar, messageObject), qnVar.getResourceProvider(), 1).f22713a;
            f3Var.show();
            f3Var.setOnDismissListener(r5Var);
            return;
        }
        qnVar.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject.messageOwner.peer_id), messageObject.messageOwner.f22401id, 0);
    }

    private final void c() {
        vo voVar = (vo) this.f1901e;
        String str = (String) this.f1902f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f1899b;
        TLObject tLObject = (TLObject) this.f1900c;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.d;
        voVar.f43530d0 = 0;
        String str2 = voVar.f43532e0;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                voVar.f43533f.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
                voVar.f43533f.setTextColorByKey(f6.f23334w6);
                voVar.f43535g0 = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                voVar.f43533f.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                voVar.f43533f.setTextColor(f6.w0(null, f6.f23212p7, false));
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    voVar.f43533f.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                } else {
                    voVar.f43533f.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                }
                voVar.f43533f.setTextColor(f6.w0(null, f6.F6, false));
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                voVar.Y = false;
                voVar.Y();
            } else {
                voVar.f43533f.setText(LocaleController.getString(R.string.LinkInUse));
                voVar.f43533f.setTextColorByKey(f6.f23212p7);
            }
            voVar.f43535g0 = false;
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bg.o0.run():void");
    }

    public o0(u6 u6Var, TLObject tLObject, TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f1898a = 4;
        this.f1901e = u6Var;
        this.f1900c = tLObject;
        this.f1902f = tL_inputStorePaymentGiftPremium;
        this.f1899b = tL_error;
        this.d = tL_payments_canPurchaseStore;
    }

    public o0(v7 v7Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        this.f1898a = 10;
        this.f1899b = v7Var;
        this.f1902f = c2Var;
        this.f1900c = tLObject;
        this.d = inputSavedStarGift;
        this.f1901e = callback;
    }

    public o0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i9) {
        this.f1898a = i9;
        this.f1899b = obj;
        this.f1901e = obj2;
        this.f1902f = obj3;
        this.f1900c = obj4;
        this.d = obj5;
    }

    public o0(Object obj, Object obj2, Object obj3, Object obj4, TLRPC.TL_error tL_error, int i9) {
        this.f1898a = i9;
        this.f1901e = obj;
        this.f1902f = obj2;
        this.f1900c = obj3;
        this.d = obj4;
        this.f1899b = tL_error;
    }

    public o0(Object obj, Object obj2, TLRPC.TL_error tL_error, TLObject tLObject, Object obj3, int i9) {
        this.f1898a = i9;
        this.f1901e = obj;
        this.f1902f = obj2;
        this.f1899b = tL_error;
        this.f1900c = tLObject;
        this.d = obj3;
    }

    public o0(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, TLObject tLObject, int i9) {
        this.f1898a = i9;
        this.f1901e = obj;
        this.f1899b = tL_error;
        this.f1902f = obj2;
        this.f1900c = obj3;
        this.d = tLObject;
    }

    public o0(of.w1 w1Var, TLRPC.TL_messages_getStickers tL_messages_getStickers, TLObject tLObject, ArrayList arrayList, LongSparseArray longSparseArray) {
        this.f1898a = 19;
        this.f1899b = w1Var;
        this.f1901e = tL_messages_getStickers;
        this.f1900c = tLObject;
        this.f1902f = arrayList;
        this.d = longSparseArray;
    }

    public o0(TLObject tLObject, MessagesController messagesController, j1 j1Var, p pVar, TLRPC.TL_error tL_error) {
        this.f1898a = 2;
        this.f1900c = tLObject;
        this.d = messagesController;
        this.f1901e = j1Var;
        this.f1902f = pVar;
        this.f1899b = tL_error;
    }

    public o0(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, MessagesController messagesController, Utilities.Callback callback2, int i9) {
        this.f1898a = i9;
        this.f1899b = tL_error;
        this.f1901e = callback;
        this.f1900c = tLObject;
        this.d = messagesController;
        this.f1902f = callback2;
    }
}
