package i9;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;
public final class e0 extends o implements RunnableFuture, g {
    public volatile d0 f10521n;

    public e0(Callable callable) {
        this.f10521n = new d0(this, callable);
    }

    @Override
    public final void e() {
        d0 d0Var;
        Object obj = this.f10530a;
        if ((obj instanceof a) && ((a) obj).f10504a && (d0Var = this.f10521n) != null) {
            androidx.emoji2.text.n nVar = d0.d;
            androidx.emoji2.text.n nVar2 = d0.f10516c;
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
        this.f10521n = null;
    }

    @Override
    public final boolean isCancelled() {
        return this.f10530a instanceof a;
    }

    @Override
    public final String k() {
        d0 d0Var = this.f10521n;
        if (d0Var != null) {
            return "task=[" + d0Var + "]";
        }
        return super.k();
    }

    @Override
    public final void run() {
        d0 d0Var = this.f10521n;
        if (d0Var != null) {
            d0Var.run();
        }
        this.f10521n = null;
    }
}
