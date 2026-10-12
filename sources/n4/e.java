package n4;

import android.os.IBinder;
import android.os.Parcel;
public final class e implements f {
    public IBinder f16299a;

    @Override
    public final IBinder asBinder() {
        return this.f16299a;
    }

    @Override
    public final void h(int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i10);
            if (!this.f16299a.transact(12, obtain, null, 1)) {
                int i11 = i.f16320b;
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
            if (!this.f16299a.transact(9, obtain, null, 1)) {
                int i11 = i.f16320b;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void t(g0 g0Var) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(1);
            g0Var.writeToParcel(obtain, 0);
            if (!this.f16299a.transact(3, obtain, null, 1)) {
                int i10 = i.f16320b;
            }
        } finally {
            obtain.recycle();
        }
    }
}
