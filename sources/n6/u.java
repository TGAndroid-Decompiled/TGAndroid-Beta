package n6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import v7.f5;
public final class u implements com.google.android.gms.common.api.o {
    public final f5 f16723a;
    public final TaskCompletionSource f16724b;
    public final k f16725c;

    public u(f5 f5Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.f16723a = f5Var;
        this.f16724b = taskCompletionSource;
        this.f16725c = kVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            f5 f5Var = this.f16723a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) f5Var;
            l.j("Result has already been consumed.", !basePendingResult.f6548j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f6523n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f6522f);
            }
            l.j("Result is not ready.", basePendingResult.g());
            this.f16724b.setResult(this.f16725c.b(basePendingResult.j()));
            return;
        }
        this.f16724b.setException(l.m(status));
    }
}
