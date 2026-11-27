package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class g8d extends gl5 {
    public final TaskCompletionSource b;

    public g8d(TaskCompletionSource taskCompletionSource) {
        this.b = taskCompletionSource;
    }

    @Override
    public final void T(Status status) {
        vze.a(status, null, this.b);
    }
}
