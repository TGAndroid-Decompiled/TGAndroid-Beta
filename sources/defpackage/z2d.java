package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class z2d extends e1d {
    public final TaskCompletionSource b;

    public z2d(TaskCompletionSource taskCompletionSource) {
        super((byte) 0, false);
        this.b = taskCompletionSource;
        attachInterface(this, "com.google.firebase.pnv.internal.IFpnvCallbacks");
    }
}
