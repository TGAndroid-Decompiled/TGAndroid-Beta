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
    public final int f3578a;
    public final Object f3579b;
    public final Object f3580c;
    public final Object d;
    public final List f3581e;
    public final Object f3582f;
    public final Object f3583g;

    public c8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, List list, int i7) {
        this.f3578a = i7;
        this.f3579b = obj;
        this.f3580c = obj2;
        this.f3582f = obj3;
        this.d = obj4;
        this.f3583g = obj5;
        this.f3581e = list;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3578a) {
            case 0:
                org.telegram.messenger.g0.h3(new n8(tLObject, (f5.l) this.f3579b, (f5.f) this.f3580c, (org.telegram.ui.Wallet.v1) this.f3582f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f3583g, this.f3581e, tL_error, 0));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new n8(tLObject, (f5.l) this.f3579b, (f5.f) this.f3580c, (mc) this.f3582f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGift) this.f3583g, this.f3581e, tL_error, 1));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new n8((UserInfoActivity) this.f3579b, tL_error, (TLObject) this.f3580c, (TL_account.TL_birthday) this.f3582f, (TLRPC.UserFull) this.d, tLObject, (int[]) this.f3583g, (ArrayList) this.f3581e));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new n8(tL_error, (c20) ((wg.v) this.f3579b), tLObject, this.f3581e, (f5.f) this.f3580c, (c20) ((wg.v) this.f3582f), (org.telegram.ui.ActionBar.f2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f3583g), 9));
                return;
            default:
                org.telegram.messenger.g0.h3(new n8(tL_error, (c20) this.f3579b, tLObject, this.f3581e, (f5.f) this.f3580c, (c20) this.f3582f, (org.telegram.ui.ActionBar.f2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f3583g), 10));
                return;
        }
    }

    public c8(c20 c20Var, List list, f5.f fVar, c20 c20Var2, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i7) {
        this.f3578a = i7;
        this.f3579b = c20Var;
        this.f3581e = list;
        this.f3580c = fVar;
        this.f3582f = c20Var2;
        this.d = f2Var;
        this.f3583g = inputStorePaymentPurpose;
    }
}
