package o5;

import android.os.Looper;
import com.google.android.gms.internal.cast.y;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class q implements Executor {
    public final int f21819a = 1;
    public final Object f21820b;

    public q(Looper looper) {
        this.f21820b = new y(looper, 4);
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f21819a) {
            case 0:
                ((Executor) this.f21820b).execute(new p(0, runnable));
                return;
            default:
                ((y) this.f21820b).post(runnable);
                return;
        }
    }

    public q(ExecutorService executorService) {
        this.f21820b = executorService;
    }
}
