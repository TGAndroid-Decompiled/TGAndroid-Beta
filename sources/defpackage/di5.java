package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
public final class di5 implements ei5 {
    public IBinder a;

    public final void a(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            wje.a(obtain, bundle);
            this.a.transact(3001, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.a;
    }
}
