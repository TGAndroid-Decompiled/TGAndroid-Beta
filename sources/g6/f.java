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
            xVar = com.google.android.gms.internal.cast.d.b(context).z1(str, str2, new j(this));
        } catch (RemoteException | d e10) {
            com.google.android.gms.internal.cast.d.f6835a.a(e10, "Unable to call %s on %s.", "newSessionImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
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
                Parcel r12 = vVar.r1(vVar.p1(), 3);
                String readString = r12.readString();
                r12.recycle();
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
                Parcel r12 = vVar.r1(vVar.p1(), 5);
                int i7 = com.google.android.gms.internal.cast.t.f6989a;
                if (r12.readInt() != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                r12.recycle();
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
                Parcel r12 = vVar.r1(vVar.p1(), 6);
                int i7 = com.google.android.gms.internal.cast.t.f6989a;
                if (r12.readInt() != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                r12.recycle();
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
            Parcel p12 = vVar.p1();
            p12.writeInt(i7);
            vVar.t1(p12, 13);
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
                Parcel r12 = vVar.r1(vVar.p1(), 17);
                int readInt = r12.readInt();
                r12.recycle();
                if (readInt >= 211100000) {
                    v vVar2 = (v) xVar;
                    Parcel r13 = vVar2.r1(vVar2.p1(), 18);
                    int readInt2 = r13.readInt();
                    r13.recycle();
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
                Parcel r12 = vVar.r1(vVar.p1(), 1);
                a7.a m12 = a7.b.m1(r12.readStrongBinder());
                r12.recycle();
                return m12;
            } catch (RemoteException e10) {
                f13557b.a(e10, "Unable to call %s on %s.", "getWrappedObject", x.class.getSimpleName());
            }
        }
        return null;
    }
}
