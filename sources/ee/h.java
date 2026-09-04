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
    public static final AtomicReferenceFieldUpdater f9072n = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile Object _reusableCancellableContinuation$volatile;
    public final a0 d;
    public final kd.c f9073e;
    public Object f9074f;
    public final Object h;

    public h(a0 a0Var, kd.c cVar) {
        super(-1);
        this.d = a0Var;
        this.f9073e = cVar;
        this.f9074f = a.f9062c;
        Object fold = cVar.getContext().fold(0, w.f9095c);
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
        kd.c cVar = this.f9073e;
        if (e2.u(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override
    public final id.h getContext() {
        return this.f9073e.getContext();
    }

    @Override
    public final Object j() {
        Object obj = this.f9074f;
        this.f9074f = a.f9062c;
        return obj;
    }

    @Override
    public final void resumeWith(Object obj) {
        Object vVar;
        kd.c cVar = this.f9073e;
        id.h context = cVar.getContext();
        Throwable a2 = gd.f.a(obj);
        if (a2 == null) {
            vVar = obj;
        } else {
            vVar = new zd.v(a2, false);
        }
        a0 a0Var = this.d;
        if (a0Var.e()) {
            this.f9074f = vVar;
            this.f51565c = 0;
            a0Var.c(context, this);
            return;
        }
        w0 a10 = c2.a();
        if (a10.f51611c >= 4294967296L) {
            this.f9074f = vVar;
            this.f51565c = 0;
            hd.e eVar = a10.f51612e;
            if (eVar == null) {
                eVar = new hd.e();
                a10.f51612e = eVar;
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
        return "DispatchedContinuation[" + this.d + ", " + e0.t(this.f9073e) + ']';
    }

    @Override
    public final id.c f() {
        return this;
    }
}
