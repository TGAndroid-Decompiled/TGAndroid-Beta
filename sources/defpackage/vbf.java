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
public abstract class vbf implements t56 {
    public static final boolean d;
    public static final Logger e;
    public static final c4f f;
    public static final Object h;
    public volatile Object a;
    public volatile pbf b;
    public volatile tbf c;

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        qbf qbfVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = Logger.getLogger(vbf.class.getName());
        try {
            th = null;
            th2 = null;
            qbfVar = new Object();
        } catch (Error | RuntimeException e2) {
            try {
                th2 = e2;
                qbfVar = new qbf(AtomicReferenceFieldUpdater.newUpdater(tbf.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(tbf.class, tbf.class, "b"), AtomicReferenceFieldUpdater.newUpdater(vbf.class, tbf.class, "c"), AtomicReferenceFieldUpdater.newUpdater(vbf.class, pbf.class, "b"), AtomicReferenceFieldUpdater.newUpdater(vbf.class, Object.class, "a"));
                th = null;
            } catch (Error | RuntimeException e3) {
                th = e3;
                th2 = e2;
                qbfVar = new Object();
            }
        }
        f = qbfVar;
        if (th != null) {
            Logger logger = e;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        h = new Object();
    }

    public static Object e(vbf vbfVar) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = vbfVar.get();
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

    public static void g(vbf vbfVar) {
        for (tbf b = f.b(vbfVar); b != null; b = b.b) {
            Thread thread = b.a;
            if (thread != null) {
                b.a = null;
                LockSupport.unpark(thread);
            }
        }
        vbfVar.d();
        pbf a = f.a(vbfVar);
        pbf pbfVar = null;
        while (a != null) {
            pbf pbfVar2 = a.c;
            a.c = pbfVar;
            pbfVar = a;
            a = pbfVar2;
        }
        while (pbfVar != null) {
            Runnable runnable = pbfVar.a;
            pbf pbfVar3 = pbfVar.c;
            runnable.getClass();
            Executor executor = pbfVar.b;
            executor.getClass();
            h(runnable, executor);
            pbfVar = pbfVar3;
        }
    }

    public static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", tb4.q("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e2);
        }
    }

    public static final Object j(Object obj) {
        if (!(obj instanceof nbf)) {
            if (!(obj instanceof obf)) {
                if (obj == h) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((obf) obj).a);
        }
        RuntimeException runtimeException = ((nbf) obj).b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(runtimeException);
        throw cancellationException;
    }

    public String a() {
        if (this instanceof ScheduledFuture) {
            return ug8.n(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override
    public final void b(Runnable runnable, Executor executor) {
        pbf pbfVar;
        pbf pbfVar2 = pbf.d;
        if (!isDone() && (pbfVar = this.b) != pbfVar2) {
            pbf pbfVar3 = new pbf(runnable, executor);
            do {
                pbfVar3.c = pbfVar;
                if (f.e(this, pbfVar, pbfVar3)) {
                    return;
                }
                pbfVar = this.b;
            } while (pbfVar != pbfVar2);
            h(runnable, executor);
        }
        h(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z) {
        nbf nbfVar;
        nbf nbfVar2;
        Object obj = this.a;
        if (obj == null) {
            if (d) {
                nbfVar2 = new nbf(z, new CancellationException("Future.cancel() was called."));
            } else {
                if (z) {
                    nbfVar = nbf.c;
                } else {
                    nbfVar = nbf.d;
                }
                nbfVar2 = nbfVar;
                nbfVar2.getClass();
            }
            if (f.f(this, obj, nbfVar2)) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vbf.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final void i(tbf tbfVar) {
        tbfVar.a = null;
        while (true) {
            tbf tbfVar2 = this.c;
            if (tbfVar2 != tbf.c) {
                tbf tbfVar3 = null;
                while (tbfVar2 != null) {
                    tbf tbfVar4 = tbfVar2.b;
                    if (tbfVar2.a != null) {
                        tbfVar3 = tbfVar2;
                    } else if (tbfVar3 != null) {
                        tbfVar3.b = tbfVar4;
                        if (tbfVar3.a == null) {
                            break;
                        }
                    } else if (f.g(this, tbfVar2, tbfVar4)) {
                    }
                    tbfVar2 = tbfVar4;
                }
                return;
            }
            return;
        }
    }

    @Override
    public final boolean isCancelled() {
        return this.a instanceof nbf;
    }

    @Override
    public final boolean isDone() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public final java.lang.String toString() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vbf.toString():java.lang.String");
    }

    public void d() {
    }

    @Override
    public final Object get() {
        Object obj;
        tbf tbfVar = tbf.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return j(obj2);
            }
            tbf tbfVar2 = this.c;
            if (tbfVar2 != tbfVar) {
                tbf tbfVar3 = new tbf();
                do {
                    c4f c4fVar = f;
                    c4fVar.c(tbfVar3, tbfVar2);
                    if (c4fVar.g(this, tbfVar2, tbfVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                i(tbfVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return j(obj);
                    }
                    tbfVar2 = this.c;
                } while (tbfVar2 != tbfVar);
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
