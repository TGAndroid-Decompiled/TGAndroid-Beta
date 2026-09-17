package c0;

import i9.w;
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
import org.telegram.ui.Cells.p6;
import v7.c5;
public abstract class h implements w {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger f4115e = Logger.getLogger(h.class.getName());
    public static final c5 f4116f;
    public static final Object h;
    public volatile Object f4117a;
    public volatile d f4118b;
    public volatile g f4119c;

    static {
        e eVar;
        try {
            th = null;
            eVar = new e(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "c"), AtomicReferenceFieldUpdater.newUpdater(h.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "a"));
        } catch (Throwable th2) {
            th = th2;
            eVar = new Object();
        }
        f4116f = eVar;
        if (th != null) {
            f4115e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        h = new Object();
    }

    public static void e(h hVar) {
        g gVar;
        d dVar;
        d dVar2;
        d dVar3;
        do {
            gVar = hVar.f4119c;
        } while (!f4116f.c(hVar, gVar, g.f4112c));
        while (true) {
            dVar = null;
            if (gVar == null) {
                break;
            }
            Thread thread = gVar.f4113a;
            if (thread != null) {
                gVar.f4113a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f4114b;
        }
        hVar.d();
        do {
            dVar2 = hVar.f4118b;
        } while (!f4116f.a(hVar, dVar2, d.d));
        while (true) {
            dVar3 = dVar;
            dVar = dVar2;
            if (dVar == null) {
                break;
            }
            dVar2 = dVar.f4107c;
            dVar.f4107c = dVar3;
        }
        while (dVar3 != null) {
            d dVar4 = dVar3.f4107c;
            f(dVar3.f4105a, dVar3.f4106b);
            dVar3 = dVar4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            Level level = Level.SEVERE;
            f4115e.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
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
            throw new ExecutionException(((c) obj).f4104a);
        }
        Throwable th2 = ((a) obj).f4102b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th2);
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
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f4118b;
        d dVar2 = d.d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f4107c = dVar;
                if (f4116f.a(this, dVar, dVar3)) {
                    return;
                }
                dVar = this.f4118b;
            } while (dVar != dVar2);
            f(runnable, executor);
        }
        f(runnable, executor);
    }

    public final void c(StringBuilder sb2) {
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
        } catch (RuntimeException e7) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e7.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        }
    }

    @Override
    public final boolean cancel(boolean z10) {
        boolean z11;
        a aVar;
        Object obj = this.f4117a;
        if (obj == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (d) {
                aVar = new a(new CancellationException("Future.cancel() was called."), z10);
            } else if (z10) {
                aVar = a.f4100c;
            } else {
                aVar = a.d;
            }
            if (f4116f.b(this, obj, aVar)) {
                e(this);
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object get(long j3, TimeUnit timeUnit) {
        g gVar = g.f4112c;
        long nanos = timeUnit.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.f4117a;
            if (obj != null) {
                return g(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                g gVar2 = this.f4119c;
                if (gVar2 != gVar) {
                    g gVar3 = new g();
                    do {
                        c5 c5Var = f4116f;
                        c5Var.d(gVar3, gVar2);
                        if (c5Var.c(this, gVar2, gVar3)) {
                            while (true) {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f4117a;
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
                            gVar2 = this.f4119c;
                        }
                    } while (gVar2 != gVar);
                    return g(this.f4117a);
                }
                return g(this.f4117a);
            }
            while (nanos > 0) {
                Object obj3 = this.f4117a;
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
            StringBuilder t10 = a4.a.t(j3, "Waited ", " ");
            t10.append(timeUnit.toString().toLowerCase(locale));
            String sb2 = t10.toString();
            if (nanos + 1000 < 0) {
                String t11 = p6.t(sb2, " (plus ");
                long j10 = -nanos;
                long convert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
                long nanos2 = j10 - timeUnit.toNanos(convert);
                int i10 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z10 = i10 == 0 || nanos2 > 1000;
                if (i10 > 0) {
                    String str = t11 + convert + " " + lowerCase;
                    if (z10) {
                        str = p6.t(str, ",");
                    }
                    t11 = p6.t(str, " ");
                }
                if (z10) {
                    t11 = t11 + nanos2 + " nanoseconds ";
                }
                sb2 = p6.t(t11, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(p6.t(sb2, " but future completed as timeout expired"));
            }
            throw new TimeoutException(a4.a.C(sb2, " for ", hVar));
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
        return this.f4117a instanceof a;
    }

    @Override
    public final boolean isDone() {
        if (this.f4117a != null) {
            return true;
        }
        return false;
    }

    public final void j(g gVar) {
        gVar.f4113a = null;
        while (true) {
            g gVar2 = this.f4119c;
            if (gVar2 != g.f4112c) {
                g gVar3 = null;
                while (gVar2 != null) {
                    g gVar4 = gVar2.f4114b;
                    if (gVar2.f4113a != null) {
                        gVar3 = gVar2;
                    } else if (gVar3 != null) {
                        gVar3.f4114b = gVar4;
                        if (gVar3.f4113a == null) {
                            break;
                        }
                    } else if (!f4116f.c(this, gVar2, gVar4)) {
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
        if (f4116f.b(this, null, obj)) {
            e(this);
            return true;
        }
        return false;
    }

    public boolean l(Throwable th2) {
        if (f4116f.b(this, null, new c(th2))) {
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
        if (this.f4117a instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            c(sb2);
        } else {
            try {
                str = i();
            } catch (RuntimeException e7) {
                str = "Exception thrown from implementation: " + e7.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                c(sb2);
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
        g gVar = g.f4112c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f4117a;
            if (obj2 != null) {
                return g(obj2);
            }
            g gVar2 = this.f4119c;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    c5 c5Var = f4116f;
                    c5Var.d(gVar3, gVar2);
                    if (c5Var.c(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4117a;
                            } else {
                                j(gVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return g(obj);
                    }
                    gVar2 = this.f4119c;
                } while (gVar2 != gVar);
                return g(this.f4117a);
            }
            return g(this.f4117a);
        }
        throw new InterruptedException();
    }
}
