package l7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class c implements IInterface {

    public final IBinder f15445a;

    public c(IBinder iBinder) {
        this.f15445a = iBinder;
    }

    public final void E0(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f15445a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f15445a;
    }
}
