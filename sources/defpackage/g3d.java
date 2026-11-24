package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
public final class g3d implements b38 {
    public final BasePendingResult a;
    public final TaskCompletionSource b;
    public final c38 c;

    public g3d(BasePendingResult basePendingResult, TaskCompletionSource taskCompletionSource, c38 c38Var) {
        this.a = basePendingResult;
        this.b = taskCompletionSource;
        this.c = c38Var;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            BasePendingResult basePendingResult = this.a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            fre.j("Result has already been consumed.", !basePendingResult.j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f);
            }
            fre.j("Result is not ready.", basePendingResult.g());
            this.b.setResult(this.c.n0(basePendingResult.j()));
            return;
        }
        this.b.setException(bmd.a(status));
    }
}
