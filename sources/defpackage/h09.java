package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class h09 extends c49 {
    public final byte a;
    public final t09 b;

    public h09(t09 t09Var, byte b) {
        this.a = b;
        this.b = t09Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, p49 p49Var) {
        byte b = this.a;
        t09 t09Var = this.b;
        switch (b) {
            case 0:
                super.e(rect, view, recyclerView, p49Var);
                if (!t09Var.n()) {
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = gl.L(6.0f);
                    }
                    rect.right = gl.L(4.0f);
                    if (R == t09Var.b0.b() - 1) {
                        if ((!t09Var.V.isEmpty() && !na7.q1(t09Var.K).F3()) || t09Var.n()) {
                            rect.right = gl.L(2.0f);
                            return;
                        } else {
                            rect.right = gl.L(6.0f);
                            return;
                        }
                    }
                    return;
                }
                rect.left = 0;
                rect.right = 0;
                return;
            default:
                int R2 = RecyclerView.R(view);
                if (R2 == 0) {
                    rect.left = gl.L(8.0f);
                }
                if (R2 == t09Var.b0.b() - 1) {
                    rect.right = gl.L(8.0f);
                    return;
                }
                return;
        }
    }
}
