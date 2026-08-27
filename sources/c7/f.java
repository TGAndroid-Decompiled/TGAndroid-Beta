package c7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import g7.g5;

public final class f extends com.google.android.gms.common.api.internal.i {

    public final Object f2463b;

    public final TaskCompletionSource f2464c;

    public f(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f2463b = bool;
        this.f2464c = taskCompletionSource;
    }

    @Override
    public final void B(Status status) {
        g5.a(status, this.f2463b, this.f2464c);
    }
}
