package defpackage;

import android.os.IInterface;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class sr5 extends u3d implements IInterface {
    public final byte b;
    public final TaskCompletionSource c;

    public sr5(TaskCompletionSource taskCompletionSource, byte b) {
        super((byte) 7, false);
        this.b = b;
        this.c = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }
}
