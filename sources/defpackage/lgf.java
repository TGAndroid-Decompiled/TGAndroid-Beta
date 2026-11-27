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
public abstract class lgf implements x76 {
    public static final boolean d;
    public static final Logger e;
    public static final v8f f;
    public static final Object h;
    public volatile Object a;
    public volatile fgf b;
    public volatile jgf c;

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        ggf ggfVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = Logger.getLogger(lgf.class.getName());
        try {
            th = null;
            th2 = null;
            ggfVar = new Object();
        } catch (Error | RuntimeException e2) {
            try {
                th2 = e2;
                ggfVar = new ggf(AtomicReferenceFieldUpdater.newUpdater(jgf.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(jgf.class, jgf.class, "b"), AtomicReferenceFieldUpdater.newUpdater(lgf.class, jgf.class, "c"), AtomicReferenceFieldUpdater.newUpdater(lgf.class, fgf.class, "b"), AtomicReferenceFieldUpdater.newUpdater(lgf.class, Object.class, "a"));
                th = null;
            } catch (Error | RuntimeException e3) {
                th = e3;
                th2 = e2;
                ggfVar = new Object();
            }
        }
        f = ggfVar;
        if (th != null) {
            Logger logger = e;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        h = new Object();
    }

    public static Object e(lgf lgfVar) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = lgfVar.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static void g(lgf lgfVar) {
        for (jgf b = f.b(lgfVar); b != null; b = b.b) {
            Thread thread = b.a;
            if (thread != null) {
                b.a = null;
                LockSupport.unpark(thread);
            }
        }
        lgfVar.d();
        fgf a = f.a(lgfVar);
        fgf fgfVar = null;
        while (a != null) {
            fgf fgfVar2 = a.c;
            a.c = fgfVar;
            fgfVar = a;
            a = fgfVar2;
        }
        while (fgfVar != null) {
            Runnable runnable = fgfVar.a;
            fgf fgfVar3 = fgfVar.c;
            runnable.getClass();
            Executor executor = fgfVar.b;
            executor.getClass();
            h(runnable, executor);
            fgfVar = fgfVar3;
        }
    }

    public static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", qd4.q("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e2);
        }
    }

    public static final Object j(Object obj) {
        if (!(obj instanceof dgf)) {
            if (!(obj instanceof egf)) {
                if (obj == h) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((egf) obj).a);
        }
        RuntimeException runtimeException = ((dgf) obj).b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(runtimeException);
        throw cancellationException;
    }

    public String a() {
        if (this instanceof ScheduledFuture) {
            return ik8.n(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override
    public final void b(Runnable runnable, Executor executor) {
        fgf fgfVar;
        fgf fgfVar2 = fgf.d;
        if (!isDone() && (fgfVar = this.b) != fgfVar2) {
            fgf fgfVar3 = new fgf(runnable, executor);
            do {
                fgfVar3.c = fgfVar;
                if (f.e(this, fgfVar, fgfVar3)) {
                    return;
                }
                fgfVar = this.b;
            } while (fgfVar != fgfVar2);
            h(runnable, executor);
        }
        h(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z) {
        dgf dgfVar;
        dgf dgfVar2;
        Object obj = this.a;
        if (obj == null) {
            if (d) {
                dgfVar2 = new dgf(z, new CancellationException("Future.cancel() was called."));
            } else {
                if (z) {
                    dgfVar = dgf.c;
                } else {
                    dgfVar = dgf.d;
                }
                dgfVar2 = dgfVar;
                dgfVar2.getClass();
            }
            if (f.f(this, obj, dgfVar2)) {
                g(this);
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f(StringBuilder sb) {
        try {
            Object e2 = e(this);
            sb.append("SUCCESS, result=[");
            if (e2 == null) {
                sb.append("null");
            } else if (e2 == this) {
                sb.append("this future");
            } else {
                sb.append(e2.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(e2)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e4) {
            sb.append("FAILURE, cause=[");
            sb.append(e4.getCause());
            sb.append("]");
        }
    }

    @Override
    public final java.lang.Object get(long r18, java.util.concurrent.TimeUnit r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgf.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final void i(jgf jgfVar) {
        jgfVar.a = null;
        while (true) {
            jgf jgfVar2 = this.c;
            if (jgfVar2 != jgf.c) {
                jgf jgfVar3 = null;
                while (jgfVar2 != null) {
                    jgf jgfVar4 = jgfVar2.b;
                    if (jgfVar2.a != null) {
                        jgfVar3 = jgfVar2;
                    } else if (jgfVar3 != null) {
                        jgfVar3.b = jgfVar4;
                        if (jgfVar3.a == null) {
                            break;
                        }
                    } else if (f.g(this, jgfVar2, jgfVar4)) {
                    }
                    jgfVar2 = jgfVar4;
                }
                return;
            }
            return;
        }
    }

    @Override
    public final boolean isCancelled() {
        return this.a instanceof dgf;
    }

    @Override
    public final boolean isDone() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public final java.lang.String toString() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgf.toString():java.lang.String");
    }

    public void d() {
    }

    @Override
    public final Object get() {
        Object obj;
        jgf jgfVar = jgf.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return j(obj2);
            }
            jgf jgfVar2 = this.c;
            if (jgfVar2 != jgfVar) {
                jgf jgfVar3 = new jgf();
                do {
                    v8f v8fVar = f;
                    v8fVar.c(jgfVar3, jgfVar2);
                    if (v8fVar.g(this, jgfVar2, jgfVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                i(jgfVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return j(obj);
                    }
                    jgfVar2 = this.c;
                } while (jgfVar2 != jgfVar);
                Object obj3 = this.a;
                obj3.getClass();
                return j(obj3);
            }
            Object obj32 = this.a;
            obj32.getClass();
            return j(obj32);
        }
        throw new InterruptedException();
    }
}
