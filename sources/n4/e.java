package n4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
public final class e implements f {
    public IBinder f13766a;

    @Override
    public final IBinder asBinder() {
        return this.f13766a;
    }

    @Override
    public final void h(int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i10);
            if (!this.f13766a.transact(12, obtain, null, 1)) {
                int i11 = i.f13782b;
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
            if (!this.f13766a.transact(9, obtain, null, 1)) {
                int i11 = i.f13782b;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void t(h0 h0Var) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(1);
            h0Var.writeToParcel(obtain, 0);
            if (!this.f13766a.transact(3, obtain, null, 1)) {
                int i10 = i.f13782b;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void t0(String str) {
        Bundle bundle = Bundle.EMPTY;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeString(str);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.f13766a.transact(1, obtain, null, 1)) {
                int i10 = i.f13782b;
            }
            obtain.recycle();
        } catch (Throwable th2) {
            obtain.recycle();
            throw th2;
        }
    }
}
