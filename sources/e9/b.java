package e9;

import com.google.android.gms.tasks.TaskCompletionSource;
import e3.g;
import i9.p;
import i9.y;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
public final class b implements Callable {
    public final boolean f5002a;
    public final p f5003b;
    public final g f5004c;

    public b(boolean z4, p pVar, g gVar) {
        this.f5002a = z4;
        this.f5003b = pVar;
        this.f5004c = gVar;
    }

    @Override
    public final Object call() {
        if (this.f5002a) {
            p pVar = this.f5003b;
            ExecutorService executorService = pVar.f7990k;
            h2.g gVar = new h2.g(3, pVar, this.f5004c);
            ExecutorService executorService2 = y.f8025a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new androidx.car.app.utils.b(gVar, executorService, taskCompletionSource, 10));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
