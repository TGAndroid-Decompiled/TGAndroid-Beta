package hh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class va extends gb {

    public final boolean f10254i0;

    public final int f10255j0;

    public final jb f10256k0;

    public va(jb jbVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, int i10) {
        super(context, c6Var);
        this.f10256k0 = jbVar;
        this.f10254i0 = z10;
        this.f10255j0 = i10;
    }

    @Override
    public final void e(int i10) {
        long j10 = i10;
        jb jbVar = this.f10256k0;
        jbVar.t(j10);
        lh.d dVar = jbVar.f9564x;
        if (dVar != null) {
            dVar.g(oa.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j10, ',')), jbVar.M), true, true);
        }
        if (this.f10254i0) {
            jh.s0 s0Var = jbVar.C;
            s0Var.f13934g = j10;
            jbVar.D.set(s0Var);
            int i11 = this.f10255j0;
            f(jh.s.b(i11, i10, 3), jh.s.b(i11, i10, 4), true);
        }
    }

    @Override
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.f10254i0) {
            int i11 = this.f10255j0;
            f(jh.s.b(i11, i10, 3), jh.s.b(i11, i10, 4), true);
        }
    }
}
