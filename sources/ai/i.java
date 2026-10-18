package ai;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class i implements RequestDelegate {
    public final int f1450a = 0;
    public final boolean f1451b;
    public final long f1452c;
    public final Object d;
    public final Object e;
    public final Object f1453f;

    public i(x xVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10) {
        this.d = xVar;
        this.e = twoStepVerificationActivity;
        this.f1453f = activity;
        this.f1451b = z10;
        this.f1452c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1450a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j((x) this.d, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.f1453f, this.f1451b, this.f1452c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m((ci.i7) this.d, tL_error, this.f1451b, this.f1452c, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.d6) this.f1453f));
                return;
        }
    }

    public i(ci.i7 i7Var, boolean z10, long j10, Utilities.Callback callback, org.telegram.ui.ActionBar.d6 d6Var) {
        this.d = i7Var;
        this.f1451b = z10;
        this.f1452c = j10;
        this.e = callback;
        this.f1453f = d6Var;
    }
}
