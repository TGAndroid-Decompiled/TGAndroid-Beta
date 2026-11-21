package di;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.UserInfoActivity;
public final class y6 implements RequestDelegate {
    public final int f10074a;
    public final Object f10075b;
    public final Object f10076c;
    public final Object d;
    public final List f10077e;
    public final Object f10078f;
    public final Object f10079g;

    public y6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, List list, int i7) {
        this.f10074a = i7;
        this.f10075b = obj;
        this.f10076c = obj2;
        this.f10078f = obj3;
        this.d = obj4;
        this.f10079g = obj5;
        this.f10077e = list;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10074a) {
            case 0:
                org.telegram.messenger.g0.g3(new j7(tLObject, (f5.m) this.f10075b, (f5.f) this.f10076c, (org.telegram.ui.Wallet.e0) this.f10078f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f10079g, this.f10077e, tL_error, 0));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new j7(tLObject, (f5.m) this.f10075b, (f5.f) this.f10076c, (bi.f8) this.f10078f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGift) this.f10079g, this.f10077e, tL_error, 1));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new j7((UserInfoActivity) this.f10075b, tL_error, (TLObject) this.f10076c, (TL_account.TL_birthday) this.f10078f, (TLRPC.UserFull) this.d, tLObject, (int[]) this.f10079g, (ArrayList) this.f10077e));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new j7(tL_error, (x10) ((wg.v) this.f10075b), tLObject, this.f10077e, (f5.f) this.f10076c, (x10) ((wg.v) this.f10078f), (org.telegram.ui.ActionBar.g2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f10079g), 9));
                return;
            default:
                org.telegram.messenger.g0.g3(new j7(tL_error, (x10) this.f10075b, tLObject, this.f10077e, (f5.f) this.f10076c, (x10) this.f10078f, (org.telegram.ui.ActionBar.g2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f10079g), 10));
                return;
        }
    }

    public y6(x10 x10Var, List list, f5.f fVar, x10 x10Var2, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i7) {
        this.f10074a = i7;
        this.f10075b = x10Var;
        this.f10077e = list;
        this.f10076c = fVar;
        this.f10078f = x10Var2;
        this.d = g2Var;
        this.f10079g = inputStorePaymentPurpose;
    }
}
