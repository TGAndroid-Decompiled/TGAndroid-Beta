package be;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import wd.b0;
import wd.i0;
import wd.t0;
import wd.v1;
import wd.x;
public final class f extends i0 implements hd.d, fd.c {
    public static final AtomicReferenceFieldUpdater f3262n = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile Object _reusableCancellableContinuation$volatile;
    public final x d;
    public final hd.c f3263e;
    public Object f3264f;
    public final Object h;

    public f(x xVar, hd.c cVar) {
        super(-1);
        this.d = xVar;
        this.f3263e = cVar;
        this.f3264f = a.f3252b;
        this.h = a.k(cVar.getContext());
    }

    @Override
    public final hd.d getCallerFrame() {
        return this.f3263e;
    }

    @Override
    public final fd.h getContext() {
        return this.f3263e.getContext();
    }

    @Override
    public final Object j() {
        Object obj = this.f3264f;
        this.f3264f = a.f3252b;
        return obj;
    }

    @Override
    public final void resumeWith(Object obj) {
        Object vVar;
        Throwable a10 = dd.g.a(obj);
        if (a10 == null) {
            vVar = obj;
        } else {
            vVar = new wd.v(a10, false);
        }
        hd.c cVar = this.f3263e;
        fd.h context = cVar.getContext();
        x xVar = this.d;
        if (xVar.e(context)) {
            this.f3264f = vVar;
            this.f57500c = 0;
            xVar.c(cVar.getContext(), this);
            return;
        }
        t0 a11 = v1.a();
        if (a11.f57533c >= 4294967296L) {
            this.f3264f = vVar;
            this.f57500c = 0;
            ed.e eVar = a11.f57534e;
            if (eVar == null) {
                eVar = new ed.e();
                a11.f57534e = eVar;
            }
            eVar.addLast(this);
            return;
        }
        a11.i(true);
        try {
            fd.h context2 = cVar.getContext();
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
        return "DispatchedContinuation[" + this.d + ", " + b0.v(this.f3263e) + ']';
    }

    @Override
    public final fd.c c() {
        return this;
    }
}
