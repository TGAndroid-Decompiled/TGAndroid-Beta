package l5;

import android.os.Looper;
import com.google.android.gms.internal.cast.c0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class q implements Executor {
    public final int f13909a = 1;
    public final Object f13910b;

    public q(Looper looper) {
        this.f13910b = new c0(looper, 4);
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f13909a) {
            case 0:
                ((Executor) this.f13910b).execute(new p(0, runnable));
                return;
            default:
                ((c0) this.f13910b).post(runnable);
                return;
        }
    }

    public q(ExecutorService executorService) {
        this.f13910b = executorService;
    }
}
