package a9;

import c3.h;
import com.google.android.gms.tasks.TaskCompletionSource;
import e9.m;
import e9.q;
import e9.z;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
public final class d implements Callable {
    public final boolean f120a;
    public final q f121b;
    public final h f122c;

    public d(boolean z10, q qVar, h hVar) {
        this.f120a = z10;
        this.f121b = qVar;
        this.f122c = hVar;
    }

    @Override
    public final Object call() {
        if (this.f120a) {
            q qVar = this.f121b;
            ExecutorService executorService = qVar.f5048k;
            m mVar = new m(2, qVar, this.f122c);
            ExecutorService executorService2 = z.f5083a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executorService.execute(new androidx.car.app.utils.b(mVar, executorService, taskCompletionSource, 11));
            taskCompletionSource.getTask();
            return null;
        }
        return null;
    }
}
