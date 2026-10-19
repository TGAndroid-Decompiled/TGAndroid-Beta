package l5;

import android.os.Looper;
import com.google.android.gms.internal.cast.a0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class q implements Executor {
    public final int f15936a = 1;
    public final Object f15937b;

    public q(Looper looper) {
        this.f15937b = new a0(looper, 4);
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f15936a) {
            case 0:
                ((Executor) this.f15937b).execute(new p(0, runnable));
                return;
            default:
                ((a0) this.f15937b).post(runnable);
                return;
        }
    }

    public q(ExecutorService executorService) {
        this.f15937b = executorService;
    }
}
