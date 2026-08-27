package cg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class x2 extends f2.w0 {

    public final y2 f2858a;

    public x2(y2 y2Var) {
        this.f2858a = y2Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.l1 l1Var) {
        super.a(rect, view, recyclerView, l1Var);
        recyclerView.getClass();
        int iR = RecyclerView.R(view);
        y2 y2Var = this.f2858a;
        if (iR == y2Var.f2870c0.size()) {
            rect.bottom = y2Var.m0;
        }
    }
}
