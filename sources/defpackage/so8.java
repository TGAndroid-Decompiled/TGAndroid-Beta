package defpackage;

import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;
public final class so8 extends c2 implements xe1, o4a {
    public final z01 e;

    public so8(mx2 mx2Var, z01 z01Var) {
        super(mx2Var, true);
        this.e = z01Var;
    }

    @Override
    public final void P(Throwable th, boolean z) {
        if (!this.e.c(th, false) && !z) {
            sde.a(this.d, th);
        }
    }

    @Override
    public final void Q(Object obj) {
        f9c f9cVar = (f9c) obj;
        this.e.c(null, false);
    }

    public final void S(g23 g23Var) {
        Unsafe unsafe;
        Unsafe unsafe2;
        z01 z01Var = this.e;
        z01Var.getClass();
        long j = z01.s;
        do {
            unsafe = fx.a;
            if (unsafe.compareAndSwapObject(z01Var, z01.s, (Object) null, g23Var)) {
                return;
            }
        } while (unsafe.getObjectVolatile(z01Var, j) == null);
        while (true) {
            Object objectVolatile = fx.a.getObjectVolatile(z01Var, j);
            ow5 ow5Var = b11.q;
            if (objectVolatile == ow5Var) {
                ow5 ow5Var2 = b11.r;
                do {
                    unsafe2 = fx.a;
                    if (unsafe2.compareAndSwapObject(z01Var, z01.s, ow5Var, ow5Var2)) {
                        g23Var.invoke(z01Var.k());
                        return;
                    }
                } while (unsafe2.getObjectVolatile(z01Var, j) == ow5Var);
            } else if (objectVolatile == b11.r) {
                grb.i("Another handler was already registered and successfully invoked");
                return;
            } else {
                lq5.i(objectVolatile, "Another handler is already registered: ");
                return;
            }
        }
    }

    @Override
    public final Object a(zw2 zw2Var, Object obj) {
        return this.e.a(zw2Var, obj);
    }

    @Override
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new fv5(l(), null, this);
        }
        j(cancellationException);
    }

    @Override
    public final Object d(Object obj) {
        return this.e.d(f9c.a);
    }

    @Override
    public final void j(CancellationException cancellationException) {
        CancellationException M = sv5.M(this, cancellationException);
        this.e.c(M, true);
        i(M);
    }
}
