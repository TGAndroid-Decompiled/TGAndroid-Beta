package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class s17 extends e69 {
    public final t17 a;

    public s17(t17 t17Var) {
        this.a = t17Var;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, r69 r69Var) {
        int R;
        int i = 0;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        f69 layoutManager = recyclerView.getLayoutManager();
        u17 u17Var = this.a.j3;
        if (layoutManager == u17Var.d && (R = RecyclerView.R(view)) != 0 && !u17Var.f.N()) {
            if (u17Var.f.I() == null && u17Var.f.V == null) {
                rect.top = gm.L(2.0f);
            } else {
                R--;
                n17 n17Var = u17Var.d;
                n17Var.z1();
                if (R > n17Var.U) {
                    rect.top = gm.L(2.0f);
                }
            }
            if (!u17Var.d.C1(R)) {
                i = gm.L(2.0f);
            }
            rect.right = i;
        }
    }
}
