package mh;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class e implements RequestDelegate {
    public final int f13925a = 0;
    public final boolean f13926b;
    public final long f13927c;
    public final Object d;
    public final Object f13928e;
    public final Object f13929f;

    public e(p pVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z4, long j10) {
        this.d = pVar;
        this.f13928e = twoStepVerificationActivity;
        this.f13929f = activity;
        this.f13926b = z4;
        this.f13927c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f13925a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f((p) this.d, tL_error, (TwoStepVerificationActivity) this.f13928e, (Activity) this.f13929f, this.f13926b, this.f13927c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new i((oh.t6) this.d, tL_error, this.f13926b, this.f13927c, (h5.d) this.f13928e, (org.telegram.ui.ActionBar.g6) this.f13929f));
                return;
        }
    }

    public e(oh.t6 t6Var, boolean z4, long j10, h5.d dVar, org.telegram.ui.ActionBar.g6 g6Var) {
        this.d = t6Var;
        this.f13926b = z4;
        this.f13927c = j10;
        this.f13928e = dVar;
        this.f13929f = g6Var;
    }
}
