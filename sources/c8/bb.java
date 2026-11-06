package c8;

import android.os.Parcel;
import android.os.RemoteException;
public abstract class bb {
    public static void a(p4.l lVar) {
        if (lVar != null) {
            try {
                p4.k kVar = (p4.k) lVar;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(0);
                kVar.f53243a.transact(3006, obtain, null, 1);
                obtain.recycle();
            } catch (RemoteException unused) {
            }
        }
    }
}
