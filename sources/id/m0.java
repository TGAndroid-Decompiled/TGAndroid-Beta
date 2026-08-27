package id;

import h7.i6;
import h7.k6;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

public abstract class m0 extends pd.i {

    public int f11168c;

    public m0(int i10) {
        super(0L, pd.k.f45728g);
        this.f11168c = i10;
    }

    public abstract void c(Object obj, CancellationException cancellationException);

    public abstract rc.c f();

    public Throwable g(Object obj) {
        v vVar = obj instanceof v ? (v) obj : null;
        if (vVar != null) {
            return vVar.f11204a;
        }
        return null;
    }

    public final void i(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            i6.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.j.b(th);
        f0.m(new e0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), f().getContext());
    }

    public abstract Object j();

    @Override
    public final void run() throws IllegalAccessException, InvocationTargetException {
        g1 g1Var;
        Object objA = pc.i.f45696a;
        com.google.android.gms.internal.cast.a aVar = this.f45721b;
        try {
            rc.c cVarF = f();
            kotlin.jvm.internal.j.c(cVarF, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            nd.h hVar = (nd.h) cVarF;
            tc.c cVar = hVar.f18487e;
            Object obj = hVar.h;
            rc.h context = cVar.getContext();
            Object objK = nd.a.k(context, obj);
            h2 h2VarV = objK != nd.a.f18478f ? f0.v(cVar, context, objK) : null;
            try {
                rc.h context2 = cVar.getContext();
                Object objJ = j();
                Throwable thG = g(objJ);
                if (thG == null) {
                    int i10 = this.f11168c;
                    boolean z10 = true;
                    if (i10 != 1 && i10 != 2) {
                        z10 = false;
                    }
                    if (z10) {
                        g1Var = (g1) context2.get(b0.f11122b);
                    } else {
                        g1Var = null;
                    }
                } else {
                    g1Var = null;
                }
                if (g1Var != null && !g1Var.isActive()) {
                    CancellationException cancellationException = g1Var.getCancellationException();
                    c(objJ, cancellationException);
                    cVar.resumeWith(k6.a(cancellationException));
                } else if (thG != null) {
                    cVar.resumeWith(k6.a(thG));
                } else {
                    cVar.resumeWith(h(objJ));
                }
                if (h2VarV == null || h2VarV.M()) {
                    nd.a.f(context, objK);
                }
                try {
                    aVar.getClass();
                } catch (Throwable th) {
                    objA = k6.a(th);
                }
                i(null, pc.f.a(objA));
            } catch (Throwable th2) {
                if (h2VarV == null || h2VarV.M()) {
                    nd.a.f(context, objK);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                aVar.getClass();
            } catch (Throwable th4) {
                objA = k6.a(th4);
            }
            i(th3, pc.f.a(objA));
        }
    }

    public Object h(Object obj) {
        return obj;
    }
}
