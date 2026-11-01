package mg;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.k20;
import org.telegram.messenger.r20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.q70;
import org.telegram.ui.UserInfoActivity;
public final class e0 implements RequestDelegate {
    public final int f13101a;
    public final Object f13102b;
    public final Object f13103c;
    public final Object d;
    public final Object e;
    public final Object f13104f;
    public final Object f13105g;

    public e0(c5.m mVar, c5.g gVar, k20 k20Var, Activity activity, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, int i10) {
        this.f13101a = i10;
        this.e = mVar;
        this.f13103c = gVar;
        this.f13104f = k20Var;
        this.d = activity;
        this.f13105g = inputStorePaymentPurpose;
        this.f13102b = list;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f13101a) {
            case 0:
                org.telegram.messenger.i0.g3(new bi.n(tL_error, (o0) this.e, tLObject, (List) this.f13102b, (c5.g) this.f13103c, (o0) this.f13104f, (k2) this.d, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f13105g, 1));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new bi.n(tL_error, (r20) this.e, tLObject, (List) this.f13102b, (c5.g) this.f13103c, (r20) this.f13104f, (k2) this.d, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f13105g, 2));
                return;
            case 2:
                org.telegram.messenger.i0.g3(new bi.n((UserInfoActivity) this.e, tL_error, (TLObject) this.f13102b, (TL_account.TL_birthday) this.f13103c, (TLRPC.UserFull) this.f13104f, tLObject, (int[]) this.d, (ArrayList) this.f13105g));
                return;
            case 3:
                org.telegram.messenger.i0.g3(new bi.n(tLObject, (c5.m) this.e, (c5.g) this.f13103c, (ih.s) this.f13104f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f13105g, (List) this.f13102b, tL_error, 9));
                return;
            default:
                org.telegram.messenger.i0.g3(new bi.n(tLObject, (c5.m) this.e, (c5.g) this.f13103c, (q70) this.f13104f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGift) this.f13105g, (List) this.f13102b, tL_error, 10));
                return;
        }
    }

    public e0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f13101a = i10;
        this.e = obj;
        this.f13102b = obj2;
        this.f13103c = obj3;
        this.f13104f = obj4;
        this.d = obj5;
        this.f13105g = obj6;
    }
}
