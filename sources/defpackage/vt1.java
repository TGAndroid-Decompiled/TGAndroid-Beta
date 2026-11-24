package defpackage;

import org.telegram.tgnet.TLRPC;
public final class vt1 extends jb8 {
    public final k47 a;
    public final jo6 b;
    public final yv1 c;

    public vt1(yv1 yv1Var, k47 k47Var, jo6 jo6Var) {
        this.c = yv1Var;
        this.a = k47Var;
        this.b = jo6Var;
    }

    @Override
    public final void M(int i, rcc rccVar, boolean z, int i2, int i3, boolean z2) {
        yv1 yv1Var = this.c;
        if (yv1Var.H5 != this.a) {
            return;
        }
        jo6 jo6Var = this.b;
        if (!jo6Var.w && !jo6Var.v && !jo6Var.u && rccVar == null) {
            yv1Var.a0.t0();
        } else {
            yv1Var.G(jo6Var, rccVar, z, i2, z2, 0L);
        }
    }

    @Override
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        return this.c.d7(this.a, null, i, z, true);
    }

    @Override
    public final boolean Q() {
        yv1 yv1Var = this.c;
        if (yv1Var.a0 != null && yv1Var.Y7()) {
            yv1Var.a0.R();
            return true;
        }
        return false;
    }

    @Override
    public final k47 W() {
        k47 k47Var = this.c.H5;
        k47 k47Var2 = this.a;
        if (k47Var == k47Var2) {
            return k47Var2;
        }
        return null;
    }

    @Override
    public final void f(CharSequence charSequence) {
        this.c.a0.J1(charSequence, false);
    }

    @Override
    public final boolean h() {
        return false;
    }
}
