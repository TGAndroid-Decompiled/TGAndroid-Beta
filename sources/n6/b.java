package n6;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.tasks.TaskCompletionSource;
import z8.c;
public final class b extends Binder implements IInterface {
    public final int f17155a;
    public final Object f17156b;

    public b(int i10, TaskCompletionSource taskCompletionSource) {
        this.f17155a = i10;
        switch (i10) {
            case 1:
                this.f17156b = taskCompletionSource;
                attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
                return;
            default:
                this.f17156b = taskCompletionSource;
                attachInterface(this, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
                return;
        }
    }

    @Override
    public final IBinder asBinder() {
        int i10 = this.f17155a;
        return this;
    }

    @Override
    public final boolean onTransact(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: n6.b.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public b(c cVar) {
        this.f17155a = 2;
        attachInterface(this, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        this.f17156b = cVar;
    }
}
