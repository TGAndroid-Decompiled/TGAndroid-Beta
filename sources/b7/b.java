package b7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.tasks.TaskCompletionSource;
import q9.c;
public final class b extends Binder implements IInterface {
    public final int f2602a;
    public final Object f2603b;

    public b(int i10, TaskCompletionSource taskCompletionSource) {
        this.f2602a = i10;
        switch (i10) {
            case 1:
                this.f2603b = taskCompletionSource;
                attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
                return;
            default:
                this.f2603b = taskCompletionSource;
                attachInterface(this, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
                return;
        }
    }

    @Override
    public final IBinder asBinder() {
        int i10 = this.f2602a;
        return this;
    }

    @Override
    public final boolean onTransact(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: b7.b.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public b(c cVar) {
        this.f2602a = 2;
        attachInterface(this, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        this.f2603b = cVar;
    }
}
