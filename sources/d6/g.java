package d6;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
public final class g {
    public static final g6.b f6612c = new g6.b("SessionManager", null);
    public final y f6613a;
    public final Context f6614b;

    public g(y yVar, Context context) {
        this.f6613a = yVar;
        this.f6614b = context;
    }

    public final void a(h hVar) {
        n6.l.e("Must be called from the main thread.");
        try {
            y yVar = this.f6613a;
            z zVar = new z(hVar);
            Parcel O0 = yVar.O0();
            com.google.android.gms.internal.cast.v.d(O0, zVar);
            yVar.S0(O0, 2);
        } catch (RemoteException e7) {
            f6612c.a(e7, "Unable to call %s on %s.", "addSessionManagerListener", y.class.getSimpleName());
        }
    }

    public final void b(boolean z10) {
        g6.b bVar = f6612c;
        n6.l.e("Must be called from the main thread.");
        try {
            Log.i(bVar.f10386a, bVar.d("End session for %s", this.f6614b.getPackageName()));
            y yVar = this.f6613a;
            Parcel O0 = yVar.O0();
            int i10 = com.google.android.gms.internal.cast.v.f5487a;
            O0.writeInt(1);
            O0.writeInt(z10 ? 1 : 0);
            yVar.S0(O0, 6);
        } catch (RemoteException e7) {
            bVar.a(e7, "Unable to call %s on %s.", "endCurrentSession", y.class.getSimpleName());
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
            y yVar = this.f6613a;
            Parcel Q0 = yVar.Q0(yVar.O0(), 1);
            x6.a L0 = x6.b.L0(Q0.readStrongBinder());
            Q0.recycle();
            return (f) x6.b.M0(L0);
        } catch (RemoteException e7) {
            f6612c.a(e7, "Unable to call %s on %s.", "getWrappedCurrentSession", y.class.getSimpleName());
            return null;
        }
    }
}
