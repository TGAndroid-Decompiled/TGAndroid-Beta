package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class bj5 implements dj5, IInterface {
    public final IBinder a;

    public bj5(IBinder iBinder) {
        this.a = iBinder;
    }

    public final Parcel a(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.a.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.a;
    }
}
