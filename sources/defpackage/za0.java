package defpackage;
public final class za0 implements fd, hm2 {
    public final byte a;
    public final ob0 b;

    public za0(ob0 ob0Var, byte b) {
        this.a = b;
        this.b = ob0Var;
    }

    @Override
    public final void c(int i, int i2, boolean z) {
        ob0 ob0Var = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        jb0 jb0Var = ob0Var.Z;
                        int i3 = jb0Var.f;
                        if (i3 != i && (i3 == 0 || i == 0)) {
                            jb0 a = jb0Var.a();
                            ob0Var.Z = a;
                            ob0Var.a.b(a, true);
                            ob0Var.r0();
                        }
                        ob0Var.Z.f = i;
                    }
                } else {
                    jb0 jb0Var2 = ob0Var.Z;
                    int i4 = jb0Var2.e;
                    if (i4 != i && (i4 == 0 || i == 0)) {
                        jb0 a2 = jb0Var2.a();
                        ob0Var.Z = a2;
                        ob0Var.a.b(a2, true);
                        ob0Var.r0();
                    }
                    ob0Var.Z.e = i;
                }
            } else {
                jb0 jb0Var3 = ob0Var.Z;
                int i5 = jb0Var3.d;
                if (i5 != i && (i5 == 0 || i == 0)) {
                    jb0 a3 = jb0Var3.a();
                    ob0Var.Z = a3;
                    ob0Var.a.b(a3, true);
                    ob0Var.r0();
                }
                ob0Var.Z.d = i;
            }
        } else {
            jb0 jb0Var4 = ob0Var.Z;
            int i6 = jb0Var4.c;
            if (i6 != i && (i6 == 0 || i == 0)) {
                jb0 a4 = jb0Var4.a();
                ob0Var.Z = a4;
                ob0Var.a.b(a4, true);
                ob0Var.r0();
            }
            ob0Var.Z.c = i;
        }
        jn7.e().k(jn7.u4, new Object[0]);
        ob0Var.a.invalidate();
    }

    @Override
    public final int d(int i) {
        return 0;
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        ob0 ob0Var = this.b;
        switch (b) {
            case 0:
                ob0Var.finishFragment();
                return;
            default:
                ob0Var.finishFragment();
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
