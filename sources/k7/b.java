package k7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class b implements d, IInterface {
    public final IBinder f17222a;

    public b(IBinder iBinder) {
        this.f17222a = iBinder;
    }

    public final void H0(Parcel parcel, int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f17222a.transact(i7, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f17222a;
    }
}
