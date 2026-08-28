package f6;

import android.os.Looper;
import c2.u0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class a implements Executor {
    public final int f5590a = 0;
    public final Object f5591b;

    public a(Looper looper) {
        this.f5591b = new u0(looper, 6);
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f5590a) {
            case 0:
                ((u0) this.f5591b).post(runnable);
                return;
            default:
                ((Executor) this.f5591b).execute(new c(1, runnable));
                return;
        }
    }

    public a(ExecutorService executorService) {
        this.f5591b = executorService;
    }
}
