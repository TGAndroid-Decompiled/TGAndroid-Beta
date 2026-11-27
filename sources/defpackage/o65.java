package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class o65 extends p79 {
    public final j95 a;

    public o65(j95 j95Var) {
        this.a = j95Var;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, c89 c89Var) {
        int i;
        int S = RecyclerView.S(view);
        if (S >= 0) {
            rect.setEmpty();
            e95 e95Var = this.a.I1;
            int i2 = e95Var.H;
            if (S >= i2 && S < e95Var.I) {
                int i3 = S - i2;
                if (j95.u5) {
                    i = 6;
                } else {
                    i = 2;
                }
                int i4 = i3 % i;
                if (i4 == 0) {
                    rect.right = hl.L(2.0f);
                } else if (i4 == i - 1) {
                    rect.left = hl.L(2.0f);
                } else {
                    rect.left = hl.L(1.0f);
                }
            }
        }
    }
}
