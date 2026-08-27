package m8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class a implements c, IInterface {

    public final IBinder f17879a;

    public a(IBinder iBinder) {
        this.f17879a = iBinder;
    }

    public final Parcel E0(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f17879a.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e9) {
                parcelObtain.recycle();
                throw e9;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f17879a;
    }
}
