package b7;

import com.google.android.gms.tasks.TaskCompletionSource;
import f7.h5;
public final class j extends a0 {
    public final TaskCompletionSource f1562b;
    public final k f1563c;

    public j(TaskCompletionSource taskCompletionSource, k kVar) {
        this.f1562b = taskCompletionSource;
        this.f1563c = kVar;
    }

    @Override
    public final void x0(y yVar) {
        h5.a(yVar.f1594a, null, this.f1562b);
    }

    @Override
    public final void zze() {
        this.f1563c.J0();
    }
}
