package bi;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ld extends yd {
    public final boolean m0;
    public final int f5055n0;
    public final be f5056o0;

    public ld(be beVar, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, int i10) {
        super(context, u6Var);
        this.f5056o0 = beVar;
        this.m0 = z10;
        this.f5055n0 = i10;
    }

    @Override
    public final void e(int i10) {
        long j10 = i10;
        be beVar = this.f5056o0;
        beVar.s(j10);
        fi.d dVar = beVar.f4406x;
        if (dVar != null) {
            dVar.i(dd.U0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j10, ',')), beVar.S), true, true);
        }
        if (this.m0) {
            di.v0 v0Var = beVar.G;
            v0Var.f9242g = j10;
            beVar.H.set(v0Var);
            int i11 = this.f5055n0;
            f(di.u.b(i11, i10, 3), di.u.b(i11, i10, 4), true);
        }
    }

    @Override
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.m0) {
            int i11 = this.f5055n0;
            f(di.u.b(i11, i10, 3), di.u.b(i11, i10, 4), true);
        }
    }
}
