package n6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import v7.g5;
public final class u implements com.google.android.gms.common.api.o {
    public final g5 f16148a;
    public final TaskCompletionSource f16149b;
    public final k f16150c;

    public u(g5 g5Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.f16148a = g5Var;
        this.f16149b = taskCompletionSource;
        this.f16150c = kVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            g5 g5Var = this.f16148a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) g5Var;
            l.j("Result has already been consumed.", !basePendingResult.f4907j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f4883n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f4882f);
            }
            l.j("Result is not ready.", basePendingResult.g());
            this.f16149b.setResult(this.f16150c.b(basePendingResult.j()));
            return;
        }
        this.f16149b.setException(l.m(status));
    }
}
