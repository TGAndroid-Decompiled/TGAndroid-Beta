package ci;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.u10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.UserInfoActivity;
public final class d7 implements RequestDelegate {
    public final int f4975a;
    public final Object f4976b;
    public final Object f4977c;
    public final Object d;
    public final List f4978e;
    public final Object f4979f;
    public final Object f4980g;

    public d7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, List list, int i3) {
        this.f4975a = i3;
        this.f4976b = obj;
        this.f4977c = obj2;
        this.f4979f = obj3;
        this.d = obj4;
        this.f4980g = obj5;
        this.f4978e = list;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f4975a) {
            case 0:
                org.telegram.messenger.g0.h3(new o7(tLObject, (e5.l) this.f4976b, (e5.f) this.f4977c, (org.telegram.ui.Wallet.s1) this.f4979f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f4980g, this.f4978e, tL_error, 0));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new o7(tLObject, (e5.l) this.f4976b, (e5.f) this.f4977c, (ai.d6) this.f4979f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGift) this.f4980g, this.f4978e, tL_error, 1));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new o7((UserInfoActivity) this.f4976b, tL_error, (TLObject) this.f4977c, (TL_account.TL_birthday) this.f4979f, (TLRPC.UserFull) this.d, tLObject, (int[]) this.f4980g, (ArrayList) this.f4978e));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new o7(tL_error, (u10) ((xg.v) this.f4976b), tLObject, this.f4978e, (e5.f) this.f4977c, (u10) ((xg.v) this.f4979f), (org.telegram.ui.ActionBar.d2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f4980g), 9));
                return;
            default:
                org.telegram.messenger.g0.h3(new o7(tL_error, (u10) this.f4976b, tLObject, this.f4978e, (e5.f) this.f4977c, (u10) this.f4979f, (org.telegram.ui.ActionBar.d2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f4980g), 10));
                return;
        }
    }

    public d7(u10 u10Var, List list, e5.f fVar, u10 u10Var2, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i3) {
        this.f4975a = i3;
        this.f4976b = u10Var;
        this.f4978e = list;
        this.f4977c = fVar;
        this.f4979f = u10Var2;
        this.d = d2Var;
        this.f4980g = inputStorePaymentPurpose;
    }
}
