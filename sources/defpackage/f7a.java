package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
public abstract class f7a {
    public static final ce6 b = new ce6("Session", null);
    public final icd a;

    public f7a(Context context, String str, String str2) {
        icd icdVar;
        try {
            icdVar = v8d.b(context).b0(str, str2, new t7d(this));
        } catch (RemoteException | sg7 e) {
            v8d.a.a(e, "Unable to call %s on %s.", "newSessionImpl", q9d.class.getSimpleName());
            icdVar = null;
        }
        this.a = icdVar;
    }

    public final String a() {
        ite.e("Must be called from the main thread.");
        icd icdVar = this.a;
        if (icdVar != null) {
            try {
                vbd vbdVar = (vbd) icdVar;
                Parcel T = vbdVar.T(vbdVar.R(), 3);
                String readString = T.readString();
                T.recycle();
                return readString;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "getSessionId", icd.class.getSimpleName());
            }
        }
        return null;
    }

    public final boolean b() {
        boolean z;
        ite.e("Must be called from the main thread.");
        icd icdVar = this.a;
        if (icdVar != null) {
            try {
                vbd vbdVar = (vbd) icdVar;
                Parcel T = vbdVar.T(vbdVar.R(), 5);
                int i = kid.a;
                if (T.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                T.recycle();
                return z;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "isConnected", icd.class.getSimpleName());
            }
        }
        return false;
    }

    public final boolean c() {
        boolean z;
        ite.e("Must be called from the main thread.");
        icd icdVar = this.a;
        if (icdVar != null) {
            try {
                vbd vbdVar = (vbd) icdVar;
                Parcel T = vbdVar.T(vbdVar.R(), 6);
                int i = kid.a;
                if (T.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                T.recycle();
                return z;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "isConnecting", icd.class.getSimpleName());
            }
        }
        return false;
    }

    public final void d(int i) {
        icd icdVar = this.a;
        if (icdVar == null) {
            return;
        }
        try {
            vbd vbdVar = (vbd) icdVar;
            Parcel R = vbdVar.R();
            R.writeInt(i);
            vbdVar.V(R, 13);
        } catch (RemoteException e) {
            b.a(e, "Unable to call %s on %s.", "notifySessionEnded", icd.class.getSimpleName());
        }
    }

    public final int e() {
        ite.e("Must be called from the main thread.");
        icd icdVar = this.a;
        if (icdVar != null) {
            try {
                vbd vbdVar = (vbd) icdVar;
                Parcel T = vbdVar.T(vbdVar.R(), 17);
                int readInt = T.readInt();
                T.recycle();
                if (readInt >= 211100000) {
                    vbd vbdVar2 = (vbd) icdVar;
                    Parcel T2 = vbdVar2.T(vbdVar2.R(), 18);
                    int readInt2 = T2.readInt();
                    T2.recycle();
                    return readInt2;
                }
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "getSessionStartType", icd.class.getSimpleName());
            }
        }
        return 0;
    }

    public final xk5 f() {
        icd icdVar = this.a;
        if (icdVar != null) {
            try {
                vbd vbdVar = (vbd) icdVar;
                Parcel T = vbdVar.T(vbdVar.R(), 1);
                xk5 T2 = eq7.T(T.readStrongBinder());
                T.recycle();
                return T2;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "getWrappedObject", icd.class.getSimpleName());
            }
        }
        return null;
    }
}
