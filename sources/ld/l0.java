package ld;

import java.util.concurrent.CancellationException;
import k7.n7;
public abstract class l0 extends sd.i {
    public int f11896c;

    public l0(int i10) {
        super(0L, sd.k.f44281g);
        this.f11896c = i10;
    }

    public abstract void c(Object obj, CancellationException cancellationException);

    public abstract uc.c f();

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
        return vVar.f11930a;
    }

    public final void i(Throwable th2, Throwable th3) {
        if (th2 == null && th3 == null) {
            return;
        }
        if (th2 != null && th3 != null) {
            n7.a(th2, th3);
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
        throw new UnsupportedOperationException("Method not decompiled: ld.l0.run():void");
    }

    public Object h(Object obj) {
        return obj;
    }
}
