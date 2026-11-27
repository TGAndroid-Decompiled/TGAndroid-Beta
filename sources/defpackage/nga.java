package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class nga extends p79 {
    public final gga a;
    public final eja b;

    public nga(eja ejaVar, gga ggaVar) {
        this.b = ejaVar;
        this.a = ggaVar;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, c89 c89Var) {
        boolean z;
        boolean z2;
        gga ggaVar = this.a;
        int i = 0;
        if (ggaVar.h.getAdapter() == this.b.R) {
            int S = RecyclerView.S(view);
            rect.left = 0;
            rect.bottom = 0;
            hga hgaVar = ggaVar.x;
            hgaVar.z1();
            if (S <= hgaVar.U) {
                rect.top = 0;
            } else {
                rect.top = hl.L(2.0f);
            }
            if (!ggaVar.x.C1(S)) {
                i = hl.L(2.0f);
            }
            rect.right = i;
        } else if (view instanceof jja) {
            jja jjaVar = (jja) view;
            ggaVar.h.getClass();
            int S2 = RecyclerView.S(jjaVar);
            int i2 = ggaVar.x.J;
            boolean z3 = true;
            if (S2 < i2) {
                z = true;
            } else {
                z = false;
            }
            jjaVar.b0 = z;
            int i3 = S2 % i2;
            if (i3 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            jjaVar.W = z2;
            if (i3 != i2 - 1) {
                z3 = false;
            }
            jjaVar.a0 = z3;
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
        } else {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
        }
    }
}
