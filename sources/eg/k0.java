package eg;

import ih.e6;
import jh.s7;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.dq;
import org.telegram.ui.hd;
import org.telegram.ui.yo;
public final class k0 implements Runnable {
    public final int f6055a;
    public final Object f6056b;
    public final Object f6057c;
    public final Object d;
    public final Object f6058e;
    public final Object f6059f;

    public k0(w2 w2Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        this.f6055a = 3;
        this.f6058e = w2Var;
        this.f6057c = tLObject;
        this.f6059f = userFull;
        this.d = tL_birthday;
        this.f6056b = tL_error;
    }

    private final void a() {
        hd hdVar = (hd) this.f6058e;
        String str = (String) this.f6059f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f6056b;
        TLObject tLObject = (TLObject) this.f6057c;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.d;
        hdVar.S = 0;
        String str2 = hdVar.T;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                hdVar.Q.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
                org.telegram.ui.Cells.w1 w1Var = hdVar.Q;
                int i10 = g6.f23401w6;
                w1Var.setTag(Integer.valueOf(i10));
                hdVar.Q.setTextColor(g6.w0(null, i10, false));
                hdVar.V = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                hdVar.Q.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                hdVar.Q.setTextColor(g6.w0(null, g6.f23279p7, false));
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    hdVar.Q.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                } else {
                    hdVar.Q.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                }
                hdVar.Q.setTextColor(g6.w0(null, g6.F6, false));
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                hdVar.Q.setTextColor(g6.w0(null, g6.f23279p7, false));
                hdVar.f38859f0 = false;
                hdVar.f0();
            } else {
                hdVar.Q.setTextColor(g6.w0(null, g6.f23279p7, false));
                hdVar.Q.setText(LocaleController.getString(R.string.LinkInUse));
            }
            hdVar.V = false;
        }
    }

    private final void b() {
        yo yoVar = (yo) this.f6058e;
        String str = (String) this.f6059f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f6056b;
        TLObject tLObject = (TLObject) this.f6057c;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.d;
        yoVar.f44921d0 = 0;
        String str2 = yoVar.f44923e0;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                yoVar.f44924f.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
                yoVar.f44924f.setTextColorByKey(g6.f23401w6);
                yoVar.f44926g0 = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                yoVar.f44924f.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                yoVar.f44924f.setTextColor(g6.w0(null, g6.f23279p7, false));
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    yoVar.f44924f.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                } else {
                    yoVar.f44924f.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                }
                yoVar.f44924f.setTextColor(g6.w0(null, g6.F6, false));
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                yoVar.Y = false;
                yoVar.Z();
            } else {
                yoVar.f44924f.setText(LocaleController.getString(R.string.LinkInUse));
                yoVar.f44924f.setTextColorByKey(g6.f23279p7);
            }
            yoVar.f44926g0 = false;
        }
    }

    private final void c() {
        dq.Y((dq) this.f6058e, (TLRPC.TL_error) this.f6056b, (TLRPC.InputCheckPasswordSRP) this.f6059f, (TwoStepVerificationActivity) this.f6057c, (TLRPC.TL_channels_editCreator) this.d);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: eg.k0.run():void");
    }

    public k0(e6 e6Var, TLObject tLObject, TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f6055a = 4;
        this.f6058e = e6Var;
        this.f6057c = tLObject;
        this.f6059f = tL_inputStorePaymentGiftPremium;
        this.f6056b = tL_error;
        this.d = tL_payments_canPurchaseStore;
    }

    public k0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f6055a = i10;
        this.f6056b = obj;
        this.f6058e = obj2;
        this.f6059f = obj3;
        this.f6057c = obj4;
        this.d = obj5;
    }

    public k0(Object obj, Object obj2, Object obj3, Object obj4, TLRPC.TL_error tL_error, int i10) {
        this.f6055a = i10;
        this.f6058e = obj;
        this.f6059f = obj2;
        this.f6057c = obj3;
        this.d = obj4;
        this.f6056b = tL_error;
    }

    public k0(Object obj, Object obj2, TLRPC.TL_error tL_error, TLObject tLObject, Object obj3, int i10) {
        this.f6055a = i10;
        this.f6058e = obj;
        this.f6059f = obj2;
        this.f6056b = tL_error;
        this.f6057c = tLObject;
        this.d = obj3;
    }

    public k0(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, TLObject tLObject, int i10) {
        this.f6055a = i10;
        this.f6058e = obj;
        this.f6056b = tL_error;
        this.f6059f = obj2;
        this.f6057c = obj3;
        this.d = tLObject;
    }

    public k0(s7 s7Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        this.f6055a = 10;
        this.f6056b = s7Var;
        this.f6059f = c2Var;
        this.f6057c = tLObject;
        this.d = inputSavedStarGift;
        this.f6058e = callback;
    }

    public k0(TLObject tLObject, MessagesController messagesController, d1 d1Var, m mVar, TLRPC.TL_error tL_error) {
        this.f6055a = 2;
        this.f6057c = tLObject;
        this.d = messagesController;
        this.f6058e = d1Var;
        this.f6059f = mVar;
        this.f6056b = tL_error;
    }

    public k0(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, MessagesController messagesController, Utilities.Callback callback2, int i10) {
        this.f6055a = i10;
        this.f6056b = tL_error;
        this.f6058e = callback;
        this.f6057c = tLObject;
        this.d = messagesController;
        this.f6059f = callback2;
    }
}
