package fe;

import ae.b0;
import ae.g0;
import ae.n0;
import ae.y0;
import com.google.android.gms.internal.vision.e2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class h extends n0 implements ld.d, jd.c {
    public static final AtomicReferenceFieldUpdater f9893n = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile Object _reusableCancellableContinuation$volatile;
    public final b0 d;
    public final ld.c f9894e;
    public Object f9895f;
    public final Object h;

    public h(b0 b0Var, ld.c cVar) {
        super(-1);
        this.d = b0Var;
        this.f9894e = cVar;
        this.f9895f = a.f9883c;
        Object fold = cVar.getContext().fold(0, w.f9916c);
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
        ld.c cVar = this.f9894e;
        if (e2.t(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override
    public final jd.h getContext() {
        return this.f9894e.getContext();
    }

    @Override
    public final Object j() {
        Object obj = this.f9895f;
        this.f9895f = a.f9883c;
        return obj;
    }

    @Override
    public final void resumeWith(Object obj) {
        Object vVar;
        ld.c cVar = this.f9894e;
        jd.h context = cVar.getContext();
        Throwable a2 = hd.f.a(obj);
        if (a2 == null) {
            vVar = obj;
        } else {
            vVar = new ae.v(a2, false);
        }
        b0 b0Var = this.d;
        if (b0Var.e()) {
            this.f9895f = vVar;
            this.f479c = 0;
            b0Var.c(context, this);
            return;
        }
        y0 a10 = ae.e2.a();
        if (a10.f523c >= 4294967296L) {
            this.f9895f = vVar;
            this.f479c = 0;
            id.e eVar = a10.f524e;
            if (eVar == null) {
                eVar = new id.e();
                a10.f524e = eVar;
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
        return "DispatchedContinuation[" + this.d + ", " + g0.t(this.f9894e) + ']';
    }

    @Override
    public final jd.c f() {
        return this;
    }
}
