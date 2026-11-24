package defpackage;

import j$.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
public final class wqd extends cmd implements bpd {
    public bpd n;
    public ScheduledFuture r;

    public static Object e(Object obj) {
        if (!(obj instanceof kld)) {
            if (obj instanceof nld) {
                Throwable th = ((nld) obj).a;
                if (th == null) {
                    cmd.e.c().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "getDoneValue", "Failure.exception is unexpectedly null.");
                    throw new ExecutionException(nld.c.a);
                }
                throw new ExecutionException(th);
            } else if (obj == cmd.d) {
                return null;
            } else {
                return obj;
            }
        }
        RuntimeException runtimeException = ((kld) obj).b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(runtimeException);
        throw cancellationException;
    }

    public static boolean g(Object obj) {
        if (!(obj instanceof lld)) {
            return true;
        }
        return false;
    }

    public static Object h(bpd bpdVar) {
        Object obj;
        Throwable d;
        if (bpdVar instanceof wqd) {
            Object obj2 = ((wqd) bpdVar).a;
            if (obj2 instanceof kld) {
                kld kldVar = (kld) obj2;
                if (kldVar.a) {
                    RuntimeException runtimeException = kldVar.b;
                    obj2 = runtimeException != null ? new kld(false, runtimeException) : kld.d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        } else if ((bpdVar instanceof cmd) && (d = ((cmd) bpdVar).d()) != null) {
            return new nld(d);
        } else {
            boolean isCancelled = bpdVar.isCancelled();
            boolean z = true;
            if ((!cmd.f) & isCancelled) {
                kld kldVar2 = kld.d;
                Objects.requireNonNull(kldVar2);
                return kldVar2;
            }
            boolean z2 = false;
            while (true) {
                try {
                    try {
                        obj = bpdVar.get();
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
                    return new nld(e);
                } catch (CancellationException e2) {
                    if (!isCancelled) {
                        return new nld(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(bpdVar)), e2));
                    }
                    return new kld(false, e2);
                } catch (ExecutionException e3) {
                    if (isCancelled) {
                        return new kld(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(bpdVar)), e3));
                    }
                    return new nld(e3.getCause());
                } catch (Exception e4) {
                    e = e4;
                    return new nld(e);
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
            if (isCancelled) {
                return new kld(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(bpdVar))));
            }
            if (obj == null) {
                return cmd.d;
            }
            return obj;
        }
    }

    public static void j(wqd wqdVar) {
        boolean z;
        old oldVar;
        old oldVar2 = null;
        while (true) {
            wqdVar.getClass();
            for (wld b = cmd.h.b(wqdVar); b != null; b = b.b) {
                Thread thread = b.a;
                if (thread != null) {
                    b.a = null;
                    LockSupport.unpark(thread);
                }
            }
            bpd bpdVar = wqdVar.n;
            boolean z2 = wqdVar.a instanceof kld;
            boolean z3 = true;
            if (bpdVar != null) {
                z = true;
            } else {
                z = false;
            }
            if (z & z2) {
                Object obj = wqdVar.a;
                bpdVar.cancel(((obj instanceof kld) && ((kld) obj).a) ? false : false);
            }
            ScheduledFuture scheduledFuture = wqdVar.r;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            wqdVar.n = null;
            wqdVar.r = null;
            old oldVar3 = oldVar2;
            old a = cmd.h.a(wqdVar);
            old oldVar4 = oldVar3;
            while (a != null) {
                old oldVar5 = a.c;
                a.c = oldVar4;
                oldVar4 = a;
                a = oldVar5;
            }
            while (oldVar4 != null) {
                Runnable runnable = oldVar4.a;
                oldVar = oldVar4.c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof lld) {
                    lld lldVar = (lld) runnable;
                    wqdVar = lldVar.a;
                    if (wqdVar.a == lldVar) {
                        if (cmd.h.f(wqdVar, lldVar, h(lldVar.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = oldVar4.b;
                    Objects.requireNonNull(executor);
                    k(runnable, executor);
                }
                oldVar4 = oldVar;
            }
            return;
            oldVar2 = oldVar;
        }
    }

    public static void k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            cmd.e.c().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", td4.r("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override
    public final void c(Runnable runnable, Executor executor) {
        old oldVar;
        old oldVar2 = old.d;
        if (executor != null) {
            if (!isDone() && (oldVar = this.b) != oldVar2) {
                old oldVar3 = new old(runnable, executor);
                do {
                    oldVar3.c = oldVar;
                    if (!cmd.h.e(this, oldVar, oldVar3)) {
                        oldVar = this.b;
                    } else {
                        return;
                    }
                } while (oldVar != oldVar2);
                k(runnable, executor);
                return;
            }
            k(runnable, executor);
            return;
        }
        gxc.d("Executor was null.");
    }

    @Override
    public final boolean cancel(boolean z) {
        boolean z2;
        kld kldVar;
        boolean z3;
        Object obj = this.a;
        boolean z4 = obj instanceof lld;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z2 | z4)) {
            return false;
        }
        if (cmd.f) {
            kldVar = new kld(z, new CancellationException("Future.cancel() was called."));
        } else {
            if (z) {
                kldVar = kld.c;
            } else {
                kldVar = kld.d;
            }
            Objects.requireNonNull(kldVar);
        }
        boolean z5 = false;
        while (true) {
            if (cmd.h.f(this, obj, kldVar)) {
                j(this);
                if (!(obj instanceof lld)) {
                    break;
                }
                bpd bpdVar = ((lld) obj).b;
                if (bpdVar instanceof wqd) {
                    this = (wqd) bpdVar;
                    obj = this.a;
                    if (obj == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && !(obj instanceof lld)) {
                        break;
                    }
                    z5 = true;
                } else {
                    bpdVar.cancel(z);
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
        if (this instanceof wqd) {
            Object obj = this.a;
            if (obj instanceof nld) {
                return ((nld) obj).a;
            }
            return null;
        }
        return null;
    }

    public final String f() {
        bpd bpdVar = this.n;
        ScheduledFuture scheduledFuture = this.r;
        if (bpdVar != null) {
            String o = kt6.o("inputFuture=[", bpdVar.toString(), "]");
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    return o + ", remaining delay=[" + delay + " ms]";
                }
            }
            return o;
        }
        return null;
    }

    @Override
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
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
        return this.a instanceof kld;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.toString():java.lang.String");
    }

    @Override
    public final Object get() {
        Object obj;
        wld wldVar = wld.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) && g(obj2)) {
                return e(obj2);
            }
            wld wldVar2 = this.c;
            if (wldVar2 != wldVar) {
                wld wldVar3 = new wld();
                do {
                    x2f x2fVar = cmd.h;
                    x2fVar.c(wldVar3, wldVar2);
                    if (x2fVar.g(this, wldVar2, wldVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                a(wldVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & g(obj)));
                        return e(obj);
                    }
                    wldVar2 = this.c;
                } while (wldVar2 != wldVar);
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
