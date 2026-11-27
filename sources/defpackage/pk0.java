package defpackage;

import java.util.concurrent.locks.LockSupport;
public final class pk0 extends c2 {
    public final Thread e;
    public final z44 f;

    public pk0(mx2 mx2Var, Thread thread, z44 z44Var) {
        super(mx2Var, true);
        this.e = thread;
        this.f = z44Var;
    }

    @Override
    public final void f(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.e;
        if (!ur5.a(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
