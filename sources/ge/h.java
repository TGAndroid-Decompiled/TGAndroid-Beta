package ge;

import be.a0;
import be.d2;
import be.f0;
import be.m0;
import be.x0;
import com.google.android.gms.internal.play_billing.k3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class h extends m0 implements md.d, kd.c {
    public static final AtomicReferenceFieldUpdater f11023n = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile Object _reusableCancellableContinuation$volatile;
    public final a0 d;
    public final md.c e;
    public Object f11024f;
    public final Object h;

    public h(a0 a0Var, md.c cVar) {
        super(-1);
        this.d = a0Var;
        this.e = cVar;
        this.f11024f = a.f11014c;
        Object fold = cVar.getContext().fold(0, w.f11043c);
        kotlin.jvm.internal.i.b(fold);
        this.h = fold;
    }

    @Override
    public final void b(Object obj, CancellationException cancellationException) {
        if (!(obj instanceof be.w)) {
            return;
        }
        throw null;
    }

    @Override
    public final md.d getCallerFrame() {
        md.c cVar = this.e;
        if (k3.s(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override
    public final kd.h getContext() {
        return this.e.getContext();
    }

    @Override
    public final Object j() {
        Object obj = this.f11024f;
        this.f11024f = a.f11014c;
        return obj;
    }

    @Override
    public final void resumeWith(Object obj) {
        Object vVar;
        md.c cVar = this.e;
        kd.h context = cVar.getContext();
        Throwable a2 = id.f.a(obj);
        if (a2 == null) {
            vVar = obj;
        } else {
            vVar = new be.v(a2, false);
        }
        a0 a0Var = this.d;
        if (a0Var.d()) {
            this.f11024f = vVar;
            this.f4303c = 0;
            a0Var.c(context, this);
            return;
        }
        x0 a10 = d2.a();
        if (a10.f4341c >= 4294967296L) {
            this.f11024f = vVar;
            this.f4303c = 0;
            jd.e eVar = a10.e;
            if (eVar == null) {
                eVar = new jd.e();
                a10.e = eVar;
            }
            eVar.addLast(this);
            return;
        }
        a10.h(true);
        try {
            kd.h context2 = cVar.getContext();
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
    public final kd.c c() {
        return this;
    }
}
