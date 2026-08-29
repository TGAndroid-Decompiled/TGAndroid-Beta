package n8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class a implements c, IInterface {
    public final IBinder f17162a;

    public a(IBinder iBinder) {
        this.f17162a = iBinder;
    }

    public final Parcel E0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f17162a.transact(i10, parcel, obtain, 0);
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
        return this.f17162a;
    }
}
