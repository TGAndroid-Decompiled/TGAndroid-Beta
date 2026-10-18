package i7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.h5;
public final class a extends com.google.android.gms.common.api.internal.i {
    public final TaskCompletionSource f12727b;

    public a(TaskCompletionSource taskCompletionSource) {
        this.f12727b = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        h5.a(status, null, this.f12727b);
    }
}
