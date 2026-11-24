package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class xy3 extends c49 {
    public final t14 a;

    public xy3(t14 t14Var) {
        this.a = t14Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, p49 p49Var) {
        int R = RecyclerView.R(view);
        t14 t14Var = this.a;
        w39 adapter = t14Var.i0.getAdapter();
        y04 y04Var = t14Var.o0;
        int i = 0;
        if (adapter == y04Var && R == y04Var.J) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            y04Var.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = gl.L(2.0f);
        z04 z04Var = t14Var.j0;
        y04Var.getClass();
        if (!z04Var.C1(R)) {
            i = gl.L(2.0f);
        }
        rect.right = i;
    }
}
