package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class li3 implements Runnable {
    public final byte a;
    public final mk3 b;

    public li3(mk3 mk3Var, byte b) {
        this.a = b;
        this.b = mk3Var;
    }

    @Override
    public final void run() {
        boolean z;
        byte b = this.a;
        int i = 1;
        mk3 mk3Var = this.b;
        switch (b) {
            case 0:
                mk3Var.d.f();
                return;
            case 1:
                nk3 nk3Var = mk3Var.L;
                jk3 jk3Var = mk3Var.a;
                if (jk3Var != null && jk3Var.getScrollState() == 0 && mk3Var.a.getChildCount() > 0 && mk3Var.a.getLayoutManager() != null) {
                    if (mk3Var.s == 0 && nk3Var.y3() && mk3Var.w == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    float f = nk3Var.O;
                    u46 u46Var = (u46) mk3Var.a.getLayoutManager();
                    View view = null;
                    int i2 = Integer.MAX_VALUE;
                    int i3 = -1;
                    for (int i4 = 0; i4 < mk3Var.a.getChildCount(); i4++) {
                        int R = RecyclerView.R(mk3Var.a.getChildAt(i4));
                        View childAt = mk3Var.a.getChildAt(i4);
                        if (R != -1 && childAt != null && childAt.getTop() < i2) {
                            i2 = childAt.getTop();
                            i3 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - mk3Var.a.getPaddingTop();
                        if (nk3Var.L) {
                            f = 0.0f;
                        }
                        if (mk3Var.a.getScrollState() != 1) {
                            if (z && i3 == 0 && ((mk3Var.a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f < 0.0f) {
                                top = f;
                            } else {
                                i = i3;
                            }
                            u46Var.g1(i, (int) top);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                mk3Var.d.S(mk3Var.J);
                mk3Var.L.R = true;
                jk3 jk3Var2 = mk3Var.a;
                jk3Var2.k3 = true;
                mk3Var.I = false;
                jk3Var2.invalidate();
                return;
        }
    }
}
