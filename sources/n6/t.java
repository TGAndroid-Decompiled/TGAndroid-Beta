package n6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import v7.e5;
public final class t implements com.google.android.gms.common.api.o {
    public final e5 f13918a;
    public final TaskCompletionSource f13919b;
    public final k f13920c;

    public t(e5 e5Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.f13918a = e5Var;
        this.f13919b = taskCompletionSource;
        this.f13920c = kVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            e5 e5Var = this.f13918a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) e5Var;
            l.j("Result has already been consumed.", !basePendingResult.f4818j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f4794n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f4793f);
            }
            l.j("Result is not ready.", basePendingResult.g());
            this.f13919b.setResult(this.f13920c.b(basePendingResult.j()));
            return;
        }
        this.f13919b.setException(l.m(status));
    }
}
