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
    public final int f9533a;
    public final Object f9534b;
    public final Object f9535c;
    public final Object d;
    public final List f9536e;
    public final Object f9537f;
    public final Object f9538g;

    public u6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, List list, int i7) {
        this.f9533a = i7;
        this.f9534b = obj;
        this.f9535c = obj2;
        this.f9537f = obj3;
        this.d = obj4;
        this.f9538g = obj5;
        this.f9536e = list;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9533a) {
            case 0:
                org.telegram.messenger.g0.h3(new g7(tLObject, (f5.m) this.f9534b, (f5.f) this.f9535c, (org.telegram.ui.Wallet.t1) this.f9537f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f9538g, this.f9536e, tL_error, 0));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new g7(tLObject, (f5.m) this.f9534b, (f5.f) this.f9535c, (bi.v5) this.f9537f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGift) this.f9538g, this.f9536e, tL_error, 1));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new g7((UserInfoActivity) this.f9534b, tL_error, (TLObject) this.f9535c, (TL_account.TL_birthday) this.f9537f, (TLRPC.UserFull) this.d, tLObject, (int[]) this.f9538g, (ArrayList) this.f9536e));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new g7(tL_error, (z10) ((wg.t) this.f9534b), tLObject, this.f9536e, (f5.f) this.f9535c, (z10) ((wg.t) this.f9537f), (org.telegram.ui.ActionBar.e2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f9538g), 9));
                return;
            default:
                org.telegram.messenger.g0.h3(new g7(tL_error, (z10) this.f9534b, tLObject, this.f9536e, (f5.f) this.f9535c, (z10) this.f9537f, (org.telegram.ui.ActionBar.e2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f9538g), 10));
                return;
        }
    }

    public u6(z10 z10Var, List list, f5.f fVar, z10 z10Var2, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i7) {
        this.f9533a = i7;
        this.f9534b = z10Var;
        this.f9536e = list;
        this.f9535c = fVar;
        this.f9537f = z10Var2;
        this.d = e2Var;
        this.f9538g = inputStorePaymentPurpose;
    }
}
