package g6;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
public final class g {
    public static final j6.b f13559c = new j6.b("SessionManager", null);
    public final y f13560a;
    public final Context f13561b;

    public g(y yVar, Context context) {
        this.f13560a = yVar;
        this.f13561b = context;
    }

    public final void a(h hVar) {
        q6.m.d("Must be called from the main thread.");
        try {
            y yVar = this.f13560a;
            z zVar = new z(hVar);
            Parcel P0 = yVar.P0();
            com.google.android.gms.internal.cast.t.d(P0, zVar);
            yVar.T0(P0, 2);
        } catch (RemoteException e10) {
            f13559c.a(e10, "Unable to call %s on %s.", "addSessionManagerListener", y.class.getSimpleName());
        }
    }

    public final void b(boolean z9) {
        j6.b bVar = f13559c;
        q6.m.d("Must be called from the main thread.");
        try {
            Log.i(bVar.f16505a, bVar.d("End session for %s", this.f13561b.getPackageName()));
            y yVar = this.f13560a;
            Parcel P0 = yVar.P0();
            int i7 = com.google.android.gms.internal.cast.t.f6991a;
            P0.writeInt(1);
            P0.writeInt(z9 ? 1 : 0);
            yVar.T0(P0, 6);
        } catch (RemoteException e10) {
            bVar.a(e10, "Unable to call %s on %s.", "endCurrentSession", y.class.getSimpleName());
        }
    }

    public final c c() {
        q6.m.d("Must be called from the main thread.");
        f d = d();
        if (d != null && (d instanceof c)) {
            return (c) d;
        }
        return null;
    }

    public final f d() {
        q6.m.d("Must be called from the main thread.");
        try {
            y yVar = this.f13560a;
            Parcel R0 = yVar.R0(yVar.P0(), 1);
            a7.a M0 = a7.b.M0(R0.readStrongBinder());
            R0.recycle();
            return (f) a7.b.N0(M0);
        } catch (RemoteException e10) {
            f13559c.a(e10, "Unable to call %s on %s.", "getWrappedCurrentSession", y.class.getSimpleName());
            return null;
        }
    }
}
