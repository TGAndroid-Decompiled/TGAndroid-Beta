package mg;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.j20;
import org.telegram.messenger.q20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.q70;
import org.telegram.ui.UserInfoActivity;
public final class e0 implements RequestDelegate {
    public final int f13100a;
    public final Object f13101b;
    public final Object f13102c;
    public final Object d;
    public final Object e;
    public final Object f13103f;
    public final Object f13104g;

    public e0(c5.m mVar, c5.g gVar, j20 j20Var, Activity activity, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, int i10) {
        this.f13100a = i10;
        this.e = mVar;
        this.f13102c = gVar;
        this.f13103f = j20Var;
        this.d = activity;
        this.f13104g = inputStorePaymentPurpose;
        this.f13101b = list;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f13100a) {
            case 0:
                org.telegram.messenger.i0.g3(new bi.n(tL_error, (o0) this.e, tLObject, (List) this.f13101b, (c5.g) this.f13102c, (o0) this.f13103f, (k2) this.d, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f13104g, 1));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new bi.n(tL_error, (q20) this.e, tLObject, (List) this.f13101b, (c5.g) this.f13102c, (q20) this.f13103f, (k2) this.d, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f13104g, 2));
                return;
            case 2:
                org.telegram.messenger.i0.g3(new bi.n((UserInfoActivity) this.e, tL_error, (TLObject) this.f13101b, (TL_account.TL_birthday) this.f13102c, (TLRPC.UserFull) this.f13103f, tLObject, (int[]) this.d, (ArrayList) this.f13104g));
                return;
            case 3:
                org.telegram.messenger.i0.g3(new bi.n(tLObject, (c5.m) this.e, (c5.g) this.f13102c, (ih.s) this.f13103f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f13104g, (List) this.f13101b, tL_error, 9));
                return;
            default:
                org.telegram.messenger.i0.g3(new bi.n(tLObject, (c5.m) this.e, (c5.g) this.f13102c, (q70) this.f13103f, (Activity) this.d, (TLRPC.TL_inputStorePaymentStarsGift) this.f13104g, (List) this.f13101b, tL_error, 10));
                return;
        }
    }

    public e0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f13100a = i10;
        this.e = obj;
        this.f13101b = obj2;
        this.f13102c = obj3;
        this.f13103f = obj4;
        this.d = obj5;
        this.f13104g = obj6;
    }
}
