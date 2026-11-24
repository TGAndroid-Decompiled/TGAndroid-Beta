package defpackage;

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
public class a7f implements bpd {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(a7f.class.getName());
    public static final g3f f;
    public static final Object h;
    public volatile Object a;
    public volatile hee b;
    public volatile a2f c;

    static {
        uoe uoeVar;
        try {
            th = null;
            uoeVar = new uoe(AtomicReferenceFieldUpdater.newUpdater(a2f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(a2f.class, a2f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a7f.class, a2f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a7f.class, hee.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a7f.class, Object.class, "a"));
        } catch (Throwable th) {
            th = th;
            uoeVar = new Object();
        }
        Throwable th2 = th;
        f = uoeVar;
        if (th2 != null) {
            e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        h = new Object();
    }

    public static void d(a7f a7fVar) {
        a2f a2fVar;
        g3f g3fVar;
        hee heeVar;
        hee heeVar2;
        hee heeVar3;
        do {
            a2fVar = a7fVar.c;
            g3fVar = f;
        } while (!g3fVar.e(a7fVar, a2fVar, a2f.c));
        while (true) {
            heeVar = null;
            if (a2fVar == null) {
                break;
            }
            Thread thread = a2fVar.a;
            if (thread != null) {
                a2fVar.a = null;
                LockSupport.unpark(thread);
            }
            a2fVar = a2fVar.b;
        }
        do {
            heeVar2 = a7fVar.b;
        } while (!g3fVar.c(a7fVar, heeVar2, hee.d));
        while (true) {
            heeVar3 = heeVar;
            heeVar = heeVar2;
            if (heeVar == null) {
                break;
            }
            heeVar2 = heeVar.c;
            heeVar.c = heeVar3;
        }
        while (heeVar3 != null) {
            Runnable runnable = heeVar3.a;
            hee heeVar4 = heeVar3.c;
            f(runnable, heeVar3.b);
            heeVar3 = heeVar4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", td4.r("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e2);
        }
    }

    public static final Object h(Object obj) {
        if (!(obj instanceof kvd)) {
            if (!(obj instanceof c8e)) {
                if (obj == h) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((c8e) obj).a);
        }
        CancellationException cancellationException = ((kvd) obj).a;
        CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
        cancellationException2.initCause(cancellationException);
        throw cancellationException2;
    }

    public String a() {
        if (this instanceof ScheduledFuture) {
            return wi8.n(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override
    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        hee heeVar = this.b;
        hee heeVar2 = hee.d;
        if (heeVar != heeVar2) {
            hee heeVar3 = new hee(runnable, executor);
            do {
                heeVar3.c = heeVar;
                if (f.c(this, heeVar, heeVar3)) {
                    return;
                }
                heeVar = this.b;
            } while (heeVar != heeVar2);
            f(runnable, executor);
        }
        f(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z) {
        kvd kvdVar;
        Object obj = this.a;
        if (obj == null) {
            if (d) {
                kvdVar = new kvd(new CancellationException("Future.cancel() was called."));
            } else if (z) {
                kvdVar = kvd.b;
            } else {
                kvdVar = kvd.c;
            }
            if (f.d(this, obj, kvdVar)) {
                d(this);
                return true;
            }
            return false;
        }
        return false;
    }

    public final void e(StringBuilder sb) {
        Object obj;
        String valueOf;
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
            } catch (RuntimeException e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e3) {
                sb.append("FAILURE, cause=[");
                sb.append(e3.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == this) {
            valueOf = "this future";
        } else {
            valueOf = String.valueOf(obj);
        }
        sb.append(valueOf);
        sb.append("]");
    }

    public final void g(a2f a2fVar) {
        a2fVar.a = null;
        while (true) {
            a2f a2fVar2 = this.c;
            if (a2fVar2 != a2f.c) {
                a2f a2fVar3 = null;
                while (a2fVar2 != null) {
                    a2f a2fVar4 = a2fVar2.b;
                    if (a2fVar2.a != null) {
                        a2fVar3 = a2fVar2;
                    } else if (a2fVar3 != null) {
                        a2fVar3.b = a2fVar4;
                        if (a2fVar3.a == null) {
                            break;
                        }
                    } else if (f.e(this, a2fVar2, a2fVar4)) {
                    }
                    a2fVar2 = a2fVar4;
                }
                return;
            }
            return;
        }
    }

    @Override
    public final Object get(long j, TimeUnit timeUnit) {
        long j2;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.a;
            if (obj != null) {
                return h(obj);
            }
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                a2f a2fVar = this.c;
                a2f a2fVar2 = a2f.c;
                if (a2fVar != a2fVar2) {
                    a2f a2fVar3 = new a2f();
                    do {
                        g3f g3fVar = f;
                        g3fVar.a(a2fVar3, a2fVar);
                        if (g3fVar.e(this, a2fVar, a2fVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.a;
                                    if (obj2 != null) {
                                        return h(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    g(a2fVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            g(a2fVar3);
                        } else {
                            a2fVar = this.c;
                        }
                    } while (a2fVar != a2fVar2);
                    return h(this.a);
                }
                return h(this.a);
            }
            while (nanos > 0) {
                Object obj3 = this.a;
                if (obj3 != null) {
                    return h(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = j2 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String a7fVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
                int i = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z = true;
                if (i != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (i > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z) {
                    concat = wi8.n(nanos2, concat, " nanoseconds ");
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(kt6.o(str, " for ", a7fVar));
        }
        throw new InterruptedException();
    }

    @Override
    public final boolean isCancelled() {
        return this.a instanceof kvd;
    }

    @Override
    public final boolean isDone() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof kvd) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            e(sb);
        } else {
            try {
                concat = a();
            } catch (RuntimeException e2) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e2.getClass()));
            }
            if (concat != null && !concat.isEmpty()) {
                wi8.z("PENDING, info=[", concat, "]", sb);
            } else if (isDone()) {
                e(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return h(obj2);
            }
            a2f a2fVar = this.c;
            a2f a2fVar2 = a2f.c;
            if (a2fVar != a2fVar2) {
                a2f a2fVar3 = new a2f();
                do {
                    g3f g3fVar = f;
                    g3fVar.a(a2fVar3, a2fVar);
                    if (g3fVar.e(this, a2fVar, a2fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                g(a2fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return h(obj);
                    }
                    a2fVar = this.c;
                } while (a2fVar != a2fVar2);
                return h(this.a);
            }
            return h(this.a);
        }
        throw new InterruptedException();
    }
}
