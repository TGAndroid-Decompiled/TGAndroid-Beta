package n6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import v7.h5;
public final class t implements com.google.android.gms.common.api.o {
    public final h5 f13639a;
    public final TaskCompletionSource f13640b;
    public final k f13641c;

    public t(h5 h5Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.f13639a = h5Var;
        this.f13640b = taskCompletionSource;
        this.f13641c = kVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            h5 h5Var = this.f13639a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) h5Var;
            l.i("Result has already been consumed.", !basePendingResult.f4356j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f4332n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f4331f);
            }
            l.i("Result is not ready.", basePendingResult.g());
            this.f13640b.setResult(this.f13641c.e(basePendingResult.j()));
            return;
        }
        this.f13640b.setException(l.l(status));
    }
}
