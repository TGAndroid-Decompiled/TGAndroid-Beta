package f2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class n0 {
    public final RecyclerView f5801a;

    public n0(RecyclerView recyclerView) {
        this.f5801a = recyclerView;
    }

    public void a(l1 l1Var, c5.e eVar, c5.e eVar2) {
        int i10;
        int i11;
        boolean z4;
        l1 T;
        int i12;
        RecyclerView recyclerView = this.f5801a;
        recyclerView.f1233b.k(l1Var);
        recyclerView.h(l1Var);
        l1Var.q(false);
        o1 o1Var = (o1) recyclerView.W;
        o1Var.getClass();
        int i13 = eVar.f2108a;
        int i14 = eVar.f2109b;
        View view = l1Var.f5774a;
        if (eVar2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = eVar2.f2108a;
        }
        int i15 = i10;
        if (eVar2 == null) {
            i11 = view.getTop();
        } else {
            i11 = eVar2.f2109b;
        }
        int i16 = i11;
        if (!l1Var.j() && (i13 != i15 || i14 != i16)) {
            view.layout(i15, i16, view.getWidth() + i15, view.getHeight() + i16);
            z4 = o1Var.r(l1Var, eVar, i13, i14, i15, i16);
        } else {
            int i17 = l1Var.h;
            int i18 = -1;
            if (i17 != -1) {
                for (int i19 = 0; i19 < recyclerView.getChildCount(); i19++) {
                    View childAt = recyclerView.getChildAt(i19);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i12 = T.h) >= 0 && i12 < i17 && i12 > i18) {
                        i18 = i12;
                    }
                }
            }
            l1Var.f5779i = (l1Var.h - i18) + (i18 * 1000);
            o1Var.s(l1Var, eVar);
            z4 = true;
        }
        if (z4) {
            recyclerView.l0();
        }
    }

    public void b(l1 l1Var) {
        RecyclerView recyclerView = this.f5801a;
        v0 v0Var = recyclerView.f1261x;
        View view = l1Var.f5774a;
        af.h hVar = recyclerView.f1233b;
        af.d dVar = v0Var.f5836a;
        bb.b bVar = (bb.b) dVar.f159b;
        int indexOfChild = ((RecyclerView) bVar.f1772b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((c) dVar.f160c).z(indexOfChild)) {
                dVar.C(view);
            }
            bVar.Q(indexOfChild);
        }
        hVar.g(view);
    }
}
