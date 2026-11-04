package b8;

import android.os.Parcel;
import android.os.RemoteException;
public abstract class ye {
    public static void a(o4.l lVar) {
        if (lVar != null) {
            try {
                o4.k kVar = (o4.k) lVar;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(0);
                kVar.f20742a.transact(3006, obtain, null, 1);
                obtain.recycle();
            } catch (RemoteException unused) {
            }
        }
    }
}
