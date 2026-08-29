package d7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import h7.o5;
public final class e extends com.google.android.gms.common.api.internal.i {
    public final Object f5432b;
    public final TaskCompletionSource f5433c;

    public e(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f5432b = bool;
        this.f5433c = taskCompletionSource;
    }

    @Override
    public final void B(Status status) {
        o5.a(status, this.f5432b, this.f5433c);
    }
}
