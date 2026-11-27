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
public abstract class b4 implements x76 {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(b4.class.getName());
    public static final wpd f;
    public static final Object h;
    public volatile Object a;
    public volatile w3 b;
    public volatile a4 c;

    static {
        x3 x3Var;
        try {
            th = null;
            x3Var = new x3(AtomicReferenceFieldUpdater.newUpdater(a4.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(a4.class, a4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(b4.class, a4.class, "c"), AtomicReferenceFieldUpdater.newUpdater(b4.class, w3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(b4.class, Object.class, "a"));
        } catch (Throwable th) {
            th = th;
            x3Var = new Object();
        }
        f = x3Var;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        h = new Object();
    }

    public static void e(b4 b4Var) {
        w3 w3Var;
        w3 w3Var2;
        w3 w3Var3 = null;
        while (true) {
            a4 a4Var = b4Var.c;
            if (f.c(b4Var, a4Var, a4.c)) {
                while (a4Var != null) {
                    Thread thread = a4Var.a;
                    if (thread != null) {
                        a4Var.a = null;
                        LockSupport.unpark(thread);
                    }
                    a4Var = a4Var.b;
                }
                b4Var.d();
                do {
                    w3Var = b4Var.b;
                } while (!f.a(b4Var, w3Var, w3.d));
                while (true) {
                    w3Var2 = w3Var3;
                    w3Var3 = w3Var;
                    if (w3Var3 == null) {
                        break;
                    }
                    w3Var = w3Var3.c;
                    w3Var3.c = w3Var2;
                }
                while (w3Var2 != null) {
                    w3Var3 = w3Var2.c;
                    Runnable runnable = w3Var2.a;
                    if (runnable instanceof y3) {
                        y3 y3Var = (y3) runnable;
                        b4Var = y3Var.a;
                        if (b4Var.a == y3Var) {
                            if (f.b(b4Var, y3Var, h(y3Var.b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        f(runnable, w3Var2.b);
                    }
                    w3Var2 = w3Var3;
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
        if (!(obj instanceof u3)) {
            if (!(obj instanceof v3)) {
                if (obj == h) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((v3) obj).a);
        }
        CancellationException cancellationException = ((u3) obj).b;
        CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
        cancellationException2.initCause(cancellationException);
        throw cancellationException2;
    }

    public static Object h(x76 x76Var) {
        Object obj;
        if (x76Var instanceof b4) {
            Object obj2 = ((b4) x76Var).a;
            if (obj2 instanceof u3) {
                u3 u3Var = (u3) obj2;
                if (u3Var.a) {
                    if (u3Var.b != null) {
                        return new u3(false, u3Var.b);
                    }
                    return u3.d;
                }
                return obj2;
            }
            return obj2;
        }
        boolean isCancelled = x76Var.isCancelled();
        boolean z = true;
        if ((!d) & isCancelled) {
            return u3.d;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = x76Var.get();
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
                    return new v3(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + x76Var, e2));
                }
                return new u3(false, e2);
            } catch (ExecutionException e3) {
                return new v3(e3.getCause());
            } catch (Throwable th2) {
                return new v3(th2);
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
        w3 w3Var = this.b;
        w3 w3Var2 = w3.d;
        if (w3Var != w3Var2) {
            w3 w3Var3 = new w3(runnable, executor);
            do {
                w3Var3.c = w3Var;
                if (f.a(this, w3Var, w3Var3)) {
                    return;
                }
                w3Var = this.b;
            } while (w3Var != w3Var2);
            f(runnable, executor);
        }
        f(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z) {
        boolean z2;
        u3 u3Var;
        boolean z3;
        Object obj = this.a;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z2 | (obj instanceof y3))) {
            return false;
        }
        if (d) {
            u3Var = new u3(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            u3Var = u3.c;
        } else {
            u3Var = u3.d;
        }
        boolean z4 = false;
        while (true) {
            if (f.b(this, obj, u3Var)) {
                e(this);
                if (!(obj instanceof y3)) {
                    break;
                }
                x76 x76Var = ((y3) obj).b;
                if (x76Var instanceof b4) {
                    this = (b4) x76Var;
                    obj = this.a;
                    if (obj == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && !(obj instanceof y3)) {
                        break;
                    }
                    z4 = true;
                } else {
                    x76Var.cancel(z);
                    break;
                }
            } else {
                obj = this.a;
                if (!(obj instanceof y3)) {
                    return z4;
                }
            }
        }
        return true;
    }

    @Override
    public final java.lang.Object get(long r19, java.util.concurrent.TimeUnit r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b4.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public String i() {
        String valueOf;
        Object obj = this.a;
        if (obj instanceof y3) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            x76 x76Var = ((y3) obj).b;
            if (x76Var == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(x76Var);
            }
            return c00.k(sb, valueOf, "]");
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    @Override
    public final boolean isCancelled() {
        return this.a instanceof u3;
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
        return z & (!(obj instanceof y3));
    }

    public final void j(a4 a4Var) {
        a4Var.a = null;
        while (true) {
            a4 a4Var2 = this.c;
            if (a4Var2 != a4.c) {
                a4 a4Var3 = null;
                while (a4Var2 != null) {
                    a4 a4Var4 = a4Var2.b;
                    if (a4Var2.a != null) {
                        a4Var3 = a4Var2;
                    } else if (a4Var3 != null) {
                        a4Var3.b = a4Var4;
                        if (a4Var3.a == null) {
                            break;
                        }
                    } else if (f.c(this, a4Var2, a4Var4)) {
                    }
                    a4Var2 = a4Var4;
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
        if (f.b(this, null, new v3(th))) {
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
        if (this.a instanceof u3) {
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
                ik8.z("PENDING, info=[", str, "]", sb);
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
        a4 a4Var = a4.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof y3))) {
                return g(obj2);
            }
            a4 a4Var2 = this.c;
            if (a4Var2 != a4Var) {
                a4 a4Var3 = new a4();
                do {
                    wpd wpdVar = f;
                    wpdVar.d(a4Var3, a4Var2);
                    if (wpdVar.c(this, a4Var2, a4Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                j(a4Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof y3))));
                        return g(obj);
                    }
                    a4Var2 = this.c;
                } while (a4Var2 != a4Var);
                return g(this.a);
            }
            return g(this.a);
        }
        throw new InterruptedException();
    }
}
