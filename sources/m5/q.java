package m5;

import android.os.Looper;
import com.google.android.gms.internal.cast.y;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class q implements Executor {
    public final int f18346a = 1;
    public final Object f18347b;

    public q(Looper looper) {
        this.f18347b = new y(looper, 4);
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f18346a) {
            case 0:
                ((Executor) this.f18347b).execute(new p(0, runnable));
                return;
            default:
                ((y) this.f18347b).post(runnable);
                return;
        }
    }

    public q(ExecutorService executorService) {
        this.f18347b = executorService;
    }
}
