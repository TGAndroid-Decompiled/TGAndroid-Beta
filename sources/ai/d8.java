package ai;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f31;
import org.telegram.ui.TwoStepVerificationActivity;
public final class d8 implements RequestDelegate {
    public final int f778a = 0;
    public final boolean f779b;
    public final long f780c;
    public final Object d;
    public final Object f781e;
    public final Object f782f;

    public d8(l9 l9Var, boolean z10, long j3, Utilities.Callback callback, org.telegram.ui.ActionBar.d6 d6Var) {
        this.d = l9Var;
        this.f779b = z10;
        this.f780c = j3;
        this.f781e = callback;
        this.f782f = d6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f778a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h3((l9) this.d, tL_error, this.f779b, this.f780c, (Utilities.Callback) this.f781e, (org.telegram.ui.ActionBar.d6) this.f782f));
                return;
            default:
                AndroidUtilities.runOnUIThread(new f31((yh.g) this.d, tL_error, (TwoStepVerificationActivity) this.f781e, (Activity) this.f782f, this.f779b, this.f780c, tLObject));
                return;
        }
    }

    public d8(yh.g gVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3) {
        this.d = gVar;
        this.f781e = twoStepVerificationActivity;
        this.f782f = activity;
        this.f779b = z10;
        this.f780c = j3;
    }
}
