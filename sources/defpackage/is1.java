package defpackage;

import org.telegram.tgnet.TLRPC;
public final class is1 extends i98 {
    public final k27 a;
    public final jm6 b;
    public final mu1 c;

    public is1(mu1 mu1Var, k27 k27Var, jm6 jm6Var) {
        this.c = mu1Var;
        this.a = k27Var;
        this.b = jm6Var;
    }

    @Override
    public final void L(int i, oac oacVar, boolean z, int i2, int i3, boolean z2) {
        mu1 mu1Var = this.c;
        if (mu1Var.H5 != this.a) {
            return;
        }
        jm6 jm6Var = this.b;
        if (!jm6Var.w && !jm6Var.v && !jm6Var.u && oacVar == null) {
            mu1Var.a0.t0();
        } else {
            mu1Var.G(jm6Var, oacVar, z, i2, z2, 0L);
        }
    }

    @Override
    public final p98 M(k27 k27Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        return this.c.T6(this.a, null, i, z, true);
    }

    @Override
    public final boolean P() {
        mu1 mu1Var = this.c;
        if (mu1Var.a0 != null && mu1Var.O7()) {
            mu1Var.a0.S();
            return true;
        }
        return false;
    }

    @Override
    public final k27 V() {
        k27 k27Var = this.c.H5;
        k27 k27Var2 = this.a;
        if (k27Var == k27Var2) {
            return k27Var2;
        }
        return null;
    }

    @Override
    public final void f(CharSequence charSequence) {
        this.c.a0.G1(charSequence, false);
    }

    @Override
    public final boolean h() {
        return false;
    }
}
