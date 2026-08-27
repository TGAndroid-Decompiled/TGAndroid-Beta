package hh;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

public final class e implements RequestDelegate {

    public final int f9154a = 0;

    public final boolean f9155b;

    public final long f9156c;
    public final Object d;

    public final Object f9157e;

    public final Object f9158f;

    public e(r rVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10) {
        this.d = rVar;
        this.f9157e = twoStepVerificationActivity;
        this.f9158f = activity;
        this.f9155b = z10;
        this.f9156c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9154a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f((r) this.d, tL_error, (TwoStepVerificationActivity) this.f9157e, (Activity) this.f9158f, this.f9155b, this.f9156c, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new i((jh.s6) this.d, tL_error, this.f9155b, this.f9156c, (d5.d) this.f9157e, (org.telegram.ui.ActionBar.c6) this.f9158f));
                break;
        }
    }

    public e(jh.s6 s6Var, boolean z10, long j10, d5.d dVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.d = s6Var;
        this.f9155b = z10;
        this.f9156c = j10;
        this.f9157e = dVar;
        this.f9158f = c6Var;
    }
}
