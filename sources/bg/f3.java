package bg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class f3 extends f2.y0 {
    public final g3 f1762a;

    public f3(g3 g3Var) {
        this.f1762a = g3Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.n1 n1Var) {
        super.a(rect, view, recyclerView, n1Var);
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        g3 g3Var = this.f1762a;
        if (R == g3Var.f1775c0.size()) {
            rect.bottom = g3Var.m0;
        }
    }
}
