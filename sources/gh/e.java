package gh;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class e implements RequestDelegate {
    public final int f7998a = 0;
    public final boolean f7999b;
    public final long f8000c;
    public final Object d;
    public final Object f8001e;
    public final Object f8002f;

    public e(r rVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10) {
        this.d = rVar;
        this.f8001e = twoStepVerificationActivity;
        this.f8002f = activity;
        this.f7999b = z10;
        this.f8000c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f7998a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f((r) this.d, tL_error, (TwoStepVerificationActivity) this.f8001e, (Activity) this.f8002f, this.f7999b, this.f8000c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new i((ih.v6) this.d, tL_error, this.f7999b, this.f8000c, (d5.d) this.f8001e, (org.telegram.ui.ActionBar.b6) this.f8002f));
                return;
        }
    }

    public e(ih.v6 v6Var, boolean z10, long j10, d5.d dVar, org.telegram.ui.ActionBar.b6 b6Var) {
        this.d = v6Var;
        this.f7999b = z10;
        this.f8000c = j10;
        this.f8001e = dVar;
        this.f8002f = b6Var;
    }
}
