package bi;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j31;
import org.telegram.ui.TwoStepVerificationActivity;
public final class p7 implements RequestDelegate {
    public final int f3473a = 0;
    public final boolean f3474b;
    public final long f3475c;
    public final Object d;
    public final Object e;
    public final Object f3476f;

    public p7(x8 x8Var, boolean z10, long j10, Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var) {
        this.d = x8Var;
        this.f3474b = z10;
        this.f3475c = j10;
        this.e = callback;
        this.f3476f = c6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3473a) {
            case 0:
                AndroidUtilities.runOnUIThread(new x2((x8) this.d, tL_error, this.f3474b, this.f3475c, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.c6) this.f3476f));
                return;
            default:
                AndroidUtilities.runOnUIThread(new j31((zh.g) this.d, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.f3476f, this.f3474b, this.f3475c, tLObject));
                return;
        }
    }

    public p7(zh.g gVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10) {
        this.d = gVar;
        this.e = twoStepVerificationActivity;
        this.f3476f = activity;
        this.f3474b = z10;
        this.f3475c = j10;
    }
}
