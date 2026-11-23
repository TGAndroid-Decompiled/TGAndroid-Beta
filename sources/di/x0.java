package di;

import android.os.Build;
import c8.ed;
public final class x0 implements ri.m, ri.n {
    public final h1 f9983a;

    @Override
    public int e() {
        return this.f9983a.e1();
    }

    @Override
    public void l(int i7) {
        h1 h1Var = this.f9983a;
        dh.g gVar = h1Var.f8903n2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (ed.a(i7, 4)) {
                gVar.h(h1Var.Y0.e());
            }
            gVar.e(h1Var.f8908s2, h1Var.f30142b.getWidth(), h1Var.f30142b.getHeight());
        }
    }
}
