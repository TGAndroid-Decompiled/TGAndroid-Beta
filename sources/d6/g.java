package d6;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
public final class g {
    public static final g6.b f7545c = new g6.b("SessionManager", null);
    public final y f7546a;
    public final Context f7547b;

    public g(y yVar, Context context) {
        this.f7546a = yVar;
        this.f7547b = context;
    }

    public final void a(h hVar) {
        n6.l.e("Must be called from the main thread.");
        try {
            y yVar = this.f7546a;
            z zVar = new z(hVar);
            Parcel O0 = yVar.O0();
            com.google.android.gms.internal.cast.v.d(O0, zVar);
            yVar.S0(O0, 2);
        } catch (RemoteException e) {
            f7545c.a(e, "Unable to call %s on %s.", "addSessionManagerListener", y.class.getSimpleName());
        }
    }

    public final void b(boolean z10) {
        g6.b bVar = f7545c;
        n6.l.e("Must be called from the main thread.");
        try {
            Log.i(bVar.f9430a, bVar.d("End session for %s", this.f7547b.getPackageName()));
            y yVar = this.f7546a;
            Parcel O0 = yVar.O0();
            int i10 = com.google.android.gms.internal.cast.v.f6516a;
            O0.writeInt(1);
            O0.writeInt(z10 ? 1 : 0);
            yVar.S0(O0, 6);
        } catch (RemoteException e) {
            bVar.a(e, "Unable to call %s on %s.", "endCurrentSession", y.class.getSimpleName());
        }
    }

    public final c c() {
        n6.l.e("Must be called from the main thread.");
        f d = d();
        if (d != null && (d instanceof c)) {
            return (c) d;
        }
        return null;
    }

    public final f d() {
        n6.l.e("Must be called from the main thread.");
        try {
            y yVar = this.f7546a;
            Parcel Q0 = yVar.Q0(yVar.O0(), 1);
            x6.a L0 = x6.b.L0(Q0.readStrongBinder());
            Q0.recycle();
            return (f) x6.b.M0(L0);
        } catch (RemoteException e) {
            f7545c.a(e, "Unable to call %s on %s.", "getWrappedCurrentSession", y.class.getSimpleName());
            return null;
        }
    }
}
