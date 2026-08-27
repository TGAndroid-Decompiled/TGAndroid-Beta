package f2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class p0 {

    public final RecyclerView f5811a;

    public p0(RecyclerView recyclerView) {
        this.f5811a = recyclerView;
    }

    public void a(o1 o1Var, d5.p pVar, d5.p pVar2) {
        boolean zR;
        o1 o1VarT;
        int i10;
        RecyclerView recyclerView = this.f5811a;
        recyclerView.f1835b.k(o1Var);
        recyclerView.h(o1Var);
        o1Var.q(false);
        r1 r1Var = (r1) recyclerView.V;
        r1Var.getClass();
        int i11 = pVar.f4821a;
        int i12 = pVar.f4822b;
        View view = o1Var.f5789a;
        int left = pVar2 == null ? view.getLeft() : pVar2.f4821a;
        int top = pVar2 == null ? view.getTop() : pVar2.f4822b;
        if (o1Var.j() || (i11 == left && i12 == top)) {
            int i13 = o1Var.h;
            int i14 = -1;
            if (i13 != -1) {
                for (int i15 = 0; i15 < recyclerView.getChildCount(); i15++) {
                    View childAt = recyclerView.getChildAt(i15);
                    if (childAt != null && (o1VarT = recyclerView.T(childAt)) != null && !o1VarT.j() && (i10 = o1VarT.h) >= 0 && i10 < i13 && i10 > i14) {
                        i14 = i10;
                    }
                }
            }
            o1Var.f5795i = (o1Var.h - i14) + (i14 * 1000);
            r1Var.s(o1Var, pVar);
            zR = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zR = r1Var.r(o1Var, pVar, i11, i12, left, top);
        }
        if (zR) {
            recyclerView.l0();
        }
    }

    public void b(o1 o1Var) {
        RecyclerView recyclerView = this.f5811a;
        x0 x0Var = recyclerView.f1864x;
        View view = o1Var.f5789a;
        e1 e1Var = recyclerView.f1835b;
        a5.n nVar = x0Var.f5852a;
        a9.i iVar = (a9.i) nVar.f100b;
        int iIndexOfChild = ((RecyclerView) iVar.f181b).indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (((c) nVar.f101c).K(iIndexOfChild)) {
                nVar.z(view);
            }
            iVar.P(iIndexOfChild);
        }
        e1Var.g(view);
    }
}
