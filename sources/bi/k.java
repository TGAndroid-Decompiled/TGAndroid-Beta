package bi;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class k implements RequestDelegate {
    public final int f4922a = 0;
    public final boolean f4923b;
    public final long f4924c;
    public final Object d;
    public final Object e;
    public final Object f4925f;

    public k(y yVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10) {
        this.d = yVar;
        this.e = twoStepVerificationActivity;
        this.f4925f = activity;
        this.f4923b = z10;
        this.f4924c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f4922a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l((y) this.d, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.f4925f, this.f4923b, this.f4924c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new n((di.h7) this.d, tL_error, this.f4923b, this.f4924c, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.u6) this.f4925f));
                return;
        }
    }

    public k(di.h7 h7Var, boolean z10, long j10, Utilities.Callback callback, org.telegram.ui.ActionBar.u6 u6Var) {
        this.d = h7Var;
        this.f4923b = z10;
        this.f4924c = j10;
        this.e = callback;
        this.f4925f = u6Var;
    }
}
