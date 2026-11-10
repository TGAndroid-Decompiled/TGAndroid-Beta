package bi;

import android.os.Build;
public final class m1 implements oi.m, oi.n {
    public final w1 f4305a;

    @Override
    public int h() {
        return this.f4305a.d1();
    }

    @Override
    public void l(int i7) {
        w1 w1Var = this.f4305a;
        dh.g gVar = w1Var.f4945m2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (c8.zc.a(i7, 4)) {
                gVar.h(w1Var.X0.e());
            }
            gVar.e(w1Var.f4950r2, w1Var.f28672b.getWidth(), w1Var.f28672b.getHeight());
        }
    }
}
