package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class y9d implements IInterface {
    public final IBinder a;

    public y9d(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void a(esd esdVar, gv4 gv4Var) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(esdVar);
            obtain.writeInt(1);
            t4f.a(gv4Var, obtain, 0);
            this.a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.a;
    }
}
