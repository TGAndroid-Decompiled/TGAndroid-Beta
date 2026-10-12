package l5;

import android.os.Looper;
import com.google.android.gms.internal.cast.a0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class p implements Executor {
    public final int f14593a = 1;
    public final Object f14594b;

    public p(Looper looper) {
        this.f14594b = new a0(looper, 4);
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f14593a) {
            case 0:
                ((Executor) this.f14594b).execute(new o(0, runnable));
                return;
            default:
                ((a0) this.f14594b).post(runnable);
                return;
        }
    }

    public p(ExecutorService executorService) {
        this.f14594b = executorService;
    }
}
