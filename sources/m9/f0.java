package m9;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
public final class f0 extends AtomicReference implements Runnable {
    public static final androidx.emoji2.text.o f20961c = new androidx.emoji2.text.o(3);
    public static final androidx.emoji2.text.o d = new androidx.emoji2.text.o(3);
    public final Callable f20962a;
    public final g0 f20963b;

    public f0(g0 g0Var, Callable callable) {
        this.f20963b = g0Var;
        callable.getClass();
        this.f20962a = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        x xVar = null;
        boolean z10 = false;
        int i7 = 0;
        while (true) {
            boolean z11 = runnable instanceof x;
            androidx.emoji2.text.o oVar = d;
            if (!z11 && runnable != oVar) {
                break;
            }
            if (z11) {
                xVar = (x) runnable;
            }
            i7++;
            if (i7 > 1000) {
                if (runnable == oVar || compareAndSet(runnable, oVar)) {
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
            g0 g0Var = this.f20963b;
            boolean isDone = g0Var.isDone();
            androidx.emoji2.text.o oVar = f20961c;
            if (!isDone) {
                try {
                    obj = this.f20962a.call();
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, oVar)) {
                            a(currentThread);
                        }
                        if (!isDone) {
                            g0Var.n(th2);
                            return;
                        }
                        return;
                    } finally {
                        if (!compareAndSet(currentThread, oVar)) {
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
        if (runnable == f20961c) {
            str = "running=[DONE]";
        } else if (runnable instanceof x) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder n10 = p5.c.n(str, ", ");
        n10.append(this.f20962a.toString());
        return n10.toString();
    }
}
