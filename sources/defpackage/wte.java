package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
public abstract class wte {
    public static void a(ei5 ei5Var) {
        if (ei5Var != null) {
            try {
                di5 di5Var = (di5) ei5Var;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(0);
                di5Var.a.transact(3006, obtain, null, 1);
                obtain.recycle();
            } catch (RemoteException unused) {
            }
        }
    }
}
