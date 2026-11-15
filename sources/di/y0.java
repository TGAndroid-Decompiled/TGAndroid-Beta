package di;

import android.os.Build;
import c8.zc;
public final class y0 implements ri.m, ri.n {
    public final i1 f9749a;

    @Override
    public int e() {
        return this.f9749a.d1();
    }

    @Override
    public void l(int i7) {
        i1 i1Var = this.f9749a;
        dh.g gVar = i1Var.f8775n2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (zc.a(i7, 4)) {
                gVar.h(i1Var.Y0.e());
            }
            gVar.e(i1Var.f8780s2, i1Var.f29682b.getWidth(), i1Var.f29682b.getHeight());
        }
    }
}
