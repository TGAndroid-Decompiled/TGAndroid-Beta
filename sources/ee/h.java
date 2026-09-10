package ee;

import com.google.android.gms.internal.vision.e2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.a0;
import zd.c2;
import zd.e0;
import zd.l0;
import zd.w0;
public final class h extends l0 implements kd.d, id.c {
    public static final AtomicReferenceFieldUpdater f7482n = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile Object _reusableCancellableContinuation$volatile;
    public final a0 d;
    public final kd.c e;
    public Object f7483f;
    public final Object h;

    public h(a0 a0Var, kd.c cVar) {
        super(-1);
        this.d = a0Var;
        this.e = cVar;
        this.f7483f = a.f7473c;
        Object fold = cVar.getContext().fold(0, x.f7504c);
        kotlin.jvm.internal.i.b(fold);
        this.h = fold;
    }

    @Override
    public final void c(Object obj, CancellationException cancellationException) {
        if (!(obj instanceof zd.w)) {
            return;
        }
        throw null;
    }

    @Override
    public final kd.d getCallerFrame() {
        kd.c cVar = this.e;
        if (e2.u(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override
    public final id.h getContext() {
        return this.e.getContext();
    }

    @Override
    public final Object j() {
        Object obj = this.f7483f;
        this.f7483f = a.f7473c;
        return obj;
    }

    @Override
    public final void resumeWith(Object obj) {
        Object vVar;
        kd.c cVar = this.e;
        id.h context = cVar.getContext();
        Throwable a2 = gd.f.a(obj);
        if (a2 == null) {
            vVar = obj;
        } else {
            vVar = new zd.v(a2, false);
        }
        a0 a0Var = this.d;
        if (a0Var.e()) {
            this.f7483f = vVar;
            this.f48023c = 0;
            a0Var.c(context, this);
            return;
        }
        w0 a10 = c2.a();
        if (a10.f48061c >= 4294967296L) {
            this.f7483f = vVar;
            this.f48023c = 0;
            hd.e eVar = a10.e;
            if (eVar == null) {
                eVar = new hd.e();
                a10.e = eVar;
            }
            eVar.addLast(this);
            return;
        }
        a10.h(true);
        try {
            id.h context2 = cVar.getContext();
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
        return "DispatchedContinuation[" + this.d + ", " + e0.t(this.e) + ']';
    }

    @Override
    public final id.c f() {
        return this;
    }
}
