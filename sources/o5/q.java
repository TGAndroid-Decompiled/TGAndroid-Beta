package o5;

import android.os.Looper;
import com.google.android.gms.internal.cast.y;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class q implements Executor {
    public final int f21362a = 1;
    public final Object f21363b;

    public q(Looper looper) {
        this.f21363b = new y(looper, 4);
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f21362a) {
            case 0:
                ((Executor) this.f21363b).execute(new p(0, runnable));
                return;
            default:
                ((y) this.f21363b).post(runnable);
                return;
        }
    }

    public q(ExecutorService executorService) {
        this.f21363b = executorService;
    }
}
