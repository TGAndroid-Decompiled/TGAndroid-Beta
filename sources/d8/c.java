package d8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class c implements IInterface {
    public final IBinder f8216a;

    public c(IBinder iBinder) {
        this.f8216a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f8216a;
    }

    public final void h1(Parcel parcel, int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f8216a.transact(i7, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
