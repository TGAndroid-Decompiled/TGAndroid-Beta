package ce;

import a8.hd;
import java.util.concurrent.CancellationException;
public abstract class m0 extends je.i {
    public int f6242c;

    public m0(int i10) {
        super(0L, je.k.f15608g);
        this.f6242c = i10;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract ld.c c();

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
        return vVar.f6271a;
    }

    public final void i(Throwable th2, Throwable th3) {
        if (th2 == null && th3 == null) {
            return;
        }
        if (th2 != null && th3 != null) {
            hd.a(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        kotlin.jvm.internal.i.b(th2);
        f0.m(new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2), c().getContext());
    }

    public abstract Object j();

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ce.m0.run():void");
    }

    public Object h(Object obj) {
        return obj;
    }
}
