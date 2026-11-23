package di;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.w10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.UserInfoActivity;
public final class y6 implements RequestDelegate {
    public final int f10038a;
    public final Object f10039b;
    public final Object f10040c;
    public final Object d;
    public final List f10041e;
    public final Object f10042f;
    public final Object f10043g;

    public y6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, List list, int i7) {
        this.f10038a = i7;
        this.f10039b = obj;
        this.f10040c = obj2;
        this.f10042f = obj3;
        this.d = obj4;
        this.f10043g = obj5;
        this.f10041e = list;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10038a) {
            case 0:
                org.telegram.messenger.g0.g3(new j7(tLObject, (f5.m) this.f10039b, (f5.f) this.f10040c, (org.telegram.ui.Wallet.f0) this.f10042f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f10043g, this.f10041e, tL_error, 0));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new j7(tLObject, (f5.m) this.f10039b, (f5.f) this.f10040c, (bi.h8) this.f10042f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGift) this.f10043g, this.f10041e, tL_error, 1));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new j7((UserInfoActivity) this.f10039b, tL_error, (TLObject) this.f10040c, (TL_account.TL_birthday) this.f10042f, (TLRPC.UserFull) this.d, tLObject, (int[]) this.f10043g, (ArrayList) this.f10041e));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new j7(tL_error, (w10) ((wg.u) this.f10039b), tLObject, this.f10041e, (f5.f) this.f10040c, (w10) ((wg.u) this.f10042f), (org.telegram.ui.ActionBar.g2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f10043g), 9));
                return;
            default:
                org.telegram.messenger.g0.g3(new j7(tL_error, (w10) this.f10039b, tLObject, this.f10041e, (f5.f) this.f10040c, (w10) this.f10042f, (org.telegram.ui.ActionBar.g2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f10043g), 10));
                return;
        }
    }

    public y6(w10 w10Var, List list, f5.f fVar, w10 w10Var2, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i7) {
        this.f10038a = i7;
        this.f10039b = w10Var;
        this.f10041e = list;
        this.f10040c = fVar;
        this.f10042f = w10Var2;
        this.d = g2Var;
        this.f10043g = inputStorePaymentPurpose;
    }
}
