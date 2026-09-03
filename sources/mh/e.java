package mh;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class e implements RequestDelegate {
    public final int f13927a = 0;
    public final boolean f13928b;
    public final long f13929c;
    public final Object d;
    public final Object f13930e;
    public final Object f13931f;

    public e(p pVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z4, long j10) {
        this.d = pVar;
        this.f13930e = twoStepVerificationActivity;
        this.f13931f = activity;
        this.f13928b = z4;
        this.f13929c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f13927a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f((p) this.d, tL_error, (TwoStepVerificationActivity) this.f13930e, (Activity) this.f13931f, this.f13928b, this.f13929c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new i((oh.t6) this.d, tL_error, this.f13928b, this.f13929c, (h5.d) this.f13930e, (org.telegram.ui.ActionBar.g6) this.f13931f));
                return;
        }
    }

    public e(oh.t6 t6Var, boolean z4, long j10, h5.d dVar, org.telegram.ui.ActionBar.g6 g6Var) {
        this.d = t6Var;
        this.f13928b = z4;
        this.f13929c = j10;
        this.f13930e = dVar;
        this.f13931f = g6Var;
    }
}
