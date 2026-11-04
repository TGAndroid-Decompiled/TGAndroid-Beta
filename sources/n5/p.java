package n5;

import android.os.Looper;
import com.google.android.gms.internal.cast.z;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class p implements Executor {
    public final int f20259a = 1;
    public final Object f20260b;

    public p(Looper looper) {
        this.f20260b = new z(looper, 4);
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f20259a) {
            case 0:
                ((Executor) this.f20260b).execute(new o(0, runnable));
                return;
            default:
                ((z) this.f20260b).post(runnable);
                return;
        }
    }

    public p(ExecutorService executorService) {
        this.f20260b = executorService;
    }
}
