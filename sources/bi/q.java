package bi;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.lx;
public final class q extends pg.b {
    public final boolean d;
    public final lx f3589e;

    public q(lx lxVar, boolean z10) {
        this.f3589e = lxVar;
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
        lx lxVar = this.f3589e;
        if (z10) {
            arrayList = lxVar.f3879y;
        } else {
            arrayList = lxVar.f3877x;
        }
        return arrayList.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        u uVar = (u) c1Var.f45738a;
        uVar.f3769b = i10;
        boolean z10 = this.d;
        lx lxVar = this.f3589e;
        if (z10) {
            uVar.setDialogId(((r) lxVar.f3879y.get(i10)).f3618c);
        } else {
            uVar.setDialogId(((r) lxVar.f3877x.get(i10)).f3618c);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        u uVar = new u(this.f3589e, viewGroup.getContext());
        boolean z10 = this.d;
        uVar.N = z10;
        if (z10) {
            uVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new s4.c1(uVar);
    }
}
