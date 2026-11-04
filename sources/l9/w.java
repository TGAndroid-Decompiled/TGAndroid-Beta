package l9;

import com.google.android.gms.internal.play_billing.s0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class w implements y {
    public static final w f18167b = new w(null);
    public static final s0 f18168c = new s0(w.class, 1);
    public final Object f18169a;

    public w(Object obj) {
        this.f18169a = obj;
    }

    @Override
    public final void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            Logger a10 = f18168c.a();
            Level level = Level.SEVERE;
            a10.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    @Override
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override
    public final Object get() {
        return this.f18169a;
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
        return super.toString() + "[status=SUCCESS, result=[" + this.f18169a + "]]";
    }

    @Override
    public final Object get(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f18169a;
    }
}
