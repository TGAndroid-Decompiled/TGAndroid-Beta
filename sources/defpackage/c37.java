package defpackage;

import android.view.View;
public final class c37 implements c39 {
    public final f37 a;

    public c37(f37 f37Var) {
        this.a = f37Var;
    }

    @Override
    public final void d(int i, View view) {
        f37 f37Var = this.a;
        if (f37Var.a == 1 && f37Var.r.f.size() > 1) {
            int e1 = ((k27) f37Var.r.f.get(i)).e1();
            boolean z = f37Var.r.g.get(e1, false);
            boolean z2 = !z;
            if (f37Var.r.g.size() != 1 || !z) {
                m27 m27Var = f37Var.r;
                if (z) {
                    m27Var.g.delete(e1);
                } else {
                    m27Var.g.put(e1, z2);
                }
                if (view instanceof gb2) {
                    ((gb2) view).o3(z2, z2, true);
                }
                f37Var.l(true);
            }
        }
    }
}
