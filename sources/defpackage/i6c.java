package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;
public final class i6c extends gn4 implements RunnableFuture {
    public volatile h6c n;

    public i6c(Callable callable) {
        this.n = new h6c(this, callable);
    }

    @Override
    public final void d() {
        h6c h6cVar;
        Object obj = this.a;
        if ((obj instanceof i2) && ((i2) obj).a && (h6cVar = this.n) != null) {
            tv tvVar = h6c.e;
            tv tvVar2 = h6c.d;
            Runnable runnable = (Runnable) h6cVar.get();
            if (runnable instanceof Thread) {
                tr5 tr5Var = new tr5(h6cVar);
                tr5Var.a(Thread.currentThread());
                if (h6cVar.compareAndSet(runnable, tr5Var)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) h6cVar.getAndSet(tvVar2)) == tvVar) {
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
        h6c h6cVar = this.n;
        if (h6cVar != null) {
            return "task=[" + h6cVar + "]";
        }
        return super.j();
    }

    @Override
    public final void run() {
        h6c h6cVar = this.n;
        if (h6cVar != null) {
            h6cVar.run();
        }
        this.n = null;
    }
}
