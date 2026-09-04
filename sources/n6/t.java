package n6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import v7.e5;
public final class t implements com.google.android.gms.common.api.o {
    public final e5 f16598a;
    public final TaskCompletionSource f16599b;
    public final k f16600c;

    public t(e5 e5Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.f16598a = e5Var;
        this.f16599b = taskCompletionSource;
        this.f16600c = kVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            e5 e5Var = this.f16598a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) e5Var;
            l.j("Result has already been consumed.", !basePendingResult.f4969j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f4944n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f4943f);
            }
            l.j("Result is not ready.", basePendingResult.g());
            this.f16599b.setResult(this.f16600c.k(basePendingResult.j()));
            return;
        }
        this.f16599b.setException(l.m(status));
    }
}
