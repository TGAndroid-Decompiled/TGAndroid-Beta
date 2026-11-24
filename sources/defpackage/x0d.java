package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class x0d extends dzc {
    public final TaskCompletionSource b;

    public x0d(TaskCompletionSource taskCompletionSource) {
        super((byte) 0, false);
        this.b = taskCompletionSource;
        attachInterface(this, "com.google.firebase.pnv.internal.IFpnvCallbacks");
    }
}
