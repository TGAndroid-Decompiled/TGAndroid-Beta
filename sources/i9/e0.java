package i9;

import ai.z9;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;
public final class e0 extends o implements RunnableFuture, g {
    public volatile d0 f11027n;

    public e0(Callable callable) {
        this.f11027n = new d0(this, callable);
    }

    @Override
    public final void e() {
        d0 d0Var;
        Object obj = this.f11036a;
        if ((obj instanceof a) && ((a) obj).f11010a && (d0Var = this.f11027n) != null) {
            z9 z9Var = d0.d;
            z9 z9Var2 = d0.f11022c;
            Runnable runnable = (Runnable) d0Var.get();
            if (runnable instanceof Thread) {
                v vVar = new v(d0Var);
                v.a(vVar, Thread.currentThread());
                if (d0Var.compareAndSet(runnable, vVar)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) d0Var.getAndSet(z9Var2)) == z9Var) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.f11027n = null;
    }

    @Override
    public final boolean isCancelled() {
        return this.f11036a instanceof a;
    }

    @Override
    public final String k() {
        d0 d0Var = this.f11027n;
        if (d0Var != null) {
            return "task=[" + d0Var + "]";
        }
        return super.k();
    }

    @Override
    public final void run() {
        d0 d0Var = this.f11027n;
        if (d0Var != null) {
            d0Var.run();
        }
        this.f11027n = null;
    }
}
