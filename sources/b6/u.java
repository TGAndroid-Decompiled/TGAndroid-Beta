package b6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.o5;
import java.util.concurrent.TimeUnit;
public final class u implements com.google.android.gms.common.api.o {
    public final o5 f1783a;
    public final TaskCompletionSource f1784b;
    public final l f1785c;

    public u(o5 o5Var, TaskCompletionSource taskCompletionSource, l lVar) {
        this.f1783a = o5Var;
        this.f1784b = taskCompletionSource;
        this.f1785c = lVar;
    }

    @Override
    public final void a(Status status) {
        if (status.e()) {
            o5 o5Var = this.f1783a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) o5Var;
            m.j("Result has already been consumed.", !basePendingResult.f2669j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f2644n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f2643f);
            }
            m.j("Result is not ready.", basePendingResult.g());
            this.f1784b.setResult(this.f1785c.f(basePendingResult.j()));
            return;
        }
        this.f1784b.setException(m.m(status));
    }
}
