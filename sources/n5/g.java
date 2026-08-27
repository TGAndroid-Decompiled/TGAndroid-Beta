package n5;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class g {

    public static final r5.b f18316b = new r5.b("Session", null);

    public final y f18317a;

    public g(Context context, String str, String str2) {
        y yVarW0;
        try {
            yVarW0 = com.google.android.gms.internal.cast.e.b(context).W0(str, str2, new k(this));
        } catch (RemoteException | d e9) {
            com.google.android.gms.internal.cast.e.f3517a.a(e9, "Unable to call %s on %s.", "newSessionImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            yVarW0 = null;
        }
        this.f18317a = yVarW0;
    }

    public final String a() {
        y5.l.e("Must be called from the main thread.");
        y yVar = this.f18317a;
        if (yVar != null) {
            try {
                w wVar = (w) yVar;
                Parcel parcelO0 = wVar.O0(wVar.M0(), 3);
                String string = parcelO0.readString();
                parcelO0.recycle();
                return string;
            } catch (RemoteException e9) {
                f18316b.a(e9, "Unable to call %s on %s.", "getSessionId", y.class.getSimpleName());
            }
        }
        return null;
    }

    public final boolean b() {
        y5.l.e("Must be called from the main thread.");
        y yVar = this.f18317a;
        if (yVar != null) {
            try {
                w wVar = (w) yVar;
                Parcel parcelO0 = wVar.O0(wVar.M0(), 5);
                int i10 = com.google.android.gms.internal.cast.t.f3660a;
                boolean z10 = parcelO0.readInt() != 0;
                parcelO0.recycle();
                return z10;
            } catch (RemoteException e9) {
                f18316b.a(e9, "Unable to call %s on %s.", "isConnected", y.class.getSimpleName());
            }
        }
        return false;
    }

    public final boolean c() {
        y5.l.e("Must be called from the main thread.");
        y yVar = this.f18317a;
        if (yVar != null) {
            try {
                w wVar = (w) yVar;
                Parcel parcelO0 = wVar.O0(wVar.M0(), 6);
                int i10 = com.google.android.gms.internal.cast.t.f3660a;
                boolean z10 = parcelO0.readInt() != 0;
                parcelO0.recycle();
                return z10;
            } catch (RemoteException e9) {
                f18316b.a(e9, "Unable to call %s on %s.", "isConnecting", y.class.getSimpleName());
            }
        }
        return false;
    }

    public final void d(int i10) {
        y yVar = this.f18317a;
        if (yVar == null) {
            return;
        }
        try {
            w wVar = (w) yVar;
            Parcel parcelM0 = wVar.M0();
            parcelM0.writeInt(i10);
            wVar.Q0(parcelM0, 13);
        } catch (RemoteException e9) {
            f18316b.a(e9, "Unable to call %s on %s.", "notifySessionEnded", y.class.getSimpleName());
        }
    }

    public final int e() {
        y5.l.e("Must be called from the main thread.");
        y yVar = this.f18317a;
        if (yVar != null) {
            try {
                w wVar = (w) yVar;
                Parcel parcelO0 = wVar.O0(wVar.M0(), 17);
                int i10 = parcelO0.readInt();
                parcelO0.recycle();
                if (i10 >= 211100000) {
                    w wVar2 = (w) yVar;
                    Parcel parcelO1 = wVar2.O0(wVar2.M0(), 18);
                    int i11 = parcelO1.readInt();
                    parcelO1.recycle();
                    return i11;
                }
            } catch (RemoteException e9) {
                f18316b.a(e9, "Unable to call %s on %s.", "getSessionStartType", y.class.getSimpleName());
            }
        }
        return 0;
    }

    public final i6.a f() {
        y yVar = this.f18317a;
        if (yVar != null) {
            try {
                w wVar = (w) yVar;
                Parcel parcelO0 = wVar.O0(wVar.M0(), 1);
                i6.a aVarJ0 = i6.b.J0(parcelO0.readStrongBinder());
                parcelO0.recycle();
                return aVarJ0;
            } catch (RemoteException e9) {
                f18316b.a(e9, "Unable to call %s on %s.", "getWrappedObject", y.class.getSimpleName());
            }
        }
        return null;
    }
}
