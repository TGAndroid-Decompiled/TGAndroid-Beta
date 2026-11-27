package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
public abstract class v8a {
    public static final he6 b = new he6("Session", null);
    public final zed a;

    public v8a(Context context, String str, String str2) {
        zed zedVar;
        try {
            zedVar = mbd.b(context).b0(str, str2, new kad(this));
        } catch (RemoteException | zg7 e) {
            mbd.a.a(e, "Unable to call %s on %s.", "newSessionImpl", hcd.class.getSimpleName());
            zedVar = null;
        }
        this.a = zedVar;
    }

    public final String a() {
        xve.e("Must be called from the main thread.");
        zed zedVar = this.a;
        if (zedVar != null) {
            try {
                med medVar = (med) zedVar;
                Parcel T = medVar.T(medVar.R(), 3);
                String readString = T.readString();
                T.recycle();
                return readString;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "getSessionId", zed.class.getSimpleName());
            }
        }
        return null;
    }

    public final boolean b() {
        boolean z;
        xve.e("Must be called from the main thread.");
        zed zedVar = this.a;
        if (zedVar != null) {
            try {
                med medVar = (med) zedVar;
                Parcel T = medVar.T(medVar.R(), 5);
                int i = ald.a;
                if (T.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                T.recycle();
                return z;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "isConnected", zed.class.getSimpleName());
            }
        }
        return false;
    }

    public final boolean c() {
        boolean z;
        xve.e("Must be called from the main thread.");
        zed zedVar = this.a;
        if (zedVar != null) {
            try {
                med medVar = (med) zedVar;
                Parcel T = medVar.T(medVar.R(), 6);
                int i = ald.a;
                if (T.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                T.recycle();
                return z;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "isConnecting", zed.class.getSimpleName());
            }
        }
        return false;
    }

    public final void d(int i) {
        zed zedVar = this.a;
        if (zedVar == null) {
            return;
        }
        try {
            med medVar = (med) zedVar;
            Parcel R = medVar.R();
            R.writeInt(i);
            medVar.V(R, 13);
        } catch (RemoteException e) {
            b.a(e, "Unable to call %s on %s.", "notifySessionEnded", zed.class.getSimpleName());
        }
    }

    public final int e() {
        xve.e("Must be called from the main thread.");
        zed zedVar = this.a;
        if (zedVar != null) {
            try {
                med medVar = (med) zedVar;
                Parcel T = medVar.T(medVar.R(), 17);
                int readInt = T.readInt();
                T.recycle();
                if (readInt >= 211100000) {
                    med medVar2 = (med) zedVar;
                    Parcel T2 = medVar2.T(medVar2.R(), 18);
                    int readInt2 = T2.readInt();
                    T2.recycle();
                    return readInt2;
                }
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "getSessionStartType", zed.class.getSimpleName());
            }
        }
        return 0;
    }

    public final al5 f() {
        zed zedVar = this.a;
        if (zedVar != null) {
            try {
                med medVar = (med) zedVar;
                Parcel T = medVar.T(medVar.R(), 1);
                al5 T2 = br7.T(T.readStrongBinder());
                T.recycle();
                return T2;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "getWrappedObject", zed.class.getSimpleName());
            }
        }
        return null;
    }
}
