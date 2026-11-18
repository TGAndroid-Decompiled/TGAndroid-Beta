package di;

import android.app.Activity;
import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class j implements RequestDelegate {
    public final int f9057a = 0;
    public final boolean f9058b;
    public final long f9059c;
    public final Object d;
    public final Object f9060e;
    public final Object f9061f;

    public j(t tVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3) {
        this.d = tVar;
        this.f9060e = twoStepVerificationActivity;
        this.f9061f = activity;
        this.f9058b = z10;
        this.f9059c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9057a) {
            case 0:
                org.telegram.messenger.g0.g3(new k((t) this.d, tL_error, (TwoStepVerificationActivity) this.f9060e, (Activity) this.f9061f, this.f9058b, this.f9059c, tLObject));
                return;
            default:
                org.telegram.messenger.g0.g3(new m((fi.p6) this.d, tL_error, this.f9058b, this.f9059c, (x10) this.f9060e, (org.telegram.ui.ActionBar.i6) this.f9061f));
                return;
        }
    }

    public j(fi.p6 p6Var, boolean z10, long j3, x10 x10Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this.d = p6Var;
        this.f9058b = z10;
        this.f9059c = j3;
        this.f9060e = x10Var;
        this.f9061f = i6Var;
    }
}
