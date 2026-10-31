package d6;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
public abstract class f {
    public static final g6.b f5774b = new g6.b("Session", null);
    public final x f5775a;

    public f(Context context, String str, String str2) {
        x xVar;
        try {
            xVar = com.google.android.gms.internal.cast.d.b(context).Z0(str, str2, new j(this));
        } catch (RemoteException | d e) {
            com.google.android.gms.internal.cast.d.f4635a.a(e, "Unable to call %s on %s.", "newSessionImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            xVar = null;
        }
        this.f5775a = xVar;
    }

    public final String a() {
        n6.l.d("Must be called from the main thread.");
        x xVar = this.f5775a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel R0 = vVar.R0(vVar.P0(), 3);
                String readString = R0.readString();
                R0.recycle();
                return readString;
            } catch (RemoteException e) {
                f5774b.a(e, "Unable to call %s on %s.", "getSessionId", x.class.getSimpleName());
            }
        }
        return null;
    }

    public final boolean b() {
        boolean z10;
        n6.l.d("Must be called from the main thread.");
        x xVar = this.f5775a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel R0 = vVar.R0(vVar.P0(), 5);
                int i10 = com.google.android.gms.internal.cast.u.f4789a;
                if (R0.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                R0.recycle();
                return z10;
            } catch (RemoteException e) {
                f5774b.a(e, "Unable to call %s on %s.", "isConnected", x.class.getSimpleName());
            }
        }
        return false;
    }

    public final boolean c() {
        boolean z10;
        n6.l.d("Must be called from the main thread.");
        x xVar = this.f5775a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel R0 = vVar.R0(vVar.P0(), 6);
                int i10 = com.google.android.gms.internal.cast.u.f4789a;
                if (R0.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                R0.recycle();
                return z10;
            } catch (RemoteException e) {
                f5774b.a(e, "Unable to call %s on %s.", "isConnecting", x.class.getSimpleName());
            }
        }
        return false;
    }

    public final void d(int i10) {
        x xVar = this.f5775a;
        if (xVar == null) {
            return;
        }
        try {
            v vVar = (v) xVar;
            Parcel P0 = vVar.P0();
            P0.writeInt(i10);
            vVar.T0(P0, 13);
        } catch (RemoteException e) {
            f5774b.a(e, "Unable to call %s on %s.", "notifySessionEnded", x.class.getSimpleName());
        }
    }

    public final int e() {
        n6.l.d("Must be called from the main thread.");
        x xVar = this.f5775a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel R0 = vVar.R0(vVar.P0(), 17);
                int readInt = R0.readInt();
                R0.recycle();
                if (readInt >= 211100000) {
                    v vVar2 = (v) xVar;
                    Parcel R02 = vVar2.R0(vVar2.P0(), 18);
                    int readInt2 = R02.readInt();
                    R02.recycle();
                    return readInt2;
                }
            } catch (RemoteException e) {
                f5774b.a(e, "Unable to call %s on %s.", "getSessionStartType", x.class.getSimpleName());
            }
        }
        return 0;
    }

    public final x6.a f() {
        x xVar = this.f5775a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel R0 = vVar.R0(vVar.P0(), 1);
                x6.a M0 = x6.b.M0(R0.readStrongBinder());
                R0.recycle();
                return M0;
            } catch (RemoteException e) {
                f5774b.a(e, "Unable to call %s on %s.", "getWrappedObject", x.class.getSimpleName());
            }
        }
        return null;
    }
}
