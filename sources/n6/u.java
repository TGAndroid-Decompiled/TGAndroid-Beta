package n6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import v7.f5;
public final class u implements com.google.android.gms.common.api.o {
    public final f5 f16468a;
    public final TaskCompletionSource f16469b;
    public final l f16470c;

    public u(f5 f5Var, TaskCompletionSource taskCompletionSource, l lVar) {
        this.f16468a = f5Var;
        this.f16469b = taskCompletionSource;
        this.f16470c = lVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            f5 f5Var = this.f16468a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) f5Var;
            m.j("Result has already been consumed.", !basePendingResult.f6546j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f6521n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f6520f);
            }
            m.j("Result is not ready.", basePendingResult.g());
            this.f16469b.setResult(this.f16470c.b(basePendingResult.j()));
            return;
        }
        this.f16469b.setException(m.m(status));
    }
}
