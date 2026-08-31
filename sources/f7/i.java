package f7;

import com.google.android.gms.tasks.TaskCompletionSource;
import j7.p5;
public final class i extends y {
    public final TaskCompletionSource f6129b;
    public final j f6130c;

    public i(TaskCompletionSource taskCompletionSource, j jVar) {
        this.f6129b = taskCompletionSource;
        this.f6130c = jVar;
    }

    @Override
    public final void V(w wVar) {
        p5.a(wVar.f6160a, null, this.f6129b);
    }

    @Override
    public final void zze() {
        this.f6130c.J0();
    }
}
