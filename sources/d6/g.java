package d6;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
public final class g {
    public static final g6.b f6409c = new g6.b("SessionManager", null);
    public final y f6410a;
    public final Context f6411b;

    public g(y yVar, Context context) {
        this.f6410a = yVar;
        this.f6411b = context;
    }

    public final void a(h hVar) {
        n6.l.e("Must be called from the main thread.");
        try {
            y yVar = this.f6410a;
            z zVar = new z(hVar);
            Parcel N0 = yVar.N0();
            com.google.android.gms.internal.cast.v.d(N0, zVar);
            yVar.R0(N0, 2);
        } catch (RemoteException e) {
            f6409c.a(e, "Unable to call %s on %s.", "addSessionManagerListener", y.class.getSimpleName());
        }
    }

    public final void b(boolean z10) {
        g6.b bVar = f6409c;
        n6.l.e("Must be called from the main thread.");
        try {
            Log.i(bVar.f9937a, bVar.d("End session for %s", this.f6411b.getPackageName()));
            y yVar = this.f6410a;
            Parcel N0 = yVar.N0();
            int i10 = com.google.android.gms.internal.cast.v.f5349a;
            N0.writeInt(1);
            N0.writeInt(z10 ? 1 : 0);
            yVar.R0(N0, 6);
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
            y yVar = this.f6410a;
            Parcel P0 = yVar.P0(yVar.N0(), 1);
            x6.a K0 = x6.b.K0(P0.readStrongBinder());
            P0.recycle();
            return (f) x6.b.L0(K0);
        } catch (RemoteException e) {
            f6409c.a(e, "Unable to call %s on %s.", "getWrappedCurrentSession", y.class.getSimpleName());
            return null;
        }
    }
}
