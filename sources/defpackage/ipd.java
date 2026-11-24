package defpackage;

import java.util.concurrent.locks.LockSupport;
public abstract class ipd {
    public static Object a(eq4 eq4Var) {
        long j;
        fp2 fp2Var;
        Thread currentThread = Thread.currentThread();
        vi2 vi2Var = vi2.b;
        d44 a = dnb.a();
        sw2 a2 = qzd.a(z14.a, a, true);
        xb3 xb3Var = ko3.a;
        if (a2 != xb3Var && a2.get(vi2Var) == null) {
            a2 = a2.plus(xb3Var);
        }
        ok0 ok0Var = new ok0(a2, currentThread, a);
        ok0Var.R(dx2.a, ok0Var, eq4Var);
        d44 d44Var = ok0Var.f;
        if (d44Var != null) {
            int i = d44.f;
            d44Var.g(false);
        }
        while (!Thread.interrupted()) {
            try {
                if (d44Var != null) {
                    j = d44Var.h();
                } else {
                    j = Long.MAX_VALUE;
                }
                if (ok0Var.v() instanceof en5) {
                    LockSupport.parkNanos(ok0Var, j);
                } else {
                    Object a3 = fad.a(ok0Var.v());
                    if (a3 instanceof fp2) {
                        fp2Var = (fp2) a3;
                    } else {
                        fp2Var = null;
                    }
                    if (fp2Var == null) {
                        return a3;
                    }
                    throw fp2Var.a;
                }
            } finally {
                if (d44Var != null) {
                    int i2 = d44.f;
                    d44Var.f(false);
                }
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        ok0Var.i(interruptedException);
        throw interruptedException;
    }
}
