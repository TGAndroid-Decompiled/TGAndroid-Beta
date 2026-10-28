package m4;

import a8.ge;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
public final class l implements m {
    public IBinder f18121a;

    public final void F0(int i10, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i10);
            ge.a(obtain, bundle);
            this.f18121a.transact(3001, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f18121a;
    }
}
