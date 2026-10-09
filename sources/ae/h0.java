package ae;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
public final class h0 extends x0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final h0 f462s;
    public static final long v;

    static {
        Long l4;
        ?? x0Var = new x0();
        f462s = x0Var;
        x0Var.h(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l4 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l4 = 1000L;
        }
        v = timeUnit.toNanos(l4.longValue());
    }

    @Override
    public final q0 a(long j3, g2 g2Var, jd.h hVar) {
        long j10 = 0;
        if (j3 > 0) {
            if (j3 >= 9223372036854L) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = 1000000 * j3;
            }
        }
        if (j10 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            u0 u0Var = new u0(j10 + nanoTime, g2Var);
            o(nanoTime, u0Var);
            return u0Var;
        }
        return y1.f523a;
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
                    thread.setContextClassLoader(h0.class.getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
            return thread;
        }
        return thread2;
    }

    @Override
    public final void k(long j3, v0 v0Var) {
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
        x0.h.set(this, null);
        x0.f516n.set(this, null);
        notifyAll();
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        boolean n10;
        e2.f441a.set(this);
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
                long j3 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long i11 = i();
                    if (i11 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j3 == Long.MAX_VALUE) {
                            j3 = v + nanoTime;
                        }
                        long j10 = j3 - nanoTime;
                        if (j10 <= 0) {
                            _thread = null;
                            p();
                            if (!n()) {
                                g();
                                return;
                            }
                            return;
                        } else if (i11 > j10) {
                            i11 = j10;
                        }
                    } else {
                        j3 = Long.MAX_VALUE;
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
