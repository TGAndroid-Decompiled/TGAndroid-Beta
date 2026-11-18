package l7;

import a8.l8;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class a extends com.google.android.gms.common.api.internal.h {
    public final TaskCompletionSource f19696b;

    public a(TaskCompletionSource taskCompletionSource) {
        this.f19696b = taskCompletionSource;
    }

    @Override
    public final void N(Status status) {
        l8.a(status, null, this.f19696b);
    }
}
