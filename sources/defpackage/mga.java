package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class mga extends p79 {
    public final gga a;

    public mga(gga ggaVar) {
        this.a = ggaVar;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, c89 c89Var) {
        boolean z;
        boolean z2;
        if (view instanceof jja) {
            jja jjaVar = (jja) view;
            gga ggaVar = this.a;
            ggaVar.n.getClass();
            int S = RecyclerView.S(jjaVar);
            int i = ggaVar.r.J;
            boolean z3 = true;
            if (S < i) {
                z = true;
            } else {
                z = false;
            }
            jjaVar.b0 = z;
            int i2 = S % i;
            if (i2 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            jjaVar.W = z2;
            if (i2 != i - 1) {
                z3 = false;
            }
            jjaVar.a0 = z3;
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
