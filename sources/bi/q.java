package bi;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.px;
public final class q extends pg.b {
    public final boolean d;
    public final px e;

    public q(px pxVar, boolean z10) {
        this.e = pxVar;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final int h() {
        ArrayList arrayList;
        boolean z10 = this.d;
        px pxVar = this.e;
        if (z10) {
            arrayList = pxVar.f3843y;
        } else {
            arrayList = pxVar.f3841x;
        }
        return arrayList.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        u uVar = (u) b1Var.f44838a;
        uVar.f3760b = i10;
        boolean z10 = this.d;
        px pxVar = this.e;
        if (z10) {
            uVar.setDialogId(((r) pxVar.f3843y.get(i10)).f3602c);
        } else {
            uVar.setDialogId(((r) pxVar.f3841x.get(i10)).f3602c);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        u uVar = new u(this.e, viewGroup.getContext());
        boolean z10 = this.d;
        uVar.N = z10;
        if (z10) {
            uVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new s4.b1(uVar);
    }
}
