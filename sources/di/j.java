package di;

import android.app.Activity;
import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class j implements RequestDelegate {
    public final int f9078a = 0;
    public final boolean f9079b;
    public final long f9080c;
    public final Object d;
    public final Object f9081e;
    public final Object f9082f;

    public j(t tVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3) {
        this.d = tVar;
        this.f9081e = twoStepVerificationActivity;
        this.f9082f = activity;
        this.f9079b = z10;
        this.f9080c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9078a) {
            case 0:
                org.telegram.messenger.g0.g3(new k((t) this.d, tL_error, (TwoStepVerificationActivity) this.f9081e, (Activity) this.f9082f, this.f9079b, this.f9080c, tLObject));
                return;
            default:
                org.telegram.messenger.g0.g3(new m((fi.p6) this.d, tL_error, this.f9079b, this.f9080c, (x10) this.f9081e, (org.telegram.ui.ActionBar.h6) this.f9082f));
                return;
        }
    }

    public j(fi.p6 p6Var, boolean z10, long j3, x10 x10Var, org.telegram.ui.ActionBar.h6 h6Var) {
        this.d = p6Var;
        this.f9079b = z10;
        this.f9080c = j3;
        this.f9081e = x10Var;
        this.f9082f = h6Var;
    }
}
