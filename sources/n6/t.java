package n6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import v7.f5;
public final class t implements com.google.android.gms.common.api.o {
    public final f5 f16751a;
    public final TaskCompletionSource f16752b;
    public final k f16753c;

    public t(f5 f5Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.f16751a = f5Var;
        this.f16752b = taskCompletionSource;
        this.f16753c = kVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            f5 f5Var = this.f16751a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) f5Var;
            l.j("Result has already been consumed.", !basePendingResult.f6496j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f6471n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f6470f);
            }
            l.j("Result is not ready.", basePendingResult.g());
            this.f16752b.setResult(this.f16753c.i(basePendingResult.j()));
            return;
        }
        this.f16752b.setException(l.m(status));
    }
}
