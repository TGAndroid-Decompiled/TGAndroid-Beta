package n4;

import android.os.IBinder;
import android.os.Parcel;
public final class a implements b {
    public IBinder f13492a;

    @Override
    public final IBinder asBinder() {
        return this.f13492a;
    }

    @Override
    public final void c(int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i10);
            if (!this.f13492a.transact(9, obtain, null, 1)) {
                int i11 = e.f13494b;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void i(int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i10);
            if (!this.f13492a.transact(12, obtain, null, 1)) {
                int i11 = e.f13494b;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void u(w wVar) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(1);
            wVar.writeToParcel(obtain, 0);
            if (!this.f13492a.transact(3, obtain, null, 1)) {
                int i10 = e.f13494b;
            }
        } finally {
            obtain.recycle();
        }
    }
}
