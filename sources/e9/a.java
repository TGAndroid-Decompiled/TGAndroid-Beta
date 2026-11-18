package e9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class a implements c, IInterface {
    public final IBinder f10875a;

    public a(IBinder iBinder) {
        this.f10875a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f10875a;
    }

    public final Parcel h1(Parcel parcel, int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f10875a.transact(i7, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }
}
