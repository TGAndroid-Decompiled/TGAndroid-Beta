package lh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qa extends bb {
    public final boolean f12978j0;
    public final int f12979k0;
    public final eb f12980l0;

    public qa(eb ebVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, int i10) {
        super(context, f6Var);
        this.f12980l0 = ebVar;
        this.f12978j0 = z4;
        this.f12979k0 = i10;
    }

    @Override
    public final void e(int i10) {
        long j10 = i10;
        eb ebVar = this.f12980l0;
        ebVar.s(j10);
        ph.d dVar = ebVar.f12371x;
        if (dVar != null) {
            dVar.g(ja.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j10, ',')), ebVar.N), true, true);
        }
        if (this.f12978j0) {
            nh.t0 t0Var = ebVar.D;
            t0Var.f15880g = j10;
            ebVar.E.set(t0Var);
            int i11 = this.f12979k0;
            f(nh.t.b(i11, i10, 3), nh.t.b(i11, i10, 4), true);
        }
    }

    @Override
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.f12978j0) {
            int i11 = this.f12979k0;
            f(nh.t.b(i11, i10, 3), nh.t.b(i11, i10, 4), true);
        }
    }
}
