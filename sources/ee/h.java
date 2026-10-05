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
    public static final AtomicReferenceFieldUpdater f8873n = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile Object _reusableCancellableContinuation$volatile;
    public final a0 d;
    public final kd.c f8874e;
    public Object f8875f;
    public final Object h;

    public h(a0 a0Var, kd.c cVar) {
        super(-1);
        this.d = a0Var;
        this.f8874e = cVar;
        this.f8875f = a.f8863c;
        Object fold = cVar.getContext().fold(0, w.f8896c);
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
        kd.c cVar = this.f8874e;
        if (e2.u(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override
    public final id.h getContext() {
        return this.f8874e.getContext();
    }

    @Override
    public final Object j() {
        Object obj = this.f8875f;
        this.f8875f = a.f8863c;
        return obj;
    }

    @Override
    public final void resumeWith(Object obj) {
        Object vVar;
        kd.c cVar = this.f8874e;
        id.h context = cVar.getContext();
        Throwable a2 = gd.f.a(obj);
        if (a2 == null) {
            vVar = obj;
        } else {
            vVar = new zd.v(a2, false);
        }
        a0 a0Var = this.d;
        if (a0Var.e()) {
            this.f8875f = vVar;
            this.f53264c = 0;
            a0Var.c(context, this);
            return;
        }
        w0 a10 = c2.a();
        if (a10.f53310c >= 4294967296L) {
            this.f8875f = vVar;
            this.f53264c = 0;
            hd.e eVar = a10.f53311e;
            if (eVar == null) {
                eVar = new hd.e();
                a10.f53311e = eVar;
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
        return "DispatchedContinuation[" + this.d + ", " + e0.t(this.f8874e) + ']';
    }

    @Override
    public final id.c f() {
        return this;
    }
}
