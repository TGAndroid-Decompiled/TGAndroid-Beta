package jh;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class e implements RequestDelegate {
    public final int f11983a = 0;
    public final boolean f11984b;
    public final long f11985c;
    public final Object d;
    public final Object f11986e;
    public final Object f11987f;

    public e(q qVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10) {
        this.d = qVar;
        this.f11986e = twoStepVerificationActivity;
        this.f11987f = activity;
        this.f11984b = z10;
        this.f11985c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f11983a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f((q) this.d, tL_error, (TwoStepVerificationActivity) this.f11986e, (Activity) this.f11987f, this.f11984b, this.f11985c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new i((lh.s6) this.d, tL_error, this.f11984b, this.f11985c, (f5.d) this.f11986e, (org.telegram.ui.ActionBar.c6) this.f11987f));
                return;
        }
    }

    public e(lh.s6 s6Var, boolean z10, long j10, f5.d dVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.d = s6Var;
        this.f11984b = z10;
        this.f11985c = j10;
        this.f11986e = dVar;
        this.f11987f = c6Var;
    }
}
