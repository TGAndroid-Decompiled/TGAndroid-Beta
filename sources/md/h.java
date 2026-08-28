package md;

import hd.a0;
import hd.d2;
import hd.f0;
import hd.m0;
import hd.x0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class h extends m0 implements sc.d, qc.c {
    public static final AtomicReferenceFieldUpdater f17650n = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile Object _reusableCancellableContinuation$volatile;
    public final a0 d;
    public final sc.c f17651e;
    public Object f17652f;
    public final Object h;

    public h(a0 a0Var, sc.c cVar) {
        super(-1);
        this.d = a0Var;
        this.f17651e = cVar;
        this.f17652f = a.f17640c;
        Object fold = cVar.getContext().fold(0, w.f17673c);
        kotlin.jvm.internal.i.b(fold);
        this.h = fold;
    }

    @Override
    public final void c(Object obj, CancellationException cancellationException) {
        if (!(obj instanceof hd.w)) {
            return;
        }
        throw null;
    }

    @Override
    public final sc.d getCallerFrame() {
        sc.c cVar = this.f17651e;
        if (e2.c.v(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override
    public final qc.h getContext() {
        return this.f17651e.getContext();
    }

    @Override
    public final Object j() {
        Object obj = this.f17652f;
        this.f17652f = a.f17640c;
        return obj;
    }

    @Override
    public final void resumeWith(Object obj) {
        Object vVar;
        sc.c cVar = this.f17651e;
        qc.h context = cVar.getContext();
        Throwable a2 = oc.f.a(obj);
        if (a2 == null) {
            vVar = obj;
        } else {
            vVar = new hd.v(a2, false);
        }
        a0 a0Var = this.d;
        if (a0Var.e()) {
            this.f17652f = vVar;
            this.f10459c = 0;
            a0Var.c(context, this);
            return;
        }
        x0 a3 = d2.a();
        if (a3.f10504c >= 4294967296L) {
            this.f17652f = vVar;
            this.f10459c = 0;
            pc.e eVar = a3.f10505e;
            if (eVar == null) {
                eVar = new pc.e();
                a3.f10505e = eVar;
            }
            eVar.addLast(this);
            return;
        }
        a3.h(true);
        try {
            qc.h context2 = cVar.getContext();
            Object k10 = a.k(context2, this.h);
            cVar.resumeWith(obj);
            a.f(context2, k10);
            do {
            } while (a3.j());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + f0.t(this.f17651e) + ']';
    }

    @Override
    public final qc.c f() {
        return this;
    }
}
