package d6;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
public abstract class f {
    public static final g6.b f8190b = new g6.b("Session", null);
    public final x f8191a;

    public f(Context context, String str, String str2) {
        x xVar;
        try {
            xVar = com.google.android.gms.internal.cast.e.b(context).X0(str, str2, new j(this));
        } catch (RemoteException | d e7) {
            com.google.android.gms.internal.cast.e.f6862a.a(e7, "Unable to call %s on %s.", "newSessionImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            xVar = null;
        }
        this.f8191a = xVar;
    }

    public final String a() {
        n6.l.e("Must be called from the main thread.");
        x xVar = this.f8191a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel P0 = vVar.P0(vVar.N0(), 3);
                String readString = P0.readString();
                P0.recycle();
                return readString;
            } catch (RemoteException e7) {
                f8190b.a(e7, "Unable to call %s on %s.", "getSessionId", x.class.getSimpleName());
            }
        }
        return null;
    }

    public final boolean b() {
        boolean z10;
        n6.l.e("Must be called from the main thread.");
        x xVar = this.f8191a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel P0 = vVar.P0(vVar.N0(), 5);
                int i10 = com.google.android.gms.internal.cast.v.f7022a;
                if (P0.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                P0.recycle();
                return z10;
            } catch (RemoteException e7) {
                f8190b.a(e7, "Unable to call %s on %s.", "isConnected", x.class.getSimpleName());
            }
        }
        return false;
    }

    public final boolean c() {
        boolean z10;
        n6.l.e("Must be called from the main thread.");
        x xVar = this.f8191a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel P0 = vVar.P0(vVar.N0(), 6);
                int i10 = com.google.android.gms.internal.cast.v.f7022a;
                if (P0.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                P0.recycle();
                return z10;
            } catch (RemoteException e7) {
                f8190b.a(e7, "Unable to call %s on %s.", "isConnecting", x.class.getSimpleName());
            }
        }
        return false;
    }

    public final void d(int i10) {
        x xVar = this.f8191a;
        if (xVar == null) {
            return;
        }
        try {
            v vVar = (v) xVar;
            Parcel N0 = vVar.N0();
            N0.writeInt(i10);
            vVar.R0(N0, 13);
        } catch (RemoteException e7) {
            f8190b.a(e7, "Unable to call %s on %s.", "notifySessionEnded", x.class.getSimpleName());
        }
    }

    public final int e() {
        n6.l.e("Must be called from the main thread.");
        x xVar = this.f8191a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel P0 = vVar.P0(vVar.N0(), 17);
                int readInt = P0.readInt();
                P0.recycle();
                if (readInt >= 211100000) {
                    v vVar2 = (v) xVar;
                    Parcel P02 = vVar2.P0(vVar2.N0(), 18);
                    int readInt2 = P02.readInt();
                    P02.recycle();
                    return readInt2;
                }
            } catch (RemoteException e7) {
                f8190b.a(e7, "Unable to call %s on %s.", "getSessionStartType", x.class.getSimpleName());
            }
        }
        return 0;
    }

    public final x6.a f() {
        x xVar = this.f8191a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel P0 = vVar.P0(vVar.N0(), 1);
                x6.a K0 = x6.b.K0(P0.readStrongBinder());
                P0.recycle();
                return K0;
            } catch (RemoteException e7) {
                f8190b.a(e7, "Unable to call %s on %s.", "getWrappedObject", x.class.getSimpleName());
            }
        }
        return null;
    }
}
