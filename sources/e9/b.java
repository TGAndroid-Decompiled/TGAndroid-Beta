package e9;

import com.google.android.gms.tasks.TaskCompletionSource;
import e3.g;
import i9.p;
import i9.y;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
public final class b implements Callable {
    public final boolean f5163a;
    public final p f5164b;
    public final g f5165c;

    public b(boolean z4, p pVar, g gVar) {
        this.f5163a = z4;
        this.f5164b = pVar;
        this.f5165c = gVar;
    }

    @Override
    public final Object call() {
        if (this.f5163a) {
            p pVar = this.f5164b;
            ExecutorService executorService = pVar.f7423k;
            h2.g gVar = new h2.g(3, pVar, this.f5165c);
            ExecutorService executorService2 = y.f7454a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new androidx.car.app.utils.b(gVar, executorService, taskCompletionSource, 10));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
