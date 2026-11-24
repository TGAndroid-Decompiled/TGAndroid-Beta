package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.PlaybackStateCompat;
public final class ki5 implements mi5 {
    public IBinder a;

    @Override
    public final void C(ii5 ii5Var) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongInterface(ii5Var);
            this.a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final void F(ii5 ii5Var) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongInterface(ii5Var);
            this.a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.a;
    }

    @Override
    public final PlaybackStateCompat h() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.a.transact(28, obtain, obtain2, 0);
            obtain2.readException();
            return (PlaybackStateCompat) eke.a(obtain2, PlaybackStateCompat.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
