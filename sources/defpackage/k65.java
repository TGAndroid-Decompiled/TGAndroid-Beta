package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class k65 extends e69 {
    public final g95 a;

    public k65(g95 g95Var) {
        this.a = g95Var;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, r69 r69Var) {
        int i;
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            b95 b95Var = this.a.I1;
            int i2 = b95Var.H;
            if (R >= i2 && R < b95Var.I) {
                int i3 = R - i2;
                if (g95.u5) {
                    i = 6;
                } else {
                    i = 2;
                }
                int i4 = i3 % i;
                if (i4 == 0) {
                    rect.right = gm.L(2.0f);
                } else if (i4 == i - 1) {
                    rect.left = gm.L(2.0f);
                } else {
                    rect.left = gm.L(1.0f);
                }
            }
        }
    }
}
