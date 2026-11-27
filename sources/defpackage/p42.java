package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.a;
public final class p42 extends v79 {
    public final byte a;
    public final s42 b;

    public p42(s42 s42Var, byte b) {
        this.a = b;
        this.b = s42Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        n69 n69Var;
        byte b = this.a;
        s42 s42Var = this.b;
        boolean z = true;
        switch (b) {
            case 0:
                gu guVar = s42Var.M;
                if (i == 0) {
                    z = false;
                }
                s42Var.I = z;
                if (!z && s42Var.G != null) {
                    s42Var.G = null;
                }
                if (i == 0) {
                    int L = hl.L(13.0f);
                    n12 n12Var = s42Var.b;
                    int i2 = n12Var.t0;
                    if (((n12Var.Y3[0] - i2) - L) + i2 < a.getCurrentActionBarHeight() && (n69Var = (n69) guVar.L(0)) != null) {
                        View view = n69Var.a;
                        if (view.getTop() > 0) {
                            guVar.y0(0, view.getTop(), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i == 1 && s42Var.d0 && s42Var.e0) {
                    hl.t1(s42Var.b.getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        switch (this.a) {
            case 0:
                s42 s42Var = this.b;
                s42Var.g0();
                if (s42Var.G != null) {
                    s42Var.H += i2;
                }
                s42Var.b.I1(s42Var, i2);
                return;
            default:
                return;
        }
    }
}
