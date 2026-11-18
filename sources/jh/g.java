package jh;

import a8.va;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import e2.r0;
import org.telegram.ui.Components.of;
import org.telegram.ui.md0;
import v4.f1;
import v4.h1;
import v4.p0;
import v4.x0;
public final class g {
    public final RecyclerView f17787a;

    public g(RecyclerView recyclerView) {
        this.f17787a = recyclerView;
    }

    public void a(f1 f1Var, r0 r0Var, r0 r0Var2) {
        int i7;
        int i10;
        boolean z10;
        f1 T;
        int i11;
        RecyclerView recyclerView = this.f17787a;
        recyclerView.f2790b.k(f1Var);
        recyclerView.h(f1Var);
        f1Var.q(false);
        h1 h1Var = (h1) recyclerView.f2794d0;
        h1Var.getClass();
        int i12 = r0Var.f10687a;
        int i13 = r0Var.f10688b;
        View view = f1Var.f59122a;
        if (r0Var2 == null) {
            i7 = view.getLeft();
        } else {
            i7 = r0Var2.f10687a;
        }
        int i14 = i7;
        if (r0Var2 == null) {
            i10 = view.getTop();
        } else {
            i10 = r0Var2.f10688b;
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
            f1Var.f59128i = (f1Var.h - i17) + (i17 * 1000);
            h1Var.s(f1Var, r0Var);
            z10 = true;
        }
        if (z10) {
            recyclerView.m0();
        }
    }

    public void b(f1 f1Var) {
        RecyclerView recyclerView = this.f17787a;
        p0 p0Var = recyclerView.f2821y;
        View view = f1Var.f59122a;
        x0 x0Var = recyclerView.f2790b;
        md0 md0Var = p0Var.f59206a;
        of ofVar = (of) md0Var.f49838b;
        int indexOfChild = ((RecyclerView) ofVar.f38076b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((va) md0Var.f49839c).I(indexOfChild)) {
                md0Var.K(view);
            }
            ofVar.x0(indexOfChild);
        }
        x0Var.g(view);
    }
}
