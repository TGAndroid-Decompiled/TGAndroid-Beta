package defpackage;

import android.os.IBinder;
import android.os.Parcel;
public final class hk5 implements jk5 {
    public IBinder a;

    @Override
    public final IBinder asBinder() {
        return this.a;
    }

    @Override
    public final void g(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i);
            this.a.transact(9, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void i(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i);
            this.a.transact(12, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void j(sf8 sf8Var) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(1);
            sf8Var.writeToParcel(obtain, 0);
            this.a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
