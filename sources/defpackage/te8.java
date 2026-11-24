package defpackage;

import android.os.Handler;
public final class te8 implements yzb {
    public final hr9 a;
    public final mj4 b = new mj4((byte) 3, false);
    public final pf7 c = new pf7();
    public long d = -9223372036854775807L;
    public final ue8 e;

    public te8(ue8 ue8Var, mx6 mx6Var) {
        this.e = ue8Var;
        this.a = new hr9(mx6Var, null, null);
    }

    @Override
    public final void a(long j, int i, int i2, int i3, xzb xzbVar) {
        long j2;
        long j3;
        this.a.a(j, i, i2, i3, xzbVar);
        while (this.a.A(false)) {
            pf7 pf7Var = this.c;
            pf7Var.clear();
            if (this.a.F(this.b, pf7Var, 0, false) == -4) {
                pf7Var.d();
            } else {
                pf7Var = null;
            }
            if (pf7Var != null) {
                long j4 = pf7Var.e;
                nf7 a = this.e.c.a(pf7Var);
                if (a != null) {
                    u54 u54Var = (u54) a.a[0];
                    String str = u54Var.a;
                    String str2 = u54Var.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j3 = hac.W(hac.r(u54Var.e));
                        } catch (bx7 unused) {
                            j3 = -9223372036854775807L;
                        }
                        if (j3 != -9223372036854775807L) {
                            se8 se8Var = new se8(j4, j3);
                            Handler handler = this.e.d;
                            handler.sendMessage(handler.obtainMessage(1, se8Var));
                        }
                    }
                }
            }
        }
        hr9 hr9Var = this.a;
        dr9 dr9Var = hr9Var.a;
        synchronized (hr9Var) {
            int i4 = hr9Var.s;
            if (i4 == 0) {
                j2 = -1;
            } else {
                j2 = hr9Var.j(i4);
            }
        }
        dr9Var.b(j2);
    }

    @Override
    public final void b(yw7 yw7Var, int i, int i2) {
        this.a.b(yw7Var, i, 0);
    }

    @Override
    public final int c(s73 s73Var, int i, boolean z) {
        return this.a.c(s73Var, i, z);
    }

    @Override
    public final void e(int i, yw7 yw7Var) {
        b(yw7Var, i, 0);
    }

    @Override
    public final int f(s73 s73Var, int i, boolean z) {
        return c(s73Var, i, z);
    }

    @Override
    public final void g(go4 go4Var) {
        this.a.g(go4Var);
    }

    @Override
    public final void d(long j) {
    }
}
