package l5;

import android.os.Looper;
import com.google.android.gms.internal.cast.a0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class q implements Executor {
    public final int f15928a = 1;
    public final Object f15929b;

    public q(Looper looper) {
        this.f15929b = new a0(looper, 4);
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f15928a) {
            case 0:
                ((Executor) this.f15929b).execute(new p(0, runnable));
                return;
            default:
                ((a0) this.f15929b).post(runnable);
                return;
        }
    }

    public q(ExecutorService executorService) {
        this.f15929b = executorService;
    }
}
