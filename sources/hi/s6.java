package hi;

import android.os.Build;
import c8.zc;
public final class s6 implements ri.n, ri.m {
    public final v6 f15029a;

    public s6(v6 v6Var) {
        this.f15029a = v6Var;
    }

    @Override
    public int e() {
        v6 v6Var = this.f15029a;
        v6Var.getClass();
        return org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, v6Var.J0);
    }

    @Override
    public void l(int i7) {
        v6 v6Var = this.f15029a;
        dh.g gVar = v6Var.f15226h2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (zc.a(i7, 4)) {
                gVar.h(v6Var.Y0.e());
            }
            gVar.e(v6Var.f15229k2, v6Var.f29682b.getWidth(), v6Var.f29682b.getHeight());
        }
    }
}
