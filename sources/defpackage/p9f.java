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
public class p9f implements prd {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(p9f.class.getName());
    public static final x5f f;
    public static final Object h;
    public volatile Object a;
    public volatile wge b;
    public volatile p4f c;

    static {
        ire ireVar;
        try {
            th = null;
            ireVar = new ire(AtomicReferenceFieldUpdater.newUpdater(p4f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(p4f.class, p4f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(p9f.class, p4f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(p9f.class, wge.class, "b"), AtomicReferenceFieldUpdater.newUpdater(p9f.class, Object.class, "a"));
        } catch (Throwable th) {
            th = th;
            ireVar = new Object();
        }
        Throwable th2 = th;
        f = ireVar;
        if (th2 != null) {
            e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        h = new Object();
    }

    public static void d(p9f p9fVar) {
        p4f p4fVar;
        x5f x5fVar;
        wge wgeVar;
        wge wgeVar2;
        wge wgeVar3;
        do {
            p4fVar = p9fVar.c;
            x5fVar = f;
        } while (!x5fVar.e(p9fVar, p4fVar, p4f.c));
        while (true) {
            wgeVar = null;
            if (p4fVar == null) {
                break;
            }
            Thread thread = p4fVar.a;
            if (thread != null) {
                p4fVar.a = null;
                LockSupport.unpark(thread);
            }
            p4fVar = p4fVar.b;
        }
        do {
            wgeVar2 = p9fVar.b;
        } while (!x5fVar.c(p9fVar, wgeVar2, wge.d));
        while (true) {
            wgeVar3 = wgeVar;
            wgeVar = wgeVar2;
            if (wgeVar == null) {
                break;
            }
            wgeVar2 = wgeVar.c;
            wgeVar.c = wgeVar3;
        }
        while (wgeVar3 != null) {
            Runnable runnable = wgeVar3.a;
            wge wgeVar4 = wgeVar3.c;
            f(runnable, wgeVar3.b);
            wgeVar3 = wgeVar4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", qd4.q("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e2);
        }
    }

    public static final Object h(Object obj) {
        if (!(obj instanceof xxd)) {
            if (!(obj instanceof pae)) {
                if (obj == h) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((pae) obj).a);
        }
        CancellationException cancellationException = ((xxd) obj).a;
        CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
        cancellationException2.initCause(cancellationException);
        throw cancellationException2;
    }

    public String a() {
        if (this instanceof ScheduledFuture) {
            return ik8.n(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override
    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        wge wgeVar = this.b;
        wge wgeVar2 = wge.d;
        if (wgeVar != wgeVar2) {
            wge wgeVar3 = new wge(runnable, executor);
            do {
                wgeVar3.c = wgeVar;
                if (f.c(this, wgeVar, wgeVar3)) {
                    return;
                }
                wgeVar = this.b;
            } while (wgeVar != wgeVar2);
            f(runnable, executor);
        }
        f(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z) {
        xxd xxdVar;
        Object obj = this.a;
        if (obj == null) {
            if (d) {
                xxdVar = new xxd(new CancellationException("Future.cancel() was called."));
            } else if (z) {
                xxdVar = xxd.b;
            } else {
                xxdVar = xxd.c;
            }
            if (f.d(this, obj, xxdVar)) {
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

    public final void g(p4f p4fVar) {
        p4fVar.a = null;
        while (true) {
            p4f p4fVar2 = this.c;
            if (p4fVar2 != p4f.c) {
                p4f p4fVar3 = null;
                while (p4fVar2 != null) {
                    p4f p4fVar4 = p4fVar2.b;
                    if (p4fVar2.a != null) {
                        p4fVar3 = p4fVar2;
                    } else if (p4fVar3 != null) {
                        p4fVar3.b = p4fVar4;
                        if (p4fVar3.a == null) {
                            break;
                        }
                    } else if (f.e(this, p4fVar2, p4fVar4)) {
                    }
                    p4fVar2 = p4fVar4;
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
                p4f p4fVar = this.c;
                p4f p4fVar2 = p4f.c;
                if (p4fVar != p4fVar2) {
                    p4f p4fVar3 = new p4f();
                    do {
                        x5f x5fVar = f;
                        x5fVar.a(p4fVar3, p4fVar);
                        if (x5fVar.e(this, p4fVar, p4fVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.a;
                                    if (obj2 != null) {
                                        return h(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    g(p4fVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            g(p4fVar3);
                        } else {
                            p4fVar = this.c;
                        }
                    } while (p4fVar != p4fVar2);
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
            String p9fVar = toString();
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
                    concat = ik8.n(nanos2, concat, " nanoseconds ");
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(qd4.y(str, " for ", p9fVar));
        }
        throw new InterruptedException();
    }

    @Override
    public final boolean isCancelled() {
        return this.a instanceof xxd;
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
        if (this.a instanceof xxd) {
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
                ik8.z("PENDING, info=[", concat, "]", sb);
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
            p4f p4fVar = this.c;
            p4f p4fVar2 = p4f.c;
            if (p4fVar != p4fVar2) {
                p4f p4fVar3 = new p4f();
                do {
                    x5f x5fVar = f;
                    x5fVar.a(p4fVar3, p4fVar);
                    if (x5fVar.e(this, p4fVar, p4fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                g(p4fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return h(obj);
                    }
                    p4fVar = this.c;
                } while (p4fVar != p4fVar2);
                return h(this.a);
            }
            return h(this.a);
        }
        throw new InterruptedException();
    }
}
