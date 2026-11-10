package m9;

import c8.r9;
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
    public static final s0 f19992e;
    public static final r9 f19993f;
    public static final Object h;
    public volatile Object f19994a;
    public volatile c f19995b;
    public volatile n f19996c;

    static {
        boolean z9;
        Throwable th2;
        d dVar;
        try {
            z9 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z9 = false;
        }
        d = z9;
        f19992e = new s0(o.class, 1);
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
        f19993f = dVar;
        if (th3 != null) {
            s0 s0Var = f19992e;
            Logger a10 = s0Var.a();
            Level level = Level.SEVERE;
            a10.log(level, "UnsafeAtomicHelper is broken!", th2);
            s0Var.a().log(level, "SafeAtomicHelper is broken!", th3);
        }
        h = new Object();
    }

    public static void g(o oVar, boolean z9) {
        c cVar = null;
        while (true) {
            for (n e10 = f19993f.e(oVar); e10 != null; e10 = e10.f19991b) {
                Thread thread = e10.f19990a;
                if (thread != null) {
                    e10.f19990a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z9) {
                z9 = false;
            }
            oVar.d();
            c cVar2 = cVar;
            c d2 = f19993f.d(oVar);
            c cVar3 = cVar2;
            while (d2 != null) {
                c cVar4 = d2.f19971c;
                d2.f19971c = cVar3;
                cVar3 = d2;
                d2 = cVar4;
            }
            while (cVar3 != null) {
                cVar = cVar3.f19971c;
                Runnable runnable = cVar3.f19969a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof e) {
                    e eVar = (e) runnable;
                    oVar = eVar.f19978a;
                    if (oVar.f19994a == eVar) {
                        if (f19993f.b(oVar, eVar, j(eVar.f19979b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = cVar3.f19970b;
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
            Logger a10 = f19992e.a();
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
            throw new ExecutionException(((b) obj).f19966a);
        }
        Throwable th2 = ((a) obj).f19963b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th2);
        throw cancellationException;
    }

    public static java.lang.Object j(m9.y r6) {
        throw new UnsupportedOperationException("Method not decompiled: m9.o.j(m9.y):java.lang.Object");
    }

    public final void a(StringBuilder sb2) {
        Object obj;
        boolean z9 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z9 = true;
                } catch (Throwable th2) {
                    if (z9) {
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
        if (z9) {
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
        if (!isDone() && (cVar = this.f19995b) != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f19971c = cVar;
                if (f19993f.a(this, cVar, cVar3)) {
                    return;
                }
                cVar = this.f19995b;
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
        return this.f19994a instanceof a;
    }

    @Override
    public boolean isDone() {
        Object obj;
        boolean z9;
        if (this.f19994a != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        return (!(obj instanceof e)) & z9;
    }

    public String k() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public final void l(n nVar) {
        nVar.f19990a = null;
        while (true) {
            n nVar2 = this.f19996c;
            if (nVar2 != n.f19989c) {
                n nVar3 = null;
                while (nVar2 != null) {
                    n nVar4 = nVar2.f19991b;
                    if (nVar2.f19990a != null) {
                        nVar3 = nVar2;
                    } else if (nVar3 != null) {
                        nVar3.f19991b = nVar4;
                        if (nVar3.f19990a == null) {
                            break;
                        }
                    } else if (!f19993f.c(this, nVar2, nVar4)) {
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
        if (!f19993f.b(this, null, obj)) {
            return false;
        }
        g(this, false);
        return true;
    }

    public boolean n(Throwable th2) {
        th2.getClass();
        if (!f19993f.b(this, null, new b(th2))) {
            return false;
        }
        g(this, false);
        return true;
    }

    public boolean o(y yVar) {
        b bVar;
        yVar.getClass();
        Object obj = this.f19994a;
        if (obj == null) {
            if (yVar.isDone()) {
                if (f19993f.b(this, null, j(yVar))) {
                    g(this, false);
                    return true;
                }
                return false;
            }
            e eVar = new e(this, yVar);
            if (f19993f.b(this, null, eVar)) {
                try {
                    yVar.b(eVar, r.f19999a);
                    return true;
                } catch (Throwable th2) {
                    try {
                        bVar = new b(th2);
                    } catch (Error | Exception unused) {
                        bVar = b.f19965b;
                    }
                    f19993f.b(this, eVar, bVar);
                    return true;
                }
            }
            obj = this.f19994a;
        }
        if (obj instanceof a) {
            yVar.cancel(((a) obj).f19962a);
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
        n nVar = n.f19989c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f19994a;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return i(obj2);
            }
            n nVar2 = this.f19996c;
            if (nVar2 != nVar) {
                n nVar3 = new n();
                do {
                    r9 r9Var = f19993f;
                    r9Var.f(nVar3, nVar2);
                    if (r9Var.c(this, nVar2, nVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f19994a;
                            } else {
                                l(nVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return i(obj);
                    }
                    nVar2 = this.f19996c;
                } while (nVar2 != nVar);
                Object obj3 = this.f19994a;
                Objects.requireNonNull(obj3);
                return i(obj3);
            }
            Object obj32 = this.f19994a;
            Objects.requireNonNull(obj32);
            return i(obj32);
        }
        throw new InterruptedException();
    }
}
