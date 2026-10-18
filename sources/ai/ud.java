package ai;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ud extends ie {
    public final boolean m0;
    public final int f2280n0;
    public final le f2281o0;

    public ud(le leVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, int i10) {
        super(context, d6Var);
        this.f2281o0 = leVar;
        this.m0 = z10;
        this.f2280n0 = i10;
    }

    @Override
    public final void e(int i10) {
        long j10 = i10;
        le leVar = this.f2281o0;
        leVar.t(j10);
        ei.d dVar = leVar.f1799x;
        if (dVar != null) {
            dVar.g(md.W0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j10, ',')), leVar.R), true, true);
        }
        if (this.m0) {
            ci.v0 v0Var = leVar.G;
            v0Var.f5998g = j10;
            leVar.H.set(v0Var);
            int i11 = this.f2280n0;
            f(ci.u.b(i11, i10, 3), ci.u.b(i11, i10, 4), true);
        }
    }

    @Override
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.m0) {
            int i11 = this.f2280n0;
            f(ci.u.b(i11, i10, 3), ci.u.b(i11, i10, 4), true);
        }
    }
}
