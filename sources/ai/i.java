package ai;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class i implements RequestDelegate {
    public final int f1445a = 0;
    public final boolean f1446b;
    public final long f1447c;
    public final Object d;
    public final Object e;
    public final Object f1448f;

    public i(x xVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10) {
        this.d = xVar;
        this.e = twoStepVerificationActivity;
        this.f1448f = activity;
        this.f1446b = z10;
        this.f1447c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1445a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j((x) this.d, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.f1448f, this.f1446b, this.f1447c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m((ci.h7) this.d, tL_error, this.f1446b, this.f1447c, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.g6) this.f1448f));
                return;
        }
    }

    public i(ci.h7 h7Var, boolean z10, long j10, Utilities.Callback callback, org.telegram.ui.ActionBar.g6 g6Var) {
        this.d = h7Var;
        this.f1446b = z10;
        this.f1447c = j10;
        this.e = callback;
        this.f1448f = g6Var;
    }
}
