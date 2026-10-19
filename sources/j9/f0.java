package j9;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
public final class f0 extends AtomicReference implements Runnable {
    public static final androidx.emoji2.text.n f14339c = new androidx.emoji2.text.n(2);
    public static final androidx.emoji2.text.n d = new androidx.emoji2.text.n(2);
    public final Callable f14340a;
    public final g0 f14341b;

    public f0(g0 g0Var, Callable callable) {
        this.f14341b = g0Var;
        callable.getClass();
        this.f14340a = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        x xVar = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            boolean z11 = runnable instanceof x;
            androidx.emoji2.text.n nVar = d;
            if (!z11 && runnable != nVar) {
                break;
            }
            if (z11) {
                xVar = (x) runnable;
            }
            i10++;
            if (i10 > 1000) {
                if (runnable == nVar || compareAndSet(runnable, nVar)) {
                    if (!Thread.interrupted() && !z10) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    LockSupport.park(xVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    @Override
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            g0 g0Var = this.f14341b;
            boolean isDone = g0Var.isDone();
            androidx.emoji2.text.n nVar = f14339c;
            if (!isDone) {
                try {
                    obj = this.f14340a.call();
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, nVar)) {
                            a(currentThread);
                        }
                        if (!isDone) {
                            g0Var.n(th2);
                            return;
                        }
                        return;
                    } finally {
                        if (!compareAndSet(currentThread, nVar)) {
                            a(currentThread);
                        }
                        if (!isDone) {
                            g0Var.m(null);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f14339c) {
            str = "running=[DONE]";
        } else if (runnable instanceof x) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder i10 = r4.c.i(str, ", ");
        i10.append(this.f14340a.toString());
        return i10.toString();
    }
}
