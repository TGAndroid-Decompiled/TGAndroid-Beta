package di;

import android.app.Activity;
import org.telegram.messenger.w10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class j implements RequestDelegate {
    public final int f9042a = 0;
    public final boolean f9043b;
    public final long f9044c;
    public final Object d;
    public final Object f9045e;
    public final Object f9046f;

    public j(t tVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3) {
        this.d = tVar;
        this.f9045e = twoStepVerificationActivity;
        this.f9046f = activity;
        this.f9043b = z10;
        this.f9044c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9042a) {
            case 0:
                org.telegram.messenger.g0.g3(new k((t) this.d, tL_error, (TwoStepVerificationActivity) this.f9045e, (Activity) this.f9046f, this.f9043b, this.f9044c, tLObject));
                return;
            default:
                org.telegram.messenger.g0.g3(new m((fi.p6) this.d, tL_error, this.f9043b, this.f9044c, (w10) this.f9045e, (org.telegram.ui.ActionBar.i6) this.f9046f));
                return;
        }
    }

    public j(fi.p6 p6Var, boolean z10, long j3, w10 w10Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this.d = p6Var;
        this.f9043b = z10;
        this.f9044c = j3;
        this.f9045e = w10Var;
        this.f9046f = i6Var;
    }
}
