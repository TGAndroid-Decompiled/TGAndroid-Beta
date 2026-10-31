package l5;

import android.os.Looper;
import com.google.android.gms.internal.cast.z;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class p implements Executor {
    public final int f11677a = 1;
    public final Object f11678b;

    public p(Looper looper) {
        this.f11678b = new z(looper, 4);
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f11677a) {
            case 0:
                ((Executor) this.f11678b).execute(new o(0, runnable));
                return;
            default:
                ((z) this.f11678b).post(runnable);
                return;
        }
    }

    public p(ExecutorService executorService) {
        this.f11678b = executorService;
    }
}
