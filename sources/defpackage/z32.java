package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.a;
public final class z32 extends i49 {
    public final byte a;
    public final c42 b;

    public z32(c42 c42Var, byte b) {
        this.a = b;
        this.b = c42Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        y29 y29Var;
        byte b = this.a;
        c42 c42Var = this.b;
        boolean z = true;
        switch (b) {
            case 0:
                fu fuVar = c42Var.M;
                if (i == 0) {
                    z = false;
                }
                c42Var.I = z;
                if (!z && c42Var.G != null) {
                    c42Var.G = null;
                }
                if (i == 0) {
                    int L = gl.L(13.0f);
                    x02 x02Var = c42Var.b;
                    int i2 = x02Var.t0;
                    if (((x02Var.Y3[0] - i2) - L) + i2 < a.getCurrentActionBarHeight() && (y29Var = (y29) fuVar.K(0)) != null) {
                        View view = y29Var.a;
                        if (view.getTop() > 0) {
                            fuVar.x0(0, view.getTop(), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i == 1 && c42Var.d0 && c42Var.e0) {
                    gl.t1(c42Var.b.getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        switch (this.a) {
            case 0:
                c42 c42Var = this.b;
                c42Var.h0();
                if (c42Var.G != null) {
                    c42Var.H += i2;
                }
                c42Var.b.H1(c42Var, i2);
                return;
            default:
                return;
        }
    }
}
