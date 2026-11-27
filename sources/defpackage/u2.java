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
public abstract class u2 implements x76 {
    public static final boolean d;
    public static final j26 e;
    public static final hpd f;
    public static final Object h;
    public volatile Object a;
    public volatile l2 b;
    public volatile t2 c;

    static {
        boolean z;
        Throwable th;
        m2 m2Var;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = new j26(u2.class, (byte) 0);
        Throwable th2 = null;
        try {
            th = null;
            m2Var = new Object();
        } catch (Error | Exception e2) {
            th = e2;
            try {
                m2Var = new m2(AtomicReferenceFieldUpdater.newUpdater(t2.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(t2.class, t2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(u2.class, t2.class, "c"), AtomicReferenceFieldUpdater.newUpdater(u2.class, l2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(u2.class, Object.class, "a"));
            } catch (Error | Exception e3) {
                th2 = e3;
                m2Var = new Object();
            }
        }
        f = m2Var;
        if (th2 != null) {
            j26 j26Var = e;
            Logger a = j26Var.a();
            Level level = Level.SEVERE;
            a.log(level, "UnsafeAtomicHelper is broken!", th);
            j26Var.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        h = new Object();
    }

    public static void f(u2 u2Var, boolean z) {
        l2 l2Var = null;
        while (true) {
            for (t2 e2 = f.e(u2Var); e2 != null; e2 = e2.b) {
                Thread thread = e2.a;
                if (thread != null) {
                    e2.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                z = false;
            }
            u2Var.d();
            l2 l2Var2 = l2Var;
            l2 d2 = f.d(u2Var);
            l2 l2Var3 = l2Var2;
            while (d2 != null) {
                l2 l2Var4 = d2.c;
                d2.c = l2Var3;
                l2Var3 = d2;
                d2 = l2Var4;
            }
            while (l2Var3 != null) {
                l2Var = l2Var3.c;
                Runnable runnable = l2Var3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof n2) {
                    n2 n2Var = (n2) runnable;
                    u2Var = n2Var.a;
                    if (u2Var.a == n2Var) {
                        if (f.b(u2Var, n2Var, i(n2Var.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = l2Var3.b;
                    Objects.requireNonNull(executor);
                    g(runnable, executor);
                }
                l2Var3 = l2Var;
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
        if (!(obj instanceof i2)) {
            if (!(obj instanceof k2)) {
                if (obj == h) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((k2) obj).a);
        }
        RuntimeException runtimeException = ((i2) obj).b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(runtimeException);
        throw cancellationException;
    }

    public static java.lang.Object i(defpackage.x76 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u2.i(x76):java.lang.Object");
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
        l2 l2Var;
        l2 l2Var2 = l2.d;
        if (!isDone() && (l2Var = this.b) != l2Var2) {
            l2 l2Var3 = new l2(runnable, executor);
            do {
                l2Var3.c = l2Var;
                if (f.a(this, l2Var, l2Var3)) {
                    return;
                }
                l2Var = this.b;
            } while (l2Var != l2Var2);
            g(runnable, executor);
        }
        g(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z) {
        boolean z2;
        i2 i2Var;
        boolean z3;
        Object obj = this.a;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z2 | (obj instanceof n2))) {
            return false;
        }
        if (d) {
            i2Var = new i2(z, new CancellationException("Future.cancel() was called."));
        } else {
            if (z) {
                i2Var = i2.c;
            } else {
                i2Var = i2.d;
            }
            Objects.requireNonNull(i2Var);
        }
        boolean z4 = false;
        while (true) {
            if (f.b(this, obj, i2Var)) {
                f(this, z);
                if (!(obj instanceof n2)) {
                    break;
                }
                x76 x76Var = ((n2) obj).b;
                if (x76Var instanceof p2) {
                    this = (u2) x76Var;
                    obj = this.a;
                    if (obj == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && !(obj instanceof n2)) {
                        break;
                    }
                    z4 = true;
                } else {
                    x76Var.cancel(z);
                    break;
                }
            } else {
                obj = this.a;
                if (!(obj instanceof n2)) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u2.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override
    public boolean isCancelled() {
        return this.a instanceof i2;
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
        return z & (!(obj instanceof n2));
    }

    public String j() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public final void k(t2 t2Var) {
        t2Var.a = null;
        while (true) {
            t2 t2Var2 = this.c;
            if (t2Var2 != t2.c) {
                t2 t2Var3 = null;
                while (t2Var2 != null) {
                    t2 t2Var4 = t2Var2.b;
                    if (t2Var2.a != null) {
                        t2Var3 = t2Var2;
                    } else if (t2Var3 != null) {
                        t2Var3.b = t2Var4;
                        if (t2Var3.a == null) {
                            break;
                        }
                    } else if (f.c(this, t2Var2, t2Var4)) {
                    }
                    t2Var2 = t2Var4;
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
        if (!f.b(this, null, new k2(th))) {
            return false;
        }
        f(this, false);
        return true;
    }

    public final boolean n(x76 x76Var) {
        k2 k2Var;
        x76Var.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (x76Var.isDone()) {
                if (f.b(this, null, i(x76Var))) {
                    f(this, false);
                    return true;
                }
                return false;
            }
            n2 n2Var = new n2(this, x76Var);
            if (f.b(this, null, n2Var)) {
                try {
                    x76Var.b(n2Var, mo3.a);
                    return true;
                } catch (Throwable th) {
                    try {
                        k2Var = new k2(th);
                    } catch (Error | Exception unused) {
                        k2Var = k2.b;
                    }
                    f.b(this, n2Var, k2Var);
                    return true;
                }
            }
            obj = this.a;
        }
        if (obj instanceof i2) {
            x76Var.cancel(((i2) obj).a);
        }
        return false;
    }

    public final java.lang.String toString() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u2.toString():java.lang.String");
    }

    public void d() {
    }

    @Override
    public final Object get() {
        Object obj;
        t2 t2Var = t2.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof n2))) {
                return h(obj2);
            }
            t2 t2Var2 = this.c;
            if (t2Var2 != t2Var) {
                t2 t2Var3 = new t2();
                do {
                    hpd hpdVar = f;
                    hpdVar.f(t2Var3, t2Var2);
                    if (hpdVar.c(this, t2Var2, t2Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                k(t2Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof n2))));
                        return h(obj);
                    }
                    t2Var2 = this.c;
                } while (t2Var2 != t2Var);
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
