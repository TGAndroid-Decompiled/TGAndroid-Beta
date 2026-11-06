package l7;

import a8.k8;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class a extends com.google.android.gms.common.api.internal.h {
    public final TaskCompletionSource f18193b;

    public a(TaskCompletionSource taskCompletionSource) {
        this.f18193b = taskCompletionSource;
    }

    @Override
    public final void E(Status status) {
        k8.a(status, null, this.f18193b);
    }
}
