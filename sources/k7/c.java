package k7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class c implements IInterface {
    public final IBinder f14663a;

    public c(IBinder iBinder) {
        this.f14663a = iBinder;
    }

    public final void E0(Parcel parcel, int i9) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f14663a.transact(i9, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f14663a;
    }
}
