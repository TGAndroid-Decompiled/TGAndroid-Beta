package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.PlaybackStateCompat;
public final class jk5 implements lk5 {
    public IBinder a;

    @Override
    public final void C(hk5 hk5Var) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongInterface(hk5Var);
            this.a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final void F(hk5 hk5Var) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongInterface(hk5Var);
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
            return (PlaybackStateCompat) gme.a(obtain2, PlaybackStateCompat.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
