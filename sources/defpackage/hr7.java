package defpackage;

import java.util.List;
public final class hr7 implements e84 {
    public g84 a;
    public ucb b;
    public boolean c;

    @Override
    public final int b(defpackage.f84 r25, defpackage.v11 r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hr7.b(f84, v11):int");
    }

    @Override
    public final boolean c(f84 f84Var) {
        try {
            return g((cb3) f84Var);
        } catch (hy7 unused) {
            return false;
        }
    }

    @Override
    public final void d(long j, long j2) {
        ucb ucbVar = this.b;
        if (ucbVar != null) {
            jr7 jr7Var = ucbVar.a;
            kr7 kr7Var = jr7Var.a;
            kr7Var.a = (short) 0;
            kr7Var.b = 0L;
            kr7Var.c = (short) 0;
            kr7Var.d = 0;
            kr7Var.e = 0;
            jr7Var.b.K(0);
            jr7Var.c = -1;
            jr7Var.e = false;
            if (j == 0) {
                ucbVar.d(!ucbVar.l);
            } else if (ucbVar.h != 0) {
                long j3 = (ucbVar.i * j2) / 1000000;
                ucbVar.e = j3;
                lr7 lr7Var = ucbVar.d;
                String str = gcc.a;
                lr7Var.p0(j3);
                ucbVar.h = (byte) 2;
            }
        }
    }

    @Override
    public final List e() {
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override
    public final void f(g84 g84Var) {
        this.a = g84Var;
    }

    public final boolean g(cb3 cb3Var) {
        boolean z;
        kr7 kr7Var = new kr7();
        if (kr7Var.a(cb3Var, true) && (kr7Var.a & 2) == 2) {
            int min = Math.min(kr7Var.e, 8);
            ey7 ey7Var = new ey7(min);
            cb3Var.d(ey7Var.a, 0, min, false);
            ey7Var.N(0);
            if (ey7Var.a() >= 5 && ey7Var.A() == 127 && ey7Var.C() == 1179402563) {
                this.b = new ucb();
                return true;
            }
            ey7Var.N(0);
            try {
                z = s2f.c(1, ey7Var, true);
            } catch (hy7 unused) {
                z = false;
            }
            if (z) {
                this.b = new ucb();
            } else {
                ey7Var.N(0);
                if (cu7.e(ey7Var, cu7.o)) {
                    this.b = new ucb();
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final e84 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
