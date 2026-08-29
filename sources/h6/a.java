package h6;

import android.os.Looper;
import b9.k;
import c2.v0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class a implements Executor {
    public final int f7540a = 0;
    public final Object f7541b;

    public a(Looper looper) {
        this.f7541b = new v0(looper, 6);
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f7540a) {
            case 0:
                ((v0) this.f7541b).post(runnable);
                return;
            default:
                ((Executor) this.f7541b).execute(new k(2, runnable));
                return;
        }
    }

    public a(ExecutorService executorService) {
        this.f7541b = executorService;
    }
}
