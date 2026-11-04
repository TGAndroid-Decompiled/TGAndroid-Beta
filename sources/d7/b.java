package d7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import n7.d;
import s9.c;
public final class b extends Binder implements IInterface {
    public final int f8585a;
    public final Object f8586b;

    public b(int i3, TaskCompletionSource taskCompletionSource) {
        this.f8585a = i3;
        switch (i3) {
            case 1:
                this.f8586b = taskCompletionSource;
                attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
                return;
            default:
                this.f8586b = taskCompletionSource;
                attachInterface(this, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
                return;
        }
    }

    @Override
    public final IBinder asBinder() {
        int i3 = this.f8585a;
        return this;
    }

    @Override
    public final boolean onTransact(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: d7.b.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public b(d dVar, TaskCompletionSource taskCompletionSource) {
        this.f8585a = 2;
        this.f8586b = taskCompletionSource;
        Objects.requireNonNull(dVar);
        attachInterface(this, "com.google.android.gms.cloudmessaging.internal.IRegisterCallback");
    }

    public b(c cVar) {
        this.f8585a = 3;
        attachInterface(this, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        this.f8586b = cVar;
    }
}
