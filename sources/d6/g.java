package d6;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
public final class g {
    public static final g6.b f5776c = new g6.b("SessionManager", null);
    public final y f5777a;
    public final Context f5778b;

    public g(y yVar, Context context) {
        this.f5777a = yVar;
        this.f5778b = context;
    }

    public final void a(h hVar) {
        n6.l.d("Must be called from the main thread.");
        try {
            y yVar = this.f5777a;
            z zVar = new z(hVar);
            Parcel P0 = yVar.P0();
            com.google.android.gms.internal.cast.u.d(P0, zVar);
            yVar.T0(P0, 2);
        } catch (RemoteException e) {
            f5776c.a(e, "Unable to call %s on %s.", "addSessionManagerListener", y.class.getSimpleName());
        }
    }

    public final void b(boolean z10) {
        g6.b bVar = f5776c;
        n6.l.d("Must be called from the main thread.");
        try {
            Log.i(bVar.f7367a, bVar.d("End session for %s", this.f5778b.getPackageName()));
            y yVar = this.f5777a;
            Parcel P0 = yVar.P0();
            int i10 = com.google.android.gms.internal.cast.u.f4789a;
            P0.writeInt(1);
            P0.writeInt(z10 ? 1 : 0);
            yVar.T0(P0, 6);
        } catch (RemoteException e) {
            bVar.a(e, "Unable to call %s on %s.", "endCurrentSession", y.class.getSimpleName());
        }
    }

    public final c c() {
        n6.l.d("Must be called from the main thread.");
        f d = d();
        if (d != null && (d instanceof c)) {
            return (c) d;
        }
        return null;
    }

    public final f d() {
        n6.l.d("Must be called from the main thread.");
        try {
            y yVar = this.f5777a;
            Parcel R0 = yVar.R0(yVar.P0(), 1);
            x6.a M0 = x6.b.M0(R0.readStrongBinder());
            R0.recycle();
            return (f) x6.b.N0(M0);
        } catch (RemoteException e) {
            f5776c.a(e, "Unable to call %s on %s.", "getWrappedCurrentSession", y.class.getSimpleName());
            return null;
        }
    }
}
