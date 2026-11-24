package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class r5d extends dl5 {
    public final TaskCompletionSource b;

    public r5d(TaskCompletionSource taskCompletionSource) {
        this.b = taskCompletionSource;
    }

    @Override
    public final void T(Status status) {
        fxe.a(status, null, this.b);
    }
}
