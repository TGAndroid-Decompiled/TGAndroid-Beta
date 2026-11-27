package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class th3 implements Runnable {
    public final byte a;
    public final tj3 b;

    public th3(tj3 tj3Var, byte b) {
        this.a = b;
        this.b = tj3Var;
    }

    @Override
    public final void run() {
        boolean z;
        byte b = this.a;
        int i = 1;
        tj3 tj3Var = this.b;
        switch (b) {
            case 0:
                tj3Var.d.f();
                return;
            case 1:
                uj3 uj3Var = tj3Var.L;
                qj3 qj3Var = tj3Var.a;
                if (qj3Var != null && qj3Var.getScrollState() == 0 && tj3Var.a.getChildCount() > 0 && tj3Var.a.getLayoutManager() != null) {
                    if (tj3Var.s == 0 && uj3Var.y3() && tj3Var.w == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    float f = uj3Var.O;
                    x46 x46Var = (x46) tj3Var.a.getLayoutManager();
                    View view = null;
                    int i2 = Integer.MAX_VALUE;
                    int i3 = -1;
                    for (int i4 = 0; i4 < tj3Var.a.getChildCount(); i4++) {
                        int S = RecyclerView.S(tj3Var.a.getChildAt(i4));
                        View childAt = tj3Var.a.getChildAt(i4);
                        if (S != -1 && childAt != null && childAt.getTop() < i2) {
                            i2 = childAt.getTop();
                            i3 = S;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - tj3Var.a.getPaddingTop();
                        if (uj3Var.L) {
                            f = 0.0f;
                        }
                        if (tj3Var.a.getScrollState() != 1) {
                            if (z && i3 == 0 && ((tj3Var.a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f < 0.0f) {
                                top = f;
                            } else {
                                i = i3;
                            }
                            x46Var.g1(i, (int) top);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                tj3Var.d.S(tj3Var.J);
                tj3Var.L.R = true;
                qj3 qj3Var2 = tj3Var.a;
                qj3Var2.k3 = true;
                tj3Var.I = false;
                qj3Var2.invalidate();
                return;
        }
    }
}
