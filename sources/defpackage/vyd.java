package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class vyd extends Binder implements IInterface {
    public final byte a;
    public final TaskCompletionSource b;

    public vyd(TaskCompletionSource taskCompletionSource, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.b = taskCompletionSource;
                attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
                return;
            default:
                this.b = taskCompletionSource;
                attachInterface(this, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
                return;
        }
    }

    @Override
    public final IBinder asBinder() {
        byte b = this.a;
        return this;
    }

    @Override
    public final boolean onTransact(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vyd.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public vyd(u84 u84Var, TaskCompletionSource taskCompletionSource) {
        this.a = (byte) 1;
        this.b = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.cloudmessaging.internal.IRegisterCallback");
    }
}
