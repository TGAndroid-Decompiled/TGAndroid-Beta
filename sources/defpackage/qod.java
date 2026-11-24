package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
public final class qod implements bpd {
    public static final f26 b = new f26(qod.class, (byte) 3);
    public final Object a;

    public qod(Object obj) {
        this.a = obj;
    }

    @Override
    public final void c(Runnable runnable, Executor executor) {
        if (executor != null) {
            try {
                executor.execute(runnable);
                return;
            } catch (Exception e) {
                b.c().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", td4.r("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e);
                return;
            }
        }
        gxc.d("Executor was null.");
    }

    @Override
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.a;
    }

    @Override
    public final boolean isCancelled() {
        return false;
    }

    @Override
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        String obj = super.toString();
        String obj2 = this.a.toString();
        return obj + "[status=SUCCESS, result=[" + obj2 + "]]";
    }

    @Override
    public final Object get() {
        return this.a;
    }
}
