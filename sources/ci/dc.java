package ci;

import android.content.Context;
import org.telegram.messenger.bd;
public final class dc extends qc {
    public final boolean f4991n0;
    public final int f4992o0;
    public final tc f4993p0;

    public dc(tc tcVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, int i3) {
        super(context, e6Var);
        this.f4993p0 = tcVar;
        this.f4991n0 = z10;
        this.f4992o0 = i3;
    }

    @Override
    public final void e(int i3) {
        long j10 = i3;
        tc tcVar = this.f4993p0;
        tcVar.N0(j10);
        gi.d dVar = tcVar.f6063u1;
        if (dVar != null) {
            dVar.i(wb.Y0(false, bd.a0(null, null, 2131745057, bd.E(j10, ',')), tcVar.K1), true, true);
        }
        if (this.f4991n0) {
            ei.u0 u0Var = tcVar.f6067y1;
            u0Var.f11074g = j10;
            tcVar.f6068z1.set(u0Var);
            int i10 = this.f4992o0;
            f(ei.u.b(i10, i3, 3), ei.u.b(i10, i3, 4), true);
        }
    }

    @Override
    public final void setValue(int i3) {
        super.setValue(i3);
        if (this.f4991n0) {
            int i10 = this.f4992o0;
            f(ei.u.b(i10, i3, 3), ei.u.b(i10, i3, 4), true);
        }
    }
}
