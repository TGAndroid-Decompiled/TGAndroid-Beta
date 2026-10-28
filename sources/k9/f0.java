package k9;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import org.telegram.ui.Components.b10;
public final class f0 extends AtomicReference implements Runnable {
    public static final androidx.emoji2.text.n f16473c = new androidx.emoji2.text.n(2);
    public static final androidx.emoji2.text.n d = new androidx.emoji2.text.n(2);
    public final Callable f16474a;
    public final g0 f16475b;

    public f0(g0 g0Var, Callable callable) {
        this.f16475b = g0Var;
        callable.getClass();
        this.f16474a = callable;
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
            g0 g0Var = this.f16475b;
            boolean isDone = g0Var.isDone();
            androidx.emoji2.text.n nVar = f16473c;
            if (!isDone) {
                try {
                    obj = this.f16474a.call();
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
        if (runnable == f16473c) {
            str = "running=[DONE]";
        } else if (runnable instanceof x) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder l4 = b10.l(str, ", ");
        l4.append(this.f16474a.toString());
        return l4.toString();
    }
}
