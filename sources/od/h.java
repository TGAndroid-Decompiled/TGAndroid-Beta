package od;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jd.a0;
import jd.c2;
import jd.e0;
import jd.l0;
import jd.w0;
public final class h extends l0 implements uc.d, sc.c {
    public static final AtomicReferenceFieldUpdater f19513n = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile Object _reusableCancellableContinuation$volatile;
    public final a0 d;
    public final uc.c f19514e;
    public Object f19515f;
    public final Object h;

    public h(a0 a0Var, uc.c cVar) {
        super(-1);
        this.d = a0Var;
        this.f19514e = cVar;
        this.f19515f = a.f19503c;
        Object fold = cVar.getContext().fold(0, x.f19539c);
        kotlin.jvm.internal.j.b(fold);
        this.h = fold;
    }

    @Override
    public final void c(Object obj, CancellationException cancellationException) {
        if (!(obj instanceof jd.w)) {
            return;
        }
        throw null;
    }

    @Override
    public final uc.d getCallerFrame() {
        uc.c cVar = this.f19514e;
        if (com.google.android.recaptcha.internal.a.u(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override
    public final sc.h getContext() {
        return this.f19514e.getContext();
    }

    @Override
    public final Object j() {
        Object obj = this.f19515f;
        this.f19515f = a.f19503c;
        return obj;
    }

    @Override
    public final void resumeWith(Object obj) {
        Object vVar;
        uc.c cVar = this.f19514e;
        sc.h context = cVar.getContext();
        Throwable a2 = qc.f.a(obj);
        if (a2 == null) {
            vVar = obj;
        } else {
            vVar = new jd.v(a2, false);
        }
        a0 a0Var = this.d;
        if (a0Var.e()) {
            this.f19515f = vVar;
            this.f11490c = 0;
            a0Var.c(context, this);
            return;
        }
        w0 a10 = c2.a();
        if (a10.f11536c >= 4294967296L) {
            this.f19515f = vVar;
            this.f11490c = 0;
            rc.e eVar = a10.f11537e;
            if (eVar == null) {
                eVar = new rc.e();
                a10.f11537e = eVar;
            }
            eVar.addLast(this);
            return;
        }
        a10.h(true);
        try {
            sc.h context2 = cVar.getContext();
            Object k9 = a.k(context2, this.h);
            cVar.resumeWith(obj);
            a.f(context2, k9);
            do {
            } while (a10.j());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + e0.t(this.f19514e) + ']';
    }

    @Override
    public final sc.c f() {
        return this;
    }
}
