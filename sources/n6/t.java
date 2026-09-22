package n6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import v7.f5;
public final class t implements com.google.android.gms.common.api.o {
    public final f5 f15086a;
    public final TaskCompletionSource f15087b;
    public final k f15088c;

    public t(f5 f5Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.f15086a = f5Var;
        this.f15087b = taskCompletionSource;
        this.f15088c = kVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            f5 f5Var = this.f15086a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) f5Var;
            l.j("Result has already been consumed.", !basePendingResult.f6041j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f6017n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f6016f);
            }
            l.j("Result is not ready.", basePendingResult.g());
            this.f15087b.setResult(this.f15088c.l(basePendingResult.j()));
            return;
        }
        this.f15087b.setException(l.m(status));
    }
}
