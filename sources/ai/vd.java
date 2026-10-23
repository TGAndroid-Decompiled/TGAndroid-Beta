package ai;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vd extends je {
    public final boolean m0;
    public final int f2337n0;
    public final me f2338o0;

    public vd(me meVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10, int i10) {
        super(context, g6Var);
        this.f2338o0 = meVar;
        this.m0 = z10;
        this.f2337n0 = i10;
    }

    @Override
    public final void e(int i10) {
        long j10 = i10;
        me meVar = this.f2338o0;
        meVar.t(j10);
        ei.d dVar = meVar.f1847x;
        if (dVar != null) {
            dVar.i(nd.W0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j10, ',')), meVar.S), true, true);
        }
        if (this.m0) {
            ci.v0 v0Var = meVar.G;
            v0Var.f6005g = j10;
            meVar.H.set(v0Var);
            int i11 = this.f2337n0;
            f(ci.u.b(i11, i10, 3), ci.u.b(i11, i10, 4), true);
        }
    }

    @Override
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.m0) {
            int i11 = this.f2337n0;
            f(ci.u.b(i11, i10, 3), ci.u.b(i11, i10, 4), true);
        }
    }
}
