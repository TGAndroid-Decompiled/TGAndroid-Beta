package n6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import v7.f5;
public final class t implements com.google.android.gms.common.api.o {
    public final f5 f15098a;
    public final TaskCompletionSource f15099b;
    public final k f15100c;

    public t(f5 f5Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.f15098a = f5Var;
        this.f15099b = taskCompletionSource;
        this.f15100c = kVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            f5 f5Var = this.f15098a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) f5Var;
            l.j("Result has already been consumed.", !basePendingResult.f6044j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f6020n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f6019f);
            }
            l.j("Result is not ready.", basePendingResult.g());
            this.f15099b.setResult(this.f15100c.l(basePendingResult.j()));
            return;
        }
        this.f15099b.setException(l.m(status));
    }
}
