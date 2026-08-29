package eg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class v2 extends f2.v0 {
    public final w2 f6151a;

    public v2(w2 w2Var) {
        this.f6151a = w2Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.k1 k1Var) {
        super.a(rect, view, recyclerView, k1Var);
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        w2 w2Var = this.f6151a;
        if (R == w2Var.f6164c0.size()) {
            rect.bottom = w2Var.m0;
        }
    }
}
