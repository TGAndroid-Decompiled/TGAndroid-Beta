package bi;

import android.app.Activity;
import org.telegram.messenger.c20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class k implements RequestDelegate {
    public final int f4120a = 0;
    public final boolean f4121b;
    public final long f4122c;
    public final Object d;
    public final Object f4123e;
    public final Object f4124f;

    public k(z zVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z9, long j3) {
        this.d = zVar;
        this.f4123e = twoStepVerificationActivity;
        this.f4124f = activity;
        this.f4121b = z9;
        this.f4122c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f4120a) {
            case 0:
                org.telegram.messenger.g0.h3(new l((z) this.d, tL_error, (TwoStepVerificationActivity) this.f4123e, (Activity) this.f4124f, this.f4121b, this.f4122c, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new o((di.z6) this.d, tL_error, this.f4121b, this.f4122c, (c20) this.f4123e, (org.telegram.ui.ActionBar.h6) this.f4124f));
                return;
        }
    }

    public k(di.z6 z6Var, boolean z9, long j3, c20 c20Var, org.telegram.ui.ActionBar.h6 h6Var) {
        this.d = z6Var;
        this.f4121b = z9;
        this.f4122c = j3;
        this.f4123e = c20Var;
        this.f4124f = h6Var;
    }
}
