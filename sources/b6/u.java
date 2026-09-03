package b6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.q5;
import java.util.concurrent.TimeUnit;
public final class u implements com.google.android.gms.common.api.o {
    public final q5 f1659a;
    public final TaskCompletionSource f1660b;
    public final l f1661c;

    public u(q5 q5Var, TaskCompletionSource taskCompletionSource, l lVar) {
        this.f1659a = q5Var;
        this.f1660b = taskCompletionSource;
        this.f1661c = lVar;
    }

    @Override
    public final void a(Status status) {
        if (status.e()) {
            q5 q5Var = this.f1659a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) q5Var;
            m.j("Result has already been consumed.", !basePendingResult.f2723j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f2699n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f2698f);
            }
            m.j("Result is not ready.", basePendingResult.g());
            this.f1660b.setResult(this.f1661c.J(basePendingResult.j()));
            return;
        }
        this.f1660b.setException(m.m(status));
    }
}
