package l5;

import android.os.Looper;
import com.google.android.gms.internal.cast.c0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class p implements Executor {
    public final int f15324a = 1;
    public final Object f15325b;

    public p(Looper looper) {
        this.f15325b = new c0(looper, 4);
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f15324a) {
            case 0:
                ((Executor) this.f15325b).execute(new o(0, runnable));
                return;
            default:
                ((c0) this.f15325b).post(runnable);
                return;
        }
    }

    public p(ExecutorService executorService) {
        this.f15325b = executorService;
    }
}
