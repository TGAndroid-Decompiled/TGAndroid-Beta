package ci;

import android.os.Build;
public final class f1 implements pi.m, pi.n {
    public final p1 f5067a;

    @Override
    public int e() {
        return this.f5067a.d1();
    }

    @Override
    public void l(int i3) {
        p1 p1Var = this.f5067a;
        eh.g gVar = p1Var.f5731k2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (x7.u.a(i3, 4)) {
                gVar.h(p1Var.Y0.e());
            }
            gVar.e(p1Var.f5736p2, p1Var.f28586b.getWidth(), p1Var.f28586b.getHeight());
        }
    }
}
