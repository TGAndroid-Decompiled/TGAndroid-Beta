package jh;

import a8.va;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import e2.r0;
import org.telegram.ui.Components.qf;
import org.telegram.ui.md0;
import v4.f1;
import v4.h1;
import v4.p0;
import v4.x0;
public final class g {
    public final RecyclerView f17812a;

    public g(RecyclerView recyclerView) {
        this.f17812a = recyclerView;
    }

    public void a(f1 f1Var, r0 r0Var, r0 r0Var2) {
        int i7;
        int i10;
        boolean z10;
        f1 T;
        int i11;
        RecyclerView recyclerView = this.f17812a;
        recyclerView.f2810b.k(f1Var);
        recyclerView.h(f1Var);
        f1Var.q(false);
        h1 h1Var = (h1) recyclerView.f2814d0;
        h1Var.getClass();
        int i12 = r0Var.f10716a;
        int i13 = r0Var.f10717b;
        View view = f1Var.f59165a;
        if (r0Var2 == null) {
            i7 = view.getLeft();
        } else {
            i7 = r0Var2.f10716a;
        }
        int i14 = i7;
        if (r0Var2 == null) {
            i10 = view.getTop();
        } else {
            i10 = r0Var2.f10717b;
        }
        int i15 = i10;
        if (!f1Var.j() && (i12 != i14 || i13 != i15)) {
            view.layout(i14, i15, view.getWidth() + i14, view.getHeight() + i15);
            z10 = h1Var.r(f1Var, r0Var, i12, i13, i14, i15);
        } else {
            int i16 = f1Var.h;
            int i17 = -1;
            if (i16 != -1) {
                for (int i18 = 0; i18 < recyclerView.getChildCount(); i18++) {
                    View childAt = recyclerView.getChildAt(i18);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i11 = T.h) >= 0 && i11 < i16 && i11 > i17) {
                        i17 = i11;
                    }
                }
            }
            f1Var.f59171i = (f1Var.h - i17) + (i17 * 1000);
            h1Var.s(f1Var, r0Var);
            z10 = true;
        }
        if (z10) {
            recyclerView.m0();
        }
    }

    public void b(f1 f1Var) {
        RecyclerView recyclerView = this.f17812a;
        p0 p0Var = recyclerView.f2841y;
        View view = f1Var.f59165a;
        x0 x0Var = recyclerView.f2810b;
        md0 md0Var = p0Var.f59249a;
        qf qfVar = (qf) md0Var.f49857b;
        int indexOfChild = ((RecyclerView) qfVar.f38895b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((va) md0Var.f49858c).I(indexOfChild)) {
                md0Var.K(view);
            }
            qfVar.x0(indexOfChild);
        }
        x0Var.g(view);
    }
}
