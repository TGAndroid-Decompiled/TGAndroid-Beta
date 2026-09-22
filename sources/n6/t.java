package n6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import v7.g5;
public final class t implements com.google.android.gms.common.api.o {
    public final g5 f15324a;
    public final TaskCompletionSource f15325b;
    public final k f15326c;

    public t(g5 g5Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.f15324a = g5Var;
        this.f15325b = taskCompletionSource;
        this.f15326c = kVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            g5 g5Var = this.f15324a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) g5Var;
            l.j("Result has already been consumed.", !basePendingResult.f6043j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f6019n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f6018f);
            }
            l.j("Result is not ready.", basePendingResult.g());
            this.f15325b.setResult(this.f15326c.l(basePendingResult.j()));
            return;
        }
        this.f15325b.setException(l.m(status));
    }
}
