package di;

import android.os.Build;
import c8.dd;
public final class x0 implements ri.m, ri.n {
    public final h1 f9982a;

    @Override
    public int e() {
        return this.f9982a.e1();
    }

    @Override
    public void l(int i7) {
        h1 h1Var = this.f9982a;
        dh.g gVar = h1Var.f8906n2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (dd.a(i7, 4)) {
                gVar.h(h1Var.Y0.e());
            }
            gVar.e(h1Var.f8911s2, h1Var.f30190b.getWidth(), h1Var.f30190b.getHeight());
        }
    }
}
