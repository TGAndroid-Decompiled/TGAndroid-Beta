package be;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.b0;
import zd.b1;
import zd.n1;
public final class r extends zd.a implements s, g {
    public final c d;

    public r(id.h hVar, c cVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override
    public final void Q(Throwable th2, boolean z10) {
        if (!this.d.g(th2, false) && !z10) {
            b0.m(this.f61246c, th2);
        }
    }

    @Override
    public final void R(Object obj) {
        gd.k kVar = (gd.k) obj;
        this.d.g(null, false);
    }

    public final void T(q qVar) {
        c cVar = this.d;
        cVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f3152s;
        while (!atomicReferenceFieldUpdater.compareAndSet(cVar, null, qVar)) {
            if (atomicReferenceFieldUpdater.get(cVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(cVar);
                    aa.b0 b0Var = e.f3169q;
                    if (obj == b0Var) {
                        aa.b0 b0Var2 = e.f3170r;
                        while (!atomicReferenceFieldUpdater.compareAndSet(cVar, b0Var, b0Var2)) {
                            if (atomicReferenceFieldUpdater.get(cVar) != b0Var) {
                                break;
                            }
                        }
                        qVar.invoke(cVar.m());
                        return;
                    } else if (obj == e.f3170r) {
                        throw new IllegalStateException("Another handler was already registered and successfully invoked");
                    } else {
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                }
            }
        }
    }

    @Override
    public final Object a(id.c cVar, Object obj) {
        return this.d.a(cVar, obj);
    }

    @Override
    public final Object b(Object obj) {
        return this.d.b(gd.k.f13173a);
    }

    @Override
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new b1(m(), null, this);
        }
        k(cancellationException);
    }

    @Override
    public final void k(CancellationException cancellationException) {
        CancellationException N = n1.N(this, cancellationException);
        this.d.g(N, true);
        j(N);
    }
}
