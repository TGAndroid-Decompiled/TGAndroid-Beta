package l5;

import android.os.Looper;
import com.google.android.gms.internal.cast.a0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class p implements Executor {
    public final int f15429a = 1;
    public final Object f15430b;

    public p(Looper looper) {
        this.f15430b = new a0(looper, 4);
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f15429a) {
            case 0:
                ((Executor) this.f15430b).execute(new o(0, runnable));
                return;
            default:
                ((a0) this.f15430b).post(runnable);
                return;
        }
    }

    public p(ExecutorService executorService) {
        this.f15430b = executorService;
    }
}
