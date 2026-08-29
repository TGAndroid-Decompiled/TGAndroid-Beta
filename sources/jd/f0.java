package jd;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
public final class f0 extends v0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final f0 f11475s;
    public static final long v;

    static {
        Long l10;
        ?? v0Var = new v0();
        f11475s = v0Var;
        v0Var.h(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        v = timeUnit.toNanos(l10.longValue());
    }

    @Override
    public final o0 a(long j10, e2 e2Var, sc.h hVar) {
        long j11 = 0;
        if (j10 > 0) {
            if (j10 >= 9223372036854L) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = 1000000 * j10;
            }
        }
        if (j11 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            s0 s0Var = new s0(j11 + nanoTime, e2Var);
            o(nanoTime, s0Var);
            return s0Var;
        }
        return w1.f11538a;
    }

    @Override
    public final Thread g() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(f0.class.getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
            return thread;
        }
        return thread2;
    }

    @Override
    public final void k(long j10, t0 t0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override
    public final void l(Runnable runnable) {
        if (debugStatus != 4) {
            super.l(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void p() {
        boolean z10;
        int i10 = debugStatus;
        if (i10 != 2 && i10 != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return;
        }
        debugStatus = 3;
        v0.h.set(this, null);
        v0.f11533n.set(this, null);
        notifyAll();
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        boolean n10;
        c2.f11453a.set(this);
        try {
            synchronized (this) {
                int i10 = debugStatus;
                if (i10 != 2 && i10 != 3) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    if (!n10) {
                        return;
                    }
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j10 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long i11 = i();
                    if (i11 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j10 == Long.MAX_VALUE) {
                            j10 = v + nanoTime;
                        }
                        long j11 = j10 - nanoTime;
                        if (j11 <= 0) {
                            _thread = null;
                            p();
                            if (!n()) {
                                g();
                                return;
                            }
                            return;
                        } else if (i11 > j11) {
                            i11 = j11;
                        }
                    } else {
                        j10 = Long.MAX_VALUE;
                    }
                    if (i11 > 0) {
                        int i12 = debugStatus;
                        if (i12 != 2 && i12 != 3) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            _thread = null;
                            p();
                            if (!n()) {
                                g();
                                return;
                            }
                            return;
                        }
                        LockSupport.parkNanos(this, i11);
                    }
                }
            }
        } finally {
            _thread = null;
            p();
            if (!n()) {
                g();
            }
        }
    }

    @Override
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
