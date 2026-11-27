package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class sz3 extends p79 {
    public final o24 a;

    public sz3(o24 o24Var) {
        this.a = o24Var;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, c89 c89Var) {
        int S = RecyclerView.S(view);
        o24 o24Var = this.a;
        j79 adapter = o24Var.i0.getAdapter();
        t14 t14Var = o24Var.o0;
        int i = 0;
        if (adapter == t14Var && S == t14Var.J) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (S == 0) {
            t14Var.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = hl.L(2.0f);
        u14 u14Var = o24Var.j0;
        t14Var.getClass();
        if (!u14Var.C1(S)) {
            i = hl.L(2.0f);
        }
        rect.right = i;
    }
}
