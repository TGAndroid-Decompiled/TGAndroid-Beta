package bi;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g21;
import org.telegram.ui.TwoStepVerificationActivity;
public final class k7 implements RequestDelegate {
    public final int f3205a = 0;
    public final boolean f3206b;
    public final long f3207c;
    public final Object d;
    public final Object f3208e;
    public final Object f3209f;

    public k7(u8 u8Var, boolean z10, long j3, e2.h hVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.d = u8Var;
        this.f3206b = z10;
        this.f3207c = j3;
        this.f3208e = hVar;
        this.f3209f = f6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3205a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u2((u8) this.d, tL_error, this.f3206b, this.f3207c, (e2.h) this.f3208e, (org.telegram.ui.ActionBar.f6) this.f3209f));
                return;
            default:
                AndroidUtilities.runOnUIThread(new g21((zh.g) this.d, tL_error, (TwoStepVerificationActivity) this.f3208e, (Activity) this.f3209f, this.f3206b, this.f3207c, tLObject));
                return;
        }
    }

    public k7(zh.g gVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3) {
        this.d = gVar;
        this.f3208e = twoStepVerificationActivity;
        this.f3209f = activity;
        this.f3206b = z10;
        this.f3207c = j3;
    }
}
