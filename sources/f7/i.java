package f7;

import com.google.android.gms.tasks.TaskCompletionSource;
import j7.r5;
public final class i extends y {
    public final TaskCompletionSource f6021b;
    public final j f6022c;

    public i(TaskCompletionSource taskCompletionSource, j jVar) {
        this.f6021b = taskCompletionSource;
        this.f6022c = jVar;
    }

    @Override
    public final void V(w wVar) {
        r5.a(wVar.f6047a, null, this.f6021b);
    }

    @Override
    public final void zze() {
        this.f6022c.J0();
    }
}
