package j6;

import a7.e;
import android.os.Looper;
import d9.j;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class a implements Executor {
    public final int f9542a = 0;
    public final Object f9543b;

    public a(Looper looper) {
        this.f9543b = new e(looper, 0);
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f9542a) {
            case 0:
                ((e) this.f9543b).post(runnable);
                return;
            default:
                ((Executor) this.f9543b).execute(new j(2, runnable));
                return;
        }
    }

    public a(ExecutorService executorService) {
        this.f9543b = executorService;
    }
}
