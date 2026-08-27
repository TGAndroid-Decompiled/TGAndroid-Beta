package nd;

import id.a0;
import id.d2;
import id.f0;
import id.m0;
import id.x0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class h extends m0 implements tc.d, rc.c {

    public static final AtomicReferenceFieldUpdater f18486n = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile Object _reusableCancellableContinuation$volatile;
    public final a0 d;

    public final tc.c f18487e;

    public Object f18488f;
    public final Object h;

    public h(a0 a0Var, tc.c cVar) {
        super(-1);
        this.d = a0Var;
        this.f18487e = cVar;
        this.f18488f = a.f18476c;
        Object objFold = cVar.getContext().fold(0, w.f18509c);
        kotlin.jvm.internal.j.b(objFold);
        this.h = objFold;
    }

    @Override
    public final void c(Object obj, CancellationException cancellationException) {
        if (obj instanceof id.w) {
            throw null;
        }
    }

    @Override
    public final tc.d getCallerFrame() {
        tc.c cVar = this.f18487e;
        if (com.google.android.recaptcha.internal.a.u(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override
    public final rc.h getContext() {
        return this.f18487e.getContext();
    }

    @Override
    public final Object j() {
        Object obj = this.f18488f;
        this.f18488f = a.f18476c;
        return obj;
    }

    @Override
    public final void resumeWith(Object obj) {
        tc.c cVar = this.f18487e;
        rc.h context = cVar.getContext();
        Throwable thA = pc.f.a(obj);
        Object vVar = thA == null ? obj : new id.v(thA, false);
        a0 a0Var = this.d;
        if (a0Var.e()) {
            this.f18488f = vVar;
            this.f11168c = 0;
            a0Var.c(context, this);
            return;
        }
        x0 x0VarA = d2.a();
        if (x0VarA.f11213c >= 4294967296L) {
            this.f18488f = vVar;
            this.f11168c = 0;
            qc.e eVar = x0VarA.f11214e;
            if (eVar == null) {
                eVar = new qc.e();
                x0VarA.f11214e = eVar;
            }
            eVar.addLast(this);
            return;
        }
        x0VarA.h(true);
        try {
            rc.h context2 = cVar.getContext();
            Object objK = a.k(context2, this.h);
            try {
                cVar.resumeWith(obj);
                a.f(context2, objK);
                while (x0VarA.j()) {
                }
            } catch (Throwable th) {
                a.f(context2, objK);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                i(th2, null);
            } finally {
                x0VarA.f(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + f0.t(this.f18487e) + ']';
    }

    @Override
    public final rc.c f() {
        return this;
    }
}
