package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;
public final class uhf extends lgf implements RunnableFuture {
    public volatile h6c n;

    public uhf(Callable callable) {
        this.n = new h6c(this, callable);
    }

    @Override
    public final String a() {
        h6c h6cVar = this.n;
        if (h6cVar != null) {
            return qd4.y("task=[", h6cVar.toString(), "]");
        }
        return super.a();
    }

    @Override
    public final void d() {
        h6c h6cVar;
        Object obj = this.a;
        if ((obj instanceof dgf) && ((dgf) obj).a && (h6cVar = this.n) != null) {
            tv tvVar = h6c.h;
            tv tvVar2 = h6c.f;
            Runnable runnable = (Runnable) h6cVar.get();
            if (runnable instanceof Thread) {
                zgf zgfVar = new zgf(h6cVar);
                zgf.a(zgfVar, Thread.currentThread());
                if (h6cVar.compareAndSet(runnable, zgfVar)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) h6cVar.getAndSet(tvVar2)) == tvVar) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th) {
                        if (((Runnable) h6cVar.getAndSet(tvVar2)) == tvVar) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th;
                    }
                }
            }
        }
        this.n = null;
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
