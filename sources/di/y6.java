package di;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.y10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.UserInfoActivity;
public final class y6 implements RequestDelegate {
    public final int f10077a;
    public final Object f10078b;
    public final Object f10079c;
    public final Object d;
    public final List f10080e;
    public final Object f10081f;
    public final Object f10082g;

    public y6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, List list, int i7) {
        this.f10077a = i7;
        this.f10078b = obj;
        this.f10079c = obj2;
        this.f10081f = obj3;
        this.d = obj4;
        this.f10082g = obj5;
        this.f10080e = list;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10077a) {
            case 0:
                org.telegram.messenger.g0.g3(new j7(tLObject, (f5.m) this.f10078b, (f5.f) this.f10079c, (org.telegram.ui.Wallet.e0) this.f10081f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f10082g, this.f10080e, tL_error, 0));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new j7(tLObject, (f5.m) this.f10078b, (f5.f) this.f10079c, (bi.e8) this.f10081f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGift) this.f10082g, this.f10080e, tL_error, 1));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new j7((UserInfoActivity) this.f10078b, tL_error, (TLObject) this.f10079c, (TL_account.TL_birthday) this.f10081f, (TLRPC.UserFull) this.d, tLObject, (int[]) this.f10082g, (ArrayList) this.f10080e));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new j7(tL_error, (y10) ((wg.v) this.f10078b), tLObject, this.f10080e, (f5.f) this.f10079c, (y10) ((wg.v) this.f10081f), (org.telegram.ui.ActionBar.g2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f10082g), 9));
                return;
            default:
                org.telegram.messenger.g0.g3(new j7(tL_error, (y10) this.f10078b, tLObject, this.f10080e, (f5.f) this.f10079c, (y10) this.f10081f, (org.telegram.ui.ActionBar.g2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f10082g), 10));
                return;
        }
    }

    public y6(y10 y10Var, List list, f5.f fVar, y10 y10Var2, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i7) {
        this.f10077a = i7;
        this.f10078b = y10Var;
        this.f10080e = list;
        this.f10079c = fVar;
        this.f10081f = y10Var2;
        this.d = g2Var;
        this.f10082g = inputStorePaymentPurpose;
    }
}
