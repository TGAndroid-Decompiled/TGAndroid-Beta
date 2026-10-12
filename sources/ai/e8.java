package ai;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.s31;
import org.telegram.ui.TwoStepVerificationActivity;
public final class e8 implements RequestDelegate {
    public final int f886a = 0;
    public final boolean f887b;
    public final long f888c;
    public final Object d;
    public final Object f889e;
    public final Object f890f;

    public e8(m9 m9Var, boolean z10, long j3, Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var) {
        this.d = m9Var;
        this.f887b = z10;
        this.f888c = j3;
        this.f889e = callback;
        this.f890f = c6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f886a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i3((m9) this.d, tL_error, this.f887b, this.f888c, (Utilities.Callback) this.f889e, (org.telegram.ui.ActionBar.c6) this.f890f));
                return;
            default:
                AndroidUtilities.runOnUIThread(new s31((yh.g) this.d, tL_error, (TwoStepVerificationActivity) this.f889e, (Activity) this.f890f, this.f887b, this.f888c, tLObject));
                return;
        }
    }

    public e8(yh.g gVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3) {
        this.d = gVar;
        this.f889e = twoStepVerificationActivity;
        this.f890f = activity;
        this.f887b = z10;
        this.f888c = j3;
    }
}
