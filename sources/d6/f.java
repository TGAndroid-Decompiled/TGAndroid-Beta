package d6;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
public abstract class f {
    public static final g6.b f6610b = new g6.b("Session", null);
    public final x f6611a;

    public f(Context context, String str, String str2) {
        x xVar;
        try {
            xVar = com.google.android.gms.internal.cast.e.b(context).Y0(str, str2, new j(this));
        } catch (RemoteException | d e7) {
            com.google.android.gms.internal.cast.e.f5277a.a(e7, "Unable to call %s on %s.", "newSessionImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            xVar = null;
        }
        this.f6611a = xVar;
    }

    public final String a() {
        n6.l.e("Must be called from the main thread.");
        x xVar = this.f6611a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel Q0 = vVar.Q0(vVar.O0(), 3);
                String readString = Q0.readString();
                Q0.recycle();
                return readString;
            } catch (RemoteException e7) {
                f6610b.a(e7, "Unable to call %s on %s.", "getSessionId", x.class.getSimpleName());
            }
        }
        return null;
    }

    public final boolean b() {
        boolean z10;
        n6.l.e("Must be called from the main thread.");
        x xVar = this.f6611a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel Q0 = vVar.Q0(vVar.O0(), 5);
                int i10 = com.google.android.gms.internal.cast.v.f5487a;
                if (Q0.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Q0.recycle();
                return z10;
            } catch (RemoteException e7) {
                f6610b.a(e7, "Unable to call %s on %s.", "isConnected", x.class.getSimpleName());
            }
        }
        return false;
    }

    public final boolean c() {
        boolean z10;
        n6.l.e("Must be called from the main thread.");
        x xVar = this.f6611a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel Q0 = vVar.Q0(vVar.O0(), 6);
                int i10 = com.google.android.gms.internal.cast.v.f5487a;
                if (Q0.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Q0.recycle();
                return z10;
            } catch (RemoteException e7) {
                f6610b.a(e7, "Unable to call %s on %s.", "isConnecting", x.class.getSimpleName());
            }
        }
        return false;
    }

    public final void d(int i10) {
        x xVar = this.f6611a;
        if (xVar == null) {
            return;
        }
        try {
            v vVar = (v) xVar;
            Parcel O0 = vVar.O0();
            O0.writeInt(i10);
            vVar.S0(O0, 13);
        } catch (RemoteException e7) {
            f6610b.a(e7, "Unable to call %s on %s.", "notifySessionEnded", x.class.getSimpleName());
        }
    }

    public final int e() {
        n6.l.e("Must be called from the main thread.");
        x xVar = this.f6611a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel Q0 = vVar.Q0(vVar.O0(), 17);
                int readInt = Q0.readInt();
                Q0.recycle();
                if (readInt >= 211100000) {
                    v vVar2 = (v) xVar;
                    Parcel Q02 = vVar2.Q0(vVar2.O0(), 18);
                    int readInt2 = Q02.readInt();
                    Q02.recycle();
                    return readInt2;
                }
            } catch (RemoteException e7) {
                f6610b.a(e7, "Unable to call %s on %s.", "getSessionStartType", x.class.getSimpleName());
            }
        }
        return 0;
    }

    public final x6.a f() {
        x xVar = this.f6611a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel Q0 = vVar.Q0(vVar.O0(), 1);
                x6.a L0 = x6.b.L0(Q0.readStrongBinder());
                Q0.recycle();
                return L0;
            } catch (RemoteException e7) {
                f6610b.a(e7, "Unable to call %s on %s.", "getWrappedObject", x.class.getSimpleName());
            }
        }
        return null;
    }
}
