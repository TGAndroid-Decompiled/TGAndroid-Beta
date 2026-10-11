package n6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class z implements IInterface {
    public final IBinder f16780a;

    public z(IBinder iBinder) {
        this.f16780a = iBinder;
    }

    public final void F0(c0 c0Var, f fVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(c0Var);
            obtain.writeInt(1);
            m8.h.a(fVar, obtain, 0);
            this.f16780a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f16780a;
    }
}
