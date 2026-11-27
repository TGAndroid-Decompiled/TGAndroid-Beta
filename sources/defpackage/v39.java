package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class v39 extends p79 {
    public final byte a;
    public final i49 b;

    public v39(i49 i49Var, byte b) {
        this.a = b;
        this.b = i49Var;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, c89 c89Var) {
        byte b = this.a;
        i49 i49Var = this.b;
        switch (b) {
            case 0:
                super.d(rect, view, recyclerView, c89Var);
                if (!i49Var.n()) {
                    int S = RecyclerView.S(view);
                    if (S == 0) {
                        rect.left = hl.L(6.0f);
                    }
                    rect.right = hl.L(4.0f);
                    if (S == i49Var.b0.b() - 1) {
                        if ((!i49Var.V.isEmpty() && !uc7.s1(i49Var.K).M3()) || i49Var.n()) {
                            rect.right = hl.L(2.0f);
                            return;
                        } else {
                            rect.right = hl.L(6.0f);
                            return;
                        }
                    }
                    return;
                }
                rect.left = 0;
                rect.right = 0;
                return;
            default:
                int S2 = RecyclerView.S(view);
                if (S2 == 0) {
                    rect.left = hl.L(8.0f);
                }
                if (S2 == i49Var.b0.b() - 1) {
                    rect.right = hl.L(8.0f);
                    return;
                }
                return;
        }
    }
}
