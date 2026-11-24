package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
public final class j6a {
    public static final dc6 c = new dc6("SessionManager", null);
    public final nad a;
    public final Context b;

    public j6a(nad nadVar, Context context) {
        this.a = nadVar;
        this.b = context;
    }

    public final void a(k6a k6aVar) {
        fre.e("Must be called from the main thread.");
        try {
            nad nadVar = this.a;
            hdd hddVar = new hdd(k6aVar);
            Parcel R = nadVar.R();
            jgd.d(R, hddVar);
            nadVar.V(R, 2);
        } catch (RemoteException e) {
            c.a(e, "Unable to call %s on %s.", "addSessionManagerListener", nad.class.getSimpleName());
        }
    }

    public final void b(boolean z) {
        dc6 dc6Var = c;
        fre.e("Must be called from the main thread.");
        try {
            Log.i(dc6Var.a, dc6Var.d("End session for %s", this.b.getPackageName()));
            nad nadVar = this.a;
            Parcel R = nadVar.R();
            int i = jgd.a;
            R.writeInt(1);
            R.writeInt(z ? 1 : 0);
            nadVar.V(R, 6);
        } catch (RemoteException e) {
            dc6Var.a(e, "Unable to call %s on %s.", "endCurrentSession", nad.class.getSimpleName());
        }
    }

    public final ed1 c() {
        fre.e("Must be called from the main thread.");
        d5a d = d();
        if (d != null && (d instanceof ed1)) {
            return (ed1) d;
        }
        return null;
    }

    public final d5a d() {
        fre.e("Must be called from the main thread.");
        try {
            nad nadVar = this.a;
            Parcel T = nadVar.T(nadVar.R(), 1);
            yi5 T2 = bo7.T(T.readStrongBinder());
            T.recycle();
            return (d5a) bo7.U(T2);
        } catch (RemoteException e) {
            c.a(e, "Unable to call %s on %s.", "getWrappedCurrentSession", nad.class.getSimpleName());
            return null;
        }
    }
}
