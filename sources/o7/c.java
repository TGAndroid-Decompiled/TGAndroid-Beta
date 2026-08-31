package o7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class c implements IInterface {
    public final IBinder f16619a;

    public c(IBinder iBinder) {
        this.f16619a = iBinder;
    }

    public final void E0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f16619a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f16619a;
    }
}
