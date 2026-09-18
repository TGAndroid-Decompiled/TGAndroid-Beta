package ai;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.nx;
public final class v extends og.b {
    public final boolean d;
    public final nx e;

    public v(nx nxVar, boolean z10) {
        this.e = nxVar;
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
        nx nxVar = this.e;
        if (z10) {
            arrayList = nxVar.f572y;
        } else {
            arrayList = nxVar.f570x;
        }
        return arrayList.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        a0 a0Var = (a0) c1Var.f42702a;
        a0Var.f497b = i10;
        boolean z10 = this.d;
        nx nxVar = this.e;
        if (z10) {
            a0Var.setDialogId(((w) nxVar.f572y.get(i10)).f1639c);
        } else {
            a0Var.setDialogId(((w) nxVar.f570x.get(i10)).f1639c);
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
