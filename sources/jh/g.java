package jh;

import a8.va;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import e2.r0;
import org.telegram.ui.Components.pf;
import org.telegram.ui.md0;
import v4.e1;
import v4.g1;
import v4.o0;
import v4.w0;
public final class g {
    public final RecyclerView f17778a;

    public g(RecyclerView recyclerView) {
        this.f17778a = recyclerView;
    }

    public void a(e1 e1Var, r0 r0Var, r0 r0Var2) {
        int i7;
        int i10;
        boolean z10;
        e1 T;
        int i11;
        RecyclerView recyclerView = this.f17778a;
        recyclerView.f2761b.k(e1Var);
        recyclerView.h(e1Var);
        e1Var.q(false);
        g1 g1Var = (g1) recyclerView.f2765d0;
        g1Var.getClass();
        int i12 = r0Var.f10679a;
        int i13 = r0Var.f10680b;
        View view = e1Var.f59111a;
        if (r0Var2 == null) {
            i7 = view.getLeft();
        } else {
            i7 = r0Var2.f10679a;
        }
        int i14 = i7;
        if (r0Var2 == null) {
            i10 = view.getTop();
        } else {
            i10 = r0Var2.f10680b;
        }
        int i15 = i10;
        if (!e1Var.j() && (i12 != i14 || i13 != i15)) {
            view.layout(i14, i15, view.getWidth() + i14, view.getHeight() + i15);
            z10 = g1Var.r(e1Var, r0Var, i12, i13, i14, i15);
        } else {
            int i16 = e1Var.h;
            int i17 = -1;
            if (i16 != -1) {
                for (int i18 = 0; i18 < recyclerView.getChildCount(); i18++) {
                    View childAt = recyclerView.getChildAt(i18);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i11 = T.h) >= 0 && i11 < i16 && i11 > i17) {
                        i17 = i11;
                    }
                }
            }
            e1Var.f59117i = (e1Var.h - i17) + (i17 * 1000);
            g1Var.s(e1Var, r0Var);
            z10 = true;
        }
        if (z10) {
            recyclerView.m0();
        }
    }

    public void b(e1 e1Var) {
        RecyclerView recyclerView = this.f17778a;
        o0 o0Var = recyclerView.f2792y;
        View view = e1Var.f59111a;
        w0 w0Var = recyclerView.f2761b;
        md0 md0Var = o0Var.f59196a;
        pf pfVar = (pf) md0Var.f49830b;
        int indexOfChild = ((RecyclerView) pfVar.f38544b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((va) md0Var.f49831c).I(indexOfChild)) {
                md0Var.K(view);
            }
            pfVar.x0(indexOfChild);
        }
        w0Var.g(view);
    }
}
