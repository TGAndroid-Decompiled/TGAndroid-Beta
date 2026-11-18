package di;

import android.app.Activity;
import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class j implements RequestDelegate {
    public final int f9054a = 0;
    public final boolean f9055b;
    public final long f9056c;
    public final Object d;
    public final Object f9057e;
    public final Object f9058f;

    public j(t tVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3) {
        this.d = tVar;
        this.f9057e = twoStepVerificationActivity;
        this.f9058f = activity;
        this.f9055b = z10;
        this.f9056c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9054a) {
            case 0:
                org.telegram.messenger.g0.g3(new k((t) this.d, tL_error, (TwoStepVerificationActivity) this.f9057e, (Activity) this.f9058f, this.f9055b, this.f9056c, tLObject));
                return;
            default:
                org.telegram.messenger.g0.g3(new m((fi.p6) this.d, tL_error, this.f9055b, this.f9056c, (x10) this.f9057e, (org.telegram.ui.ActionBar.i6) this.f9058f));
                return;
        }
    }

    public j(fi.p6 p6Var, boolean z10, long j3, x10 x10Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this.d = p6Var;
        this.f9055b = z10;
        this.f9056c = j3;
        this.f9057e = x10Var;
        this.f9058f = i6Var;
    }
}
