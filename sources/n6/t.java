package n6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import v7.g5;
public final class t implements com.google.android.gms.common.api.o {
    public final g5 f15301a;
    public final TaskCompletionSource f15302b;
    public final k f15303c;

    public t(g5 g5Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.f15301a = g5Var;
        this.f15302b = taskCompletionSource;
        this.f15303c = kVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            g5 g5Var = this.f15301a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) g5Var;
            l.j("Result has already been consumed.", !basePendingResult.f6027j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f6003n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f6002f);
            }
            l.j("Result is not ready.", basePendingResult.g());
            this.f15302b.setResult(this.f15303c.l(basePendingResult.j()));
            return;
        }
        this.f15302b.setException(l.m(status));
    }
}
