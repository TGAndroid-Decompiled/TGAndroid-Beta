package m4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
public final class h implements i {
    public IBinder f14759a;

    public final void G0(int i10, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.s.a(obtain, bundle);
            this.f14759a.transact(3001, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f14759a;
    }
}
