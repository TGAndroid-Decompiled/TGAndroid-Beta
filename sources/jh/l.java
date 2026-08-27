package jh;

import android.view.ViewGroup;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.yw;

public final class l extends xf.b {
    public final boolean d;

    public final yw f13606e;

    public l(yw ywVar, boolean z10) {
        this.f13606e = ywVar;
        this.d = z10;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    @Override
    public final int h() {
        boolean z10 = this.d;
        yw ywVar = this.f13606e;
        return (z10 ? ywVar.f13804y : ywVar.f13802x).size();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        o oVar = (o) o1Var.f5789a;
        oVar.f13721b = i10;
        boolean z10 = this.d;
        yw ywVar = this.f13606e;
        if (z10) {
            oVar.setDialogId(((m) ywVar.f13804y.get(i10)).f13646c);
        } else {
            oVar.setDialogId(((m) ywVar.f13802x.get(i10)).f13646c);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        o oVar = new o(this.f13606e, viewGroup.getContext());
        boolean z10 = this.d;
        oVar.J = z10;
        if (z10) {
            oVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new lk0(oVar);
    }
}
