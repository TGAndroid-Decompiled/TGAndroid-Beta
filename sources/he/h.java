package he;

import c3.h0;
import ce.a0;
import ce.d2;
import ce.f0;
import ce.m0;
import ce.x0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class h extends m0 implements nd.d, ld.c {
    public static final AtomicReferenceFieldUpdater f12801n = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile Object _reusableCancellableContinuation$volatile;
    public final a0 d;
    public final nd.c e;
    public Object f12802f;
    public final Object h;

    public h(a0 a0Var, nd.c cVar) {
        super(-1);
        this.d = a0Var;
        this.e = cVar;
        this.f12802f = a.f12792c;
        Object fold = cVar.getContext().fold(0, x.f12823c);
        kotlin.jvm.internal.i.b(fold);
        this.h = fold;
    }

    @Override
    public final void b(Object obj, CancellationException cancellationException) {
        if (!(obj instanceof ce.w)) {
            return;
        }
        throw null;
    }

    @Override
    public final nd.d getCallerFrame() {
        nd.c cVar = this.e;
        if (h0.t(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override
    public final ld.h getContext() {
        return this.e.getContext();
    }

    @Override
    public final Object j() {
        Object obj = this.f12802f;
        this.f12802f = a.f12792c;
        return obj;
    }

    @Override
    public final void resumeWith(Object obj) {
        Object vVar;
        nd.c cVar = this.e;
        ld.h context = cVar.getContext();
        Throwable a2 = jd.f.a(obj);
        if (a2 == null) {
            vVar = obj;
        } else {
            vVar = new ce.v(a2, false);
        }
        a0 a0Var = this.d;
        if (a0Var.d()) {
            this.f12802f = vVar;
            this.f6242c = 0;
            a0Var.c(context, this);
            return;
        }
        x0 a10 = d2.a();
        if (a10.f6280c >= 4294967296L) {
            this.f12802f = vVar;
            this.f6242c = 0;
            kd.e eVar = a10.e;
            if (eVar == null) {
                eVar = new kd.e();
                a10.e = eVar;
            }
            eVar.addLast(this);
            return;
        }
        a10.h(true);
        try {
            ld.h context2 = cVar.getContext();
            Object k10 = a.k(context2, this.h);
            cVar.resumeWith(obj);
            a.f(context2, k10);
            do {
            } while (a10.j());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + f0.t(this.e) + ']';
    }

    @Override
    public final ld.c c() {
        return this;
    }
}
