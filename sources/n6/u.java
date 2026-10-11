package n6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import v7.f5;
public final class u implements com.google.android.gms.common.api.o {
    public final f5 f16801a;
    public final TaskCompletionSource f16802b;
    public final l f16803c;

    public u(f5 f5Var, TaskCompletionSource taskCompletionSource, l lVar) {
        this.f16801a = f5Var;
        this.f16802b = taskCompletionSource;
        this.f16803c = lVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            f5 f5Var = this.f16801a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) f5Var;
            m.j("Result has already been consumed.", !basePendingResult.f6547j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f6522n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f6521f);
            }
            m.j("Result is not ready.", basePendingResult.g());
            this.f16802b.setResult(this.f16803c.b(basePendingResult.j()));
            return;
        }
        this.f16802b.setException(m.m(status));
    }
}
