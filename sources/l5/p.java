package l5;

import android.os.Looper;
import com.google.android.gms.internal.cast.z;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class p implements Executor {
    public final int f11678a = 1;
    public final Object f11679b;

    public p(Looper looper) {
        this.f11679b = new z(looper, 4);
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f11678a) {
            case 0:
                ((Executor) this.f11679b).execute(new o(0, runnable));
                return;
            default:
                ((z) this.f11679b).post(runnable);
                return;
        }
    }

    public p(ExecutorService executorService) {
        this.f11679b = executorService;
    }
}
