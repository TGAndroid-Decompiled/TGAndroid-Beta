package ai;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class td extends he {
    public final boolean m0;
    public final int f2232n0;
    public final ke f2233o0;

    public td(ke keVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, int i10) {
        super(context, d6Var);
        this.f2233o0 = keVar;
        this.m0 = z10;
        this.f2232n0 = i10;
    }

    @Override
    public final void e(int i10) {
        long j10 = i10;
        ke keVar = this.f2233o0;
        keVar.t(j10);
        ei.d dVar = keVar.f1744x;
        if (dVar != null) {
            dVar.g(ld.W0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j10, ',')), keVar.R), true, true);
        }
        if (this.m0) {
            ci.v0 v0Var = keVar.G;
            v0Var.f6070g = j10;
            keVar.H.set(v0Var);
            int i11 = this.f2232n0;
            f(ci.u.b(i11, i10, 3), ci.u.b(i11, i10, 4), true);
        }
    }

    @Override
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.m0) {
            int i11 = this.f2232n0;
            f(ci.u.b(i11, i10, 3), ci.u.b(i11, i10, 4), true);
        }
    }
}
