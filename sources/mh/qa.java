package mh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qa extends bb {
    public final boolean f14650j0;
    public final int f14651k0;
    public final eb f14652l0;

    public qa(eb ebVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4, int i10) {
        super(context, g6Var);
        this.f14652l0 = ebVar;
        this.f14650j0 = z4;
        this.f14651k0 = i10;
    }

    @Override
    public final void e(int i10) {
        long j10 = i10;
        eb ebVar = this.f14652l0;
        ebVar.s(j10);
        qh.d dVar = ebVar.f13998x;
        if (dVar != null) {
            dVar.g(ja.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j10, ',')), ebVar.N), true, true);
        }
        if (this.f14650j0) {
            oh.t0 t0Var = ebVar.D;
            t0Var.f17762g = j10;
            ebVar.E.set(t0Var);
            int i11 = this.f14651k0;
            f(oh.s.b(i11, i10, 3), oh.s.b(i11, i10, 4), true);
        }
    }

    @Override
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.f14650j0) {
            int i11 = this.f14651k0;
            f(oh.s.b(i11, i10, 3), oh.s.b(i11, i10, 4), true);
        }
    }
}
