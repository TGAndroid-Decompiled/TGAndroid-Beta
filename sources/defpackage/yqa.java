package defpackage;

import android.os.Build;
public final class yqa implements ry4, sy4 {
    public final gra a;

    @Override
    public final int h() {
        return this.a.Z0();
    }

    @Override
    public final void k(int i) {
        gra graVar = this.a;
        tq3 tq3Var = graVar.m2;
        if (Build.VERSION.SDK_INT >= 31 && tq3Var != null) {
            if (vsd.a(i, 4)) {
                tq3Var.h(graVar.X0.e());
            }
            tq3Var.e(graVar.r2, graVar.b.getWidth(), graVar.b.getHeight());
        }
    }
}
