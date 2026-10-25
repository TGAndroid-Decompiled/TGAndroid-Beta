package m5;

import android.os.Looper;
import com.google.android.gms.internal.cast.y;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class q implements Executor {
    public final int f18347a = 1;
    public final Object f18348b;

    public q(Looper looper) {
        this.f18348b = new y(looper, 4);
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f18347a) {
            case 0:
                ((Executor) this.f18348b).execute(new p(0, runnable));
                return;
            default:
                ((y) this.f18348b).post(runnable);
                return;
        }
    }

    public q(ExecutorService executorService) {
        this.f18348b = executorService;
    }
}
