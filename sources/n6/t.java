package n6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import v7.f5;
public final class t implements com.google.android.gms.common.api.o {
    public final f5 f15273a;
    public final TaskCompletionSource f15274b;
    public final k f15275c;

    public t(f5 f5Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.f15273a = f5Var;
        this.f15274b = taskCompletionSource;
        this.f15275c = kVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            f5 f5Var = this.f15273a;
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
            this.f15274b.setResult(this.f15275c.l(basePendingResult.j()));
            return;
        }
        this.f15274b.setException(l.m(status));
    }
}
