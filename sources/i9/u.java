package i9;

import com.google.android.gms.internal.play_billing.s0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class u implements w {
    public static final u f10538b = new u(null);
    public static final s0 f10539c = new s0(u.class, 1);
    public final Object f10540a;

    public u(Object obj) {
        this.f10540a = obj;
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger a2 = f10539c.a();
            Level level = Level.SEVERE;
            a2.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override
    public final Object get() {
        return this.f10540a;
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
        return super.toString() + "[status=SUCCESS, result=[" + this.f10540a + "]]";
    }

    @Override
    public final Object get(long j3, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f10540a;
    }
}
