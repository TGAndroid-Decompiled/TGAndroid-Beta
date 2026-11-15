package di;

import android.content.Context;
import org.telegram.messenger.hd;
public final class sb extends fc {
    public final boolean f9408n0;
    public final int f9409o0;
    public final ic f9410p0;

    public sb(ic icVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, int i7) {
        super(context, e6Var);
        this.f9410p0 = icVar;
        this.f9408n0 = z10;
        this.f9409o0 = i7;
    }

    @Override
    public final void e(int i7) {
        long j3 = i7;
        ic icVar = this.f9410p0;
        icVar.N0(j3);
        hi.d dVar = icVar.f8831x1;
        if (dVar != null) {
            dVar.i(lb.Y0(false, hd.a0(null, null, 2131745047, hd.E(j3, ',')), icVar.N1), true, true);
        }
        if (this.f9408n0) {
            fi.s0 s0Var = icVar.B1;
            s0Var.f12302g = j3;
            icVar.C1.set(s0Var);
            int i10 = this.f9409o0;
            f(fi.t.b(i10, i7, 3), fi.t.b(i10, i7, 4), true);
        }
    }

    @Override
    public final void setValue(int i7) {
        super.setValue(i7);
        if (this.f9408n0) {
            int i10 = this.f9409o0;
            f(fi.t.b(i10, i7, 3), fi.t.b(i10, i7, 4), true);
        }
    }
}
