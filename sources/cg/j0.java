package cg;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.UserInfoActivity;

public final class j0 implements RequestDelegate {

    public final int f2731a;

    public final Object f2732b;

    public final Object f2733c;
    public final Object d;

    public final Object f2734e;

    public final Object f2735f;

    public final Object f2736g;

    public j0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f2731a = i10;
        this.f2734e = obj;
        this.f2732b = obj2;
        this.f2733c = obj3;
        this.f2735f = obj4;
        this.d = obj5;
        this.f2736g = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2731a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l0(tL_error, (v0) this.f2734e, tLObject, (List) this.f2732b, (n2.g) this.f2733c, (v0) this.f2735f, (org.telegram.ui.ActionBar.n2) this.d, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f2736g, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new l0(tL_error, (Utilities.Callback) this.f2734e, tLObject, (List) this.f2732b, (n2.g) this.f2733c, (Utilities.Callback) this.f2735f, (org.telegram.ui.ActionBar.n2) this.d, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f2736g, 1));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new l0(tLObject, (n2.l) this.f2734e, (n2.g) this.f2733c, (Utilities.Callback2) this.f2735f, (Activity) this.d, (TLRPC.InputStorePaymentPurpose) this.f2736g, (List) this.f2732b, tL_error, 2));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new l0(tLObject, (n2.l) this.f2734e, (n2.g) this.f2733c, (Utilities.Callback2) this.f2735f, (Activity) this.d, (TLRPC.InputStorePaymentPurpose) this.f2736g, (List) this.f2732b, tL_error, 3));
                break;
            default:
                AndroidUtilities.runOnUIThread(new l0((UserInfoActivity) this.f2734e, tL_error, (TLObject) this.f2732b, (TL_account.TL_birthday) this.f2733c, (TLRPC.UserFull) this.f2735f, tLObject, (int[]) this.d, (ArrayList) this.f2736g));
                break;
        }
    }

    public j0(n2.l lVar, n2.g gVar, Utilities.Callback2 callback2, Activity activity, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, int i10) {
        this.f2731a = i10;
        this.f2734e = lVar;
        this.f2733c = gVar;
        this.f2735f = callback2;
        this.d = activity;
        this.f2736g = inputStorePaymentPurpose;
        this.f2732b = list;
    }
}
