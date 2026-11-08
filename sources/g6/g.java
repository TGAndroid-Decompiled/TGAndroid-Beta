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
            Parcel p12 = yVar.p1();
            com.google.android.gms.internal.cast.t.d(p12, zVar);
            yVar.t1(p12, 2);
        } catch (RemoteException e10) {
            f13559c.a(e10, "Unable to call %s on %s.", "addSessionManagerListener", y.class.getSimpleName());
        }
    }

    public final void b(boolean z9) {
        j6.b bVar = f13559c;
        q6.m.d("Must be called from the main thread.");
        try {
            Log.i(bVar.f16508a, bVar.d("End session for %s", this.f13561b.getPackageName()));
            y yVar = this.f13560a;
            Parcel p12 = yVar.p1();
            int i7 = com.google.android.gms.internal.cast.t.f6991a;
            p12.writeInt(1);
            p12.writeInt(z9 ? 1 : 0);
            yVar.t1(p12, 6);
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
            Parcel r12 = yVar.r1(yVar.p1(), 1);
            a7.a m12 = a7.b.m1(r12.readStrongBinder());
            r12.recycle();
            return (f) a7.b.n1(m12);
        } catch (RemoteException e10) {
            f13559c.a(e10, "Unable to call %s on %s.", "getWrappedCurrentSession", y.class.getSimpleName());
            return null;
        }
    }
}
