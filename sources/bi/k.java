package bi;

import android.app.Activity;
import org.telegram.messenger.c20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class k implements RequestDelegate {
    public final int f4123a = 0;
    public final boolean f4124b;
    public final long f4125c;
    public final Object d;
    public final Object f4126e;
    public final Object f4127f;

    public k(z zVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z9, long j3) {
        this.d = zVar;
        this.f4126e = twoStepVerificationActivity;
        this.f4127f = activity;
        this.f4124b = z9;
        this.f4125c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f4123a) {
            case 0:
                org.telegram.messenger.g0.h3(new l((z) this.d, tL_error, (TwoStepVerificationActivity) this.f4126e, (Activity) this.f4127f, this.f4124b, this.f4125c, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new o((di.z6) this.d, tL_error, this.f4124b, this.f4125c, (c20) this.f4126e, (org.telegram.ui.ActionBar.g6) this.f4127f));
                return;
        }
    }

    public k(di.z6 z6Var, boolean z9, long j3, c20 c20Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.d = z6Var;
        this.f4124b = z9;
        this.f4125c = j3;
        this.f4126e = c20Var;
        this.f4127f = g6Var;
    }
}
