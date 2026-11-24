package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class wea extends e69 {
    public final pea a;
    public final nha b;

    public wea(nha nhaVar, pea peaVar) {
        this.b = nhaVar;
        this.a = peaVar;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, r69 r69Var) {
        boolean z;
        boolean z2;
        pea peaVar = this.a;
        int i = 0;
        if (peaVar.h.getAdapter() == this.b.R) {
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            qea qeaVar = peaVar.x;
            qeaVar.z1();
            if (R <= qeaVar.U) {
                rect.top = 0;
            } else {
                rect.top = gm.L(2.0f);
            }
            if (!peaVar.x.C1(R)) {
                i = gm.L(2.0f);
            }
            rect.right = i;
        } else if (view instanceof sha) {
            sha shaVar = (sha) view;
            peaVar.h.getClass();
            int R2 = RecyclerView.R(shaVar);
            int i2 = peaVar.x.J;
            boolean z3 = true;
            if (R2 < i2) {
                z = true;
            } else {
                z = false;
            }
            shaVar.b0 = z;
            int i3 = R2 % i2;
            if (i3 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            shaVar.W = z2;
            if (i3 != i2 - 1) {
                z3 = false;
            }
            shaVar.a0 = z3;
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
