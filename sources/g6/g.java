package g6;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
public final class g {
    public static final j6.b f13216c = new j6.b("SessionManager", null);
    public final y f13217a;
    public final Context f13218b;

    public g(y yVar, Context context) {
        this.f13217a = yVar;
        this.f13218b = context;
    }

    public final void a(h hVar) {
        q6.m.e("Must be called from the main thread.");
        try {
            y yVar = this.f13217a;
            z zVar = new z(hVar);
            Parcel p12 = yVar.p1();
            com.google.android.gms.internal.cast.t.d(p12, zVar);
            yVar.t1(p12, 2);
        } catch (RemoteException e10) {
            f13216c.a(e10, "Unable to call %s on %s.", "addSessionManagerListener", y.class.getSimpleName());
        }
    }

    public final void b(boolean z10) {
        j6.b bVar = f13216c;
        q6.m.e("Must be called from the main thread.");
        try {
            Log.i(bVar.f17332a, bVar.d("End session for %s", this.f13218b.getPackageName()));
            y yVar = this.f13217a;
            Parcel p12 = yVar.p1();
            int i7 = com.google.android.gms.internal.cast.t.f6657a;
            p12.writeInt(1);
            p12.writeInt(z10 ? 1 : 0);
            yVar.t1(p12, 6);
        } catch (RemoteException e10) {
            bVar.a(e10, "Unable to call %s on %s.", "endCurrentSession", y.class.getSimpleName());
        }
    }

    public final c c() {
        q6.m.e("Must be called from the main thread.");
        f d = d();
        if (d != null && (d instanceof c)) {
            return (c) d;
        }
        return null;
    }

    public final f d() {
        q6.m.e("Must be called from the main thread.");
        try {
            y yVar = this.f13217a;
            Parcel r12 = yVar.r1(yVar.p1(), 1);
            a7.a m12 = a7.b.m1(r12.readStrongBinder());
            r12.recycle();
            return (f) a7.b.n1(m12);
        } catch (RemoteException e10) {
            f13216c.a(e10, "Unable to call %s on %s.", "getWrappedCurrentSession", y.class.getSimpleName());
            return null;
        }
    }
}
