package jd;

import i7.a7;
import java.util.concurrent.CancellationException;
public abstract class l0 extends qd.i {
    public int f11490c;

    public l0(int i10) {
        super(0L, qd.k.f46635g);
        this.f11490c = i10;
    }

    public abstract void c(Object obj, CancellationException cancellationException);

    public abstract sc.c f();

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
        return vVar.f11532a;
    }

    public final void i(Throwable th2, Throwable th3) {
        if (th2 == null && th3 == null) {
            return;
        }
        if (th2 != null && th3 != null) {
            a7.a(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        kotlin.jvm.internal.j.b(th2);
        e0.m(new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2), f().getContext());
    }

    public abstract Object j();

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: jd.l0.run():void");
    }

    public Object h(Object obj) {
        return obj;
    }
}
