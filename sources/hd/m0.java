package hd;

import g7.w5;
import java.util.concurrent.CancellationException;
public abstract class m0 extends od.i {
    public int f10459c;

    public m0(int i9) {
        super(0L, od.k.f19229g);
        this.f10459c = i9;
    }

    public abstract void c(Object obj, CancellationException cancellationException);

    public abstract qc.c f();

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
        return vVar.f10495a;
    }

    public final void i(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            w5.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.i.b(th);
        f0.m(new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), f().getContext());
    }

    public abstract Object j();

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hd.m0.run():void");
    }

    public Object h(Object obj) {
        return obj;
    }
}
