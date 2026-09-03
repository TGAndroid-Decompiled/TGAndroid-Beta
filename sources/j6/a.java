package j6;

import a7.e;
import android.os.Looper;
import d9.j;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class a implements Executor {
    public final int f8918a = 0;
    public final Object f8919b;

    public a(Looper looper) {
        this.f8919b = new e(looper, 0);
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f8918a) {
            case 0:
                ((e) this.f8919b).post(runnable);
                return;
            default:
                ((Executor) this.f8919b).execute(new j(2, runnable));
                return;
        }
    }

    public a(ExecutorService executorService) {
        this.f8919b = executorService;
    }
}
