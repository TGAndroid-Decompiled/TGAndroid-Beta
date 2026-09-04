package i9;

import com.google.android.gms.internal.play_billing.s0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class u implements w {
    public static final u f11925b = new u(null);
    public static final s0 f11926c = new s0(u.class, 1);
    public final Object f11927a;

    public u(Object obj) {
        this.f11927a = obj;
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e7) {
            Logger a2 = f11926c.a();
            Level level = Level.SEVERE;
            a2.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    @Override
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override
    public final Object get() {
        return this.f11927a;
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
        return super.toString() + "[status=SUCCESS, result=[" + this.f11927a + "]]";
    }

    @Override
    public final Object get(long j3, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f11927a;
    }
}
