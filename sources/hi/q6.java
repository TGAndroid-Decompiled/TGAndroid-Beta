package hi;

import android.os.Build;
import c8.dd;
public final class q6 implements ri.n, ri.m {
    public final u6 f15307a;

    public q6(u6 u6Var) {
        this.f15307a = u6Var;
    }

    @Override
    public int e() {
        u6 u6Var = this.f15307a;
        u6Var.getClass();
        return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29378d6, u6Var.J0);
    }

    @Override
    public void l(int i7) {
        u6 u6Var = this.f15307a;
        dh.g gVar = u6Var.f15550h2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (dd.a(i7, 4)) {
                gVar.h(u6Var.Y0.e());
            }
            gVar.e(u6Var.f15553k2, u6Var.f30173b.getWidth(), u6Var.f30173b.getHeight());
        }
    }
}
