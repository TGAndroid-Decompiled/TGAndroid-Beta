package defpackage;

import j$.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
public final class jtd extends rod implements prd {
    public prd n;
    public ScheduledFuture r;

    public static Object e(Object obj) {
        if (!(obj instanceof znd)) {
            if (obj instanceof cod) {
                Throwable th = ((cod) obj).a;
                if (th == null) {
                    rod.e.c().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "getDoneValue", "Failure.exception is unexpectedly null.");
                    throw new ExecutionException(cod.c.a);
                }
                throw new ExecutionException(th);
            } else if (obj == rod.d) {
                return null;
            } else {
                return obj;
            }
        }
        RuntimeException runtimeException = ((znd) obj).b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(runtimeException);
        throw cancellationException;
    }

    public static boolean g(Object obj) {
        if (!(obj instanceof aod)) {
            return true;
        }
        return false;
    }

    public static Object h(prd prdVar) {
        Object obj;
        Throwable d;
        if (prdVar instanceof jtd) {
            Object obj2 = ((jtd) prdVar).a;
            if (obj2 instanceof znd) {
                znd zndVar = (znd) obj2;
                if (zndVar.a) {
                    RuntimeException runtimeException = zndVar.b;
                    obj2 = runtimeException != null ? new znd(false, runtimeException) : znd.d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        } else if ((prdVar instanceof rod) && (d = ((rod) prdVar).d()) != null) {
            return new cod(d);
        } else {
            boolean isCancelled = prdVar.isCancelled();
            boolean z = true;
            if ((!rod.f) & isCancelled) {
                znd zndVar2 = znd.d;
                Objects.requireNonNull(zndVar2);
                return zndVar2;
            }
            boolean z2 = false;
            while (true) {
                try {
                    try {
                        obj = prdVar.get();
                        break;
                    } catch (InterruptedException unused) {
                        z2 = z;
                    } catch (Throwable th) {
                        if (z2) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (Error e) {
                    e = e;
                    return new cod(e);
                } catch (CancellationException e2) {
                    if (!isCancelled) {
                        return new cod(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(prdVar)), e2));
                    }
                    return new znd(false, e2);
                } catch (ExecutionException e3) {
                    if (isCancelled) {
                        return new znd(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(prdVar)), e3));
                    }
                    return new cod(e3.getCause());
                } catch (Exception e4) {
                    e = e4;
                    return new cod(e);
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
            if (isCancelled) {
                return new znd(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(prdVar))));
            }
            if (obj == null) {
                return rod.d;
            }
            return obj;
        }
    }

    public static void j(jtd jtdVar) {
        boolean z;
        dod dodVar;
        dod dodVar2 = null;
        while (true) {
            jtdVar.getClass();
            for (lod b = rod.h.b(jtdVar); b != null; b = b.b) {
                Thread thread = b.a;
                if (thread != null) {
                    b.a = null;
                    LockSupport.unpark(thread);
                }
            }
            prd prdVar = jtdVar.n;
            boolean z2 = jtdVar.a instanceof znd;
            boolean z3 = true;
            if (prdVar != null) {
                z = true;
            } else {
                z = false;
            }
            if (z & z2) {
                Object obj = jtdVar.a;
                prdVar.cancel(((obj instanceof znd) && ((znd) obj).a) ? false : false);
            }
            ScheduledFuture scheduledFuture = jtdVar.r;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            jtdVar.n = null;
            jtdVar.r = null;
            dod dodVar3 = dodVar2;
            dod a = rod.h.a(jtdVar);
            dod dodVar4 = dodVar3;
            while (a != null) {
                dod dodVar5 = a.c;
                a.c = dodVar4;
                dodVar4 = a;
                a = dodVar5;
            }
            while (dodVar4 != null) {
                Runnable runnable = dodVar4.a;
                dodVar = dodVar4.c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof aod) {
                    aod aodVar = (aod) runnable;
                    jtdVar = aodVar.a;
                    if (jtdVar.a == aodVar) {
                        if (rod.h.f(jtdVar, aodVar, h(aodVar.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = dodVar4.b;
                    Objects.requireNonNull(executor);
                    k(runnable, executor);
                }
                dodVar4 = dodVar;
            }
            return;
            dodVar2 = dodVar;
        }
    }

    public static void k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            rod.e.c().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", qd4.q("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override
    public final void c(Runnable runnable, Executor executor) {
        dod dodVar;
        dod dodVar2 = dod.d;
        if (executor != null) {
            if (!isDone() && (dodVar = this.b) != dodVar2) {
                dod dodVar3 = new dod(runnable, executor);
                do {
                    dodVar3.c = dodVar;
                    if (!rod.h.e(this, dodVar, dodVar3)) {
                        dodVar = this.b;
                    } else {
                        return;
                    }
                } while (dodVar != dodVar2);
                k(runnable, executor);
                return;
            }
            k(runnable, executor);
            return;
        }
        p3d.h("Executor was null.");
    }

    @Override
    public final boolean cancel(boolean z) {
        boolean z2;
        znd zndVar;
        boolean z3;
        Object obj = this.a;
        boolean z4 = obj instanceof aod;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z2 | z4)) {
            return false;
        }
        if (rod.f) {
            zndVar = new znd(z, new CancellationException("Future.cancel() was called."));
        } else {
            if (z) {
                zndVar = znd.c;
            } else {
                zndVar = znd.d;
            }
            Objects.requireNonNull(zndVar);
        }
        boolean z5 = false;
        while (true) {
            if (rod.h.f(this, obj, zndVar)) {
                j(this);
                if (!(obj instanceof aod)) {
                    break;
                }
                prd prdVar = ((aod) obj).b;
                if (prdVar instanceof jtd) {
                    this = (jtd) prdVar;
                    obj = this.a;
                    if (obj == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && !(obj instanceof aod)) {
                        break;
                    }
                    z5 = true;
                } else {
                    prdVar.cancel(z);
                    break;
                }
            } else {
                obj = this.a;
                if (g(obj)) {
                    return z5;
                }
            }
        }
        return true;
    }

    @Override
    public final Throwable d() {
        if (this instanceof jtd) {
            Object obj = this.a;
            if (obj instanceof cod) {
                return ((cod) obj).a;
            }
            return null;
        }
        return null;
    }

    public final String f() {
        prd prdVar = this.n;
        ScheduledFuture scheduledFuture = this.r;
        if (prdVar != null) {
            String y = qd4.y("inputFuture=[", prdVar.toString(), "]");
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    return y + ", remaining delay=[" + delay + " ms]";
                }
            }
            return y;
        }
        return null;
    }

    @Override
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jtd.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final void i(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb.append("]");
    }

    @Override
    public final boolean isCancelled() {
        return this.a instanceof znd;
    }

    @Override
    public final boolean isDone() {
        boolean z;
        Object obj = this.a;
        boolean g = g(obj);
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        return z & g;
    }

    public final java.lang.String toString() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jtd.toString():java.lang.String");
    }

    @Override
    public final Object get() {
        Object obj;
        lod lodVar = lod.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) && g(obj2)) {
                return e(obj2);
            }
            lod lodVar2 = this.c;
            if (lodVar2 != lodVar) {
                lod lodVar3 = new lod();
                do {
                    o5f o5fVar = rod.h;
                    o5fVar.c(lodVar3, lodVar2);
                    if (o5fVar.g(this, lodVar2, lodVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                a(lodVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & g(obj)));
                        return e(obj);
                    }
                    lodVar2 = this.c;
                } while (lodVar2 != lodVar);
                Object obj3 = this.a;
                Objects.requireNonNull(obj3);
                return e(obj3);
            }
            Object obj32 = this.a;
            Objects.requireNonNull(obj32);
            return e(obj32);
        }
        throw new InterruptedException();
    }
}
