package i7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.i5;
public final class a extends com.google.android.gms.common.api.internal.i {
    public final TaskCompletionSource f8226b;

    public a(TaskCompletionSource taskCompletionSource) {
        this.f8226b = taskCompletionSource;
    }

    @Override
    public final void I(Status status) {
        i5.a(status, null, this.f8226b);
    }
}
