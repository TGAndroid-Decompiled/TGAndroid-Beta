package c0;

import j7.h0;
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
import vh.v2;
public abstract class h implements v8.a {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(h.class.getName());
    public static final h0 f1852f;
    public static final Object h;
    public volatile Object f1853a;
    public volatile d f1854b;
    public volatile g f1855c;

    static {
        e eVar;
        try {
            th = null;
            eVar = new e(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "c"), AtomicReferenceFieldUpdater.newUpdater(h.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "a"));
        } catch (Throwable th2) {
            th = th2;
            eVar = new Object();
        }
        f1852f = eVar;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        h = new Object();
    }

    public static void e(h hVar) {
        g gVar;
        d dVar;
        d dVar2;
        d dVar3;
        do {
            gVar = hVar.f1855c;
        } while (!f1852f.c(hVar, gVar, g.f1849c));
        while (true) {
            dVar = null;
            if (gVar == null) {
                break;
            }
            Thread thread = gVar.f1850a;
            if (thread != null) {
                gVar.f1850a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f1851b;
        }
        hVar.d();
        do {
            dVar2 = hVar.f1854b;
        } while (!f1852f.a(hVar, dVar2, d.d));
        while (true) {
            dVar3 = dVar;
            dVar = dVar2;
            if (dVar == null) {
                break;
            }
            dVar2 = dVar.f1845c;
            dVar.f1845c = dVar3;
        }
        while (dVar3 != null) {
            d dVar4 = dVar3.f1845c;
            f(dVar3.f1843a, dVar3.f1844b);
            dVar3 = dVar4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e6) {
            Level level = Level.SEVERE;
            e.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e6);
        }
    }

    public static Object g(Object obj) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof c)) {
                if (obj == h) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((c) obj).f1842a);
        }
        Throwable th2 = ((a) obj).f1840b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th2);
        throw cancellationException;
    }

    public static Object h(h hVar) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                obj = hVar.get();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th2) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void b(StringBuilder sb) {
        String valueOf;
        try {
            Object h9 = h(this);
            sb.append("SUCCESS, result=[");
            if (h9 == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(h9);
            }
            sb.append(valueOf);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e6) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e6.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e10) {
            sb.append("FAILURE, cause=[");
            sb.append(e10.getCause());
            sb.append("]");
        }
    }

    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f1854b;
        d dVar2 = d.d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f1845c = dVar;
                if (f1852f.a(this, dVar, dVar3)) {
                    return;
                }
                dVar = this.f1854b;
            } while (dVar != dVar2);
            f(runnable, executor);
        }
        f(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z4) {
        boolean z10;
        a aVar;
        Object obj = this.f1853a;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (d) {
                aVar = new a(new CancellationException("Future.cancel() was called."), z4);
            } else if (z4) {
                aVar = a.f1838c;
            } else {
                aVar = a.d;
            }
            if (f1852f.b(this, obj, aVar)) {
                e(this);
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object get(long j10, TimeUnit timeUnit) {
        g gVar = g.f1849c;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f1853a;
            if (obj != null) {
                return g(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                g gVar2 = this.f1855c;
                if (gVar2 != gVar) {
                    g gVar3 = new g();
                    do {
                        h0 h0Var = f1852f;
                        h0Var.d(gVar3, gVar2);
                        if (h0Var.c(this, gVar2, gVar3)) {
                            while (true) {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f1853a;
                                    if (obj2 != null) {
                                        return g(obj2);
                                    }
                                    long nanoTime2 = nanoTime - System.nanoTime();
                                    if (nanoTime2 < 1000) {
                                        j(gVar3);
                                        nanos = nanoTime2;
                                        break;
                                    }
                                    nanos = nanoTime2;
                                } else {
                                    j(gVar3);
                                    throw new InterruptedException();
                                }
                            }
                        } else {
                            gVar2 = this.f1855c;
                        }
                    } while (gVar2 != gVar);
                    return g(this.f1853a);
                }
                return g(this.f1853a);
            }
            while (nanos > 0) {
                Object obj3 = this.f1853a;
                if (obj3 != null) {
                    return g(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String hVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            StringBuilder s6 = android.support.v4.media.a.s(j10, "Waited ", " ");
            s6.append(timeUnit.toString().toLowerCase(locale));
            String sb = s6.toString();
            if (nanos + 1000 < 0) {
                String k10 = v2.k(sb, " (plus ");
                long j11 = -nanos;
                long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(convert);
                int i10 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z4 = i10 == 0 || nanos2 > 1000;
                if (i10 > 0) {
                    String str = k10 + convert + " " + lowerCase;
                    if (z4) {
                        str = v2.k(str, ",");
                    }
                    k10 = v2.k(str, " ");
                }
                if (z4) {
                    k10 = k10 + nanos2 + " nanoseconds ";
                }
                sb = v2.k(k10, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(v2.k(sb, " but future completed as timeout expired"));
            }
            throw new TimeoutException(android.support.v4.media.a.z(sb, " for ", hVar));
        }
        throw new InterruptedException();
    }

    public String i() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    @Override
    public final boolean isCancelled() {
        return this.f1853a instanceof a;
    }

    @Override
    public final boolean isDone() {
        if (this.f1853a != null) {
            return true;
        }
        return false;
    }

    public final void j(g gVar) {
        gVar.f1850a = null;
        while (true) {
            g gVar2 = this.f1855c;
            if (gVar2 != g.f1849c) {
                g gVar3 = null;
                while (gVar2 != null) {
                    g gVar4 = gVar2.f1851b;
                    if (gVar2.f1850a != null) {
                        gVar3 = gVar2;
                    } else if (gVar3 != null) {
                        gVar3.f1851b = gVar4;
                        if (gVar3.f1850a == null) {
                            break;
                        }
                    } else if (!f1852f.c(this, gVar2, gVar4)) {
                        break;
                    }
                    gVar2 = gVar4;
                }
                return;
            }
            return;
        }
    }

    public boolean k(Object obj) {
        if (obj == null) {
            obj = h;
        }
        if (f1852f.b(this, null, obj)) {
            e(this);
            return true;
        }
        return false;
    }

    public boolean l(Throwable th2) {
        if (f1852f.b(this, null, new c(th2))) {
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
        if (this.f1853a instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                str = i();
            } catch (RuntimeException e6) {
                str = "Exception thrown from implementation: " + e6.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
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
        g gVar = g.f1849c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f1853a;
            if (obj2 != null) {
                return g(obj2);
            }
            g gVar2 = this.f1855c;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    h0 h0Var = f1852f;
                    h0Var.d(gVar3, gVar2);
                    if (h0Var.c(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f1853a;
                            } else {
                                j(gVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return g(obj);
                    }
                    gVar2 = this.f1855c;
                } while (gVar2 != gVar);
                return g(this.f1853a);
            }
            return g(this.f1853a);
        }
        throw new InterruptedException();
    }
}
