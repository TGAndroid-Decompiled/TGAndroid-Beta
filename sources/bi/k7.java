package bi;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g21;
import org.telegram.ui.TwoStepVerificationActivity;
public final class k7 implements RequestDelegate {
    public final int f3232a = 0;
    public final boolean f3233b;
    public final long f3234c;
    public final Object d;
    public final Object f3235e;
    public final Object f3236f;

    public k7(u8 u8Var, boolean z10, long j3, e2.h hVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.d = u8Var;
        this.f3233b = z10;
        this.f3234c = j3;
        this.f3235e = hVar;
        this.f3236f = f6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3232a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u2((u8) this.d, tL_error, this.f3233b, this.f3234c, (e2.h) this.f3235e, (org.telegram.ui.ActionBar.f6) this.f3236f));
                return;
            default:
                AndroidUtilities.runOnUIThread(new g21((zh.g) this.d, tL_error, (TwoStepVerificationActivity) this.f3235e, (Activity) this.f3236f, this.f3233b, this.f3234c, tLObject));
                return;
        }
    }

    public k7(zh.g gVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3) {
        this.d = gVar;
        this.f3235e = twoStepVerificationActivity;
        this.f3236f = activity;
        this.f3233b = z10;
        this.f3234c = j3;
    }
}
