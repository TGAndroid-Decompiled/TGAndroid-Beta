package defpackage;
public final class xb0 implements ee, an2 {
    public final byte a;
    public final mc0 b;

    public xb0(mc0 mc0Var, byte b) {
        this.a = b;
        this.b = mc0Var;
    }

    @Override
    public final void c(int i, int i2, boolean z) {
        mc0 mc0Var = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        hc0 hc0Var = mc0Var.Z;
                        int i3 = hc0Var.f;
                        if (i3 != i && (i3 == 0 || i == 0)) {
                            hc0 a = hc0Var.a();
                            mc0Var.Z = a;
                            mc0Var.a.b(a, true);
                            mc0Var.s0();
                        }
                        mc0Var.Z.f = i;
                    }
                } else {
                    hc0 hc0Var2 = mc0Var.Z;
                    int i4 = hc0Var2.e;
                    if (i4 != i && (i4 == 0 || i == 0)) {
                        hc0 a2 = hc0Var2.a();
                        mc0Var.Z = a2;
                        mc0Var.a.b(a2, true);
                        mc0Var.s0();
                    }
                    mc0Var.Z.e = i;
                }
            } else {
                hc0 hc0Var3 = mc0Var.Z;
                int i5 = hc0Var3.d;
                if (i5 != i && (i5 == 0 || i == 0)) {
                    hc0 a3 = hc0Var3.a();
                    mc0Var.Z = a3;
                    mc0Var.a.b(a3, true);
                    mc0Var.s0();
                }
                mc0Var.Z.d = i;
            }
        } else {
            hc0 hc0Var4 = mc0Var.Z;
            int i6 = hc0Var4.c;
            if (i6 != i && (i6 == 0 || i == 0)) {
                hc0 a4 = hc0Var4.a();
                mc0Var.Z = a4;
                mc0Var.a.b(a4, true);
                mc0Var.s0();
            }
            mc0Var.Z.c = i;
        }
        nm7.e().k(nm7.v4, new Object[0]);
        mc0Var.a.invalidate();
    }

    @Override
    public final int d(int i) {
        return 0;
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        mc0 mc0Var = this.b;
        switch (b) {
            case 0:
                mc0Var.finishFragment();
                return;
            default:
                mc0Var.finishFragment();
                return;
        }
    }

    @Override
    public final void a(boolean z) {
    }

    @Override
    public final void b() {
    }
}
