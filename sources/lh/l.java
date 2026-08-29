package lh;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.xw;
public final class l extends zf.b {
    public final boolean d;
    public final xw f15870e;

    public l(xw xwVar, boolean z10) {
        this.f15870e = xwVar;
        this.d = z10;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override
    public final int h() {
        ArrayList arrayList;
        boolean z10 = this.d;
        xw xwVar = this.f15870e;
        if (z10) {
            arrayList = xwVar.f16075y;
        } else {
            arrayList = xwVar.f16073x;
        }
        return arrayList.size();
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        o oVar = (o) n1Var.f6432a;
        oVar.f15996b = i10;
        boolean z10 = this.d;
        xw xwVar = this.f15870e;
        if (z10) {
            oVar.setDialogId(((m) xwVar.f16075y.get(i10)).f15916c);
        } else {
            oVar.setDialogId(((m) xwVar.f16073x.get(i10)).f15916c);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        o oVar = new o(this.f15870e, viewGroup.getContext());
        boolean z10 = this.d;
        oVar.J = z10;
        if (z10) {
            oVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new f2.n1(oVar);
    }
}
