package defpackage;

import android.os.Handler;
public final class qc8 implements wxb {
    public final gp9 a;
    public final sk4 b = new sk4((byte) 1, false);
    public final nd7 c = new nd7();
    public long d = -9223372036854775807L;
    public final rc8 e;

    public qc8(rc8 rc8Var, mv6 mv6Var) {
        this.e = rc8Var;
        this.a = new gp9(mv6Var, null, null);
    }

    @Override
    public final void a(long j, int i, int i2, int i3, vxb vxbVar) {
        long j2;
        long j3;
        this.a.a(j, i, i2, i3, vxbVar);
        while (this.a.A(false)) {
            nd7 nd7Var = this.c;
            nd7Var.clear();
            if (this.a.F(this.b, nd7Var, 0, false) == -4) {
                nd7Var.d();
            } else {
                nd7Var = null;
            }
            if (nd7Var != null) {
                long j4 = nd7Var.e;
                ld7 a = this.e.c.a(nd7Var);
                if (a != null) {
                    j44 j44Var = (j44) a.a[0];
                    String str = j44Var.a;
                    String str2 = j44Var.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j3 = g8c.W(g8c.r(j44Var.e));
                        } catch (av7 unused) {
                            j3 = -9223372036854775807L;
                        }
                        if (j3 != -9223372036854775807L) {
                            pc8 pc8Var = new pc8(j4, j3);
                            Handler handler = this.e.d;
                            handler.sendMessage(handler.obtainMessage(1, pc8Var));
                        }
                    }
                }
            }
        }
        gp9 gp9Var = this.a;
        cp9 cp9Var = gp9Var.a;
        synchronized (gp9Var) {
            int i4 = gp9Var.s;
            if (i4 == 0) {
                j2 = -1;
            } else {
                j2 = gp9Var.j(i4);
            }
        }
        cp9Var.b(j2);
    }

    @Override
    public final void b(xu7 xu7Var, int i, int i2) {
        this.a.b(xu7Var, i, 0);
    }

    @Override
    public final int c(g63 g63Var, int i, boolean z) {
        return this.a.c(g63Var, i, z);
    }

    @Override
    public final void e(int i, xu7 xu7Var) {
        b(xu7Var, i, 0);
    }

    @Override
    public final int f(g63 g63Var, int i, boolean z) {
        return c(g63Var, i, z);
    }

    @Override
    public final void g(fm4 fm4Var) {
        this.a.g(fm4Var);
    }

    @Override
    public final void d(long j) {
    }
}
