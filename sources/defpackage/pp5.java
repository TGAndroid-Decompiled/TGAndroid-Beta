package defpackage;

import android.os.IInterface;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class pp5 extends dzc implements IInterface {
    public final byte b;
    public final TaskCompletionSource c;

    public pp5(TaskCompletionSource taskCompletionSource, byte b) {
        super((byte) 7, false);
        this.b = b;
        this.c = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }
}
