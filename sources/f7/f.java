package f7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.p5;
public final class f extends com.google.android.gms.common.api.internal.i {
    public final Object f6124b;
    public final TaskCompletionSource f6125c;

    public f(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.f6124b = bool;
        this.f6125c = taskCompletionSource;
    }

    @Override
    public final void z(Status status) {
        p5.a(status, this.f6124b, this.f6125c);
    }
}
