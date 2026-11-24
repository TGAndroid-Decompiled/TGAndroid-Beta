package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
public final class h2c extends AtomicReference implements Runnable {
    public static final sv d = new sv((byte) 8);
    public static final sv e = new sv((byte) 8);
    public static final sv f = new sv((byte) 16);
    public static final sv h = new sv((byte) 16);
    public final byte a = 1;
    public final Callable b;
    public final Object c;

    public h2c(edf edfVar, Callable callable) {
        this.c = edfVar;
        callable.getClass();
        this.b = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        qp5 qp5Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof qp5;
            sv svVar = e;
            if (!z2) {
                if (runnable != svVar) {
                    break;
                }
            } else {
                qp5Var = (qp5) runnable;
            }
            i++;
            if (i > 1000) {
                if (runnable == svVar || compareAndSet(runnable, svVar)) {
                    if (!Thread.interrupted() && !z) {
                        z = false;
                    } else {
                        z = true;
                    }
                    LockSupport.park(qp5Var);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public final void b(Thread thread) {
        Runnable runnable = (Runnable) get();
        jcf jcfVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof jcf;
            sv svVar = h;
            if (!z2) {
                if (runnable != svVar) {
                    break;
                }
            } else {
                jcfVar = (jcf) runnable;
            }
            i++;
            if (i > 1000) {
                if (runnable == svVar || compareAndSet(runnable, svVar)) {
                    if (!Thread.interrupted() && !z) {
                        z = false;
                    } else {
                        z = true;
                    }
                    LockSupport.park(jcfVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override
    public final void run() {
        Object call;
        byte b = this.a;
        Callable callable = this.b;
        Object obj = null;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                i2c i2cVar = (i2c) obj2;
                Thread currentThread = Thread.currentThread();
                if (compareAndSet(null, currentThread)) {
                    boolean isDone = i2cVar.isDone();
                    sv svVar = d;
                    if (!isDone) {
                        try {
                            obj = callable.call();
                        } catch (Throwable th) {
                            try {
                                if (th instanceof InterruptedException) {
                                    Thread.currentThread().interrupt();
                                }
                                if (!compareAndSet(currentThread, svVar)) {
                                    a(currentThread);
                                }
                                if (!isDone) {
                                    i2cVar.m(th);
                                    return;
                                }
                                return;
                            } finally {
                                if (!compareAndSet(currentThread, svVar)) {
                                    a(currentThread);
                                }
                                if (!isDone) {
                                    i2cVar.l(null);
                                }
                            }
                        }
                    }
                    if (!isDone) {
                        return;
                    }
                    return;
                }
                return;
            default:
                edf edfVar = (edf) obj2;
                Thread currentThread2 = Thread.currentThread();
                if (compareAndSet(null, currentThread2)) {
                    boolean isDone2 = edfVar.isDone();
                    sv svVar2 = f;
                    if (!isDone2) {
                        try {
                            call = callable.call();
                        } catch (Throwable th2) {
                            try {
                                if (th2 instanceof InterruptedException) {
                                    Thread.currentThread().interrupt();
                                }
                                if (!compareAndSet(currentThread2, svVar2)) {
                                    b(currentThread2);
                                }
                                if (vbf.f.f(edfVar, null, new obf(th2))) {
                                    vbf.g(edfVar);
                                    return;
                                }
                                return;
                            } catch (Throwable th3) {
                                if (!compareAndSet(currentThread2, svVar2)) {
                                    b(currentThread2);
                                }
                                if (vbf.f.f(edfVar, null, vbf.h)) {
                                    vbf.g(edfVar);
                                }
                                throw th3;
                            }
                        }
                    } else {
                        call = null;
                    }
                    if (!compareAndSet(currentThread2, svVar2)) {
                        b(currentThread2);
                    }
                    if (!isDone2) {
                        if (call == null) {
                            call = vbf.h;
                        }
                        if (vbf.f.f(edfVar, null, call)) {
                            vbf.g(edfVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final String toString() {
        byte b = this.a;
        Callable callable = this.b;
        String str = "running=[NOT STARTED YET]";
        switch (b) {
            case 0:
                Runnable runnable = (Runnable) get();
                if (runnable == d) {
                    str = "running=[DONE]";
                } else if (runnable instanceof qp5) {
                    str = "running=[INTERRUPTED]";
                } else if (runnable instanceof Thread) {
                    str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
                }
                StringBuilder k = b00.k(str, ", ");
                k.append(callable.toString());
                return k.toString();
            default:
                Runnable runnable2 = (Runnable) get();
                if (runnable2 == f) {
                    str = "running=[DONE]";
                } else if (runnable2 instanceof jcf) {
                    str = "running=[INTERRUPTED]";
                } else if (runnable2 instanceof Thread) {
                    str = tb4.y("running=[RUNNING ON ", ((Thread) runnable2).getName(), "]");
                }
                return tb4.y(str, ", ", callable.toString());
        }
    }

    public h2c(i2c i2cVar, Callable callable) {
        this.c = i2cVar;
        callable.getClass();
        this.b = callable;
    }
}
