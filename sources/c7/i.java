package c7;

import com.google.android.gms.tasks.TaskCompletionSource;
import g7.g5;

public final class i extends z {

    public final TaskCompletionSource f2468b;

    public final j f2469c;

    public i(TaskCompletionSource taskCompletionSource, j jVar) {
        this.f2468b = taskCompletionSource;
        this.f2469c = jVar;
    }

    @Override
    public final void Z(x xVar) {
        g5.a(xVar.f2500a, null, this.f2468b);
    }

    @Override
    public final void zze() {
        this.f2469c.J0();
    }
}
