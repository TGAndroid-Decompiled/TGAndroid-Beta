package defpackage;

import android.view.View;
public final class c57 implements f59 {
    public final f57 a;

    public c57(f57 f57Var) {
        this.a = f57Var;
    }

    @Override
    public final void g(int i, View view) {
        f57 f57Var = this.a;
        if (f57Var.a == 1 && f57Var.r.f.size() > 1) {
            int e1 = ((k47) f57Var.r.f.get(i)).e1();
            boolean z = f57Var.r.g.get(e1, false);
            boolean z2 = !z;
            if (f57Var.r.g.size() != 1 || !z) {
                m47 m47Var = f57Var.r;
                if (z) {
                    m47Var.g.delete(e1);
                } else {
                    m47Var.g.put(e1, z2);
                }
                if (view instanceof rc2) {
                    ((rc2) view).o3(z2, z2, true);
                }
                f57Var.l(true);
            }
        }
    }
}
