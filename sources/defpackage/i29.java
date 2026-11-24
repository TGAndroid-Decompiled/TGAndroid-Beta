package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class i29 extends e69 {
    public final byte a;
    public final v29 b;

    public i29(v29 v29Var, byte b) {
        this.a = b;
        this.b = v29Var;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, r69 r69Var) {
        byte b = this.a;
        v29 v29Var = this.b;
        switch (b) {
            case 0:
                super.d(rect, view, recyclerView, r69Var);
                if (!v29Var.n()) {
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = gm.L(6.0f);
                    }
                    rect.right = gm.L(4.0f);
                    if (R == v29Var.b0.b() - 1) {
                        if ((!v29Var.V.isEmpty() && !oc7.r1(v29Var.K).H3()) || v29Var.n()) {
                            rect.right = gm.L(2.0f);
                            return;
                        } else {
                            rect.right = gm.L(6.0f);
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
                    rect.left = gm.L(8.0f);
                }
                if (R2 == v29Var.b0.b() - 1) {
                    rect.right = gm.L(8.0f);
                    return;
                }
                return;
        }
    }
}
