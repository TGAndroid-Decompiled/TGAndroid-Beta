package i9;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;
public final class e0 extends o implements RunnableFuture, g {
    public volatile d0 f11932n;

    public e0(Callable callable) {
        this.f11932n = new d0(this, callable);
    }

    @Override
    public final void e() {
        d0 d0Var;
        Object obj = this.f11943a;
        if ((obj instanceof a) && ((a) obj).f11914a && (d0Var = this.f11932n) != null) {
            androidx.emoji2.text.n nVar = d0.d;
            androidx.emoji2.text.n nVar2 = d0.f11927c;
            Runnable runnable = (Runnable) d0Var.get();
            if (runnable instanceof Thread) {
                v vVar = new v(d0Var);
                v.a(vVar, Thread.currentThread());
                if (d0Var.compareAndSet(runnable, vVar)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) d0Var.getAndSet(nVar2)) == nVar) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.f11932n = null;
    }

    @Override
    public final boolean isCancelled() {
        return this.f11943a instanceof a;
    }

    @Override
    public final String k() {
        d0 d0Var = this.f11932n;
        if (d0Var != null) {
            return "task=[" + d0Var + "]";
        }
        return super.k();
    }

    @Override
    public final void run() {
        d0 d0Var = this.f11932n;
        if (d0Var != null) {
            d0Var.run();
        }
        this.f11932n = null;
    }
}
