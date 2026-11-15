package di;

import android.app.Activity;
import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class i implements RequestDelegate {
    public final int f8754a = 0;
    public final boolean f8755b;
    public final long f8756c;
    public final Object d;
    public final Object f8757e;
    public final Object f8758f;

    public i(t tVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3) {
        this.d = tVar;
        this.f8757e = twoStepVerificationActivity;
        this.f8758f = activity;
        this.f8755b = z10;
        this.f8756c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8754a) {
            case 0:
                org.telegram.messenger.g0.h3(new j((t) this.d, tL_error, (TwoStepVerificationActivity) this.f8757e, (Activity) this.f8758f, this.f8755b, this.f8756c, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new l((fi.s6) this.d, tL_error, this.f8755b, this.f8756c, (z10) this.f8757e, (org.telegram.ui.ActionBar.e6) this.f8758f));
                return;
        }
    }

    public i(fi.s6 s6Var, boolean z10, long j3, z10 z10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.d = s6Var;
        this.f8755b = z10;
        this.f8756c = j3;
        this.f8757e = z10Var;
        this.f8758f = e6Var;
    }
}
