package gi;

import android.os.Build;
public final class u6 implements pi.n, pi.m {
    public final x6 f13661a;

    public u6(x6 x6Var) {
        this.f13661a = x6Var;
    }

    @Override
    public int e() {
        x6 x6Var = this.f13661a;
        x6Var.getClass();
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, x6Var.J0);
    }

    @Override
    public void l(int i3) {
        x6 x6Var = this.f13661a;
        eh.g gVar = x6Var.f13847e2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (x7.u.a(i3, 4)) {
                gVar.h(x6Var.Y0.e());
            }
            gVar.e(x6Var.f13850h2, x6Var.f28586b.getWidth(), x6Var.f28586b.getHeight());
        }
    }
}
