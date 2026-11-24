package defpackage;

import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;
public final class hn8 extends b2 implements wf1, x2a {
    public final y11 e;

    public hn8(cy2 cy2Var, y11 y11Var) {
        super(cy2Var, true);
        this.e = y11Var;
    }

    @Override
    public final void P(Throwable th, boolean z) {
        if (!this.e.c(th, false) && !z) {
            dbe.a(this.d, th);
        }
    }

    @Override
    public final void Q(Object obj) {
        g7c g7cVar = (g7c) obj;
        this.e.c(null, false);
    }

    public final void S(z23 z23Var) {
        Unsafe unsafe;
        Unsafe unsafe2;
        y11 y11Var = this.e;
        y11Var.getClass();
        long j = y11.s;
        do {
            unsafe = fy.a;
            if (unsafe.compareAndSwapObject(y11Var, y11.s, (Object) null, z23Var)) {
                return;
            }
        } while (unsafe.getObjectVolatile(y11Var, j) == null);
        while (true) {
            Object objectVolatile = fy.a.getObjectVolatile(y11Var, j);
            du2 du2Var = a21.q;
            if (objectVolatile == du2Var) {
                du2 du2Var2 = a21.r;
                do {
                    unsafe2 = fy.a;
                    if (unsafe2.compareAndSwapObject(y11Var, y11.s, du2Var, du2Var2)) {
                        z23Var.invoke(y11Var.k());
                        return;
                    }
                } while (unsafe2.getObjectVolatile(y11Var, j) == du2Var);
            } else if (objectVolatile == a21.r) {
                dq9.m("Another handler was already registered and successfully invoked");
                return;
            } else {
                zo4.p(objectVolatile, "Another handler is already registered: ");
                return;
            }
        }
    }

    @Override
    public final Object a(px2 px2Var, Object obj) {
        return this.e.a(px2Var, obj);
    }

    @Override
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new bv5(l(), null, this);
        }
        j(cancellationException);
    }

    @Override
    public final Object d(Object obj) {
        return this.e.d(g7c.a);
    }

    @Override
    public final void j(CancellationException cancellationException) {
        CancellationException M = ov5.M(this, cancellationException);
        this.e.c(M, true);
        i(M);
    }
}
