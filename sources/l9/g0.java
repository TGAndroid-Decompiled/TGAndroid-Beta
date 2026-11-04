package l9;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;
public final class g0 extends s implements RunnableFuture {
    public volatile f0 f18146n;

    public g0(Callable callable) {
        this.f18146n = new f0(this, callable);
    }

    @Override
    public final void e() {
        f0 f0Var;
        Object obj = this.f18157a;
        if ((obj instanceof a) && ((a) obj).f18125a && (f0Var = this.f18146n) != null) {
            androidx.emoji2.text.o oVar = f0.d;
            androidx.emoji2.text.o oVar2 = f0.f18143c;
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
        this.f18146n = null;
    }

    @Override
    public final String k() {
        f0 f0Var = this.f18146n;
        if (f0Var != null) {
            return "task=[" + f0Var + "]";
        }
        return super.k();
    }

    @Override
    public final void run() {
        f0 f0Var = this.f18146n;
        if (f0Var != null) {
            f0Var.run();
        }
        this.f18146n = null;
    }
}
