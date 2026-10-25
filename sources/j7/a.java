package j7;

import a8.aa;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class a extends com.google.android.gms.common.api.internal.i {
    public final TaskCompletionSource f15532b;

    public a(TaskCompletionSource taskCompletionSource) {
        this.f15532b = taskCompletionSource;
    }

    @Override
    public final void F(Status status) {
        aa.a(status, null, this.f15532b);
    }
}
