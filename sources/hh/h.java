package hh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b2.q0;
import e6.n;
import k2.b0;
import s4.c1;
import s4.f1;
import s4.o0;
public final class h {
    public final RecyclerView f10517a;

    public h(RecyclerView recyclerView) {
        this.f10517a = recyclerView;
    }

    public void a(c1 c1Var, q0 q0Var, q0 q0Var2) {
        int i10;
        int i11;
        boolean z10;
        c1 T;
        int i12;
        RecyclerView recyclerView = this.f10517a;
        recyclerView.f2832b.k(c1Var);
        recyclerView.h(c1Var);
        c1Var.q(false);
        f1 f1Var = (f1) recyclerView.f2835c0;
        f1Var.getClass();
        int i13 = q0Var.f3195a;
        int i14 = q0Var.f3196b;
        View view = c1Var.f42627a;
        if (q0Var2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = q0Var2.f3195a;
        }
        int i15 = i10;
        if (q0Var2 == null) {
            i11 = view.getTop();
        } else {
            i11 = q0Var2.f3196b;
        }
        int i16 = i11;
        if (!c1Var.j() && (i13 != i15 || i14 != i16)) {
            view.layout(i15, i16, view.getWidth() + i15, view.getHeight() + i16);
            z10 = f1Var.r(c1Var, q0Var, i13, i14, i15, i16);
        } else {
            int i17 = c1Var.h;
            int i18 = -1;
            if (i17 != -1) {
                for (int i19 = 0; i19 < recyclerView.getChildCount(); i19++) {
                    View childAt = recyclerView.getChildAt(i19);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i12 = T.h) >= 0 && i12 < i17 && i12 > i18) {
                        i18 = i12;
                    }
                }
            }
            c1Var.f42632i = (c1Var.h - i18) + (i18 * 1000);
            f1Var.s(c1Var, q0Var);
            z10 = true;
        }
        if (z10) {
            recyclerView.l0();
        }
    }

    public void b(c1 c1Var) {
        RecyclerView recyclerView = this.f10517a;
        o0 o0Var = recyclerView.f2860x;
        View view = c1Var.f42627a;
        of.e eVar = recyclerView.f2832b;
        lf.i iVar = o0Var.f42719a;
        b0 b0Var = (b0) iVar.f14011b;
        int indexOfChild = ((RecyclerView) b0Var.f13222b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((n) iVar.f14012c).B(indexOfChild)) {
                iVar.Y(view);
            }
            b0Var.r(indexOfChild);
        }
        eVar.g(view);
    }
}
