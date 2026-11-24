package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class ih5 implements kh5, IInterface {
    public final IBinder a;

    public ih5(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void a(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.a;
    }
}
