package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
public abstract class d5a {
    public static final dc6 b = new dc6("Session", null);
    public final gad a;

    public d5a(Context context, String str, String str2) {
        gad gadVar;
        try {
            gadVar = t6d.b(context).b0(str, str2, new r5d(this));
        } catch (RemoteException | qe7 e) {
            t6d.a.a(e, "Unable to call %s on %s.", "newSessionImpl", o7d.class.getSimpleName());
            gadVar = null;
        }
        this.a = gadVar;
    }

    public final String a() {
        fre.e("Must be called from the main thread.");
        gad gadVar = this.a;
        if (gadVar != null) {
            try {
                t9d t9dVar = (t9d) gadVar;
                Parcel T = t9dVar.T(t9dVar.R(), 3);
                String readString = T.readString();
                T.recycle();
                return readString;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "getSessionId", gad.class.getSimpleName());
            }
        }
        return null;
    }

    public final boolean b() {
        boolean z;
        fre.e("Must be called from the main thread.");
        gad gadVar = this.a;
        if (gadVar != null) {
            try {
                t9d t9dVar = (t9d) gadVar;
                Parcel T = t9dVar.T(t9dVar.R(), 5);
                int i = jgd.a;
                if (T.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                T.recycle();
                return z;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "isConnected", gad.class.getSimpleName());
            }
        }
        return false;
    }

    public final boolean c() {
        boolean z;
        fre.e("Must be called from the main thread.");
        gad gadVar = this.a;
        if (gadVar != null) {
            try {
                t9d t9dVar = (t9d) gadVar;
                Parcel T = t9dVar.T(t9dVar.R(), 6);
                int i = jgd.a;
                if (T.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                T.recycle();
                return z;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "isConnecting", gad.class.getSimpleName());
            }
        }
        return false;
    }

    public final void d(int i) {
        gad gadVar = this.a;
        if (gadVar == null) {
            return;
        }
        try {
            t9d t9dVar = (t9d) gadVar;
            Parcel R = t9dVar.R();
            R.writeInt(i);
            t9dVar.V(R, 13);
        } catch (RemoteException e) {
            b.a(e, "Unable to call %s on %s.", "notifySessionEnded", gad.class.getSimpleName());
        }
    }

    public final int e() {
        fre.e("Must be called from the main thread.");
        gad gadVar = this.a;
        if (gadVar != null) {
            try {
                t9d t9dVar = (t9d) gadVar;
                Parcel T = t9dVar.T(t9dVar.R(), 17);
                int readInt = T.readInt();
                T.recycle();
                if (readInt >= 211100000) {
                    t9d t9dVar2 = (t9d) gadVar;
                    Parcel T2 = t9dVar2.T(t9dVar2.R(), 18);
                    int readInt2 = T2.readInt();
                    T2.recycle();
                    return readInt2;
                }
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "getSessionStartType", gad.class.getSimpleName());
            }
        }
        return 0;
    }

    public final yi5 f() {
        gad gadVar = this.a;
        if (gadVar != null) {
            try {
                t9d t9dVar = (t9d) gadVar;
                Parcel T = t9dVar.T(t9dVar.R(), 1);
                yi5 T2 = bo7.T(T.readStrongBinder());
                T.recycle();
                return T2;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "getWrappedObject", gad.class.getSimpleName());
            }
        }
        return null;
    }
}
