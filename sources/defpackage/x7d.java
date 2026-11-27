package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
public final class x7d implements r68 {
    public final BasePendingResult a;
    public final TaskCompletionSource b;
    public final s68 c;

    public x7d(BasePendingResult basePendingResult, TaskCompletionSource taskCompletionSource, s68 s68Var) {
        this.a = basePendingResult;
        this.b = taskCompletionSource;
        this.c = s68Var;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            BasePendingResult basePendingResult = this.a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            xve.j("Result has already been consumed.", !basePendingResult.j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f);
            }
            xve.j("Result is not ready.", basePendingResult.g());
            this.b.setResult(this.c.J(basePendingResult.j()));
            return;
        }
        this.b.setException(sqd.a(status));
    }
}
