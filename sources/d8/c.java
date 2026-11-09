package d8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class c implements IInterface {
    public final IBinder f8211a;

    public c(IBinder iBinder) {
        this.f8211a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f8211a;
    }

    public final void h1(Parcel parcel, int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f8211a.transact(i7, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
