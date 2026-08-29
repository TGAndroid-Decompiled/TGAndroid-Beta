package f2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class o0 {
    public final RecyclerView f6453a;

    public o0(RecyclerView recyclerView) {
        this.f6453a = recyclerView;
    }

    public void a(n1 n1Var, a5.e eVar, a5.e eVar2) {
        int i10;
        int i11;
        boolean z10;
        n1 T;
        int i12;
        RecyclerView recyclerView = this.f6453a;
        recyclerView.f1829b.k(n1Var);
        recyclerView.h(n1Var);
        n1Var.q(false);
        q1 q1Var = (q1) recyclerView.V;
        q1Var.getClass();
        int i13 = eVar.f165a;
        int i14 = eVar.f166b;
        View view = n1Var.f6432a;
        if (eVar2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = eVar2.f165a;
        }
        int i15 = i10;
        if (eVar2 == null) {
            i11 = view.getTop();
        } else {
            i11 = eVar2.f166b;
        }
        int i16 = i11;
        if (!n1Var.j() && (i13 != i15 || i14 != i16)) {
            view.layout(i15, i16, view.getWidth() + i15, view.getHeight() + i16);
            z10 = q1Var.r(n1Var, eVar, i13, i14, i15, i16);
        } else {
            int i17 = n1Var.h;
            int i18 = -1;
            if (i17 != -1) {
                for (int i19 = 0; i19 < recyclerView.getChildCount(); i19++) {
                    View childAt = recyclerView.getChildAt(i19);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i12 = T.h) >= 0 && i12 < i17 && i12 > i18) {
                        i18 = i12;
                    }
                }
            }
            n1Var.f6438i = (n1Var.h - i18) + (i18 * 1000);
            q1Var.s(n1Var, eVar);
            z10 = true;
        }
        if (z10) {
            recyclerView.l0();
        }
    }

    public void b(n1 n1Var) {
        RecyclerView recyclerView = this.f6453a;
        w0 w0Var = recyclerView.f1858x;
        View view = n1Var.f6432a;
        d1 d1Var = recyclerView.f1829b;
        androidx.biometric.e eVar = w0Var.f6496a;
        ag.o1 o1Var = (ag.o1) eVar.f1030b;
        int indexOfChild = ((RecyclerView) o1Var.f624b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((c) eVar.f1031c).G(indexOfChild)) {
                eVar.B(view);
            }
            o1Var.k(indexOfChild);
        }
        d1Var.g(view);
    }
}
