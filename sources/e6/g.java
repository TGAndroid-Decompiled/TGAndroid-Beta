package e6;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
public final class g {
    public static final h6.b f9816c = new h6.b("SessionManager", null);
    public final y f9817a;
    public final Context f9818b;

    public g(y yVar, Context context) {
        this.f9817a = yVar;
        this.f9818b = context;
    }

    public final void a(h hVar) {
        o6.l.e("Must be called from the main thread.");
        try {
            y yVar = this.f9817a;
            z zVar = new z(hVar);
            Parcel N0 = yVar.N0();
            com.google.android.gms.internal.cast.t.d(N0, zVar);
            yVar.R0(N0, 2);
        } catch (RemoteException e) {
            f9816c.a(e, "Unable to call %s on %s.", "addSessionManagerListener", y.class.getSimpleName());
        }
    }

    public final void b(boolean z10) {
        h6.b bVar = f9816c;
        o6.l.e("Must be called from the main thread.");
        try {
            Log.i(bVar.f12621a, bVar.d("End session for %s", this.f9818b.getPackageName()));
            y yVar = this.f9817a;
            Parcel N0 = yVar.N0();
            int i10 = com.google.android.gms.internal.cast.t.f6896a;
            N0.writeInt(1);
            N0.writeInt(z10 ? 1 : 0);
            yVar.R0(N0, 6);
        } catch (RemoteException e) {
            bVar.a(e, "Unable to call %s on %s.", "endCurrentSession", y.class.getSimpleName());
        }
    }

    public final c c() {
        o6.l.e("Must be called from the main thread.");
        f d = d();
        if (d != null && (d instanceof c)) {
            return (c) d;
        }
        return null;
    }

    public final f d() {
        o6.l.e("Must be called from the main thread.");
        try {
            y yVar = this.f9817a;
            Parcel P0 = yVar.P0(yVar.N0(), 1);
            y6.a K0 = y6.b.K0(P0.readStrongBinder());
            P0.recycle();
            return (f) y6.b.L0(K0);
        } catch (RemoteException e) {
            f9816c.a(e, "Unable to call %s on %s.", "getWrappedCurrentSession", y.class.getSimpleName());
            return null;
        }
    }
}
