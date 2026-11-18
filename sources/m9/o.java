package m9;

import c8.s9;
import com.google.android.gms.internal.play_billing.s0;
import j$.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class o extends n9.a implements y {
    public static final boolean d;
    public static final s0 f20948e;
    public static final s9 f20949f;
    public static final Object h;
    public volatile Object f20950a;
    public volatile c f20951b;
    public volatile n f20952c;

    static {
        boolean z10;
        Throwable th2;
        d dVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        d = z10;
        f20948e = new s0(o.class, 1);
        Throwable th3 = null;
        try {
            th2 = null;
            dVar = new Object();
        } catch (Error | Exception e10) {
            th2 = e10;
            try {
                dVar = new d(AtomicReferenceFieldUpdater.newUpdater(n.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(n.class, n.class, "b"), AtomicReferenceFieldUpdater.newUpdater(o.class, n.class, "c"), AtomicReferenceFieldUpdater.newUpdater(o.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "a"));
            } catch (Error | Exception e11) {
                th3 = e11;
                dVar = new Object();
            }
        }
        f20949f = dVar;
        if (th3 != null) {
            s0 s0Var = f20948e;
            Logger a10 = s0Var.a();
            Level level = Level.SEVERE;
            a10.log(level, "UnsafeAtomicHelper is broken!", th2);
            s0Var.a().log(level, "SafeAtomicHelper is broken!", th3);
        }
        h = new Object();
    }

    public static void g(o oVar, boolean z10) {
        c cVar = null;
        while (true) {
            for (n e10 = f20949f.e(oVar); e10 != null; e10 = e10.f20947b) {
                Thread thread = e10.f20946a;
                if (thread != null) {
                    e10.f20946a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z10) {
                z10 = false;
            }
            oVar.d();
            c cVar2 = cVar;
            c d2 = f20949f.d(oVar);
            c cVar3 = cVar2;
            while (d2 != null) {
                c cVar4 = d2.f20927c;
                d2.f20927c = cVar3;
                cVar3 = d2;
                d2 = cVar4;
            }
            while (cVar3 != null) {
                cVar = cVar3.f20927c;
                Runnable runnable = cVar3.f20925a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof e) {
                    e eVar = (e) runnable;
                    oVar = eVar.f20934a;
                    if (oVar.f20950a == eVar) {
                        if (f20949f.b(oVar, eVar, j(eVar.f20935b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = cVar3.f20926b;
                    Objects.requireNonNull(executor);
                    h(runnable, executor);
                }
                cVar3 = cVar;
            }
            return;
        }
    }

    public static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            Logger a10 = f20948e.a();
            Level level = Level.SEVERE;
            a10.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object i(Object obj) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof b)) {
                if (obj == h) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((b) obj).f20922a);
        }
        Throwable th2 = ((a) obj).f20919b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th2);
        throw cancellationException;
    }

    public static java.lang.Object j(m9.y r6) {
        throw new UnsupportedOperationException("Method not decompiled: m9.o.j(m9.y):java.lang.Object");
    }

    public final void a(StringBuilder sb2) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (ExecutionException e10) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e10.getCause());
                sb2.append("]");
                return;
            } catch (Exception e11) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e11.getClass());
                sb2.append(" thrown from get()]");
                return;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        f(sb2, obj);
        sb2.append("]");
    }

    @Override
    public void b(Runnable runnable, Executor executor) {
        c cVar;
        c cVar2 = c.d;
        if (!isDone() && (cVar = this.f20951b) != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f20927c = cVar;
                if (f20949f.a(this, cVar, cVar3)) {
                    return;
                }
                cVar = this.f20951b;
            } while (cVar != cVar2);
            h(runnable, executor);
        }
        h(runnable, executor);
    }

    @Override
    public boolean cancel(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: m9.o.cancel(boolean):boolean");
    }

    public final void f(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append("null");
        } else if (obj == this) {
            sb2.append("this future");
        } else {
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override
    public java.lang.Object get(long r21, java.util.concurrent.TimeUnit r23) {
        throw new UnsupportedOperationException("Method not decompiled: m9.o.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public boolean isCancelled() {
        return this.f20950a instanceof a;
    }

    @Override
    public boolean isDone() {
        Object obj;
        boolean z10;
        if (this.f20950a != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return (!(obj instanceof e)) & z10;
    }

    public String k() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public final void l(n nVar) {
        nVar.f20946a = null;
        while (true) {
            n nVar2 = this.f20952c;
            if (nVar2 != n.f20945c) {
                n nVar3 = null;
                while (nVar2 != null) {
                    n nVar4 = nVar2.f20947b;
                    if (nVar2.f20946a != null) {
                        nVar3 = nVar2;
                    } else if (nVar3 != null) {
                        nVar3.f20947b = nVar4;
                        if (nVar3.f20946a == null) {
                            break;
                        }
                    } else if (!f20949f.c(this, nVar2, nVar4)) {
                        break;
                    }
                    nVar2 = nVar4;
                }
                return;
            }
            return;
        }
    }

    public boolean m(Object obj) {
        if (obj == null) {
            obj = h;
        }
        if (!f20949f.b(this, null, obj)) {
            return false;
        }
        g(this, false);
        return true;
    }

    public boolean n(Throwable th2) {
        th2.getClass();
        if (!f20949f.b(this, null, new b(th2))) {
            return false;
        }
        g(this, false);
        return true;
    }

    public boolean o(y yVar) {
        b bVar;
        yVar.getClass();
        Object obj = this.f20950a;
        if (obj == null) {
            if (yVar.isDone()) {
                if (f20949f.b(this, null, j(yVar))) {
                    g(this, false);
                    return true;
                }
                return false;
            }
            e eVar = new e(this, yVar);
            if (f20949f.b(this, null, eVar)) {
                try {
                    yVar.b(eVar, r.f20955a);
                    return true;
                } catch (Throwable th2) {
                    try {
                        bVar = new b(th2);
                    } catch (Error | Exception unused) {
                        bVar = b.f20921b;
                    }
                    f20949f.b(this, eVar, bVar);
                    return true;
                }
            }
            obj = this.f20950a;
        }
        if (obj instanceof a) {
            yVar.cancel(((a) obj).f20918a);
        }
        return false;
    }

    public final java.lang.String toString() {
        throw new UnsupportedOperationException("Method not decompiled: m9.o.toString():java.lang.String");
    }

    public void d() {
    }

    @Override
    public Object get() {
        Object obj;
        n nVar = n.f20945c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f20950a;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return i(obj2);
            }
            n nVar2 = this.f20952c;
            if (nVar2 != nVar) {
                n nVar3 = new n();
                do {
                    s9 s9Var = f20949f;
                    s9Var.f(nVar3, nVar2);
                    if (s9Var.c(this, nVar2, nVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f20950a;
                            } else {
                                l(nVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return i(obj);
                    }
                    nVar2 = this.f20952c;
                } while (nVar2 != nVar);
                Object obj3 = this.f20950a;
                Objects.requireNonNull(obj3);
                return i(obj3);
            }
            Object obj32 = this.f20950a;
            Objects.requireNonNull(obj32);
            return i(obj32);
        }
        throw new InterruptedException();
    }
}
