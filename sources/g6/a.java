package g6;

import a9.n;
import android.os.Looper;
import c2.t0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class a implements Executor {

    public final int f6394a = 0;

    public final Object f6395b;

    public a(Looper looper) {
        this.f6395b = new t0(looper, 6);
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f6394a) {
            case 0:
                ((t0) this.f6395b).post(runnable);
                break;
            default:
                ((Executor) this.f6395b).execute(new n(2, runnable));
                break;
        }
    }

    public a(ExecutorService executorService) {
        this.f6395b = executorService;
    }
}
