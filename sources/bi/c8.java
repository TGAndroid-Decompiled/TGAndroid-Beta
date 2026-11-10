package bi;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.c20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.UserInfoActivity;
public final class c8 implements RequestDelegate {
    public final int f3581a;
    public final Object f3582b;
    public final Object f3583c;
    public final Object d;
    public final List f3584e;
    public final Object f3585f;
    public final Object f3586g;

    public c8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, List list, int i7) {
        this.f3581a = i7;
        this.f3582b = obj;
        this.f3583c = obj2;
        this.f3585f = obj3;
        this.d = obj4;
        this.f3586g = obj5;
        this.f3584e = list;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3581a) {
            case 0:
                org.telegram.messenger.g0.h3(new n8(tLObject, (f5.l) this.f3582b, (f5.f) this.f3583c, (org.telegram.ui.Wallet.t1) this.f3585f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f3586g, this.f3584e, tL_error, 0));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new n8(tLObject, (f5.l) this.f3582b, (f5.f) this.f3583c, (mc) this.f3585f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGift) this.f3586g, this.f3584e, tL_error, 1));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new n8((UserInfoActivity) this.f3582b, tL_error, (TLObject) this.f3583c, (TL_account.TL_birthday) this.f3585f, (TLRPC.UserFull) this.d, tLObject, (int[]) this.f3586g, (ArrayList) this.f3584e));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new n8(tL_error, (c20) ((wg.u) this.f3582b), tLObject, this.f3584e, (f5.f) this.f3583c, (c20) ((wg.u) this.f3585f), (org.telegram.ui.ActionBar.f2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f3586g), 9));
                return;
            default:
                org.telegram.messenger.g0.h3(new n8(tL_error, (c20) this.f3582b, tLObject, this.f3584e, (f5.f) this.f3583c, (c20) this.f3585f, (org.telegram.ui.ActionBar.f2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f3586g), 10));
                return;
        }
    }

    public c8(c20 c20Var, List list, f5.f fVar, c20 c20Var2, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i7) {
        this.f3581a = i7;
        this.f3582b = c20Var;
        this.f3584e = list;
        this.f3583c = fVar;
        this.f3585f = c20Var2;
        this.d = f2Var;
        this.f3586g = inputStorePaymentPurpose;
    }
}
