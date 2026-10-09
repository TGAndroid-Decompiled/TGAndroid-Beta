package fe;

import ae.b0;
import ae.g0;
import ae.n0;
import ae.y0;
import com.google.android.gms.internal.vision.e2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class h extends n0 implements ld.d, jd.c {
    public static final AtomicReferenceFieldUpdater f9895n = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile Object _reusableCancellableContinuation$volatile;
    public final b0 d;
    public final ld.c f9896e;
    public Object f9897f;
    public final Object h;

    public h(b0 b0Var, ld.c cVar) {
        super(-1);
        this.d = b0Var;
        this.f9896e = cVar;
        this.f9897f = a.f9885c;
        Object fold = cVar.getContext().fold(0, w.f9918c);
        kotlin.jvm.internal.i.b(fold);
        this.h = fold;
    }

    @Override
    public final void c(Object obj, CancellationException cancellationException) {
        if (!(obj instanceof ae.w)) {
            return;
        }
        throw null;
    }

    @Override
    public final ld.d getCallerFrame() {
        ld.c cVar = this.f9896e;
        if (e2.t(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override
    public final jd.h getContext() {
        return this.f9896e.getContext();
    }

    @Override
    public final Object j() {
        Object obj = this.f9897f;
        this.f9897f = a.f9885c;
        return obj;
    }

    @Override
    public final void resumeWith(Object obj) {
        Object vVar;
        ld.c cVar = this.f9896e;
        jd.h context = cVar.getContext();
        Throwable a2 = hd.f.a(obj);
        if (a2 == null) {
            vVar = obj;
        } else {
            vVar = new ae.v(a2, false);
        }
        b0 b0Var = this.d;
        if (b0Var.e()) {
            this.f9897f = vVar;
            this.f477c = 0;
            b0Var.c(context, this);
            return;
        }
        y0 a10 = ae.e2.a();
        if (a10.f521c >= 4294967296L) {
            this.f9897f = vVar;
            this.f477c = 0;
            id.e eVar = a10.f522e;
            if (eVar == null) {
                eVar = new id.e();
                a10.f522e = eVar;
            }
            eVar.addLast(this);
            return;
        }
        a10.h(true);
        try {
            jd.h context2 = cVar.getContext();
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
        return "DispatchedContinuation[" + this.d + ", " + g0.t(this.f9896e) + ']';
    }

    @Override
    public final jd.c f() {
        return this;
    }
}
