package b7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import f7.h5;
public final class g extends com.google.android.gms.common.api.internal.i {
    public final Object f1557b;
    public final TaskCompletionSource f1558c;

    public g(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f1557b = bool;
        this.f1558c = taskCompletionSource;
    }

    @Override
    public final void D(Status status) {
        h5.a(status, this.f1557b, this.f1558c);
    }
}
