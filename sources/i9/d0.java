package i9;

import ai.z9;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
public final class d0 extends AtomicReference implements Runnable {
    public static final z9 f11022c = new z9(2);
    public static final z9 d = new z9(2);
    public final Callable f11023a;
    public final e0 f11024b;

    public d0(e0 e0Var, Callable callable) {
        this.f11024b = e0Var;
        callable.getClass();
        this.f11023a = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        v vVar = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            boolean z11 = runnable instanceof v;
            z9 z9Var = d;
            if (!z11 && runnable != z9Var) {
                break;
            }
            if (z11) {
                vVar = (v) runnable;
            }
            i10++;
            if (i10 > 1000) {
                if (runnable == z9Var || compareAndSet(runnable, z9Var)) {
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
            e0 e0Var = this.f11024b;
            boolean isDone = e0Var.isDone();
            z9 z9Var = f11022c;
            if (!isDone) {
                try {
                    obj = this.f11023a.call();
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, z9Var)) {
                            a(currentThread);
                        }
                        if (!isDone) {
                            e0Var.n(th2);
                            return;
                        }
                        return;
                    } finally {
                        if (!compareAndSet(currentThread, z9Var)) {
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
        if (runnable == f11022c) {
            str = "running=[DONE]";
        } else if (runnable instanceof v) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder h = w.c.h(str, ", ");
        h.append(this.f11023a.toString());
        return h.toString();
    }
}
