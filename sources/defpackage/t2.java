package defpackage;

import j$.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class t2 implements t76 {
    public static final boolean d;
    public static final f26 e;
    public static final smd f;
    public static final Object h;
    public volatile Object a;
    public volatile k2 b;
    public volatile s2 c;

    static {
        boolean z;
        Throwable th;
        l2 l2Var;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = new f26(t2.class, (byte) 0);
        Throwable th2 = null;
        try {
            th = null;
            l2Var = new Object();
        } catch (Error | Exception e2) {
            th = e2;
            try {
                l2Var = new l2(AtomicReferenceFieldUpdater.newUpdater(s2.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(s2.class, s2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(t2.class, s2.class, "c"), AtomicReferenceFieldUpdater.newUpdater(t2.class, k2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(t2.class, Object.class, "a"));
            } catch (Error | Exception e3) {
                th2 = e3;
                l2Var = new Object();
            }
        }
        f = l2Var;
        if (th2 != null) {
            f26 f26Var = e;
            Logger a = f26Var.a();
            Level level = Level.SEVERE;
            a.log(level, "UnsafeAtomicHelper is broken!", th);
            f26Var.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        h = new Object();
    }

    public static void f(t2 t2Var, boolean z) {
        k2 k2Var = null;
        while (true) {
            for (s2 e2 = f.e(t2Var); e2 != null; e2 = e2.b) {
                Thread thread = e2.a;
                if (thread != null) {
                    e2.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                z = false;
            }
            t2Var.d();
            k2 k2Var2 = k2Var;
            k2 d2 = f.d(t2Var);
            k2 k2Var3 = k2Var2;
            while (d2 != null) {
                k2 k2Var4 = d2.c;
                d2.c = k2Var3;
                k2Var3 = d2;
                d2 = k2Var4;
            }
            while (k2Var3 != null) {
                k2Var = k2Var3.c;
                Runnable runnable = k2Var3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof m2) {
                    m2 m2Var = (m2) runnable;
                    t2Var = m2Var.a;
                    if (t2Var.a == m2Var) {
                        if (f.b(t2Var, m2Var, i(m2Var.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = k2Var3.b;
                    Objects.requireNonNull(executor);
                    g(runnable, executor);
                }
                k2Var3 = k2Var;
            }
            return;
        }
    }

    public static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            Logger a = e.a();
            Level level = Level.SEVERE;
            a.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object h(Object obj) {
        if (!(obj instanceof h2)) {
            if (!(obj instanceof j2)) {
                if (obj == h) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((j2) obj).a);
        }
        RuntimeException runtimeException = ((h2) obj).b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(runtimeException);
        throw cancellationException;
    }

    public static java.lang.Object i(defpackage.t76 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t2.i(t76):java.lang.Object");
    }

    public final void a(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            } catch (Exception e3) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e3.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        e(sb, obj);
        sb.append("]");
    }

    @Override
    public final void b(Runnable runnable, Executor executor) {
        k2 k2Var;
        k2 k2Var2 = k2.d;
        if (!isDone() && (k2Var = this.b) != k2Var2) {
            k2 k2Var3 = new k2(runnable, executor);
            do {
                k2Var3.c = k2Var;
                if (f.a(this, k2Var, k2Var3)) {
                    return;
                }
                k2Var = this.b;
            } while (k2Var != k2Var2);
            g(runnable, executor);
        }
        g(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z) {
        boolean z2;
        h2 h2Var;
        boolean z3;
        Object obj = this.a;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z2 | (obj instanceof m2))) {
            return false;
        }
        if (d) {
            h2Var = new h2(z, new CancellationException("Future.cancel() was called."));
        } else {
            if (z) {
                h2Var = h2.c;
            } else {
                h2Var = h2.d;
            }
            Objects.requireNonNull(h2Var);
        }
        boolean z4 = false;
        while (true) {
            if (f.b(this, obj, h2Var)) {
                f(this, z);
                if (!(obj instanceof m2)) {
                    break;
                }
                t76 t76Var = ((m2) obj).b;
                if (t76Var instanceof o2) {
                    this = (t2) t76Var;
                    obj = this.a;
                    if (obj == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && !(obj instanceof m2)) {
                        break;
                    }
                    z4 = true;
                } else {
                    t76Var.cancel(z);
                    break;
                }
            } else {
                obj = this.a;
                if (!(obj instanceof m2)) {
                    return z4;
                }
            }
        }
        return true;
    }

    public final void e(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override
    public final java.lang.Object get(long r21, java.util.concurrent.TimeUnit r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t2.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override
    public boolean isCancelled() {
        return this.a instanceof h2;
    }

    @Override
    public final boolean isDone() {
        Object obj;
        boolean z;
        if (this.a != null) {
            z = true;
        } else {
            z = false;
        }
        return z & (!(obj instanceof m2));
    }

    public String j() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public final void k(s2 s2Var) {
        s2Var.a = null;
        while (true) {
            s2 s2Var2 = this.c;
            if (s2Var2 != s2.c) {
                s2 s2Var3 = null;
                while (s2Var2 != null) {
                    s2 s2Var4 = s2Var2.b;
                    if (s2Var2.a != null) {
                        s2Var3 = s2Var2;
                    } else if (s2Var3 != null) {
                        s2Var3.b = s2Var4;
                        if (s2Var3.a == null) {
                            break;
                        }
                    } else if (f.c(this, s2Var2, s2Var4)) {
                    }
                    s2Var2 = s2Var4;
                }
                return;
            }
            return;
        }
    }

    public final boolean l(Object obj) {
        if (obj == null) {
            obj = h;
        }
        if (!f.b(this, null, obj)) {
            return false;
        }
        f(this, false);
        return true;
    }

    public final boolean m(Throwable th) {
        th.getClass();
        if (!f.b(this, null, new j2(th))) {
            return false;
        }
        f(this, false);
        return true;
    }

    public final boolean n(t76 t76Var) {
        j2 j2Var;
        t76Var.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (t76Var.isDone()) {
                if (f.b(this, null, i(t76Var))) {
                    f(this, false);
                    return true;
                }
                return false;
            }
            m2 m2Var = new m2(this, t76Var);
            if (f.b(this, null, m2Var)) {
                try {
                    t76Var.b(m2Var, fp3.a);
                    return true;
                } catch (Throwable th) {
                    try {
                        j2Var = new j2(th);
                    } catch (Error | Exception unused) {
                        j2Var = j2.b;
                    }
                    f.b(this, m2Var, j2Var);
                    return true;
                }
            }
            obj = this.a;
        }
        if (obj instanceof h2) {
            t76Var.cancel(((h2) obj).a);
        }
        return false;
    }

    public final java.lang.String toString() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t2.toString():java.lang.String");
    }

    public void d() {
    }

    @Override
    public final Object get() {
        Object obj;
        s2 s2Var = s2.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof m2))) {
                return h(obj2);
            }
            s2 s2Var2 = this.c;
            if (s2Var2 != s2Var) {
                s2 s2Var3 = new s2();
                do {
                    smd smdVar = f;
                    smdVar.f(s2Var3, s2Var2);
                    if (smdVar.c(this, s2Var2, s2Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                k(s2Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof m2))));
                        return h(obj);
                    }
                    s2Var2 = this.c;
                } while (s2Var2 != s2Var);
                Object obj3 = this.a;
                Objects.requireNonNull(obj3);
                return h(obj3);
            }
            Object obj32 = this.a;
            Objects.requireNonNull(obj32);
            return h(obj32);
        }
        throw new InterruptedException();
    }
}
