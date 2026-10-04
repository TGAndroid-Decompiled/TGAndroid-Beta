package n6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import v7.f5;
public final class t implements com.google.android.gms.common.api.o {
    public final f5 f16742a;
    public final TaskCompletionSource f16743b;
    public final k f16744c;

    public t(f5 f5Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.f16742a = f5Var;
        this.f16743b = taskCompletionSource;
        this.f16744c = kVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            f5 f5Var = this.f16742a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) f5Var;
            l.j("Result has already been consumed.", !basePendingResult.f6495j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f6470n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f6469f);
            }
            l.j("Result is not ready.", basePendingResult.g());
            this.f16743b.setResult(this.f16744c.i(basePendingResult.j()));
            return;
        }
        this.f16743b.setException(l.m(status));
    }
}
