package n6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import v7.f5;
public final class t implements com.google.android.gms.common.api.o {
    public final f5 f15063a;
    public final TaskCompletionSource f15064b;
    public final k f15065c;

    public t(f5 f5Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.f15063a = f5Var;
        this.f15064b = taskCompletionSource;
        this.f15065c = kVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            f5 f5Var = this.f15063a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) f5Var;
            l.j("Result has already been consumed.", !basePendingResult.f6027j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f6003n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f6002f);
            }
            l.j("Result is not ready.", basePendingResult.g());
            this.f15064b.setResult(this.f15065c.l(basePendingResult.j()));
            return;
        }
        this.f15064b.setException(l.m(status));
    }
}
