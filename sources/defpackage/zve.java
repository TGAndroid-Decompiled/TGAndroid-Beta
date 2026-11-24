package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
public abstract class zve {
    public static void a(dk5 dk5Var) {
        if (dk5Var != null) {
            try {
                ck5 ck5Var = (ck5) dk5Var;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(0);
                ck5Var.a.transact(3006, obtain, null, 1);
                obtain.recycle();
            } catch (RemoteException unused) {
            }
        }
    }
}
