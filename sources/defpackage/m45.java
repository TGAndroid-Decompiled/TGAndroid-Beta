package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class m45 extends c49 {
    public final h75 a;

    public m45(h75 h75Var) {
        this.a = h75Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, p49 p49Var) {
        int i;
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            c75 c75Var = this.a.I1;
            int i2 = c75Var.H;
            if (R >= i2 && R < c75Var.I) {
                int i3 = R - i2;
                if (h75.u5) {
                    i = 6;
                } else {
                    i = 2;
                }
                int i4 = i3 % i;
                if (i4 == 0) {
                    rect.right = gl.L(2.0f);
                } else if (i4 == i - 1) {
                    rect.left = gl.L(2.0f);
                } else {
                    rect.left = gl.L(1.0f);
                }
            }
        }
    }
}
