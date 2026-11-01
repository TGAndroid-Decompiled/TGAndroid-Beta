package n6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import v7.h5;
public final class t implements com.google.android.gms.common.api.o {
    public final h5 f13640a;
    public final TaskCompletionSource f13641b;
    public final k f13642c;

    public t(h5 h5Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.f13640a = h5Var;
        this.f13641b = taskCompletionSource;
        this.f13642c = kVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            h5 h5Var = this.f13640a;
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
            this.f13641b.setResult(this.f13642c.e(basePendingResult.j()));
            return;
        }
        this.f13641b.setException(l.l(status));
    }
}
