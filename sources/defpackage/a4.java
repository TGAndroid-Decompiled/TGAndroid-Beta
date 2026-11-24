package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class a4 implements t76 {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(a4.class.getName());
    public static final hnd f;
    public static final Object h;
    public volatile Object a;
    public volatile v3 b;
    public volatile z3 c;

    static {
        w3 w3Var;
        try {
            th = null;
            w3Var = new w3(AtomicReferenceFieldUpdater.newUpdater(z3.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(z3.class, z3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a4.class, z3.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a4.class, v3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a4.class, Object.class, "a"));
        } catch (Throwable th) {
            th = th;
            w3Var = new Object();
        }
        f = w3Var;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        h = new Object();
    }

    public static void e(a4 a4Var) {
        v3 v3Var;
        v3 v3Var2;
        v3 v3Var3 = null;
        while (true) {
            z3 z3Var = a4Var.c;
            if (f.c(a4Var, z3Var, z3.c)) {
                while (z3Var != null) {
                    Thread thread = z3Var.a;
                    if (thread != null) {
                        z3Var.a = null;
                        LockSupport.unpark(thread);
                    }
                    z3Var = z3Var.b;
                }
                a4Var.d();
                do {
                    v3Var = a4Var.b;
                } while (!f.a(a4Var, v3Var, v3.d));
                while (true) {
                    v3Var2 = v3Var3;
                    v3Var3 = v3Var;
                    if (v3Var3 == null) {
                        break;
                    }
                    v3Var = v3Var3.c;
                    v3Var3.c = v3Var2;
                }
                while (v3Var2 != null) {
                    v3Var3 = v3Var2.c;
                    Runnable runnable = v3Var2.a;
                    if (runnable instanceof x3) {
                        x3 x3Var = (x3) runnable;
                        a4Var = x3Var.a;
                        if (a4Var.a == x3Var) {
                            if (f.b(a4Var, x3Var, h(x3Var.b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        f(runnable, v3Var2.b);
                    }
                    v3Var2 = v3Var3;
                }
                return;
            }
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Level level = Level.SEVERE;
            e.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object g(Object obj) {
        if (!(obj instanceof t3)) {
            if (!(obj instanceof u3)) {
                if (obj == h) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((u3) obj).a);
        }
        CancellationException cancellationException = ((t3) obj).b;
        CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
        cancellationException2.initCause(cancellationException);
        throw cancellationException2;
    }

    public static Object h(t76 t76Var) {
        Object obj;
        if (t76Var instanceof a4) {
            Object obj2 = ((a4) t76Var).a;
            if (obj2 instanceof t3) {
                t3 t3Var = (t3) obj2;
                if (t3Var.a) {
                    if (t3Var.b != null) {
                        return new t3(false, t3Var.b);
                    }
                    return t3.d;
                }
                return obj2;
            }
            return obj2;
        }
        boolean isCancelled = t76Var.isCancelled();
        boolean z = true;
        if ((!d) & isCancelled) {
            return t3.d;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = t76Var.get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e2) {
                if (!isCancelled) {
                    return new u3(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + t76Var, e2));
                }
                return new t3(false, e2);
            } catch (ExecutionException e3) {
                return new u3(e3.getCause());
            } catch (Throwable th2) {
                return new u3(th2);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (obj == null) {
            return h;
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        Object obj;
        String valueOf;
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
            } catch (RuntimeException e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e3) {
                sb.append("FAILURE, cause=[");
                sb.append(e3.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == this) {
            valueOf = "this future";
        } else {
            valueOf = String.valueOf(obj);
        }
        sb.append(valueOf);
        sb.append("]");
    }

    @Override
    public final void b(Runnable runnable, Executor executor) {
        executor.getClass();
        v3 v3Var = this.b;
        v3 v3Var2 = v3.d;
        if (v3Var != v3Var2) {
            v3 v3Var3 = new v3(runnable, executor);
            do {
                v3Var3.c = v3Var;
                if (f.a(this, v3Var, v3Var3)) {
                    return;
                }
                v3Var = this.b;
            } while (v3Var != v3Var2);
            f(runnable, executor);
        }
        f(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z) {
        boolean z2;
        t3 t3Var;
        boolean z3;
        Object obj = this.a;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z2 | (obj instanceof x3))) {
            return false;
        }
        if (d) {
            t3Var = new t3(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            t3Var = t3.c;
        } else {
            t3Var = t3.d;
        }
        boolean z4 = false;
        while (true) {
            if (f.b(this, obj, t3Var)) {
                e(this);
                if (!(obj instanceof x3)) {
                    break;
                }
                t76 t76Var = ((x3) obj).b;
                if (t76Var instanceof a4) {
                    this = (a4) t76Var;
                    obj = this.a;
                    if (obj == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && !(obj instanceof x3)) {
                        break;
                    }
                    z4 = true;
                } else {
                    t76Var.cancel(z);
                    break;
                }
            } else {
                obj = this.a;
                if (!(obj instanceof x3)) {
                    return z4;
                }
            }
        }
        return true;
    }

    @Override
    public final java.lang.Object get(long r19, java.util.concurrent.TimeUnit r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a4.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public String i() {
        String valueOf;
        Object obj = this.a;
        if (obj instanceof x3) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            t76 t76Var = ((x3) obj).b;
            if (t76Var == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(t76Var);
            }
            return b10.j(sb, valueOf, "]");
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    @Override
    public final boolean isCancelled() {
        return this.a instanceof t3;
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
        return z & (!(obj instanceof x3));
    }

    public final void j(z3 z3Var) {
        z3Var.a = null;
        while (true) {
            z3 z3Var2 = this.c;
            if (z3Var2 != z3.c) {
                z3 z3Var3 = null;
                while (z3Var2 != null) {
                    z3 z3Var4 = z3Var2.b;
                    if (z3Var2.a != null) {
                        z3Var3 = z3Var2;
                    } else if (z3Var3 != null) {
                        z3Var3.b = z3Var4;
                        if (z3Var3.a == null) {
                            break;
                        }
                    } else if (f.c(this, z3Var2, z3Var4)) {
                    }
                    z3Var2 = z3Var4;
                }
                return;
            }
            return;
        }
    }

    public final boolean k(Object obj) {
        if (obj == null) {
            obj = h;
        }
        if (f.b(this, null, obj)) {
            e(this);
            return true;
        }
        return false;
    }

    public final boolean l(Throwable th) {
        if (f.b(this, null, new u3(th))) {
            e(this);
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof t3) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = i();
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                wi8.z("PENDING, info=[", str, "]", sb);
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void d() {
    }

    @Override
    public final Object get() {
        Object obj;
        z3 z3Var = z3.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof x3))) {
                return g(obj2);
            }
            z3 z3Var2 = this.c;
            if (z3Var2 != z3Var) {
                z3 z3Var3 = new z3();
                do {
                    hnd hndVar = f;
                    hndVar.d(z3Var3, z3Var2);
                    if (hndVar.c(this, z3Var2, z3Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                j(z3Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof x3))));
                        return g(obj);
                    }
                    z3Var2 = this.c;
                } while (z3Var2 != z3Var);
                return g(this.a);
            }
            return g(this.a);
        }
        throw new InterruptedException();
    }
}
