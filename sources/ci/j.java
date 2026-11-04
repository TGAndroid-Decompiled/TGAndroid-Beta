package ci;

import android.app.Activity;
import org.telegram.messenger.u10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class j implements RequestDelegate {
    public final int f5319a = 0;
    public final boolean f5320b;
    public final long f5321c;
    public final Object d;
    public final Object f5322e;
    public final Object f5323f;

    public j(v vVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10) {
        this.d = vVar;
        this.f5322e = twoStepVerificationActivity;
        this.f5323f = activity;
        this.f5320b = z10;
        this.f5321c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5319a) {
            case 0:
                org.telegram.messenger.g0.h3(new k((v) this.d, tL_error, (TwoStepVerificationActivity) this.f5322e, (Activity) this.f5323f, this.f5320b, this.f5321c, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new n((ei.z6) this.d, tL_error, this.f5320b, this.f5321c, (u10) this.f5322e, (org.telegram.ui.ActionBar.e6) this.f5323f));
                return;
        }
    }

    public j(ei.z6 z6Var, boolean z10, long j10, u10 u10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.d = z6Var;
        this.f5320b = z10;
        this.f5321c = j10;
        this.f5322e = u10Var;
        this.f5323f = e6Var;
    }
}
