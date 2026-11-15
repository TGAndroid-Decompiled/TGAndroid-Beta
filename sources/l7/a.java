package l7;

import a8.l8;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class a extends com.google.android.gms.common.api.internal.h {
    public final TaskCompletionSource f19329b;

    public a(TaskCompletionSource taskCompletionSource) {
        this.f19329b = taskCompletionSource;
    }

    @Override
    public final void O(Status status) {
        l8.a(status, null, this.f19329b);
    }
}
