package m9;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;
public final class g0 extends s implements RunnableFuture {
    public volatile f0 f21029n;

    public g0(Callable callable) {
        this.f21029n = new f0(this, callable);
    }

    @Override
    public final void d() {
        f0 f0Var;
        Object obj = this.f21040a;
        if ((obj instanceof a) && ((a) obj).f21008a && (f0Var = this.f21029n) != null) {
            androidx.emoji2.text.o oVar = f0.d;
            androidx.emoji2.text.o oVar2 = f0.f21026c;
            Runnable runnable = (Runnable) f0Var.get();
            if (runnable instanceof Thread) {
                x xVar = new x(f0Var);
                x.a(xVar, Thread.currentThread());
                if (f0Var.compareAndSet(runnable, xVar)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) f0Var.getAndSet(oVar2)) == oVar) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.f21029n = null;
    }

    @Override
    public final String k() {
        f0 f0Var = this.f21029n;
        if (f0Var != null) {
            return "task=[" + f0Var + "]";
        }
        return super.k();
    }

    @Override
    public final void run() {
        f0 f0Var = this.f21029n;
        if (f0Var != null) {
            f0Var.run();
        }
        this.f21029n = null;
    }
}
