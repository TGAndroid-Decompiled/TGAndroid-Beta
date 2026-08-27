package b9;

import c3.g;
import com.google.android.gms.tasks.TaskCompletionSource;
import f9.b0;
import f9.m;
import f9.q;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public final class b implements Callable {

    public final boolean f2048a;

    public final q f2049b;

    public final g f2050c;

    public b(boolean z10, q qVar, g gVar) {
        this.f2048a = z10;
        this.f2049b = qVar;
        this.f2050c = gVar;
    }

    @Override
    public final Object call() {
        if (!this.f2048a) {
            return null;
        }
        q qVar = this.f2049b;
        ExecutorService executorService = qVar.f5980k;
        m mVar = new m(2, qVar, this.f2050c);
        ExecutorService executorService2 = b0.f5926a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executorService.execute(new androidx.car.app.utils.a(mVar, executorService, taskCompletionSource, 11));
        taskCompletionSource.getTask();
        return null;
    }
}
