package c0;

import a9.p;
import g7.h0;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class h implements s8.a {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    public static final Logger f2206e = Logger.getLogger(h.class.getName());

    public static final h0 f2207f;
    public static final Object h;

    public volatile Object f2208a;

    public volatile d f2209b;

    public volatile g f2210c;

    static {
        h0 fVar;
        try {
            fVar = new e(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "c"), AtomicReferenceFieldUpdater.newUpdater(h.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            fVar = new f();
        }
        f2207f = fVar;
        if (th != null) {
            f2206e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        h = new Object();
    }

    public static void e(h hVar) {
        g gVar;
        d dVar;
        d dVar2;
        d dVar3;
        do {
            gVar = hVar.f2210c;
        } while (!f2207f.c(hVar, gVar, g.f2203c));
        while (true) {
            dVar = null;
            if (gVar == null) {
                break;
            }
            Thread thread = gVar.f2204a;
            if (thread != null) {
                gVar.f2204a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f2205b;
        }
        hVar.d();
        do {
            dVar2 = hVar.f2209b;
        } while (!f2207f.a(hVar, dVar2, d.d));
        while (true) {
            dVar3 = dVar;
            dVar = dVar2;
            if (dVar == null) {
                break;
            }
            dVar2 = dVar.f2198c;
            dVar.f2198c = dVar3;
        }
        while (dVar3 != null) {
            d dVar4 = dVar3.f2198c;
            f(dVar3.f2196a, dVar3.f2197b);
            dVar3 = dVar4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e9) {
            f2206e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e9);
        }
    }

    public static Object g(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th = ((a) obj).f2193b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f2195a);
        }
        if (obj == h) {
            return null;
        }
        return obj;
    }

    public static Object h(h hVar) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = hVar.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void b(StringBuilder sb2) {
        try {
            Object objH = h(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(objH == this ? "this future" : String.valueOf(objH));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e9) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e9.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        }
    }

    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f2209b;
        d dVar2 = d.d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f2198c = dVar;
                if (f2207f.a(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f2209b;
                }
            } while (dVar != dVar2);
        }
        f(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        a aVar;
        Object obj = this.f2208a;
        if (obj == null) {
            if (d) {
                aVar = new a(new CancellationException("Future.cancel() was called."), z10);
            } else {
                aVar = z10 ? a.f2191c : a.d;
            }
            if (f2207f.b(this, obj, aVar)) {
                e(this);
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        g gVar = g.f2203c;
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f2208a;
        if (obj != null) {
            return g(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar2 = this.f2210c;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                while (true) {
                    h0 h0Var = f2207f;
                    h0Var.d(gVar3, gVar2);
                    if (h0Var.c(this, gVar2, gVar3)) {
                        while (true) {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                j(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f2208a;
                            if (obj2 != null) {
                                return g(obj2);
                            }
                            long jNanoTime2 = jNanoTime - System.nanoTime();
                            if (jNanoTime2 < 1000) {
                                j(gVar3);
                                nanos = jNanoTime2;
                                break;
                            }
                            nanos = jNanoTime2;
                        }
                    } else {
                        gVar2 = this.f2210c;
                        if (gVar2 == gVar) {
                        }
                    }
                }
            }
            return g(this.f2208a);
        }
        while (nanos > 0) {
            Object obj3 = this.f2208a;
            if (obj3 != null) {
                return g(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbQ = p.q(j10, "Waited ", " ");
        sbQ.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbQ.toString();
        if (nanos + 1000 < 0) {
            String strL = s3.c.l(string3, " (plus ");
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strL2 = strL + jConvert + " " + lowerCase;
                if (z10) {
                    strL2 = s3.c.l(strL2, ",");
                }
                strL = s3.c.l(strL2, " ");
            }
            if (z10) {
                strL = strL + nanos2 + " nanoseconds ";
            }
            string3 = s3.c.l(strL, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(s3.c.l(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(p.w(string3, " for ", string));
    }

    public String i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override
    public final boolean isCancelled() {
        return this.f2208a instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f2208a != null;
    }

    public final void j(g gVar) {
        gVar.f2204a = null;
        while (true) {
            g gVar2 = this.f2210c;
            if (gVar2 == g.f2203c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f2205b;
                if (gVar2.f2204a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f2205b = gVar4;
                    if (gVar3.f2204a == null) {
                    }
                } else if (!f2207f.c(this, gVar2, gVar4)) {
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    public boolean k(Object obj) {
        if (obj == null) {
            obj = h;
        }
        if (!f2207f.b(this, null, obj)) {
            return false;
        }
        e(this);
        return true;
    }

    public boolean l(Throwable th) {
        if (!f2207f.b(this, null, new c(th))) {
            return false;
        }
        e(this);
        return true;
    }

    public final String toString() {
        String strI;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f2208a instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                strI = i();
            } catch (RuntimeException e9) {
                strI = "Exception thrown from implementation: " + e9.getClass();
            }
            if (strI != null && !strI.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strI);
                sb2.append("]");
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void d() {
    }

    @Override
    public final Object get() throws InterruptedException {
        Object obj;
        g gVar = g.f2203c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f2208a;
            if (obj2 != null) {
                return g(obj2);
            }
            g gVar2 = this.f2210c;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    h0 h0Var = f2207f;
                    h0Var.d(gVar3, gVar2);
                    if (h0Var.c(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f2208a;
                            } else {
                                j(gVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return g(obj);
                    }
                    gVar2 = this.f2210c;
                } while (gVar2 != gVar);
            }
            return g(this.f2208a);
        }
        throw new InterruptedException();
    }
}
