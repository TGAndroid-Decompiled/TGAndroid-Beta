package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
public final class i5d implements d58 {
    public final BasePendingResult a;
    public final TaskCompletionSource b;
    public final e58 c;

    public i5d(BasePendingResult basePendingResult, TaskCompletionSource taskCompletionSource, e58 e58Var) {
        this.a = basePendingResult;
        this.b = taskCompletionSource;
        this.c = e58Var;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            BasePendingResult basePendingResult = this.a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            ite.j("Result has already been consumed.", !basePendingResult.j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f);
            }
            ite.j("Result is not ready.", basePendingResult.g());
            this.b.setResult(this.c.n0(basePendingResult.j()));
            return;
        }
        this.b.setException(dod.a(status));
    }
}
