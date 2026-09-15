package ai;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h21;
import org.telegram.ui.TwoStepVerificationActivity;
public final class b8 implements RequestDelegate {
    public final int f586a = 0;
    public final boolean f587b;
    public final long f588c;
    public final Object d;
    public final Object e;
    public final Object f589f;

    public b8(l9 l9Var, boolean z10, long j3, e2.h hVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.d = l9Var;
        this.f587b = z10;
        this.f588c = j3;
        this.e = hVar;
        this.f589f = e6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f586a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h3((l9) this.d, tL_error, this.f587b, this.f588c, (e2.h) this.e, (org.telegram.ui.ActionBar.e6) this.f589f));
                return;
            default:
                AndroidUtilities.runOnUIThread(new h21((yh.g) this.d, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.f589f, this.f587b, this.f588c, tLObject));
                return;
        }
    }

    public b8(yh.g gVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3) {
        this.d = gVar;
        this.e = twoStepVerificationActivity;
        this.f589f = activity;
        this.f587b = z10;
        this.f588c = j3;
    }
}
