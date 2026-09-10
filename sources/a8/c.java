package a8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class c implements IInterface {
    public final IBinder f305a;

    public c(IBinder iBinder) {
        this.f305a = iBinder;
    }

    public final void G0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f305a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f305a;
    }
}
