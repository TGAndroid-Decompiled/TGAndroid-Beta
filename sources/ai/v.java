package ai;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.lx;
public final class v extends og.b {
    public final boolean d;
    public final lx e;

    public v(lx lxVar, boolean z10) {
        this.e = lxVar;
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
        lx lxVar = this.e;
        if (z10) {
            arrayList = lxVar.f567y;
        } else {
            arrayList = lxVar.f565x;
        }
        return arrayList.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        a0 a0Var = (a0) c1Var.f42675a;
        a0Var.f492b = i10;
        boolean z10 = this.d;
        lx lxVar = this.e;
        if (z10) {
            a0Var.setDialogId(((w) lxVar.f567y.get(i10)).f1634c);
        } else {
            a0Var.setDialogId(((w) lxVar.f565x.get(i10)).f1634c);
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
