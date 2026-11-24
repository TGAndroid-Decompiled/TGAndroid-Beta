package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class p3d extends ej5 {
    public final TaskCompletionSource b;

    public p3d(TaskCompletionSource taskCompletionSource) {
        this.b = taskCompletionSource;
    }

    @Override
    public final void T(Status status) {
        dve.a(status, null, this.b);
    }
}
