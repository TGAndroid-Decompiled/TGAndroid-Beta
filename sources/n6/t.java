package n6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import v7.g5;
public final class t implements com.google.android.gms.common.api.o {
    public final g5 f15857a;
    public final TaskCompletionSource f15858b;
    public final k f15859c;

    public t(g5 g5Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.f15857a = g5Var;
        this.f15858b = taskCompletionSource;
        this.f15859c = kVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            g5 g5Var = this.f15857a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) g5Var;
            l.j("Result has already been consumed.", !basePendingResult.f4910j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f4886n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f4885f);
            }
            l.j("Result is not ready.", basePendingResult.g());
            this.f15858b.setResult(this.f15859c.a(basePendingResult.j()));
            return;
        }
        this.f15858b.setException(l.m(status));
    }
}
