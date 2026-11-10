package e7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import o7.d;
import t9.c;
public final class b extends Binder implements IInterface {
    public final int f10722a;
    public final Object f10723b;

    public b(int i7, TaskCompletionSource taskCompletionSource) {
        this.f10722a = i7;
        switch (i7) {
            case 1:
                this.f10723b = taskCompletionSource;
                attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
                return;
            default:
                this.f10723b = taskCompletionSource;
                attachInterface(this, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
                return;
        }
    }

    @Override
    public final IBinder asBinder() {
        int i7 = this.f10722a;
        return this;
    }

    @Override
    public final boolean onTransact(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: e7.b.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public b(d dVar, TaskCompletionSource taskCompletionSource) {
        this.f10722a = 2;
        this.f10723b = taskCompletionSource;
        Objects.requireNonNull(dVar);
        attachInterface(this, "com.google.android.gms.cloudmessaging.internal.IRegisterCallback");
    }

    public b(c cVar) {
        this.f10722a = 3;
        attachInterface(this, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        this.f10723b = cVar;
    }
}
