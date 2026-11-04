package o4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import b8.ve;
public final class k implements l {
    public IBinder f20742a;

    public final void H0(int i3, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i3);
            ve.a(obtain, bundle);
            this.f20742a.transact(3001, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f20742a;
    }
}
