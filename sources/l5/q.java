package l5;

import android.os.Looper;
import com.google.android.gms.internal.cast.c0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class q implements Executor {
    public final int f14121a = 1;
    public final Object f14122b;

    public q(Looper looper) {
        this.f14122b = new c0(looper, 4);
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f14121a) {
            case 0:
                ((Executor) this.f14122b).execute(new p(0, runnable));
                return;
            default:
                ((c0) this.f14122b).post(runnable);
                return;
        }
    }

    public q(ExecutorService executorService) {
        this.f14122b = executorService;
    }
}
