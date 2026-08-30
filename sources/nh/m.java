package nh;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.gx;
public final class m extends bg.c {
    public final boolean d;
    public final gx e;

    public m(gx gxVar, boolean z4) {
        this.e = gxVar;
        this.d = z4;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override
    public final int h() {
        ArrayList arrayList;
        boolean z4 = this.d;
        gx gxVar = this.e;
        if (z4) {
            arrayList = gxVar.f15787y;
        } else {
            arrayList = gxVar.f15785x;
        }
        return arrayList.size();
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        p pVar = (p) l1Var.f5785a;
        pVar.f15727b = i10;
        boolean z4 = this.d;
        gx gxVar = this.e;
        if (z4) {
            pVar.setDialogId(((n) gxVar.f15787y.get(i10)).f15651c);
        } else {
            pVar.setDialogId(((n) gxVar.f15785x.get(i10)).f15651c);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        p pVar = new p(this.e, viewGroup.getContext());
        boolean z4 = this.d;
        pVar.K = z4;
        if (z4) {
            pVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new f2.l1(pVar);
    }
}
