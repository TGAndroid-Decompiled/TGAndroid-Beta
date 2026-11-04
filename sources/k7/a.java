package k7;

import b8.y9;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class a extends com.google.android.gms.common.api.internal.h {
    public final TaskCompletionSource f16898b;

    public a(TaskCompletionSource taskCompletionSource) {
        this.f16898b = taskCompletionSource;
    }

    @Override
    public final void G(Status status) {
        y9.a(status, null, this.f16898b);
    }
}
