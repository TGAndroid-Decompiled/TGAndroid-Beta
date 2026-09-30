package n6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import v7.g5;
public final class t implements com.google.android.gms.common.api.o {
    public final g5 f15332a;
    public final TaskCompletionSource f15333b;
    public final k f15334c;

    public t(g5 g5Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.f15332a = g5Var;
        this.f15333b = taskCompletionSource;
        this.f15334c = kVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            g5 g5Var = this.f15332a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) g5Var;
            l.j("Result has already been consumed.", !basePendingResult.f6039j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f6015n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f6014f);
            }
            l.j("Result is not ready.", basePendingResult.g());
            this.f15333b.setResult(this.f15334c.l(basePendingResult.j()));
            return;
        }
        this.f15333b.setException(l.m(status));
    }
}
