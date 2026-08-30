package gg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class u2 extends f2.u0 {
    public final v2 f6766a;

    public u2(v2 v2Var) {
        this.f6766a = v2Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.i1 i1Var) {
        super.a(rect, view, recyclerView, i1Var);
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        v2 v2Var = this.f6766a;
        if (R == v2Var.f6779d0.size()) {
            rect.bottom = v2Var.f6788n0;
        }
    }
}
