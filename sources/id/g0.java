package id;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public final class g0 extends w0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    public static final g0 f11153s;
    public static final long v;

    static {
        Long l10;
        g0 g0Var = new g0();
        f11153s = g0Var;
        g0Var.h(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        v = timeUnit.toNanos(l10.longValue());
    }

    @Override
    public final p0 b(long j10, f2 f2Var, rc.h hVar) {
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10;
        }
        if (j11 >= 4611686018427387903L) {
            return x1.f11215a;
        }
        long jNanoTime = System.nanoTime();
        t0 t0Var = new t0(j11 + jNanoTime, f2Var);
        o(jNanoTime, t0Var);
        return t0Var;
    }

    @Override
    public final Thread g() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(g0.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override
    public final void k(long j10, u0 u0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override
    public final void l(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.l(runnable);
    }

    public final synchronized void p() {
        int i10 = debugStatus;
        if (i10 == 2 || i10 == 3) {
            debugStatus = 3;
            w0.h.set(this, null);
            w0.f11208n.set(this, null);
            notifyAll();
        }
    }

    @Override
    public final void run() {
        d2.f11131a.set(this);
        try {
            synchronized (this) {
                int i10 = debugStatus;
                if (i10 == 2 || i10 == 3) {
                    _thread = null;
                    p();
                    if (n()) {
                        return;
                    }
                    g();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j10 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jI = i();
                    if (jI == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j10 == Long.MAX_VALUE) {
                            j10 = v + jNanoTime;
                        }
                        long j11 = j10 - jNanoTime;
                        if (j11 <= 0) {
                            _thread = null;
                            p();
                            if (n()) {
                                return;
                            }
                            g();
                            return;
                        }
                        if (jI > j11) {
                            jI = j11;
                        }
                    } else {
                        j10 = Long.MAX_VALUE;
                    }
                    if (jI > 0) {
                        int i11 = debugStatus;
                        if (i11 == 2 || i11 == 3) {
                            _thread = null;
                            p();
                            if (n()) {
                                return;
                            }
                            g();
                            return;
                        }
                        LockSupport.parkNanos(this, jI);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            p();
            if (!n()) {
                g();
            }
            throw th;
        }
    }

    @Override
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
