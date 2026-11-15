package di;

import android.app.Activity;
import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class i implements RequestDelegate {
    public final int f8756a = 0;
    public final boolean f8757b;
    public final long f8758c;
    public final Object d;
    public final Object f8759e;
    public final Object f8760f;

    public i(t tVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3) {
        this.d = tVar;
        this.f8759e = twoStepVerificationActivity;
        this.f8760f = activity;
        this.f8757b = z10;
        this.f8758c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8756a) {
            case 0:
                org.telegram.messenger.g0.h3(new j((t) this.d, tL_error, (TwoStepVerificationActivity) this.f8759e, (Activity) this.f8760f, this.f8757b, this.f8758c, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new l((fi.s6) this.d, tL_error, this.f8757b, this.f8758c, (z10) this.f8759e, (org.telegram.ui.ActionBar.e6) this.f8760f));
                return;
        }
    }

    public i(fi.s6 s6Var, boolean z10, long j3, z10 z10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.d = s6Var;
        this.f8757b = z10;
        this.f8758c = j3;
        this.f8759e = z10Var;
        this.f8760f = e6Var;
    }
}
