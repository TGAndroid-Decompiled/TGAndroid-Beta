package k7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class b implements d, IInterface {
    public final IBinder f17225a;

    public b(IBinder iBinder) {
        this.f17225a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f17225a;
    }

    public final void h1(Parcel parcel, int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f17225a.transact(i7, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
