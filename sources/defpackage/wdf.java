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
public abstract class wdf implements t76 {
    public static final boolean d;
    public static final Logger e;
    public static final e6f f;
    public static final Object h;
    public volatile Object a;
    public volatile qdf b;
    public volatile udf c;

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        rdf rdfVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = Logger.getLogger(wdf.class.getName());
        try {
            th = null;
            th2 = null;
            rdfVar = new Object();
        } catch (Error | RuntimeException e2) {
            try {
                th2 = e2;
                rdfVar = new rdf(AtomicReferenceFieldUpdater.newUpdater(udf.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(udf.class, udf.class, "b"), AtomicReferenceFieldUpdater.newUpdater(wdf.class, udf.class, "c"), AtomicReferenceFieldUpdater.newUpdater(wdf.class, qdf.class, "b"), AtomicReferenceFieldUpdater.newUpdater(wdf.class, Object.class, "a"));
                th = null;
            } catch (Error | RuntimeException e3) {
                th = e3;
                th2 = e2;
                rdfVar = new Object();
            }
        }
        f = rdfVar;
        if (th != null) {
            Logger logger = e;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        h = new Object();
    }

    public static Object e(wdf wdfVar) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = wdfVar.get();
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

    public static void g(wdf wdfVar) {
        for (udf b = f.b(wdfVar); b != null; b = b.b) {
            Thread thread = b.a;
            if (thread != null) {
                b.a = null;
                LockSupport.unpark(thread);
            }
        }
        wdfVar.d();
        qdf a = f.a(wdfVar);
        qdf qdfVar = null;
        while (a != null) {
            qdf qdfVar2 = a.c;
            a.c = qdfVar;
            qdfVar = a;
            a = qdfVar2;
        }
        while (qdfVar != null) {
            Runnable runnable = qdfVar.a;
            qdf qdfVar3 = qdfVar.c;
            runnable.getClass();
            Executor executor = qdfVar.b;
            executor.getClass();
            h(runnable, executor);
            qdfVar = qdfVar3;
        }
    }

    public static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", td4.r("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e2);
        }
    }

    public static final Object j(Object obj) {
        if (!(obj instanceof odf)) {
            if (!(obj instanceof pdf)) {
                if (obj == h) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((pdf) obj).a);
        }
        RuntimeException runtimeException = ((odf) obj).b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(runtimeException);
        throw cancellationException;
    }

    public String a() {
        if (this instanceof ScheduledFuture) {
            return wi8.n(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override
    public final void b(Runnable runnable, Executor executor) {
        qdf qdfVar;
        qdf qdfVar2 = qdf.d;
        if (!isDone() && (qdfVar = this.b) != qdfVar2) {
            qdf qdfVar3 = new qdf(runnable, executor);
            do {
                qdfVar3.c = qdfVar;
                if (f.e(this, qdfVar, qdfVar3)) {
                    return;
                }
                qdfVar = this.b;
            } while (qdfVar != qdfVar2);
            h(runnable, executor);
        }
        h(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z) {
        odf odfVar;
        odf odfVar2;
        Object obj = this.a;
        if (obj == null) {
            if (d) {
                odfVar2 = new odf(z, new CancellationException("Future.cancel() was called."));
            } else {
                if (z) {
                    odfVar = odf.c;
                } else {
                    odfVar = odf.d;
                }
                odfVar2 = odfVar;
                odfVar2.getClass();
            }
            if (f.f(this, obj, odfVar2)) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wdf.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final void i(udf udfVar) {
        udfVar.a = null;
        while (true) {
            udf udfVar2 = this.c;
            if (udfVar2 != udf.c) {
                udf udfVar3 = null;
                while (udfVar2 != null) {
                    udf udfVar4 = udfVar2.b;
                    if (udfVar2.a != null) {
                        udfVar3 = udfVar2;
                    } else if (udfVar3 != null) {
                        udfVar3.b = udfVar4;
                        if (udfVar3.a == null) {
                            break;
                        }
                    } else if (f.g(this, udfVar2, udfVar4)) {
                    }
                    udfVar2 = udfVar4;
                }
                return;
            }
            return;
        }
    }

    @Override
    public final boolean isCancelled() {
        return this.a instanceof odf;
    }

    @Override
    public final boolean isDone() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public final java.lang.String toString() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wdf.toString():java.lang.String");
    }

    public void d() {
    }

    @Override
    public final Object get() {
        Object obj;
        udf udfVar = udf.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return j(obj2);
            }
            udf udfVar2 = this.c;
            if (udfVar2 != udfVar) {
                udf udfVar3 = new udf();
                do {
                    e6f e6fVar = f;
                    e6fVar.c(udfVar3, udfVar2);
                    if (e6fVar.g(this, udfVar2, udfVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                i(udfVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return j(obj);
                    }
                    udfVar2 = this.c;
                } while (udfVar2 != udfVar);
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
