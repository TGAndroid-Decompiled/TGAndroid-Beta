package gh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class va extends gb {
    public final boolean f9075i0;
    public final int f9076j0;
    public final jb f9077k0;

    public va(jb jbVar, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, int i9) {
        super(context, b6Var);
        this.f9077k0 = jbVar;
        this.f9075i0 = z10;
        this.f9076j0 = i9;
    }

    @Override
    public final void e(int i9) {
        long j10 = i9;
        jb jbVar = this.f9077k0;
        jbVar.s(j10);
        kh.d dVar = jbVar.f8376x;
        if (dVar != null) {
            dVar.g(oa.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j10, ',')), jbVar.M), true, true);
        }
        if (this.f9075i0) {
            ih.u0 u0Var = jbVar.C;
            u0Var.f12179g = j10;
            jbVar.D.set(u0Var);
            int i10 = this.f9076j0;
            f(ih.u.b(i10, i9, 3), ih.u.b(i10, i9, 4), true);
        }
    }

    @Override
    public final void setValue(int i9) {
        super.setValue(i9);
        if (this.f9075i0) {
            int i10 = this.f9076j0;
            f(ih.u.b(i10, i9, 3), ih.u.b(i10, i9, 4), true);
        }
    }
}
