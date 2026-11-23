package di;

import android.os.Build;
import c8.ed;
public final class x0 implements ri.m, ri.n {
    public final h1 f9981a;

    @Override
    public int j() {
        return this.f9981a.e1();
    }

    @Override
    public void k(int i7) {
        h1 h1Var = this.f9981a;
        dh.g gVar = h1Var.f8899n2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (ed.a(i7, 4)) {
                gVar.h(h1Var.Y0.e());
            }
            gVar.e(h1Var.f8904s2, h1Var.f30226b.getWidth(), h1Var.f30226b.getHeight());
        }
    }
}
