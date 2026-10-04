package n6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import v7.f5;
public final class t implements com.google.android.gms.common.api.o {
    public final f5 f16741a;
    public final TaskCompletionSource f16742b;
    public final k f16743c;

    public t(f5 f5Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.f16741a = f5Var;
        this.f16742b = taskCompletionSource;
        this.f16743c = kVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            f5 f5Var = this.f16741a;
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
            this.f16742b.setResult(this.f16743c.i(basePendingResult.j()));
            return;
        }
        this.f16742b.setException(l.m(status));
    }
}
