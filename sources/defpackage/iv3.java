package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class iv3 extends eu5 {
    public boolean e;
    public final kv3 f;

    public iv3(kv3 kv3Var) {
        this.f = kv3Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, u69 u69Var) {
        super.a(recyclerView, u69Var);
        u69Var.a.setPressed(false);
    }

    @Override
    public final boolean o(RecyclerView recyclerView, u69 u69Var, u69 u69Var2) {
        boolean z;
        boolean z2 = false;
        if (u69Var.f != u69Var2.f) {
            return false;
        }
        int b = u69Var.b();
        int b2 = u69Var2.b();
        kv3 kv3Var = this.f;
        hv3 hv3Var = kv3Var.a;
        kv3 kv3Var2 = hv3Var.f;
        int i = kv3Var2.n;
        ArrayList arrayList = kv3Var2.e;
        int i2 = b - i;
        int i3 = b2 - i;
        int i4 = kv3Var2.r - i;
        if (i2 >= 0 && i3 >= 0 && i2 < i4 && i3 < i4) {
            arrayList.set(i2, (Long) arrayList.get(i3));
            arrayList.set(i3, (Long) arrayList.get(i2));
            hv3Var.j(b, b2);
            xc5 xc5Var = (xc5) u69Var.a;
            if (b2 != kv3Var.r - 1) {
                z = true;
            } else {
                z = false;
            }
            xc5Var.setDrawDivider(z);
            xc5 xc5Var2 = (xc5) u69Var2.a;
            if (b != kv3Var.r - 1) {
                z2 = true;
            }
            xc5Var2.setDrawDivider(z2);
            this.e = true;
        }
        return true;
    }

    @Override
    public final void q(u69 u69Var, int i) {
        kv3 kv3Var = this.f;
        if (i != 0) {
            kv3Var.b.J0(false);
            u69Var.a.setPressed(true);
        } else if (this.e) {
            jv3 jv3Var = kv3Var.f;
            if (jv3Var != null) {
                jv3Var.a();
            }
            this.e = false;
        }
    }
}
