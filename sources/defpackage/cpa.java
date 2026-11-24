package defpackage;

import android.os.Build;
public final class cpa implements oy4, py4 {
    public final kpa a;

    @Override
    public final int i() {
        return this.a.Y0();
    }

    @Override
    public final void s(int i) {
        kpa kpaVar = this.a;
        mr3 mr3Var = kpaVar.m2;
        if (Build.VERSION.SDK_INT >= 31 && mr3Var != null) {
            if (iqd.a(i, 4)) {
                mr3Var.h(kpaVar.X0.e());
            }
            mr3Var.e(kpaVar.r2, kpaVar.b.getWidth(), kpaVar.b.getHeight());
        }
    }
}
