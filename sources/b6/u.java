package b6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.q5;
import java.util.concurrent.TimeUnit;
public final class u implements com.google.android.gms.common.api.o {
    public final q5 f1648a;
    public final TaskCompletionSource f1649b;
    public final l f1650c;

    public u(q5 q5Var, TaskCompletionSource taskCompletionSource, l lVar) {
        this.f1648a = q5Var;
        this.f1649b = taskCompletionSource;
        this.f1650c = lVar;
    }

    @Override
    public final void a(Status status) {
        if (status.e()) {
            q5 q5Var = this.f1648a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) q5Var;
            m.j("Result has already been consumed.", !basePendingResult.f2740j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f2716n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f2715f);
            }
            m.j("Result is not ready.", basePendingResult.g());
            this.f1649b.setResult(this.f1650c.f(basePendingResult.j()));
            return;
        }
        this.f1649b.setException(m.m(status));
    }
}
