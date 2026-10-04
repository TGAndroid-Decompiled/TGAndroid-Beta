package ai;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.jx;
public final class v extends og.b {
    public final boolean d;
    public final jx f1733e;

    public v(jx jxVar, boolean z10) {
        this.f1733e = jxVar;
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
        jx jxVar = this.f1733e;
        if (z10) {
            arrayList = jxVar.f626y;
        } else {
            arrayList = jxVar.f624x;
        }
        return arrayList.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        a0 a0Var = (a0) c1Var.f46523a;
        a0Var.f539b = i10;
        boolean z10 = this.d;
        jx jxVar = this.f1733e;
        if (z10) {
            a0Var.setDialogId(((w) jxVar.f626y.get(i10)).f1785c);
        } else {
            a0Var.setDialogId(((w) jxVar.f624x.get(i10)).f1785c);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        a0 a0Var = new a0(this.f1733e, viewGroup.getContext());
        boolean z10 = this.d;
        a0Var.N = z10;
        if (z10) {
            a0Var.d(1.0f, 1.0f, 0.0f, false);
        }
        return new s4.c1(a0Var);
    }
}
