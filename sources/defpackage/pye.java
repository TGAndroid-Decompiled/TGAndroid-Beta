package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
public abstract class pye {
    public static void a(gk5 gk5Var) {
        if (gk5Var != null) {
            try {
                fk5 fk5Var = (fk5) gk5Var;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(0);
                fk5Var.a.transact(3006, obtain, null, 1);
                obtain.recycle();
            } catch (RemoteException unused) {
            }
        }
    }
}
