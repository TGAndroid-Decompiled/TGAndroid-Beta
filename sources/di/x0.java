package di;

import android.os.Build;
import c8.dd;
public final class x0 implements ri.m, ri.n {
    public final h1 f9985a;

    @Override
    public int e() {
        return this.f9985a.e1();
    }

    @Override
    public void l(int i7) {
        h1 h1Var = this.f9985a;
        dh.g gVar = h1Var.f8909n2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (dd.a(i7, 4)) {
                gVar.h(h1Var.Y0.e());
            }
            gVar.e(h1Var.f8914s2, h1Var.f30192b.getWidth(), h1Var.f30192b.getHeight());
        }
    }
}
