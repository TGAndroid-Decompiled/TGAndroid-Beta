package o5;

import android.os.Looper;
import com.google.android.gms.internal.cast.y;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class p implements Executor {
    public final int f21728a = 1;
    public final Object f21729b;

    public p(Looper looper) {
        this.f21729b = new y(looper, 4);
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f21728a) {
            case 0:
                ((Executor) this.f21729b).execute(new o(0, runnable));
                return;
            default:
                ((y) this.f21729b).post(runnable);
                return;
        }
    }

    public p(ExecutorService executorService) {
        this.f21729b = executorService;
    }
}
