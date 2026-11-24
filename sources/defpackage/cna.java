package defpackage;

import android.os.Build;
public final class cna implements mw4, nw4 {
    public final kna a;

    @Override
    public final int i() {
        return this.a.Y0();
    }

    @Override
    public final void j(int i) {
        kna knaVar = this.a;
        cq3 cq3Var = knaVar.m2;
        if (Build.VERSION.SDK_INT >= 31 && cq3Var != null) {
            if (fod.a(i, 4)) {
                cq3Var.h(knaVar.X0.e());
            }
            cq3Var.e(knaVar.r2, knaVar.b.getWidth(), knaVar.b.getHeight());
        }
    }
}
