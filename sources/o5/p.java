package o5;

import android.os.Looper;
import com.google.android.gms.internal.cast.y;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class p implements Executor {
    public final int f20845a = 1;
    public final Object f20846b;

    public p(Looper looper) {
        this.f20846b = new y(looper, 4);
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f20845a) {
            case 0:
                ((Executor) this.f20846b).execute(new o(0, runnable));
                return;
            default:
                ((y) this.f20846b).post(runnable);
                return;
        }
    }

    public p(ExecutorService executorService) {
        this.f20846b = executorService;
    }
}
