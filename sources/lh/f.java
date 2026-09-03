package lh;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class f implements RequestDelegate {
    public final int f12373a = 0;
    public final boolean f12374b;
    public final long f12375c;
    public final Object d;
    public final Object e;
    public final Object f12376f;

    public f(q qVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z4, long j10) {
        this.d = qVar;
        this.e = twoStepVerificationActivity;
        this.f12376f = activity;
        this.f12374b = z4;
        this.f12375c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12373a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g((q) this.d, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.f12376f, this.f12374b, this.f12375c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new j((nh.t6) this.d, tL_error, this.f12374b, this.f12375c, (h5.d) this.e, (org.telegram.ui.ActionBar.f6) this.f12376f));
                return;
        }
    }

    public f(nh.t6 t6Var, boolean z4, long j10, h5.d dVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.d = t6Var;
        this.f12374b = z4;
        this.f12375c = j10;
        this.e = dVar;
        this.f12376f = f6Var;
    }
}
