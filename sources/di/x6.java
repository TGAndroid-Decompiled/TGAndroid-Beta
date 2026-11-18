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
public final class x6 implements RequestDelegate {
    public final int f10009a;
    public final Object f10010b;
    public final Object f10011c;
    public final Object d;
    public final List f10012e;
    public final Object f10013f;
    public final Object f10014g;

    public x6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, List list, int i7) {
        this.f10009a = i7;
        this.f10010b = obj;
        this.f10011c = obj2;
        this.f10013f = obj3;
        this.d = obj4;
        this.f10014g = obj5;
        this.f10012e = list;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10009a) {
            case 0:
                org.telegram.messenger.g0.g3(new j7(tLObject, (f5.m) this.f10010b, (f5.f) this.f10011c, (org.telegram.ui.Wallet.e0) this.f10013f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f10014g, this.f10012e, tL_error, 0));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new j7(tLObject, (f5.m) this.f10010b, (f5.f) this.f10011c, (bi.c8) this.f10013f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGift) this.f10014g, this.f10012e, tL_error, 1));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new j7((UserInfoActivity) this.f10010b, tL_error, (TLObject) this.f10011c, (TL_account.TL_birthday) this.f10013f, (TLRPC.UserFull) this.d, tLObject, (int[]) this.f10014g, (ArrayList) this.f10012e));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new j7(tL_error, (x10) ((wg.v) this.f10010b), tLObject, this.f10012e, (f5.f) this.f10011c, (x10) ((wg.v) this.f10013f), (org.telegram.ui.ActionBar.h2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f10014g), 9));
                return;
            default:
                org.telegram.messenger.g0.g3(new j7(tL_error, (x10) this.f10010b, tLObject, this.f10012e, (f5.f) this.f10011c, (x10) this.f10013f, (org.telegram.ui.ActionBar.h2) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f10014g), 10));
                return;
        }
    }

    public x6(x10 x10Var, List list, f5.f fVar, x10 x10Var2, org.telegram.ui.ActionBar.h2 h2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i7) {
        this.f10009a = i7;
        this.f10010b = x10Var;
        this.f10012e = list;
        this.f10011c = fVar;
        this.f10013f = x10Var2;
        this.d = h2Var;
        this.f10014g = inputStorePaymentPurpose;
    }
}
