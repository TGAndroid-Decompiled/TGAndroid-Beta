package di;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.UserInfoActivity;
public final class u6 implements RequestDelegate {
    public final int f9518a;
    public final Object f9519b;
    public final Object f9520c;
    public final Object d;
    public final List f9521e;
    public final Object f9522f;
    public final Object f9523g;

    public u6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, List list, int i7) {
        this.f9518a = i7;
        this.f9519b = obj;
        this.f9520c = obj2;
        this.f9522f = obj3;
        this.d = obj4;
        this.f9523g = obj5;
        this.f9521e = list;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9518a) {
            case 0:
                org.telegram.messenger.g0.h3(new g7(tLObject, (f5.m) this.f9519b, (f5.f) this.f9520c, (org.telegram.ui.Wallet.t1) this.f9522f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f9523g, this.f9521e, tL_error, 0));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new g7(tLObject, (f5.m) this.f9519b, (f5.f) this.f9520c, (bi.v5) this.f9522f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGift) this.f9523g, this.f9521e, tL_error, 1));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new g7((UserInfoActivity) this.f9519b, tL_error, (TLObject) this.f9520c, (TL_account.TL_birthday) this.f9522f, (TLRPC.UserFull) this.d, tLObject, (int[]) this.f9523g, (ArrayList) this.f9521e));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new g7(tL_error, (z10) ((wg.t) this.f9519b), tLObject, this.f9521e, (f5.f) this.f9520c, (z10) ((wg.t) this.f9522f), (org.telegram.ui.ActionBar.e2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f9523g), 9));
                return;
            default:
                org.telegram.messenger.g0.h3(new g7(tL_error, (z10) this.f9519b, tLObject, this.f9521e, (f5.f) this.f9520c, (z10) this.f9522f, (org.telegram.ui.ActionBar.e2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f9523g), 10));
                return;
        }
    }

    public u6(z10 z10Var, List list, f5.f fVar, z10 z10Var2, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i7) {
        this.f9518a = i7;
        this.f9519b = z10Var;
        this.f9521e = list;
        this.f9520c = fVar;
        this.f9522f = z10Var2;
        this.d = e2Var;
        this.f9523g = inputStorePaymentPurpose;
    }
}
