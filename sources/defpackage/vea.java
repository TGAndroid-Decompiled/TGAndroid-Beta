package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class vea extends e69 {
    public final pea a;

    public vea(pea peaVar) {
        this.a = peaVar;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, r69 r69Var) {
        boolean z;
        boolean z2;
        if (view instanceof sha) {
            sha shaVar = (sha) view;
            pea peaVar = this.a;
            peaVar.n.getClass();
            int R = RecyclerView.R(shaVar);
            int i = peaVar.r.J;
            boolean z3 = true;
            if (R < i) {
                z = true;
            } else {
                z = false;
            }
            shaVar.b0 = z;
            int i2 = R % i;
            if (i2 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            shaVar.W = z2;
            if (i2 != i - 1) {
                z3 = false;
            }
            shaVar.a0 = z3;
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
