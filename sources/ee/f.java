package ee;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.b0;
import zd.i0;
import zd.t0;
import zd.v1;
import zd.x;
public final class f extends i0 implements kd.d, id.c {
    public static final AtomicReferenceFieldUpdater f10925n = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile Object _reusableCancellableContinuation$volatile;
    public final x d;
    public final kd.c f10926e;
    public Object f10927f;
    public final Object h;

    public f(x xVar, kd.c cVar) {
        super(-1);
        this.d = xVar;
        this.f10926e = cVar;
        this.f10927f = a.f10915b;
        this.h = a.k(cVar.getContext());
    }

    @Override
    public final kd.d getCallerFrame() {
        return this.f10926e;
    }

    @Override
    public final id.h getContext() {
        return this.f10926e.getContext();
    }

    @Override
    public final Object j() {
        Object obj = this.f10927f;
        this.f10927f = a.f10915b;
        return obj;
    }

    @Override
    public final void resumeWith(Object obj) {
        Object vVar;
        Throwable a10 = gd.g.a(obj);
        if (a10 == null) {
            vVar = obj;
        } else {
            vVar = new zd.v(a10, false);
        }
        kd.c cVar = this.f10926e;
        id.h context = cVar.getContext();
        x xVar = this.d;
        if (xVar.d(context)) {
            this.f10927f = vVar;
            this.f61854c = 0;
            xVar.c(cVar.getContext(), this);
            return;
        }
        t0 a11 = v1.a();
        if (a11.f61887c >= 4294967296L) {
            this.f10927f = vVar;
            this.f61854c = 0;
            hd.d dVar = a11.f61888e;
            if (dVar == null) {
                dVar = new hd.d();
                a11.f61888e = dVar;
            }
            dVar.addLast(this);
            return;
        }
        a11.i(true);
        try {
            id.h context2 = cVar.getContext();
            Object l10 = a.l(context2, this.h);
            cVar.resumeWith(obj);
            a.g(context2, l10);
            do {
            } while (a11.k());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + b0.v(this.f10926e) + ']';
    }

    @Override
    public final id.c c() {
        return this;
    }
}
