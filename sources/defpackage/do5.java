package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class do5 implements x76 {
    public static final do5 b = new do5(null);
    public static final j26 c = new j26(do5.class, (byte) 0);
    public final Object a;

    public do5(Object obj) {
        this.a = obj;
    }

    @Override
    public final void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger a = c.a();
            Level level = Level.SEVERE;
            a.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
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
        return super.toString() + "[status=SUCCESS, result=[" + this.a + "]]";
    }

    @Override
    public final Object get() {
        return this.a;
    }
}
