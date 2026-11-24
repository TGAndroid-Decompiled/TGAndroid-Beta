package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;
public final class fff extends wdf implements RunnableFuture {
    public volatile h4c n;

    public fff(Callable callable) {
        this.n = new h4c(this, callable);
    }

    @Override
    public final String a() {
        h4c h4cVar = this.n;
        if (h4cVar != null) {
            return kt6.o("task=[", h4cVar.toString(), "]");
        }
        return super.a();
    }

    @Override
    public final void d() {
        h4c h4cVar;
        Object obj = this.a;
        if ((obj instanceof odf) && ((odf) obj).a && (h4cVar = this.n) != null) {
            sw swVar = h4c.h;
            sw swVar2 = h4c.f;
            Runnable runnable = (Runnable) h4cVar.get();
            if (runnable instanceof Thread) {
                kef kefVar = new kef(h4cVar);
                kef.a(kefVar, Thread.currentThread());
                if (h4cVar.compareAndSet(runnable, kefVar)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) h4cVar.getAndSet(swVar2)) == swVar) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th) {
                        if (((Runnable) h4cVar.getAndSet(swVar2)) == swVar) {
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
        h4c h4cVar = this.n;
        if (h4cVar != null) {
            h4cVar.run();
        }
        this.n = null;
    }
}
