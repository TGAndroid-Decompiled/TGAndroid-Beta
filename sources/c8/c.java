package c8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class c implements IInterface {
    public final IBinder f4239a;

    public c(IBinder iBinder) {
        this.f4239a = iBinder;
    }

    public final void H0(Parcel parcel, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f4239a.transact(i3, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f4239a;
    }
}
