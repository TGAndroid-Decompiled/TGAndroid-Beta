package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class h04 extends e69 {
    public final e34 a;

    public h04(e34 e34Var) {
        this.a = e34Var;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, r69 r69Var) {
        int R = RecyclerView.R(view);
        e34 e34Var = this.a;
        y59 adapter = e34Var.i0.getAdapter();
        j24 j24Var = e34Var.o0;
        int i = 0;
        if (adapter == j24Var && R == j24Var.J) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            j24Var.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = gm.L(2.0f);
        k24 k24Var = e34Var.j0;
        j24Var.getClass();
        if (!k24Var.C1(R)) {
            i = gm.L(2.0f);
        }
        rect.right = i;
    }
}
