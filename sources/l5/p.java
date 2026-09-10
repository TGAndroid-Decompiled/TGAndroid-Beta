package l5;

import android.os.Looper;
import com.google.android.gms.internal.cast.c0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class p implements Executor {
    public final int f12806a = 1;
    public final Object f12807b;

    public p(Looper looper) {
        this.f12807b = new c0(looper, 4);
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f12806a) {
            case 0:
                ((Executor) this.f12807b).execute(new o(0, runnable));
                return;
            default:
                ((c0) this.f12807b).post(runnable);
                return;
        }
    }

    public p(ExecutorService executorService) {
        this.f12807b = executorService;
    }
}
