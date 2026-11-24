package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;
public final class tb3 extends t54 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final tb3 w;
    public static final long x;

    static {
        Long l;
        ?? t54Var = new t54();
        w = t54Var;
        t54Var.g(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        x = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override
    public final xp3 a(long j, oqb oqbVar, cy2 cy2Var) {
        long j2 = 0;
        if (j > 0) {
            if (j >= 9223372036854L) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = 1000000 * j;
            }
        }
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            q54 q54Var = new q54(j2 + nanoTime, oqbVar);
            p(nanoTime, q54Var);
            return q54Var;
        }
        return vl7.a;
    }

    @Override
    public final void j(Runnable runnable) {
        if (debugStatus != 4) {
            super.j(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override
    public final Thread m() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(w.getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
            return thread;
        }
        return thread2;
    }

    @Override
    public final void o(long j, r54 r54Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void q() {
        boolean z;
        int i = debugStatus;
        if (i != 2 && i != 3) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return;
        }
        debugStatus = 3;
        Unsafe unsafe = fy.a;
        unsafe.putObjectVolatile(this, t54.r, (Object) null);
        unsafe.putObjectVolatile(this, t54.h, (Object) null);
        notifyAll();
    }

    @Override
    public final void run() {
        boolean z;
        boolean z2;
        boolean n;
        epb.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i != 2 && i != 3) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    _thread = null;
                    q();
                    if (n()) {
                    }
                } else {
                    debugStatus = 1;
                    notifyAll();
                    long j = Long.MAX_VALUE;
                    while (true) {
                        Thread.interrupted();
                        long h = h();
                        if (h == Long.MAX_VALUE) {
                            long nanoTime = System.nanoTime();
                            if (j == Long.MAX_VALUE) {
                                j = x + nanoTime;
                            }
                            long j2 = j - nanoTime;
                            if (j2 <= 0) {
                                _thread = null;
                                q();
                                if (n()) {
                                    return;
                                }
                            } else if (h > j2) {
                                h = j2;
                            }
                        } else {
                            j = Long.MAX_VALUE;
                        }
                        if (h > 0) {
                            int i2 = debugStatus;
                            if (i2 != 2 && i2 != 3) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                if (n) {
                                    return;
                                }
                            } else {
                                LockSupport.parkNanos(this, h);
                            }
                        }
                    }
                }
            }
        } finally {
            _thread = null;
            q();
            if (!n()) {
                m();
            }
        }
    }

    @Override
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override
    public final String toString() {
        return "DefaultExecutor";
    }
}
