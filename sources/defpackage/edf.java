package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;
public final class edf extends vbf implements RunnableFuture {
    public volatile h2c n;

    public edf(Callable callable) {
        this.n = new h2c(this, callable);
    }

    @Override
    public final String a() {
        h2c h2cVar = this.n;
        if (h2cVar != null) {
            return tb4.y("task=[", h2cVar.toString(), "]");
        }
        return super.a();
    }

    @Override
    public final void d() {
        h2c h2cVar;
        Object obj = this.a;
        if ((obj instanceof nbf) && ((nbf) obj).a && (h2cVar = this.n) != null) {
            sv svVar = h2c.h;
            sv svVar2 = h2c.f;
            Runnable runnable = (Runnable) h2cVar.get();
            if (runnable instanceof Thread) {
                jcf jcfVar = new jcf(h2cVar);
                jcf.a(jcfVar, Thread.currentThread());
                if (h2cVar.compareAndSet(runnable, jcfVar)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) h2cVar.getAndSet(svVar2)) == svVar) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th) {
                        if (((Runnable) h2cVar.getAndSet(svVar2)) == svVar) {
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
        h2c h2cVar = this.n;
        if (h2cVar != null) {
            h2cVar.run();
        }
        this.n = null;
    }
}
