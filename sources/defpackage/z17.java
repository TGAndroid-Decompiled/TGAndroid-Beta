package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class z17 extends p79 {
    public final a27 a;

    public z17(a27 a27Var) {
        this.a = a27Var;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, c89 c89Var) {
        int S;
        int i = 0;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        q79 layoutManager = recyclerView.getLayoutManager();
        b27 b27Var = this.a.j3;
        if (layoutManager == b27Var.d && (S = RecyclerView.S(view)) != 0 && !b27Var.f.N()) {
            if (b27Var.f.I() == null && b27Var.f.V == null) {
                rect.top = hl.L(2.0f);
            } else {
                S--;
                u17 u17Var = b27Var.d;
                u17Var.z1();
                if (S > u17Var.U) {
                    rect.top = hl.L(2.0f);
                }
            }
            if (!b27Var.d.C1(S)) {
                i = hl.L(2.0f);
            }
            rect.right = i;
        }
    }
}
