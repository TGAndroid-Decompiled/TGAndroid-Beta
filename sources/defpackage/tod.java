package defpackage;

import j$.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
public final class tod extends akd implements ymd {
    public ymd n;
    public ScheduledFuture r;

    public static Object e(Object obj) {
        if (!(obj instanceof ijd)) {
            if (obj instanceof ljd) {
                Throwable th = ((ljd) obj).a;
                if (th == null) {
                    akd.e.c().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "getDoneValue", "Failure.exception is unexpectedly null.");
                    throw new ExecutionException(ljd.c.a);
                }
                throw new ExecutionException(th);
            } else if (obj == akd.d) {
                return null;
            } else {
                return obj;
            }
        }
        RuntimeException runtimeException = ((ijd) obj).b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(runtimeException);
        throw cancellationException;
    }

    public static boolean g(Object obj) {
        if (!(obj instanceof jjd)) {
            return true;
        }
        return false;
    }

    public static Object h(ymd ymdVar) {
        Object obj;
        Throwable d;
        if (ymdVar instanceof tod) {
            Object obj2 = ((tod) ymdVar).a;
            if (obj2 instanceof ijd) {
                ijd ijdVar = (ijd) obj2;
                if (ijdVar.a) {
                    RuntimeException runtimeException = ijdVar.b;
                    obj2 = runtimeException != null ? new ijd(false, runtimeException) : ijd.d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        } else if ((ymdVar instanceof akd) && (d = ((akd) ymdVar).d()) != null) {
            return new ljd(d);
        } else {
            boolean isCancelled = ymdVar.isCancelled();
            boolean z = true;
            if ((!akd.f) & isCancelled) {
                ijd ijdVar2 = ijd.d;
                Objects.requireNonNull(ijdVar2);
                return ijdVar2;
            }
            boolean z2 = false;
            while (true) {
                try {
                    try {
                        obj = ymdVar.get();
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
                    return new ljd(e);
                } catch (CancellationException e2) {
                    if (!isCancelled) {
                        return new ljd(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(ymdVar)), e2));
                    }
                    return new ijd(false, e2);
                } catch (ExecutionException e3) {
                    if (isCancelled) {
                        return new ijd(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(ymdVar)), e3));
                    }
                    return new ljd(e3.getCause());
                } catch (Exception e4) {
                    e = e4;
                    return new ljd(e);
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
            if (isCancelled) {
                return new ijd(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(ymdVar))));
            }
            if (obj == null) {
                return akd.d;
            }
            return obj;
        }
    }

    public static void j(tod todVar) {
        boolean z;
        mjd mjdVar;
        mjd mjdVar2 = null;
        while (true) {
            todVar.getClass();
            for (ujd b = akd.h.b(todVar); b != null; b = b.b) {
                Thread thread = b.a;
                if (thread != null) {
                    b.a = null;
                    LockSupport.unpark(thread);
                }
            }
            ymd ymdVar = todVar.n;
            boolean z2 = todVar.a instanceof ijd;
            boolean z3 = true;
            if (ymdVar != null) {
                z = true;
            } else {
                z = false;
            }
            if (z & z2) {
                Object obj = todVar.a;
                ymdVar.cancel(((obj instanceof ijd) && ((ijd) obj).a) ? false : false);
            }
            ScheduledFuture scheduledFuture = todVar.r;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            todVar.n = null;
            todVar.r = null;
            mjd mjdVar3 = mjdVar2;
            mjd a = akd.h.a(todVar);
            mjd mjdVar4 = mjdVar3;
            while (a != null) {
                mjd mjdVar5 = a.c;
                a.c = mjdVar4;
                mjdVar4 = a;
                a = mjdVar5;
            }
            while (mjdVar4 != null) {
                Runnable runnable = mjdVar4.a;
                mjdVar = mjdVar4.c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof jjd) {
                    jjd jjdVar = (jjd) runnable;
                    todVar = jjdVar.a;
                    if (todVar.a == jjdVar) {
                        if (akd.h.f(todVar, jjdVar, h(jjdVar.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = mjdVar4.b;
                    Objects.requireNonNull(executor);
                    k(runnable, executor);
                }
                mjdVar4 = mjdVar;
            }
            return;
            mjdVar2 = mjdVar;
        }
    }

    public static void k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            akd.e.c().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", tb4.q("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override
    public final void c(Runnable runnable, Executor executor) {
        mjd mjdVar;
        mjd mjdVar2 = mjd.d;
        if (executor != null) {
            if (!isDone() && (mjdVar = this.b) != mjdVar2) {
                mjd mjdVar3 = new mjd(runnable, executor);
                do {
                    mjdVar3.c = mjdVar;
                    if (!akd.h.e(this, mjdVar, mjdVar3)) {
                        mjdVar = this.b;
                    } else {
                        return;
                    }
                } while (mjdVar != mjdVar2);
                k(runnable, executor);
                return;
            }
            k(runnable, executor);
            return;
        }
        fvc.f("Executor was null.");
    }

    @Override
    public final boolean cancel(boolean z) {
        boolean z2;
        ijd ijdVar;
        boolean z3;
        Object obj = this.a;
        boolean z4 = obj instanceof jjd;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z2 | z4)) {
            return false;
        }
        if (akd.f) {
            ijdVar = new ijd(z, new CancellationException("Future.cancel() was called."));
        } else {
            if (z) {
                ijdVar = ijd.c;
            } else {
                ijdVar = ijd.d;
            }
            Objects.requireNonNull(ijdVar);
        }
        boolean z5 = false;
        while (true) {
            if (akd.h.f(this, obj, ijdVar)) {
                j(this);
                if (!(obj instanceof jjd)) {
                    break;
                }
                ymd ymdVar = ((jjd) obj).b;
                if (ymdVar instanceof tod) {
                    this = (tod) ymdVar;
                    obj = this.a;
                    if (obj == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && !(obj instanceof jjd)) {
                        break;
                    }
                    z5 = true;
                } else {
                    ymdVar.cancel(z);
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
        if (this instanceof tod) {
            Object obj = this.a;
            if (obj instanceof ljd) {
                return ((ljd) obj).a;
            }
            return null;
        }
        return null;
    }

    public final String f() {
        ymd ymdVar = this.n;
        ScheduledFuture scheduledFuture = this.r;
        if (ymdVar != null) {
            String y = tb4.y("inputFuture=[", ymdVar.toString(), "]");
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tod.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
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
        return this.a instanceof ijd;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tod.toString():java.lang.String");
    }

    @Override
    public final Object get() {
        Object obj;
        ujd ujdVar = ujd.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) && g(obj2)) {
                return e(obj2);
            }
            ujd ujdVar2 = this.c;
            if (ujdVar2 != ujdVar) {
                ujd ujdVar3 = new ujd();
                do {
                    v0f v0fVar = akd.h;
                    v0fVar.c(ujdVar3, ujdVar2);
                    if (v0fVar.g(this, ujdVar2, ujdVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                a(ujdVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & g(obj)));
                        return e(obj);
                    }
                    ujdVar2 = this.c;
                } while (ujdVar2 != ujdVar);
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
