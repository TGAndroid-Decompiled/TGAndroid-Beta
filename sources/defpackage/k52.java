package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.a;
public final class k52 extends k69 {
    public final byte a;
    public final n52 b;

    public k52(n52 n52Var, byte b) {
        this.a = b;
        this.b = n52Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        b59 b59Var;
        byte b = this.a;
        n52 n52Var = this.b;
        boolean z = true;
        switch (b) {
            case 0:
                fv fvVar = n52Var.M;
                if (i == 0) {
                    z = false;
                }
                n52Var.I = z;
                if (!z && n52Var.G != null) {
                    n52Var.G = null;
                }
                if (i == 0) {
                    int L = gm.L(13.0f);
                    i22 i22Var = n52Var.b;
                    int i2 = i22Var.t0;
                    if (((i22Var.Y3[0] - i2) - L) + i2 < a.getCurrentActionBarHeight() && (b59Var = (b59) fvVar.K(0)) != null) {
                        View view = b59Var.a;
                        if (view.getTop() > 0) {
                            fvVar.x0(0, view.getTop(), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i == 1 && n52Var.d0 && n52Var.e0) {
                    gm.t1(n52Var.b.getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        switch (this.a) {
            case 0:
                n52 n52Var = this.b;
                n52Var.h0();
                if (n52Var.G != null) {
                    n52Var.H += i2;
                }
                n52Var.b.H1(n52Var, i2);
                return;
            default:
                return;
        }
    }
}
