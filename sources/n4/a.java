package n4;

import android.os.IBinder;
import android.os.Parcel;
public final class a implements b {
    public IBinder f17085a;

    @Override
    public final IBinder asBinder() {
        return this.f17085a;
    }

    @Override
    public final void h(int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i10);
            if (!this.f17085a.transact(12, obtain, null, 1)) {
                int i11 = e.f17087b;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i10);
            if (!this.f17085a.transact(9, obtain, null, 1)) {
                int i11 = e.f17087b;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void t(y yVar) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(1);
            yVar.writeToParcel(obtain, 0);
            if (!this.f17085a.transact(3, obtain, null, 1)) {
                int i10 = e.f17087b;
            }
        } finally {
            obtain.recycle();
        }
    }
}
