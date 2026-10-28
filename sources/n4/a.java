package n4;

import android.os.IBinder;
import android.os.Parcel;
public final class a implements b {
    public IBinder f18652a;

    @Override
    public final IBinder asBinder() {
        return this.f18652a;
    }

    @Override
    public final void h(int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i10);
            if (!this.f18652a.transact(12, obtain, null, 1)) {
                int i11 = e.f18657b;
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
            if (!this.f18652a.transact(9, obtain, null, 1)) {
                int i11 = e.f18657b;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void r(z zVar) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(1);
            zVar.writeToParcel(obtain, 0);
            if (!this.f18652a.transact(3, obtain, null, 1)) {
                int i10 = e.f18657b;
            }
        } finally {
            obtain.recycle();
        }
    }
}
