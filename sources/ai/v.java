package ai;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.hx;
public final class v extends og.b {
    public final boolean d;
    public final hx e;

    public v(hx hxVar, boolean z10) {
        this.e = hxVar;
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
        hx hxVar = this.e;
        if (z10) {
            arrayList = hxVar.f576y;
        } else {
            arrayList = hxVar.f574x;
        }
        return arrayList.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        a0 a0Var = (a0) c1Var.f42946a;
        a0Var.f494b = i10;
        boolean z10 = this.d;
        hx hxVar = this.e;
        if (z10) {
            a0Var.setDialogId(((w) hxVar.f576y.get(i10)).f1640c);
        } else {
            a0Var.setDialogId(((w) hxVar.f574x.get(i10)).f1640c);
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
