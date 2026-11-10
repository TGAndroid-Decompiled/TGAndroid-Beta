package jh;

import a8.ua;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import e2.r0;
import org.telegram.ui.Components.uy;
import org.telegram.ui.ly0;
import v4.d1;
import v4.f1;
import v4.n0;
import v4.v0;
public final class g {
    public final RecyclerView f17049a;

    public g(RecyclerView recyclerView) {
        this.f17049a = recyclerView;
    }

    public void a(d1 d1Var, r0 r0Var, r0 r0Var2) {
        int i7;
        int i10;
        boolean z9;
        d1 T;
        int i11;
        RecyclerView recyclerView = this.f17049a;
        recyclerView.f2842b.k(d1Var);
        recyclerView.h(d1Var);
        d1Var.q(false);
        f1 f1Var = (f1) recyclerView.f2845c0;
        f1Var.getClass();
        int i12 = r0Var.f10538a;
        int i13 = r0Var.f10539b;
        View view = d1Var.f57052a;
        if (r0Var2 == null) {
            i7 = view.getLeft();
        } else {
            i7 = r0Var2.f10538a;
        }
        int i14 = i7;
        if (r0Var2 == null) {
            i10 = view.getTop();
        } else {
            i10 = r0Var2.f10539b;
        }
        int i15 = i10;
        if (!d1Var.j() && (i12 != i14 || i13 != i15)) {
            view.layout(i14, i15, view.getWidth() + i14, view.getHeight() + i15);
            z9 = f1Var.r(d1Var, r0Var, i12, i13, i14, i15);
        } else {
            int i16 = d1Var.h;
            int i17 = -1;
            if (i16 != -1) {
                for (int i18 = 0; i18 < recyclerView.getChildCount(); i18++) {
                    View childAt = recyclerView.getChildAt(i18);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i11 = T.h) >= 0 && i11 < i16 && i11 > i17) {
                        i17 = i11;
                    }
                }
            }
            d1Var.f57058i = (d1Var.h - i17) + (i17 * 1000);
            f1Var.s(d1Var, r0Var);
            z9 = true;
        }
        if (z9) {
            recyclerView.m0();
        }
    }

    public void b(d1 d1Var) {
        RecyclerView recyclerView = this.f17049a;
        n0 n0Var = recyclerView.f2873y;
        View view = d1Var.f57052a;
        v0 v0Var = recyclerView.f2842b;
        ly0 ly0Var = n0Var.f57139a;
        uy uyVar = (uy) ly0Var.f47746b;
        int indexOfChild = ((RecyclerView) uyVar.f38776b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((ua) ly0Var.f47747c).G(indexOfChild)) {
                ly0Var.M(view);
            }
            uyVar.Q(indexOfChild);
        }
        v0Var.g(view);
    }
}
