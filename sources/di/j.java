package di;

import android.app.Activity;
import org.telegram.messenger.y10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class j implements RequestDelegate {
    public final int f9045a = 0;
    public final boolean f9046b;
    public final long f9047c;
    public final Object d;
    public final Object f9048e;
    public final Object f9049f;

    public j(t tVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3) {
        this.d = tVar;
        this.f9048e = twoStepVerificationActivity;
        this.f9049f = activity;
        this.f9046b = z10;
        this.f9047c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9045a) {
            case 0:
                org.telegram.messenger.g0.g3(new k((t) this.d, tL_error, (TwoStepVerificationActivity) this.f9048e, (Activity) this.f9049f, this.f9046b, this.f9047c, tLObject));
                return;
            default:
                org.telegram.messenger.g0.g3(new m((fi.p6) this.d, tL_error, this.f9046b, this.f9047c, (y10) this.f9048e, (org.telegram.ui.ActionBar.h6) this.f9049f));
                return;
        }
    }

    public j(fi.p6 p6Var, boolean z10, long j3, y10 y10Var, org.telegram.ui.ActionBar.h6 h6Var) {
        this.d = p6Var;
        this.f9046b = z10;
        this.f9047c = j3;
        this.f9048e = y10Var;
        this.f9049f = h6Var;
    }
}
