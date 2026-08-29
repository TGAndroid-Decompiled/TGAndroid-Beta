package ff;

import android.os.IBinder;
import android.os.Parcel;
public final class c implements e {
    public IBinder f6716a;

    public final boolean E0(b bVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            obtain.writeStrongBinder(bVar);
            boolean z10 = false;
            this.f6716a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean F0() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            obtain.writeLong(0L);
            boolean z10 = false;
            this.f6716a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f6716a;
    }
}
