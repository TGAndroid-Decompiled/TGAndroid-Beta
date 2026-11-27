package defpackage;

import java.util.concurrent.locks.LockSupport;
public abstract class ytd {
    public static Object a(is4 is4Var) {
        long j;
        yp2 yp2Var;
        Thread currentThread = Thread.currentThread();
        rj2 rj2Var = rj2.b;
        z44 a = crb.a();
        mx2 a2 = g4e.a(u24.a, a, true);
        qc3 qc3Var = bp3.a;
        if (a2 != qc3Var && a2.get(rj2Var) == null) {
            a2 = a2.plus(qc3Var);
        }
        pk0 pk0Var = new pk0(a2, currentThread, a);
        pk0Var.R(xx2.a, pk0Var, is4Var);
        z44 z44Var = pk0Var.f;
        if (z44Var != null) {
            int i = z44.f;
            z44Var.g(false);
        }
        while (!Thread.interrupted()) {
            try {
                if (z44Var != null) {
                    j = z44Var.h();
                } else {
                    j = Long.MAX_VALUE;
                }
                if (pk0Var.v() instanceof hp5) {
                    LockSupport.parkNanos(pk0Var, j);
                } else {
                    Object a3 = yed.a(pk0Var.v());
                    if (a3 instanceof yp2) {
                        yp2Var = (yp2) a3;
                    } else {
                        yp2Var = null;
                    }
                    if (yp2Var == null) {
                        return a3;
                    }
                    throw yp2Var.a;
                }
            } finally {
                if (z44Var != null) {
                    int i2 = z44.f;
                    z44Var.f(false);
                }
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        pk0Var.i(interruptedException);
        throw interruptedException;
    }
}
