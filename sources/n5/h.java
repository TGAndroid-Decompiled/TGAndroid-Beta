package n5;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

public final class h {

    public static final r5.b f18318c = new r5.b("SessionManager", null);

    public final z f18319a;

    public final Context f18320b;

    public h(z zVar, Context context) {
        this.f18319a = zVar;
        this.f18320b = context;
    }

    public final void a(i iVar) {
        y5.l.e("Must be called from the main thread.");
        try {
            z zVar = this.f18319a;
            a0 a0Var = new a0(iVar);
            Parcel parcelM0 = zVar.M0();
            com.google.android.gms.internal.cast.t.d(parcelM0, a0Var);
            zVar.Q0(parcelM0, 2);
        } catch (RemoteException e9) {
            f18318c.a(e9, "Unable to call %s on %s.", "addSessionManagerListener", z.class.getSimpleName());
        }
    }

    public final void b(boolean z10) {
        r5.b bVar = f18318c;
        y5.l.e("Must be called from the main thread.");
        try {
            Log.i(bVar.f46768a, bVar.d("End session for %s", this.f18320b.getPackageName()));
            z zVar = this.f18319a;
            Parcel parcelM0 = zVar.M0();
            int i10 = com.google.android.gms.internal.cast.t.f3660a;
            parcelM0.writeInt(1);
            parcelM0.writeInt(z10 ? 1 : 0);
            zVar.Q0(parcelM0, 6);
        } catch (RemoteException e9) {
            bVar.a(e9, "Unable to call %s on %s.", "endCurrentSession", z.class.getSimpleName());
        }
    }

    public final c c() {
        y5.l.e("Must be called from the main thread.");
        g gVarD = d();
        if (gVarD == null || !(gVarD instanceof c)) {
            return null;
        }
        return (c) gVarD;
    }

    public final g d() {
        y5.l.e("Must be called from the main thread.");
        try {
            z zVar = this.f18319a;
            Parcel parcelO0 = zVar.O0(zVar.M0(), 1);
            i6.a aVarJ0 = i6.b.J0(parcelO0.readStrongBinder());
            parcelO0.recycle();
            return (g) i6.b.K0(aVarJ0);
        } catch (RemoteException e9) {
            f18318c.a(e9, "Unable to call %s on %s.", "getWrappedCurrentSession", z.class.getSimpleName());
            return null;
        }
    }
}
