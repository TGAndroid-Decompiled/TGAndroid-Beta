package i9;

import ai.aa;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;
public final class e0 extends o implements RunnableFuture, g {
    public volatile d0 f12060n;

    public e0(Callable callable) {
        this.f12060n = new d0(this, callable);
    }

    @Override
    public final void e() {
        d0 d0Var;
        Object obj = this.f12071a;
        if ((obj instanceof a) && ((a) obj).f12042a && (d0Var = this.f12060n) != null) {
            aa aaVar = d0.d;
            aa aaVar2 = d0.f12055c;
            Runnable runnable = (Runnable) d0Var.get();
            if (runnable instanceof Thread) {
                v vVar = new v(d0Var);
                v.a(vVar, Thread.currentThread());
                if (d0Var.compareAndSet(runnable, vVar)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) d0Var.getAndSet(aaVar2)) == aaVar) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.f12060n = null;
    }

    @Override
    public final boolean isCancelled() {
        return this.f12071a instanceof a;
    }

    @Override
    public final String k() {
        d0 d0Var = this.f12060n;
        if (d0Var != null) {
            return "task=[" + d0Var + "]";
        }
        return super.k();
    }

    @Override
    public final void run() {
        d0 d0Var = this.f12060n;
        if (d0Var != null) {
            d0Var.run();
        }
        this.f12060n = null;
    }
}
