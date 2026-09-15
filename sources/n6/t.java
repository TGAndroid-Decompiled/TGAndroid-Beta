package n6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import v7.f5;
public final class t implements com.google.android.gms.common.api.o {
    public final f5 f15088a;
    public final TaskCompletionSource f15089b;
    public final k f15090c;

    public t(f5 f5Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.f15088a = f5Var;
        this.f15089b = taskCompletionSource;
        this.f15090c = kVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            f5 f5Var = this.f15088a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) f5Var;
            l.j("Result has already been consumed.", !basePendingResult.f6039j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f6015n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f6014f);
            }
            l.j("Result is not ready.", basePendingResult.g());
            this.f15089b.setResult(this.f15090c.l(basePendingResult.j()));
            return;
        }
        this.f15089b.setException(l.m(status));
    }
}
