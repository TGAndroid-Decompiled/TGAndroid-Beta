package di;

import android.app.Activity;
import org.telegram.messenger.y10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class j implements RequestDelegate {
    public final int f9081a = 0;
    public final boolean f9082b;
    public final long f9083c;
    public final Object d;
    public final Object f9084e;
    public final Object f9085f;

    public j(t tVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3) {
        this.d = tVar;
        this.f9084e = twoStepVerificationActivity;
        this.f9085f = activity;
        this.f9082b = z10;
        this.f9083c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9081a) {
            case 0:
                org.telegram.messenger.g0.g3(new k((t) this.d, tL_error, (TwoStepVerificationActivity) this.f9084e, (Activity) this.f9085f, this.f9082b, this.f9083c, tLObject));
                return;
            default:
                org.telegram.messenger.g0.g3(new m((fi.p6) this.d, tL_error, this.f9082b, this.f9083c, (y10) this.f9084e, (org.telegram.ui.ActionBar.h6) this.f9085f));
                return;
        }
    }

    public j(fi.p6 p6Var, boolean z10, long j3, y10 y10Var, org.telegram.ui.ActionBar.h6 h6Var) {
        this.d = p6Var;
        this.f9082b = z10;
        this.f9083c = j3;
        this.f9084e = y10Var;
        this.f9085f = h6Var;
    }
}
