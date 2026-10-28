package o6;

import a8.z9;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
public final class t implements com.google.android.gms.common.api.o {
    public final z9 f19180a;
    public final TaskCompletionSource f19181b;
    public final k f19182c;

    public t(z9 z9Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.f19180a = z9Var;
        this.f19181b = taskCompletionSource;
        this.f19182c = kVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            z9 z9Var = this.f19180a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) z9Var;
            l.j("Result has already been consumed.", !basePendingResult.f6488j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f6464n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f6463f);
            }
            l.j("Result is not ready.", basePendingResult.g());
            this.f19181b.setResult(this.f19182c.f(basePendingResult.j()));
            return;
        }
        this.f19181b.setException(l.m(status));
    }
}
