package defpackage;

import android.os.Build;
public final class q1a implements sy4, ry4 {
    public final r1a a;

    public q1a(r1a r1aVar) {
        this.a = r1aVar;
    }

    @Override
    public final int h() {
        return aob.v0(aob.d6, this.a.J0);
    }

    @Override
    public final void k(int i) {
        r1a r1aVar = this.a;
        tq3 tq3Var = r1aVar.g2;
        if (Build.VERSION.SDK_INT >= 31 && tq3Var != null) {
            if (vsd.a(i, 4)) {
                tq3Var.h(r1aVar.X0.e());
            }
            tq3Var.e(r1aVar.i2, r1aVar.b.getWidth(), r1aVar.b.getHeight());
        }
    }
}
