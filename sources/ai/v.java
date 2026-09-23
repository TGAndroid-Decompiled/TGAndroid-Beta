package ai;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ix;
public final class v extends og.b {
    public final boolean d;
    public final ix e;

    public v(ix ixVar, boolean z10) {
        this.e = ixVar;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        ArrayList arrayList;
        boolean z10 = this.d;
        ix ixVar = this.e;
        if (z10) {
            arrayList = ixVar.f576y;
        } else {
            arrayList = ixVar.f574x;
        }
        return arrayList.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        a0 a0Var = (a0) c1Var.f42627a;
        a0Var.f494b = i10;
        boolean z10 = this.d;
        ix ixVar = this.e;
        if (z10) {
            a0Var.setDialogId(((w) ixVar.f576y.get(i10)).f1640c);
        } else {
            a0Var.setDialogId(((w) ixVar.f574x.get(i10)).f1640c);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        a0 a0Var = new a0(this.e, viewGroup.getContext());
        boolean z10 = this.d;
        a0Var.N = z10;
        if (z10) {
            a0Var.d(1.0f, 1.0f, 0.0f, false);
        }
        return new s4.c1(a0Var);
    }
}
