package jh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pa extends ab {
    public final boolean f12628i0;
    public final int f12629j0;
    public final db f12630k0;

    public pa(db dbVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, int i10) {
        super(context, c6Var);
        this.f12630k0 = dbVar;
        this.f12628i0 = z10;
        this.f12629j0 = i10;
    }

    @Override
    public final void e(int i10) {
        long j10 = i10;
        db dbVar = this.f12630k0;
        dbVar.s(j10);
        nh.d dVar = dbVar.f11981x;
        if (dVar != null) {
            dVar.g(ia.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j10, ',')), dbVar.M), true, true);
        }
        if (this.f12628i0) {
            lh.s0 s0Var = dbVar.C;
            s0Var.f16199g = j10;
            dbVar.D.set(s0Var);
            int i11 = this.f12629j0;
            f(lh.s.b(i11, i10, 3), lh.s.b(i11, i10, 4), true);
        }
    }

    @Override
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.f12628i0) {
            int i11 = this.f12629j0;
            f(lh.s.b(i11, i10, 3), lh.s.b(i11, i10, 4), true);
        }
    }
}
