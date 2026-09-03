package f7;

import com.google.android.gms.tasks.TaskCompletionSource;
import j7.r5;
public final class i extends y {
    public final TaskCompletionSource f6010b;
    public final j f6011c;

    public i(TaskCompletionSource taskCompletionSource, j jVar) {
        this.f6010b = taskCompletionSource;
        this.f6011c = jVar;
    }

    @Override
    public final void V(w wVar) {
        r5.a(wVar.f6036a, null, this.f6010b);
    }

    @Override
    public final void zze() {
        this.f6011c.J0();
    }
}
