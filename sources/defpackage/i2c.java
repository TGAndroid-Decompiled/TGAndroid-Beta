package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;
public final class i2c extends bl4 implements RunnableFuture {
    public volatile h2c n;

    public i2c(Callable callable) {
        this.n = new h2c(this, callable);
    }

    @Override
    public final void d() {
        h2c h2cVar;
        Object obj = this.a;
        if ((obj instanceof h2) && ((h2) obj).a && (h2cVar = this.n) != null) {
            sv svVar = h2c.e;
            sv svVar2 = h2c.d;
            Runnable runnable = (Runnable) h2cVar.get();
            if (runnable instanceof Thread) {
                qp5 qp5Var = new qp5(h2cVar);
                qp5Var.a(Thread.currentThread());
                if (h2cVar.compareAndSet(runnable, qp5Var)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) h2cVar.getAndSet(svVar2)) == svVar) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.n = null;
    }

    @Override
    public final String j() {
        h2c h2cVar = this.n;
        if (h2cVar != null) {
            return "task=[" + h2cVar + "]";
        }
        return super.j();
    }

    @Override
    public final void run() {
        h2c h2cVar = this.n;
        if (h2cVar != null) {
            h2cVar.run();
        }
        this.n = null;
    }
}
