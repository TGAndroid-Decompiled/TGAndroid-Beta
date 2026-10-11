package ae;

import java.util.concurrent.CancellationException;
import v7.y7;
public abstract class n0 extends he.i {
    public int f477c;

    public n0(int i10) {
        super(0L, he.k.f11123g);
        this.f477c = i10;
    }

    public abstract void c(Object obj, CancellationException cancellationException);

    public abstract jd.c f();

    public Throwable g(Object obj) {
        v vVar;
        if (obj instanceof v) {
            vVar = (v) obj;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            return null;
        }
        return vVar.f509a;
    }

    public final void i(Throwable th2, Throwable th3) {
        if (th2 == null && th3 == null) {
            return;
        }
        if (th2 != null && th3 != null) {
            y7.a(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        kotlin.jvm.internal.i.b(th2);
        g0.m(new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2), f().getContext());
    }

    public abstract Object j();

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ae.n0.run():void");
    }

    public Object h(Object obj) {
        return obj;
    }
}
