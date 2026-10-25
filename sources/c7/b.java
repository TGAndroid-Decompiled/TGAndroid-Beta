package c7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.tasks.TaskCompletionSource;
import r9.c;
public final class b extends Binder implements IInterface {
    public final int f6154a;
    public final Object f6155b;

    public b(int i10, TaskCompletionSource taskCompletionSource) {
        this.f6154a = i10;
        switch (i10) {
            case 1:
                this.f6155b = taskCompletionSource;
                attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
                return;
            default:
                this.f6155b = taskCompletionSource;
                attachInterface(this, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
                return;
        }
    }

    @Override
    public final IBinder asBinder() {
        int i10 = this.f6154a;
        return this;
    }

    @Override
    public final boolean onTransact(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: c7.b.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public b(c cVar) {
        this.f6154a = 2;
        attachInterface(this, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        this.f6155b = cVar;
    }
}
