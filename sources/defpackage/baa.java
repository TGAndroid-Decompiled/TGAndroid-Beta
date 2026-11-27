package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
public final class baa {
    public static final he6 c = new he6("SessionManager", null);
    public final gfd a;
    public final Context b;

    public baa(gfd gfdVar, Context context) {
        this.a = gfdVar;
        this.b = context;
    }

    public final void a(caa caaVar) {
        xve.e("Must be called from the main thread.");
        try {
            gfd gfdVar = this.a;
            aid aidVar = new aid(caaVar);
            Parcel R = gfdVar.R();
            ald.d(R, aidVar);
            gfdVar.V(R, 2);
        } catch (RemoteException e) {
            c.a(e, "Unable to call %s on %s.", "addSessionManagerListener", gfd.class.getSimpleName());
        }
    }

    public final void b(boolean z) {
        he6 he6Var = c;
        xve.e("Must be called from the main thread.");
        try {
            Log.i(he6Var.a, he6Var.d("End session for %s", this.b.getPackageName()));
            gfd gfdVar = this.a;
            Parcel R = gfdVar.R();
            int i = ald.a;
            R.writeInt(1);
            R.writeInt(z ? 1 : 0);
            gfdVar.V(R, 6);
        } catch (RemoteException e) {
            he6Var.a(e, "Unable to call %s on %s.", "endCurrentSession", gfd.class.getSimpleName());
        }
    }

    public final md1 c() {
        xve.e("Must be called from the main thread.");
        v8a d = d();
        if (d != null && (d instanceof md1)) {
            return (md1) d;
        }
        return null;
    }

    public final v8a d() {
        xve.e("Must be called from the main thread.");
        try {
            gfd gfdVar = this.a;
            Parcel T = gfdVar.T(gfdVar.R(), 1);
            al5 T2 = br7.T(T.readStrongBinder());
            T.recycle();
            return (v8a) br7.U(T2);
        } catch (RemoteException e) {
            c.a(e, "Unable to call %s on %s.", "getWrappedCurrentSession", gfd.class.getSimpleName());
            return null;
        }
    }
}
