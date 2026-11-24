package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;
public final class ha3 extends i44 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final ha3 w;
    public static final long x;

    static {
        Long l;
        ?? i44Var = new i44();
        w = i44Var;
        i44Var.g(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        x = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override
    public final no3 a(long j, nob nobVar, sw2 sw2Var) {
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
            f44 f44Var = new f44(j2 + nanoTime, nobVar);
            p(nanoTime, f44Var);
            return f44Var;
        }
        return sj7.a;
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
    public final void o(long j, g44 g44Var) {
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
        Unsafe unsafe = ex.a;
        unsafe.putObjectVolatile(this, i44.r, (Object) null);
        unsafe.putObjectVolatile(this, i44.h, (Object) null);
        notifyAll();
    }

    @Override
    public final void run() {
        boolean z;
        boolean z2;
        boolean n;
        dnb.a.set(this);
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
