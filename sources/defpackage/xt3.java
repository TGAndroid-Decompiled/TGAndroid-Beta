package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class xt3 extends fs5 {
    public boolean e;
    public final zt3 f;

    public xt3(zt3 zt3Var) {
        this.f = zt3Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s49 s49Var) {
        super.a(recyclerView, s49Var);
        s49Var.a.setPressed(false);
    }

    @Override
    public final boolean o(RecyclerView recyclerView, s49 s49Var, s49 s49Var2) {
        boolean z;
        boolean z2 = false;
        if (s49Var.f != s49Var2.f) {
            return false;
        }
        int b = s49Var.b();
        int b2 = s49Var2.b();
        zt3 zt3Var = this.f;
        wt3 wt3Var = zt3Var.a;
        zt3 zt3Var2 = wt3Var.f;
        int i = zt3Var2.n;
        ArrayList arrayList = zt3Var2.e;
        int i2 = b - i;
        int i3 = b2 - i;
        int i4 = zt3Var2.r - i;
        if (i2 >= 0 && i3 >= 0 && i2 < i4 && i3 < i4) {
            arrayList.set(i2, (Long) arrayList.get(i3));
            arrayList.set(i3, (Long) arrayList.get(i2));
            wt3Var.j(b, b2);
            za5 za5Var = (za5) s49Var.a;
            if (b2 != zt3Var.r - 1) {
                z = true;
            } else {
                z = false;
            }
            za5Var.setDrawDivider(z);
            za5 za5Var2 = (za5) s49Var2.a;
            if (b != zt3Var.r - 1) {
                z2 = true;
            }
            za5Var2.setDrawDivider(z2);
            this.e = true;
        }
        return true;
    }

    @Override
    public final void q(s49 s49Var, int i) {
        zt3 zt3Var = this.f;
        if (i != 0) {
            zt3Var.b.J0(false);
            s49Var.a.setPressed(true);
        } else if (this.e) {
            yt3 yt3Var = zt3Var.f;
            if (yt3Var != null) {
                yt3Var.a();
            }
            this.e = false;
        }
    }
}
