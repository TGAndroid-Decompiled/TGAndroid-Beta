package d6;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
public final class g {
    public static final g6.b f8191c = new g6.b("SessionManager", null);
    public final y f8192a;
    public final Context f8193b;

    public g(y yVar, Context context) {
        this.f8192a = yVar;
        this.f8193b = context;
    }

    public final void a(h hVar) {
        n6.m.e("Must be called from the main thread.");
        try {
            y yVar = this.f8192a;
            z zVar = new z(hVar);
            Parcel N0 = yVar.N0();
            com.google.android.gms.internal.cast.v.d(N0, zVar);
            yVar.R0(N0, 2);
        } catch (RemoteException e7) {
            f8191c.a(e7, "Unable to call %s on %s.", "addSessionManagerListener", y.class.getSimpleName());
        }
    }

    public final void b(boolean z10) {
        g6.b bVar = f8191c;
        n6.m.e("Must be called from the main thread.");
        try {
            Log.i(bVar.f10322a, bVar.d("End session for %s", this.f8193b.getPackageName()));
            y yVar = this.f8192a;
            Parcel N0 = yVar.N0();
            int i10 = com.google.android.gms.internal.cast.v.f7021a;
            N0.writeInt(1);
            N0.writeInt(z10 ? 1 : 0);
            yVar.R0(N0, 6);
        } catch (RemoteException e7) {
            bVar.a(e7, "Unable to call %s on %s.", "endCurrentSession", y.class.getSimpleName());
        }
    }

    public final c c() {
        n6.m.e("Must be called from the main thread.");
        f d = d();
        if (d != null && (d instanceof c)) {
            return (c) d;
        }
        return null;
    }

    public final f d() {
        n6.m.e("Must be called from the main thread.");
        try {
            y yVar = this.f8192a;
            Parcel P0 = yVar.P0(yVar.N0(), 1);
            x6.a K0 = x6.b.K0(P0.readStrongBinder());
            P0.recycle();
            return (f) x6.b.L0(K0);
        } catch (RemoteException e7) {
            f8191c.a(e7, "Unable to call %s on %s.", "getWrappedCurrentSession", y.class.getSimpleName());
            return null;
        }
    }
}
