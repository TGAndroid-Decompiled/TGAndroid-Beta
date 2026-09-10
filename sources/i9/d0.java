package i9;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
public final class d0 extends AtomicReference implements Runnable {
    public static final androidx.emoji2.text.n f10516c = new androidx.emoji2.text.n(1);
    public static final androidx.emoji2.text.n d = new androidx.emoji2.text.n(1);
    public final Callable f10517a;
    public final e0 f10518b;

    public d0(e0 e0Var, Callable callable) {
        this.f10518b = e0Var;
        callable.getClass();
        this.f10517a = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        v vVar = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            boolean z11 = runnable instanceof v;
            androidx.emoji2.text.n nVar = d;
            if (!z11 && runnable != nVar) {
                break;
            }
            if (z11) {
                vVar = (v) runnable;
            }
            i10++;
            if (i10 > 1000) {
                if (runnable == nVar || compareAndSet(runnable, nVar)) {
                    if (!Thread.interrupted() && !z10) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    LockSupport.park(vVar);
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
            e0 e0Var = this.f10518b;
            boolean isDone = e0Var.isDone();
            androidx.emoji2.text.n nVar = f10516c;
            if (!isDone) {
                try {
                    obj = this.f10517a.call();
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, nVar)) {
                            a(currentThread);
                        }
                        if (!isDone) {
                            e0Var.n(th2);
                            return;
                        }
                        return;
                    } finally {
                        if (!compareAndSet(currentThread, nVar)) {
                            a(currentThread);
                        }
                        if (!isDone) {
                            e0Var.m(null);
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
        if (runnable == f10516c) {
            str = "running=[DONE]";
        } else if (runnable instanceof v) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder g10 = w.f.g(str, ", ");
        g10.append(this.f10517a.toString());
        return g10.toString();
    }
}
