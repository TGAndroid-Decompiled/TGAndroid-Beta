package g6;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
public abstract class f {
    public static final j6.b f13557b = new j6.b("Session", null);
    public final x f13558a;

    public f(Context context, String str, String str2) {
        x xVar;
        try {
            xVar = com.google.android.gms.internal.cast.d.b(context).Z0(str, str2, new j(this));
        } catch (RemoteException | d e10) {
            com.google.android.gms.internal.cast.d.f6837a.a(e10, "Unable to call %s on %s.", "newSessionImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            xVar = null;
        }
        this.f13558a = xVar;
    }

    public final String a() {
        q6.m.d("Must be called from the main thread.");
        x xVar = this.f13558a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel R0 = vVar.R0(vVar.P0(), 3);
                String readString = R0.readString();
                R0.recycle();
                return readString;
            } catch (RemoteException e10) {
                f13557b.a(e10, "Unable to call %s on %s.", "getSessionId", x.class.getSimpleName());
            }
        }
        return null;
    }

    public final boolean b() {
        boolean z9;
        q6.m.d("Must be called from the main thread.");
        x xVar = this.f13558a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel R0 = vVar.R0(vVar.P0(), 5);
                int i7 = com.google.android.gms.internal.cast.t.f6991a;
                if (R0.readInt() != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                R0.recycle();
                return z9;
            } catch (RemoteException e10) {
                f13557b.a(e10, "Unable to call %s on %s.", "isConnected", x.class.getSimpleName());
            }
        }
        return false;
    }

    public final boolean c() {
        boolean z9;
        q6.m.d("Must be called from the main thread.");
        x xVar = this.f13558a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel R0 = vVar.R0(vVar.P0(), 6);
                int i7 = com.google.android.gms.internal.cast.t.f6991a;
                if (R0.readInt() != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                R0.recycle();
                return z9;
            } catch (RemoteException e10) {
                f13557b.a(e10, "Unable to call %s on %s.", "isConnecting", x.class.getSimpleName());
            }
        }
        return false;
    }

    public final void d(int i7) {
        x xVar = this.f13558a;
        if (xVar == null) {
            return;
        }
        try {
            v vVar = (v) xVar;
            Parcel P0 = vVar.P0();
            P0.writeInt(i7);
            vVar.T0(P0, 13);
        } catch (RemoteException e10) {
            f13557b.a(e10, "Unable to call %s on %s.", "notifySessionEnded", x.class.getSimpleName());
        }
    }

    public final int e() {
        q6.m.d("Must be called from the main thread.");
        x xVar = this.f13558a;
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
            } catch (RemoteException e10) {
                f13557b.a(e10, "Unable to call %s on %s.", "getSessionStartType", x.class.getSimpleName());
            }
        }
        return 0;
    }

    public final a7.a f() {
        x xVar = this.f13558a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel R0 = vVar.R0(vVar.P0(), 1);
                a7.a M0 = a7.b.M0(R0.readStrongBinder());
                R0.recycle();
                return M0;
            } catch (RemoteException e10) {
                f13557b.a(e10, "Unable to call %s on %s.", "getWrappedObject", x.class.getSimpleName());
            }
        }
        return null;
    }
}
