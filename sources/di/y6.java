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
    public final int f10040a;
    public final Object f10041b;
    public final Object f10042c;
    public final Object d;
    public final List f10043e;
    public final Object f10044f;
    public final Object f10045g;

    public y6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, List list, int i7) {
        this.f10040a = i7;
        this.f10041b = obj;
        this.f10042c = obj2;
        this.f10044f = obj3;
        this.d = obj4;
        this.f10045g = obj5;
        this.f10043e = list;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10040a) {
            case 0:
                org.telegram.messenger.g0.g3(new j7(tLObject, (f5.m) this.f10041b, (f5.f) this.f10042c, (org.telegram.ui.Wallet.e0) this.f10044f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f10045g, this.f10043e, tL_error, 0));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new j7(tLObject, (f5.m) this.f10041b, (f5.f) this.f10042c, (bi.h8) this.f10044f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGift) this.f10045g, this.f10043e, tL_error, 1));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new j7((UserInfoActivity) this.f10041b, tL_error, (TLObject) this.f10042c, (TL_account.TL_birthday) this.f10044f, (TLRPC.UserFull) this.d, tLObject, (int[]) this.f10045g, (ArrayList) this.f10043e));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new j7(tL_error, (y10) ((wg.v) this.f10041b), tLObject, this.f10043e, (f5.f) this.f10042c, (y10) ((wg.v) this.f10044f), (org.telegram.ui.ActionBar.g2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f10045g), 9));
                return;
            default:
                org.telegram.messenger.g0.g3(new j7(tL_error, (y10) this.f10041b, tLObject, this.f10043e, (f5.f) this.f10042c, (y10) this.f10044f, (org.telegram.ui.ActionBar.g2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f10045g), 10));
                return;
        }
    }

    public y6(y10 y10Var, List list, f5.f fVar, y10 y10Var2, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i7) {
        this.f10040a = i7;
        this.f10041b = y10Var;
        this.f10043e = list;
        this.f10042c = fVar;
        this.f10044f = y10Var2;
        this.d = g2Var;
        this.f10045g = inputStorePaymentPurpose;
    }
}
