package db;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class u extends a8.q {
    public final TaskCompletionSource f8598b;

    public u(TaskCompletionSource taskCompletionSource) {
        super(4);
        this.f8598b = taskCompletionSource;
        attachInterface(this, "com.google.firebase.pnv.internal.IFpnvCallbacks");
    }
}
