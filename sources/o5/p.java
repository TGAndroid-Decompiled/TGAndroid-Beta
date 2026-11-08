package o5;

import android.os.Looper;
import com.google.android.gms.internal.cast.y;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class p implements Executor {
    public final int f20840a = 1;
    public final Object f20841b;

    public p(Looper looper) {
        this.f20841b = new y(looper, 4);
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f20840a) {
            case 0:
                ((Executor) this.f20841b).execute(new o(0, runnable));
                return;
            default:
                ((y) this.f20841b).post(runnable);
                return;
        }
    }

    public p(ExecutorService executorService) {
        this.f20841b = executorService;
    }
}
