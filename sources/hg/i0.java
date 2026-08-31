package hg;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import lh.i5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.UserInfoActivity;
public final class i0 implements RequestDelegate {
    public final int f7510a;
    public final Object f7511b;
    public final Object f7512c;
    public final Object d;
    public final Object f7513e;
    public final Object f7514f;
    public final Object f7515g;

    public i0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f7510a = i10;
        this.f7513e = obj;
        this.f7511b = obj2;
        this.f7512c = obj3;
        this.f7514f = obj4;
        this.d = obj5;
        this.f7515g = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f7510a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k0(tL_error, (t0) this.f7513e, tLObject, (List) this.f7511b, (p2.h) this.f7512c, (t0) this.f7514f, (org.telegram.ui.ActionBar.p2) this.d, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f7515g, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new k0(tL_error, (Utilities.Callback) this.f7513e, tLObject, (List) this.f7511b, (p2.h) this.f7512c, (Utilities.Callback) this.f7514f, (org.telegram.ui.ActionBar.p2) this.d, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f7515g, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new k0(tLObject, (p2.m) this.f7513e, (p2.h) this.f7512c, (Utilities.Callback2) ((eh.w) this.f7514f), (Activity) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentStarsGiveaway) this.f7515g), (List) this.f7511b, tL_error, 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new k0(tLObject, (p2.m) this.f7513e, (p2.h) this.f7512c, (Utilities.Callback2) ((i5) this.f7514f), (Activity) this.d, (TLRPC.InputStorePaymentPurpose) ((TLRPC.TL_inputStorePaymentStarsGift) this.f7515g), (List) this.f7511b, tL_error, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new k0((UserInfoActivity) this.f7513e, tL_error, (TLObject) this.f7511b, (TL_account.TL_birthday) this.f7512c, (TLRPC.UserFull) this.f7514f, tLObject, (int[]) this.d, (ArrayList) this.f7515g));
                return;
        }
    }

    public i0(p2.m mVar, p2.h hVar, Utilities.Callback2 callback2, Activity activity, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, int i10) {
        this.f7510a = i10;
        this.f7513e = mVar;
        this.f7512c = hVar;
        this.f7514f = callback2;
        this.d = activity;
        this.f7515g = inputStorePaymentPurpose;
        this.f7511b = list;
    }
}
