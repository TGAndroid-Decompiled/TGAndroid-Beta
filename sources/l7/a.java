package l7;

import a8.m8;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class a extends com.google.android.gms.common.api.internal.h {
    public final TaskCompletionSource f19690b;

    public a(TaskCompletionSource taskCompletionSource) {
        this.f19690b = taskCompletionSource;
    }

    @Override
    public final void N(Status status) {
        m8.a(status, null, this.f19690b);
    }
}
