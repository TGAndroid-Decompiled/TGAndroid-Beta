package d9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class a implements c, IInterface {
    public final IBinder f8592a;

    public a(IBinder iBinder) {
        this.f8592a = iBinder;
    }

    public final Parcel H0(Parcel parcel, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f8592a.transact(i3, parcel, obtain, 0);
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

    @Override
    public final IBinder asBinder() {
        return this.f8592a;
    }
}
