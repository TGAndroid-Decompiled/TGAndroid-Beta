package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
public final class l8a {
    public static final ce6 c = new ce6("SessionManager", null);
    public final pcd a;
    public final Context b;

    public l8a(pcd pcdVar, Context context) {
        this.a = pcdVar;
        this.b = context;
    }

    public final void a(m8a m8aVar) {
        ite.e("Must be called from the main thread.");
        try {
            pcd pcdVar = this.a;
            jfd jfdVar = new jfd(m8aVar);
            Parcel R = pcdVar.R();
            kid.d(R, jfdVar);
            pcdVar.V(R, 2);
        } catch (RemoteException e) {
            c.a(e, "Unable to call %s on %s.", "addSessionManagerListener", pcd.class.getSimpleName());
        }
    }

    public final void b(boolean z) {
        ce6 ce6Var = c;
        ite.e("Must be called from the main thread.");
        try {
            Log.i(ce6Var.a, ce6Var.d("End session for %s", this.b.getPackageName()));
            pcd pcdVar = this.a;
            Parcel R = pcdVar.R();
            int i = kid.a;
            R.writeInt(1);
            R.writeInt(z ? 1 : 0);
            pcdVar.V(R, 6);
        } catch (RemoteException e) {
            ce6Var.a(e, "Unable to call %s on %s.", "endCurrentSession", pcd.class.getSimpleName());
        }
    }

    public final me1 c() {
        ite.e("Must be called from the main thread.");
        f7a d = d();
        if (d != null && (d instanceof me1)) {
            return (me1) d;
        }
        return null;
    }

    public final f7a d() {
        ite.e("Must be called from the main thread.");
        try {
            pcd pcdVar = this.a;
            Parcel T = pcdVar.T(pcdVar.R(), 1);
            xk5 T2 = eq7.T(T.readStrongBinder());
            T.recycle();
            return (f7a) eq7.U(T2);
        } catch (RemoteException e) {
            c.a(e, "Unable to call %s on %s.", "getWrappedCurrentSession", pcd.class.getSimpleName());
            return null;
        }
    }
}
