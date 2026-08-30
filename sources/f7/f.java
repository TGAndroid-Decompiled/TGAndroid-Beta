package f7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.r5;
public final class f extends com.google.android.gms.common.api.internal.i {
    public final Object f6016b;
    public final TaskCompletionSource f6017c;

    public f(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f6016b = bool;
        this.f6017c = taskCompletionSource;
    }

    @Override
    public final void z(Status status) {
        r5.a(status, this.f6016b, this.f6017c);
    }
}
