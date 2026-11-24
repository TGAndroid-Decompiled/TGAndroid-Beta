package defpackage;
public final class xa0 implements ed, nl2 {
    public final byte a;
    public final mb0 b;

    public xa0(mb0 mb0Var, byte b) {
        this.a = b;
        this.b = mb0Var;
    }

    @Override
    public final void c(int i, int i2, boolean z) {
        mb0 mb0Var = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        hb0 hb0Var = mb0Var.Z;
                        int i3 = hb0Var.f;
                        if (i3 != i && (i3 == 0 || i == 0)) {
                            hb0 a = hb0Var.a();
                            mb0Var.Z = a;
                            mb0Var.a.b(a, true);
                            mb0Var.r0();
                        }
                        mb0Var.Z.f = i;
                    }
                } else {
                    hb0 hb0Var2 = mb0Var.Z;
                    int i4 = hb0Var2.e;
                    if (i4 != i && (i4 == 0 || i == 0)) {
                        hb0 a2 = hb0Var2.a();
                        mb0Var.Z = a2;
                        mb0Var.a.b(a2, true);
                        mb0Var.r0();
                    }
                    mb0Var.Z.e = i;
                }
            } else {
                hb0 hb0Var3 = mb0Var.Z;
                int i5 = hb0Var3.d;
                if (i5 != i && (i5 == 0 || i == 0)) {
                    hb0 a3 = hb0Var3.a();
                    mb0Var.Z = a3;
                    mb0Var.a.b(a3, true);
                    mb0Var.r0();
                }
                mb0Var.Z.d = i;
            }
        } else {
            hb0 hb0Var4 = mb0Var.Z;
            int i6 = hb0Var4.c;
            if (i6 != i && (i6 == 0 || i == 0)) {
                hb0 a4 = hb0Var4.a();
                mb0Var.Z = a4;
                mb0Var.a.b(a4, true);
                mb0Var.r0();
            }
            mb0Var.Z.c = i;
        }
        kk7.e().k(kk7.t4, new Object[0]);
        mb0Var.a.invalidate();
    }

    @Override
    public final int d(int i) {
        return 0;
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        mb0 mb0Var = this.b;
        switch (b) {
            case 0:
                mb0Var.finishFragment();
                return;
            default:
                mb0Var.finishFragment();
                return;
        }
    }

    @Override
    public final void b() {
    }

    @Override
    public final void a(boolean z) {
    }
}
