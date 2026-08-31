package b6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class z implements IInterface {
    public final IBinder f1798a;

    public z(IBinder iBinder) {
        this.f1798a = iBinder;
    }

    public final void E0(c0 c0Var, f fVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(c0Var);
            obtain.writeInt(1);
            w.a.a(fVar, obtain, 0);
            this.f1798a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f1798a;
    }
}
