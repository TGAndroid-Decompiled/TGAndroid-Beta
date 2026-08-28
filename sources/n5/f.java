package n5;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
public abstract class f {
    public static final q5.b f18489b = new q5.b("Session", null);
    public final x f18490a;

    public f(Context context, String str, String str2) {
        x xVar;
        try {
            xVar = com.google.android.gms.internal.cast.e.b(context).W0(str, str2, new j(this));
        } catch (RemoteException | d e10) {
            com.google.android.gms.internal.cast.e.f3087a.a(e10, "Unable to call %s on %s.", "newSessionImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            xVar = null;
        }
        this.f18490a = xVar;
    }

    public final String a() {
        x5.l.e("Must be called from the main thread.");
        x xVar = this.f18490a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel O0 = vVar.O0(vVar.M0(), 3);
                String readString = O0.readString();
                O0.recycle();
                return readString;
            } catch (RemoteException e10) {
                f18489b.a(e10, "Unable to call %s on %s.", "getSessionId", x.class.getSimpleName());
            }
        }
        return null;
    }

    public final boolean b() {
        boolean z10;
        x5.l.e("Must be called from the main thread.");
        x xVar = this.f18490a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel O0 = vVar.O0(vVar.M0(), 5);
                int i9 = com.google.android.gms.internal.cast.u.f3239a;
                if (O0.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                O0.recycle();
                return z10;
            } catch (RemoteException e10) {
                f18489b.a(e10, "Unable to call %s on %s.", "isConnected", x.class.getSimpleName());
            }
        }
        return false;
    }

    public final boolean c() {
        boolean z10;
        x5.l.e("Must be called from the main thread.");
        x xVar = this.f18490a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel O0 = vVar.O0(vVar.M0(), 6);
                int i9 = com.google.android.gms.internal.cast.u.f3239a;
                if (O0.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                O0.recycle();
                return z10;
            } catch (RemoteException e10) {
                f18489b.a(e10, "Unable to call %s on %s.", "isConnecting", x.class.getSimpleName());
            }
        }
        return false;
    }

    public final void d(int i9) {
        x xVar = this.f18490a;
        if (xVar == null) {
            return;
        }
        try {
            v vVar = (v) xVar;
            Parcel M0 = vVar.M0();
            M0.writeInt(i9);
            vVar.Q0(M0, 13);
        } catch (RemoteException e10) {
            f18489b.a(e10, "Unable to call %s on %s.", "notifySessionEnded", x.class.getSimpleName());
        }
    }

    public final int e() {
        x5.l.e("Must be called from the main thread.");
        x xVar = this.f18490a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel O0 = vVar.O0(vVar.M0(), 17);
                int readInt = O0.readInt();
                O0.recycle();
                if (readInt >= 211100000) {
                    v vVar2 = (v) xVar;
                    Parcel O02 = vVar2.O0(vVar2.M0(), 18);
                    int readInt2 = O02.readInt();
                    O02.recycle();
                    return readInt2;
                }
            } catch (RemoteException e10) {
                f18489b.a(e10, "Unable to call %s on %s.", "getSessionStartType", x.class.getSimpleName());
            }
        }
        return 0;
    }

    public final h6.a f() {
        x xVar = this.f18490a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel O0 = vVar.O0(vVar.M0(), 1);
                h6.a J0 = h6.b.J0(O0.readStrongBinder());
                O0.recycle();
                return J0;
            } catch (RemoteException e10) {
                f18489b.a(e10, "Unable to call %s on %s.", "getWrappedObject", x.class.getSimpleName());
            }
        }
        return null;
    }
}
