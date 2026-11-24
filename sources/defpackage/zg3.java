package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class zg3 implements Runnable {
    public final byte a;
    public final bj3 b;

    public zg3(bj3 bj3Var, byte b) {
        this.a = b;
        this.b = bj3Var;
    }

    @Override
    public final void run() {
        boolean z;
        byte b = this.a;
        int i = 1;
        bj3 bj3Var = this.b;
        switch (b) {
            case 0:
                bj3Var.d.f();
                return;
            case 1:
                cj3 cj3Var = bj3Var.L;
                yi3 yi3Var = bj3Var.a;
                if (yi3Var != null && yi3Var.getScrollState() == 0 && bj3Var.a.getChildCount() > 0 && bj3Var.a.getLayoutManager() != null) {
                    if (bj3Var.s == 0 && cj3Var.w3() && bj3Var.w == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    float f = cj3Var.O;
                    t26 t26Var = (t26) bj3Var.a.getLayoutManager();
                    View view = null;
                    int i2 = Integer.MAX_VALUE;
                    int i3 = -1;
                    for (int i4 = 0; i4 < bj3Var.a.getChildCount(); i4++) {
                        int R = RecyclerView.R(bj3Var.a.getChildAt(i4));
                        View childAt = bj3Var.a.getChildAt(i4);
                        if (R != -1 && childAt != null && childAt.getTop() < i2) {
                            i2 = childAt.getTop();
                            i3 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - bj3Var.a.getPaddingTop();
                        if (cj3Var.L) {
                            f = 0.0f;
                        }
                        if (bj3Var.a.getScrollState() != 1) {
                            if (z && i3 == 0 && ((bj3Var.a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f < 0.0f) {
                                top = f;
                            } else {
                                i = i3;
                            }
                            t26Var.g1(i, (int) top);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                bj3Var.d.S(bj3Var.J);
                bj3Var.L.R = true;
                yi3 yi3Var2 = bj3Var.a;
                yi3Var2.k3 = true;
                bj3Var.I = false;
                yi3Var2.invalidate();
                return;
        }
    }
}
