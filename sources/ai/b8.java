package ai;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x21;
import org.telegram.ui.TwoStepVerificationActivity;
public final class b8 implements RequestDelegate {
    public final int f588a = 0;
    public final boolean f589b;
    public final long f590c;
    public final Object d;
    public final Object e;
    public final Object f591f;

    public b8(l9 l9Var, boolean z10, long j3, e2.h hVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.d = l9Var;
        this.f589b = z10;
        this.f590c = j3;
        this.e = hVar;
        this.f591f = f6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f588a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h3((l9) this.d, tL_error, this.f589b, this.f590c, (e2.h) this.e, (org.telegram.ui.ActionBar.f6) this.f591f));
                return;
            default:
                AndroidUtilities.runOnUIThread(new x21((yh.g) this.d, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.f591f, this.f589b, this.f590c, tLObject));
                return;
        }
    }

    public b8(yh.g gVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3) {
        this.d = gVar;
        this.e = twoStepVerificationActivity;
        this.f591f = activity;
        this.f589b = z10;
        this.f590c = j3;
    }
}
