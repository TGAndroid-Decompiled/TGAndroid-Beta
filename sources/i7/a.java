package i7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.g5;
public final class a extends com.google.android.gms.common.api.internal.i {
    public final TaskCompletionSource f11015b;

    public a(TaskCompletionSource taskCompletionSource) {
        this.f11015b = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        g5.a(status, null, this.f11015b);
    }
}
