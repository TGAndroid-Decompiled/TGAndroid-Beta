package j9;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;
public final class g0 extends s implements RunnableFuture {
    public volatile f0 f14337n;

    public g0(Callable callable) {
        this.f14337n = new f0(this, callable);
    }

    @Override
    public final void d() {
        f0 f0Var;
        Object obj = this.f14346a;
        if ((obj instanceof a) && ((a) obj).f14317a && (f0Var = this.f14337n) != null) {
            androidx.emoji2.text.n nVar = f0.d;
            androidx.emoji2.text.n nVar2 = f0.f14334c;
            Runnable runnable = (Runnable) f0Var.get();
            if (runnable instanceof Thread) {
                x xVar = new x(f0Var);
                x.a(xVar, Thread.currentThread());
                if (f0Var.compareAndSet(runnable, xVar)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) f0Var.getAndSet(nVar2)) == nVar) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.f14337n = null;
    }

    @Override
    public final String k() {
        f0 f0Var = this.f14337n;
        if (f0Var != null) {
            return "task=[" + f0Var + "]";
        }
        return super.k();
    }

    @Override
    public final void run() {
        f0 f0Var = this.f14337n;
        if (f0Var != null) {
            f0Var.run();
        }
        this.f14337n = null;
    }
}
