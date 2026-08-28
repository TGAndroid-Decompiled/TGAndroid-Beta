package c0;

import f7.k0;
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
public abstract class h implements r8.a {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger f2067e = Logger.getLogger(h.class.getName());
    public static final k0 f2068f;
    public static final Object h;
    public volatile Object f2069a;
    public volatile d f2070b;
    public volatile g f2071c;

    static {
        e eVar;
        try {
            th = null;
            eVar = new e(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "c"), AtomicReferenceFieldUpdater.newUpdater(h.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "a"));
        } catch (Throwable th) {
            th = th;
            eVar = new Object();
        }
        f2068f = eVar;
        if (th != null) {
            f2067e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        h = new Object();
    }

    public static void e(h hVar) {
        g gVar;
        d dVar;
        d dVar2;
        d dVar3;
        do {
            gVar = hVar.f2071c;
        } while (!f2068f.c(hVar, gVar, g.f2064c));
        while (true) {
            dVar = null;
            if (gVar == null) {
                break;
            }
            Thread thread = gVar.f2065a;
            if (thread != null) {
                gVar.f2065a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f2066b;
        }
        hVar.d();
        do {
            dVar2 = hVar.f2070b;
        } while (!f2068f.a(hVar, dVar2, d.d));
        while (true) {
            dVar3 = dVar;
            dVar = dVar2;
            if (dVar == null) {
                break;
            }
            dVar2 = dVar.f2059c;
            dVar.f2059c = dVar3;
        }
        while (dVar3 != null) {
            d dVar4 = dVar3.f2059c;
            f(dVar3.f2057a, dVar3.f2058b);
            dVar3 = dVar4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Level level = Level.SEVERE;
            f2067e.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
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
            throw new ExecutionException(((c) obj).f2056a);
        }
        Throwable th = ((a) obj).f2054b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
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
        String valueOf;
        try {
            Object h10 = h(this);
            sb2.append("SUCCESS, result=[");
            if (h10 == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(h10);
            }
            sb2.append(valueOf);
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f2070b;
        d dVar2 = d.d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f2059c = dVar;
                if (f2068f.a(this, dVar, dVar3)) {
                    return;
                }
                dVar = this.f2070b;
            } while (dVar != dVar2);
            f(runnable, executor);
        }
        f(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        boolean z11;
        a aVar;
        Object obj = this.f2069a;
        if (obj == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (d) {
                aVar = new a(new CancellationException("Future.cancel() was called."), z10);
            } else if (z10) {
                aVar = a.f2052c;
            } else {
                aVar = a.d;
            }
            if (f2068f.b(this, obj, aVar)) {
                e(this);
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object get(long j10, TimeUnit timeUnit) {
        g gVar = g.f2064c;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f2069a;
            if (obj != null) {
                return g(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                g gVar2 = this.f2071c;
                if (gVar2 != gVar) {
                    g gVar3 = new g();
                    do {
                        k0 k0Var = f2068f;
                        k0Var.d(gVar3, gVar2);
                        if (k0Var.c(this, gVar2, gVar3)) {
                            while (true) {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f2069a;
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
                            gVar2 = this.f2071c;
                        }
                    } while (gVar2 != gVar);
                    return g(this.f2069a);
                }
                return g(this.f2069a);
            }
            while (nanos > 0) {
                Object obj3 = this.f2069a;
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
            StringBuilder s10 = aa.d.s(j10, "Waited ", " ");
            s10.append(timeUnit.toString().toLowerCase(locale));
            String sb2 = s10.toString();
            if (nanos + 1000 < 0) {
                String j11 = ta.b.j(sb2, " (plus ");
                long j12 = -nanos;
                long convert = timeUnit.convert(j12, TimeUnit.NANOSECONDS);
                long nanos2 = j12 - timeUnit.toNanos(convert);
                int i9 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z10 = i9 == 0 || nanos2 > 1000;
                if (i9 > 0) {
                    String str = j11 + convert + " " + lowerCase;
                    if (z10) {
                        str = ta.b.j(str, ",");
                    }
                    j11 = ta.b.j(str, " ");
                }
                if (z10) {
                    j11 = j11 + nanos2 + " nanoseconds ";
                }
                sb2 = ta.b.j(j11, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(ta.b.j(sb2, " but future completed as timeout expired"));
            }
            throw new TimeoutException(aa.d.z(sb2, " for ", hVar));
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
        return this.f2069a instanceof a;
    }

    @Override
    public final boolean isDone() {
        if (this.f2069a != null) {
            return true;
        }
        return false;
    }

    public final void j(g gVar) {
        gVar.f2065a = null;
        while (true) {
            g gVar2 = this.f2071c;
            if (gVar2 != g.f2064c) {
                g gVar3 = null;
                while (gVar2 != null) {
                    g gVar4 = gVar2.f2066b;
                    if (gVar2.f2065a != null) {
                        gVar3 = gVar2;
                    } else if (gVar3 != null) {
                        gVar3.f2066b = gVar4;
                        if (gVar3.f2065a == null) {
                            break;
                        }
                    } else if (!f2068f.c(this, gVar2, gVar4)) {
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
        if (f2068f.b(this, null, obj)) {
            e(this);
            return true;
        }
        return false;
    }

    public boolean l(Throwable th) {
        if (f2068f.b(this, null, new c(th))) {
            e(this);
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f2069a instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                str = i();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
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
    public final Object get() {
        Object obj;
        g gVar = g.f2064c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f2069a;
            if (obj2 != null) {
                return g(obj2);
            }
            g gVar2 = this.f2071c;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    k0 k0Var = f2068f;
                    k0Var.d(gVar3, gVar2);
                    if (k0Var.c(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f2069a;
                            } else {
                                j(gVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return g(obj);
                    }
                    gVar2 = this.f2071c;
                } while (gVar2 != gVar);
                return g(this.f2069a);
            }
            return g(this.f2069a);
        }
        throw new InterruptedException();
    }
}
