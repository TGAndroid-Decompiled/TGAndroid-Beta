package l5;

import android.os.Looper;
import com.google.android.gms.internal.cast.c0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class q implements Executor {
    public final int f13911a = 1;
    public final Object f13912b;

    public q(Looper looper) {
        this.f13912b = new c0(looper, 4);
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f13911a) {
            case 0:
                ((Executor) this.f13912b).execute(new p(0, runnable));
                return;
            default:
                ((c0) this.f13912b).post(runnable);
                return;
        }
    }

    public q(ExecutorService executorService) {
        this.f13912b = executorService;
    }
}
