package ai;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u21;
import org.telegram.ui.TwoStepVerificationActivity;
public final class d8 implements RequestDelegate {
    public final int f716a = 0;
    public final boolean f717b;
    public final long f718c;
    public final Object d;
    public final Object e;
    public final Object f719f;

    public d8(l9 l9Var, boolean z10, long j3, Utilities.Callback callback, org.telegram.ui.ActionBar.d6 d6Var) {
        this.d = l9Var;
        this.f717b = z10;
        this.f718c = j3;
        this.e = callback;
        this.f719f = d6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f716a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h3((l9) this.d, tL_error, this.f717b, this.f718c, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.d6) this.f719f));
                return;
            default:
                AndroidUtilities.runOnUIThread(new u21((yh.g) this.d, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.f719f, this.f717b, this.f718c, tLObject));
                return;
        }
    }

    public d8(yh.g gVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3) {
        this.d = gVar;
        this.e = twoStepVerificationActivity;
        this.f719f = activity;
        this.f717b = z10;
        this.f718c = j3;
    }
}
