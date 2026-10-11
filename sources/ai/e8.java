package ai;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.o31;
import org.telegram.ui.TwoStepVerificationActivity;
public final class e8 implements RequestDelegate {
    public final int f888a = 0;
    public final boolean f889b;
    public final long f890c;
    public final Object d;
    public final Object f891e;
    public final Object f892f;

    public e8(m9 m9Var, boolean z10, long j3, Utilities.Callback callback, org.telegram.ui.ActionBar.d6 d6Var) {
        this.d = m9Var;
        this.f889b = z10;
        this.f890c = j3;
        this.f891e = callback;
        this.f892f = d6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f888a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i3((m9) this.d, tL_error, this.f889b, this.f890c, (Utilities.Callback) this.f891e, (org.telegram.ui.ActionBar.d6) this.f892f));
                return;
            default:
                AndroidUtilities.runOnUIThread(new o31((yh.g) this.d, tL_error, (TwoStepVerificationActivity) this.f891e, (Activity) this.f892f, this.f889b, this.f890c, tLObject));
                return;
        }
    }

    public e8(yh.g gVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3) {
        this.d = gVar;
        this.f891e = twoStepVerificationActivity;
        this.f892f = activity;
        this.f889b = z10;
        this.f890c = j3;
    }
}
