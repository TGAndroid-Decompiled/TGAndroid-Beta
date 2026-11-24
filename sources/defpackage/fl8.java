package defpackage;

import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;
public final class fl8 extends b2 implements oe1, v0a {
    public final q01 e;

    public fl8(sw2 sw2Var, q01 q01Var) {
        super(sw2Var, true);
        this.e = q01Var;
    }

    @Override
    public final void P(Throwable th, boolean z) {
        if (!this.e.c(th, false) && !z) {
            c9e.a(this.d, th);
        }
    }

    @Override
    public final void Q(Object obj) {
        g5c g5cVar = (g5c) obj;
        this.e.c(null, false);
    }

    public final void S(n13 n13Var) {
        Unsafe unsafe;
        Unsafe unsafe2;
        q01 q01Var = this.e;
        q01Var.getClass();
        long j = q01.s;
        do {
            unsafe = ex.a;
            if (unsafe.compareAndSwapObject(q01Var, q01.s, (Object) null, n13Var)) {
                return;
            }
        } while (unsafe.getObjectVolatile(q01Var, j) == null);
        while (true) {
            Object objectVolatile = ex.a.getObjectVolatile(q01Var, j);
            lo5 lo5Var = s01.q;
            if (objectVolatile == lo5Var) {
                lo5 lo5Var2 = s01.r;
                do {
                    unsafe2 = ex.a;
                    if (unsafe2.compareAndSwapObject(q01Var, q01.s, lo5Var, lo5Var2)) {
                        n13Var.invoke(q01Var.k());
                        return;
                    }
                } while (unsafe2.getObjectVolatile(q01Var, j) == lo5Var);
            } else if (objectVolatile == s01.r) {
                sc8.j("Another handler was already registered and successfully invoked");
                return;
            } else {
                wn4.n(objectVolatile, "Another handler is already registered: ");
                return;
            }
        }
    }

    @Override
    public final Object a(fw2 fw2Var, Object obj) {
        return this.e.a(fw2Var, obj);
    }

    @Override
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new ct5(l(), null, this);
        }
        j(cancellationException);
    }

    @Override
    public final Object d(Object obj) {
        return this.e.d(g5c.a);
    }

    @Override
    public final void j(CancellationException cancellationException) {
        CancellationException M = pt5.M(this, cancellationException);
        this.e.c(M, true);
        i(M);
    }
}
