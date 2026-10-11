package h7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class b implements d, IInterface {
    public final IBinder f11027a;

    public b(IBinder iBinder) {
        this.f11027a = iBinder;
    }

    public final void F0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f11027a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f11027a;
    }
}
