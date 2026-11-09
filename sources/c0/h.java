package c0;

import a8.n7;
import a8.p0;
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
import m9.y;
public abstract class h implements y {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger f5233e = Logger.getLogger(h.class.getName());
    public static final n7 f5234f;
    public static final Object h;
    public volatile Object f5235a;
    public volatile d f5236b;
    public volatile g f5237c;

    static {
        e eVar;
        try {
            th = null;
            eVar = new e(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "c"), AtomicReferenceFieldUpdater.newUpdater(h.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "a"));
        } catch (Throwable th2) {
            th = th2;
            eVar = new Object();
        }
        f5234f = eVar;
        if (th != null) {
            f5233e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        h = new Object();
    }

    public static void e(h hVar) {
        g gVar;
        d dVar;
        d dVar2;
        d dVar3;
        do {
            gVar = hVar.f5237c;
        } while (!f5234f.c(hVar, gVar, g.f5230c));
        while (true) {
            dVar = null;
            if (gVar == null) {
                break;
            }
            Thread thread = gVar.f5231a;
            if (thread != null) {
                gVar.f5231a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f5232b;
        }
        hVar.d();
        do {
            dVar2 = hVar.f5236b;
        } while (!f5234f.a(hVar, dVar2, d.d));
        while (true) {
            dVar3 = dVar;
            dVar = dVar2;
            if (dVar == null) {
                break;
            }
            dVar2 = dVar.f5225c;
            dVar.f5225c = dVar3;
        }
        while (dVar3 != null) {
            d dVar4 = dVar3.f5225c;
            f(dVar3.f5223a, dVar3.f5224b);
            dVar3 = dVar4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Level level = Level.SEVERE;
            f5233e.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
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
            throw new ExecutionException(((c) obj).f5222a);
        }
        Throwable th2 = ((a) obj).f5220b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th2);
        throw cancellationException;
    }

    public static Object h(h hVar) {
        Object obj;
        boolean z9 = false;
        while (true) {
            try {
                obj = hVar.get();
                break;
            } catch (InterruptedException unused) {
                z9 = true;
            } catch (Throwable th2) {
                if (z9) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb2) {
        String valueOf;
        try {
            Object h7 = h(this);
            sb2.append("SUCCESS, result=[");
            if (h7 == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(h7);
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

    @Override
    public final void b(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f5236b;
        d dVar2 = d.d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f5225c = dVar;
                if (f5234f.a(this, dVar, dVar3)) {
                    return;
                }
                dVar = this.f5236b;
            } while (dVar != dVar2);
            f(runnable, executor);
        }
        f(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z9) {
        boolean z10;
        a aVar;
        Object obj = this.f5235a;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (d) {
                aVar = new a(new CancellationException("Future.cancel() was called."), z9);
            } else if (z9) {
                aVar = a.f5218c;
            } else {
                aVar = a.d;
            }
            if (f5234f.b(this, obj, aVar)) {
                e(this);
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object get(long j3, TimeUnit timeUnit) {
        g gVar = g.f5230c;
        long nanos = timeUnit.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.f5235a;
            if (obj != null) {
                return g(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                g gVar2 = this.f5237c;
                if (gVar2 != gVar) {
                    g gVar3 = new g();
                    do {
                        n7 n7Var = f5234f;
                        n7Var.d(gVar3, gVar2);
                        if (n7Var.c(this, gVar2, gVar3)) {
                            while (true) {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f5235a;
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
                            gVar2 = this.f5237c;
                        }
                    } while (gVar2 != gVar);
                    return g(this.f5235a);
                }
                return g(this.f5235a);
            }
            while (nanos > 0) {
                Object obj3 = this.f5235a;
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
            StringBuilder t6 = p0.t(j3, "Waited ", " ");
            t6.append(timeUnit.toString().toLowerCase(locale));
            String sb2 = t6.toString();
            if (nanos + 1000 < 0) {
                String r10 = rf.b.r(sb2, " (plus ");
                long j10 = -nanos;
                long convert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
                long nanos2 = j10 - timeUnit.toNanos(convert);
                int i7 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z9 = i7 == 0 || nanos2 > 1000;
                if (i7 > 0) {
                    String str = r10 + convert + " " + lowerCase;
                    if (z9) {
                        str = rf.b.r(str, ",");
                    }
                    r10 = rf.b.r(str, " ");
                }
                if (z9) {
                    r10 = r10 + nanos2 + " nanoseconds ";
                }
                sb2 = rf.b.r(r10, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(rf.b.r(sb2, " but future completed as timeout expired"));
            }
            throw new TimeoutException(p0.D(sb2, " for ", hVar));
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
        return this.f5235a instanceof a;
    }

    @Override
    public final boolean isDone() {
        if (this.f5235a != null) {
            return true;
        }
        return false;
    }

    public final void j(g gVar) {
        gVar.f5231a = null;
        while (true) {
            g gVar2 = this.f5237c;
            if (gVar2 != g.f5230c) {
                g gVar3 = null;
                while (gVar2 != null) {
                    g gVar4 = gVar2.f5232b;
                    if (gVar2.f5231a != null) {
                        gVar3 = gVar2;
                    } else if (gVar3 != null) {
                        gVar3.f5232b = gVar4;
                        if (gVar3.f5231a == null) {
                            break;
                        }
                    } else if (!f5234f.c(this, gVar2, gVar4)) {
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
        if (f5234f.b(this, null, obj)) {
            e(this);
            return true;
        }
        return false;
    }

    public boolean l(Throwable th2) {
        if (f5234f.b(this, null, new c(th2))) {
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
        if (this.f5235a instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
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
                a(sb2);
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
        g gVar = g.f5230c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f5235a;
            if (obj2 != null) {
                return g(obj2);
            }
            g gVar2 = this.f5237c;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    n7 n7Var = f5234f;
                    n7Var.d(gVar3, gVar2);
                    if (n7Var.c(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f5235a;
                            } else {
                                j(gVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return g(obj);
                    }
                    gVar2 = this.f5237c;
                } while (gVar2 != gVar);
                return g(this.f5235a);
            }
            return g(this.f5235a);
        }
        throw new InterruptedException();
    }
}
