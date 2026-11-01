package m4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
public final class l implements m {
    public IBinder f12820a;

    public final void H0(int i10, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            w7.w.a(obtain, bundle);
            this.f12820a.transact(3001, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f12820a;
    }
}
