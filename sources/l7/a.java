package l7;

import a8.k8;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class a extends com.google.android.gms.common.api.internal.h {
    public final TaskCompletionSource f18199b;

    public a(TaskCompletionSource taskCompletionSource) {
        this.f18199b = taskCompletionSource;
    }

    @Override
    public final void N(Status status) {
        k8.a(status, null, this.f18199b);
    }
}
