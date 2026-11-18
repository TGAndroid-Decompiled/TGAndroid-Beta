package hi;

import android.os.Build;
import c8.dd;
public final class r6 implements ri.n, ri.m {
    public final v6 f15331a;

    public r6(v6 v6Var) {
        this.f15331a = v6Var;
    }

    @Override
    public int e() {
        v6 v6Var = this.f15331a;
        v6Var.getClass();
        return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29396d6, v6Var.J0);
    }

    @Override
    public void l(int i7) {
        v6 v6Var = this.f15331a;
        dh.g gVar = v6Var.f15586h2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (dd.a(i7, 4)) {
                gVar.h(v6Var.Y0.e());
            }
            gVar.e(v6Var.f15589k2, v6Var.f30192b.getWidth(), v6Var.f30192b.getHeight());
        }
    }
}
