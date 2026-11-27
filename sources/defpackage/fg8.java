package defpackage;

import android.os.Handler;
public final class fg8 implements x1c {
    public final ys9 a;
    public final ym4 b = new ym4((byte) 1, false);
    public final wf7 c = new wf7();
    public long d = -9223372036854775807L;
    public final gg8 e;

    public fg8(gg8 gg8Var, rx6 rx6Var) {
        this.e = gg8Var;
        this.a = new ys9(rx6Var, null, null);
    }

    @Override
    public final void a(long j, int i, int i2, int i3, w1c w1cVar) {
        long j2;
        long j3;
        this.a.a(j, i, i2, i3, w1cVar);
        while (this.a.A(false)) {
            wf7 wf7Var = this.c;
            wf7Var.clear();
            if (this.a.F(this.b, wf7Var, 0, false) == -4) {
                wf7Var.d();
            } else {
                wf7Var = null;
            }
            if (wf7Var != null) {
                long j4 = wf7Var.e;
                uf7 a = this.e.c.a(wf7Var);
                if (a != null) {
                    f54 f54Var = (f54) a.a[0];
                    String str = f54Var.a;
                    String str2 = f54Var.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j3 = gcc.W(gcc.r(f54Var.e));
                        } catch (hy7 unused) {
                            j3 = -9223372036854775807L;
                        }
                        if (j3 != -9223372036854775807L) {
                            eg8 eg8Var = new eg8(j4, j3);
                            Handler handler = this.e.d;
                            handler.sendMessage(handler.obtainMessage(1, eg8Var));
                        }
                    }
                }
            }
        }
        ys9 ys9Var = this.a;
        us9 us9Var = ys9Var.a;
        synchronized (ys9Var) {
            int i4 = ys9Var.s;
            if (i4 == 0) {
                j2 = -1;
            } else {
                j2 = ys9Var.j(i4);
            }
        }
        us9Var.b(j2);
    }

    @Override
    public final void b(ey7 ey7Var, int i, int i2) {
        this.a.b(ey7Var, i, 0);
    }

    @Override
    public final int c(z63 z63Var, int i, boolean z) {
        return this.a.c(z63Var, i, z);
    }

    @Override
    public final void e(int i, ey7 ey7Var) {
        b(ey7Var, i, 0);
    }

    @Override
    public final int f(z63 z63Var, int i, boolean z) {
        return c(z63Var, i, z);
    }

    @Override
    public final void g(ko4 ko4Var) {
        this.a.g(ko4Var);
    }

    @Override
    public final void d(long j) {
    }
}
