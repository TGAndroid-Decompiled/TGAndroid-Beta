package i9;

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
import v7.k8;
public abstract class o extends j9.a implements w {
    public static final boolean d;
    public static final s0 f11915e;
    public static final k8 f11916f;
    public static final Object h;
    public volatile Object f11917a;
    public volatile c f11918b;
    public volatile n f11919c;

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
        f11915e = new s0(o.class, 1);
        Throwable th3 = null;
        try {
            th2 = null;
            dVar = new Object();
        } catch (Error | Exception e7) {
            th2 = e7;
            try {
                dVar = new d(AtomicReferenceFieldUpdater.newUpdater(n.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(n.class, n.class, "b"), AtomicReferenceFieldUpdater.newUpdater(o.class, n.class, "c"), AtomicReferenceFieldUpdater.newUpdater(o.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "a"));
            } catch (Error | Exception e10) {
                th3 = e10;
                dVar = new Object();
            }
        }
        f11916f = dVar;
        if (th3 != null) {
            s0 s0Var = f11915e;
            Logger a2 = s0Var.a();
            Level level = Level.SEVERE;
            a2.log(level, "UnsafeAtomicHelper is broken!", th2);
            s0Var.a().log(level, "SafeAtomicHelper is broken!", th3);
        }
        h = new Object();
    }

    public static void g(o oVar, boolean z10) {
        c cVar = null;
        while (true) {
            for (n e7 = f11916f.e(oVar); e7 != null; e7 = e7.f11914b) {
                Thread thread = e7.f11913a;
                if (thread != null) {
                    e7.f11913a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z10) {
                z10 = false;
            }
            oVar.e();
            c cVar2 = cVar;
            c d10 = f11916f.d(oVar);
            c cVar3 = cVar2;
            while (d10 != null) {
                c cVar4 = d10.f11896c;
                d10.f11896c = cVar3;
                cVar3 = d10;
                d10 = cVar4;
            }
            while (cVar3 != null) {
                cVar = cVar3.f11896c;
                Runnable runnable = cVar3.f11894a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof e) {
                    e eVar = (e) runnable;
                    oVar = eVar.f11904a;
                    if (oVar.f11917a == eVar) {
                        if (f11916f.b(oVar, eVar, j(eVar.f11905b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = cVar3.f11895b;
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
        } catch (Exception e7) {
            Logger a2 = f11915e.a();
            Level level = Level.SEVERE;
            a2.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
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
            throw new ExecutionException(((b) obj).f11892a);
        }
        Throwable th2 = ((a) obj).f11889b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th2);
        throw cancellationException;
    }

    public static java.lang.Object j(i9.w r6) {
        throw new UnsupportedOperationException("Method not decompiled: i9.o.j(i9.w):java.lang.Object");
    }

    @Override
    public void a(Runnable runnable, Executor executor) {
        c cVar;
        c cVar2 = c.d;
        if (!isDone() && (cVar = this.f11918b) != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f11896c = cVar;
                if (f11916f.a(this, cVar, cVar3)) {
                    return;
                }
                cVar = this.f11918b;
            } while (cVar != cVar2);
            h(runnable, executor);
        }
        h(runnable, executor);
    }

    public final void c(StringBuilder sb2) {
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
            } catch (ExecutionException e7) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e7.getCause());
                sb2.append("]");
                return;
            } catch (Exception e10) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e10.getClass());
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
    public boolean cancel(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: i9.o.cancel(boolean):boolean");
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
        throw new UnsupportedOperationException("Method not decompiled: i9.o.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public boolean isCancelled() {
        return this.f11917a instanceof a;
    }

    @Override
    public boolean isDone() {
        boolean z10;
        Object obj = this.f11917a;
        if (obj != null) {
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
        nVar.f11913a = null;
        while (true) {
            n nVar2 = this.f11919c;
            if (nVar2 != n.f11912c) {
                n nVar3 = null;
                while (nVar2 != null) {
                    n nVar4 = nVar2.f11914b;
                    if (nVar2.f11913a != null) {
                        nVar3 = nVar2;
                    } else if (nVar3 != null) {
                        nVar3.f11914b = nVar4;
                        if (nVar3.f11913a == null) {
                            break;
                        }
                    } else if (!f11916f.c(this, nVar2, nVar4)) {
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
        if (!f11916f.b(this, null, obj)) {
            return false;
        }
        g(this, false);
        return true;
    }

    public boolean n(Throwable th2) {
        if (!f11916f.b(this, null, new b(th2))) {
            return false;
        }
        g(this, false);
        return true;
    }

    public final java.lang.String toString() {
        throw new UnsupportedOperationException("Method not decompiled: i9.o.toString():java.lang.String");
    }

    public void e() {
    }

    @Override
    public Object get() {
        Object obj;
        n nVar = n.f11912c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f11917a;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return i(obj2);
            }
            n nVar2 = this.f11919c;
            if (nVar2 != nVar) {
                n nVar3 = new n();
                do {
                    k8 k8Var = f11916f;
                    k8Var.f(nVar3, nVar2);
                    if (k8Var.c(this, nVar2, nVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f11917a;
                            } else {
                                l(nVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return i(obj);
                    }
                    nVar2 = this.f11919c;
                } while (nVar2 != nVar);
                Object obj3 = this.f11917a;
                Objects.requireNonNull(obj3);
                return i(obj3);
            }
            Object obj32 = this.f11917a;
            Objects.requireNonNull(obj32);
            return i(obj32);
        }
        throw new InterruptedException();
    }
}
