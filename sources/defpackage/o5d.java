package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class o5d extends u3d {
    public final TaskCompletionSource b;

    public o5d(TaskCompletionSource taskCompletionSource) {
        super((byte) 0, false);
        this.b = taskCompletionSource;
        attachInterface(this, "com.google.firebase.pnv.internal.IFpnvCallbacks");
    }
}
