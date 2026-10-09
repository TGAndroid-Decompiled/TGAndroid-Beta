package ai;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.kx;
public final class v extends og.b {
    public final boolean d;
    public final kx f1813e;

    public v(kx kxVar, boolean z10) {
        this.f1813e = kxVar;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override
    public final int h() {
        ArrayList arrayList;
        boolean z10 = this.d;
        kx kxVar = this.f1813e;
        if (z10) {
            arrayList = kxVar.f693y;
        } else {
            arrayList = kxVar.f691x;
        }
        return arrayList.size();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        a0 a0Var = (a0) d1Var.f47656a;
        a0Var.f622b = i10;
        boolean z10 = this.d;
        kx kxVar = this.f1813e;
        if (z10) {
            a0Var.setDialogId(((w) kxVar.f693y.get(i10)).f1841c);
        } else {
            a0Var.setDialogId(((w) kxVar.f691x.get(i10)).f1841c);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        a0 a0Var = new a0(this.f1813e, viewGroup.getContext());
        boolean z10 = this.d;
        a0Var.N = z10;
        if (z10) {
            a0Var.d(1.0f, 1.0f, 0.0f, false);
        }
        return new s4.d1(a0Var);
    }
}
