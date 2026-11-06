package m9;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
public final class f0 extends AtomicReference implements Runnable {
    public static final androidx.emoji2.text.n f19972c = new androidx.emoji2.text.n(3);
    public static final androidx.emoji2.text.n d = new androidx.emoji2.text.n(3);
    public final Callable f19973a;
    public final g0 f19974b;

    public f0(g0 g0Var, Callable callable) {
        this.f19974b = g0Var;
        callable.getClass();
        this.f19973a = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        x xVar = null;
        boolean z9 = false;
        int i7 = 0;
        while (true) {
            boolean z10 = runnable instanceof x;
            androidx.emoji2.text.n nVar = d;
            if (!z10 && runnable != nVar) {
                break;
            }
            if (z10) {
                xVar = (x) runnable;
            }
            i7++;
            if (i7 > 1000) {
                if (runnable == nVar || compareAndSet(runnable, nVar)) {
                    if (!Thread.interrupted() && !z9) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    LockSupport.park(xVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z9) {
            thread.interrupt();
        }
    }

    @Override
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            g0 g0Var = this.f19974b;
            boolean isDone = g0Var.isDone();
            androidx.emoji2.text.n nVar = f19972c;
            if (!isDone) {
                try {
                    obj = this.f19973a.call();
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
        if (runnable == f19972c) {
            str = "running=[DONE]";
        } else if (runnable instanceof x) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder j3 = rf.b.j(str, ", ");
        j3.append(this.f19973a.toString());
        return j3.toString();
    }
}
