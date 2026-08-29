package c9;

import com.google.android.gms.tasks.TaskCompletionSource;
import e3.f;
import g9.a0;
import g9.n;
import g9.r;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
public final class b implements Callable {
    public final boolean f3009a;
    public final r f3010b;
    public final f f3011c;

    public b(boolean z10, r rVar, f fVar) {
        this.f3009a = z10;
        this.f3010b = rVar;
        this.f3011c = fVar;
    }

    @Override
    public final Object call() {
        if (this.f3009a) {
            r rVar = this.f3010b;
            ExecutorService executorService = rVar.f7205k;
            n nVar = new n(2, rVar, this.f3011c);
            ExecutorService executorService2 = a0.f7145a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new androidx.car.app.utils.b(nVar, executorService, taskCompletionSource, 10));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
