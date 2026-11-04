package j7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class b implements d, IInterface {
    public final IBinder f16207a;

    public b(IBinder iBinder) {
        this.f16207a = iBinder;
    }

    public final void H0(Parcel parcel, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f16207a.transact(i3, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f16207a;
    }
}
