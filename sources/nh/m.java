package nh;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ix;
public final class m extends bg.c {
    public final boolean d;
    public final ix e;

    public m(ix ixVar, boolean z4) {
        this.e = ixVar;
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
        ix ixVar = this.e;
        if (z4) {
            arrayList = ixVar.f15767y;
        } else {
            arrayList = ixVar.f15765x;
        }
        return arrayList.size();
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        p pVar = (p) l1Var.f5774a;
        pVar.f15707b = i10;
        boolean z4 = this.d;
        ix ixVar = this.e;
        if (z4) {
            pVar.setDialogId(((n) ixVar.f15767y.get(i10)).f15631c);
        } else {
            pVar.setDialogId(((n) ixVar.f15765x.get(i10)).f15631c);
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
