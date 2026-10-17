package n6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import v7.g5;
public final class t implements com.google.android.gms.common.api.o {
    public final g5 f17233a;
    public final TaskCompletionSource f17234b;
    public final k f17235c;

    public t(g5 g5Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.f17233a = g5Var;
        this.f17234b = taskCompletionSource;
        this.f17235c = kVar;
    }

    @Override
    public final void a(Status status) {
        if (status.b()) {
            g5 g5Var = this.f17233a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) g5Var;
            l.j("Result has already been consumed.", !basePendingResult.f6368j);
            try {
                if (!basePendingResult.d.await(0L, timeUnit)) {
                    basePendingResult.e(Status.f6344n);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.f6343f);
            }
            l.j("Result is not ready.", basePendingResult.g());
            this.f17234b.setResult(this.f17235c.b(basePendingResult.j()));
            return;
        }
        this.f17234b.setException(l.m(status));
    }
}
