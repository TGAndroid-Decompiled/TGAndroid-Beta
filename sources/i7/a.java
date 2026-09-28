package i7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.h5;
public final class a extends com.google.android.gms.common.api.internal.i {
    public final TaskCompletionSource f11002b;

    public a(TaskCompletionSource taskCompletionSource) {
        this.f11002b = taskCompletionSource;
    }

    @Override
    public final void H(Status status) {
        h5.a(status, null, this.f11002b);
    }
}
