package h7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class b implements d, IInterface {
    public final IBinder f10894a;

    public b(IBinder iBinder) {
        this.f10894a = iBinder;
    }

    public final void G0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f10894a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f10894a;
    }
}
