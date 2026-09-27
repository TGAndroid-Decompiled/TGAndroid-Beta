package ai;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w21;
import org.telegram.ui.TwoStepVerificationActivity;
public final class d8 implements RequestDelegate {
    public final int f719a = 0;
    public final boolean f720b;
    public final long f721c;
    public final Object d;
    public final Object e;
    public final Object f722f;

    public d8(l9 l9Var, boolean z10, long j3, Utilities.Callback callback, org.telegram.ui.ActionBar.e6 e6Var) {
        this.d = l9Var;
        this.f720b = z10;
        this.f721c = j3;
        this.e = callback;
        this.f722f = e6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f719a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h3((l9) this.d, tL_error, this.f720b, this.f721c, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.e6) this.f722f));
                return;
            default:
                AndroidUtilities.runOnUIThread(new w21((yh.g) this.d, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.f722f, this.f720b, this.f721c, tLObject));
                return;
        }
    }

    public d8(yh.g gVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3) {
        this.d = gVar;
        this.e = twoStepVerificationActivity;
        this.f722f = activity;
        this.f720b = z10;
        this.f721c = j3;
    }
}
