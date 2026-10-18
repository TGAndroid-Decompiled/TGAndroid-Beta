package d6;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
public final class g {
    public static final g6.b f7863c = new g6.b("SessionManager", null);
    public final y f7864a;
    public final Context f7865b;

    public g(y yVar, Context context) {
        this.f7864a = yVar;
        this.f7865b = context;
    }

    public final void a(h hVar) {
        n6.l.e("Must be called from the main thread.");
        try {
            y yVar = this.f7864a;
            z zVar = new z(hVar);
            Parcel N0 = yVar.N0();
            com.google.android.gms.internal.cast.v.d(N0, zVar);
            yVar.R0(N0, 2);
        } catch (RemoteException e) {
            f7863c.a(e, "Unable to call %s on %s.", "addSessionManagerListener", y.class.getSimpleName());
        }
    }

    public final void b(boolean z10) {
        g6.b bVar = f7863c;
        n6.l.e("Must be called from the main thread.");
        try {
            Log.i(bVar.f10843a, bVar.d("End session for %s", this.f7865b.getPackageName()));
            y yVar = this.f7864a;
            Parcel N0 = yVar.N0();
            int i10 = com.google.android.gms.internal.cast.v.f6802a;
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
            y yVar = this.f7864a;
            Parcel P0 = yVar.P0(yVar.N0(), 1);
            x6.a K0 = x6.b.K0(P0.readStrongBinder());
            P0.recycle();
            return (f) x6.b.L0(K0);
        } catch (RemoteException e) {
            f7863c.a(e, "Unable to call %s on %s.", "getWrappedCurrentSession", y.class.getSimpleName());
            return null;
        }
    }
}
