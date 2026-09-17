package a8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class c implements IInterface {
    public final IBinder f318a;

    public c(IBinder iBinder) {
        this.f318a = iBinder;
    }

    public final void G0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f318a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f318a;
    }
}
