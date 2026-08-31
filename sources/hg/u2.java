package hg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class u2 extends f2.v0 {
    public final v2 f7621a;

    public u2(v2 v2Var) {
        this.f7621a = v2Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.j1 j1Var) {
        super.a(rect, view, recyclerView, j1Var);
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        v2 v2Var = this.f7621a;
        if (R == v2Var.f7635d0.size()) {
            rect.bottom = v2Var.f7644n0;
        }
    }
}
