package o5;

import android.os.Looper;
import com.google.android.gms.internal.cast.y;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class p implements Executor {
    public final int f21750a = 1;
    public final Object f21751b;

    public p(Looper looper) {
        this.f21751b = new y(looper, 4);
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f21750a) {
            case 0:
                ((Executor) this.f21751b).execute(new o(0, runnable));
                return;
            default:
                ((y) this.f21751b).post(runnable);
                return;
        }
    }

    public p(ExecutorService executorService) {
        this.f21751b = executorService;
    }
}
