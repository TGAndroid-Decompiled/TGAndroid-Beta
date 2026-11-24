package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
public final class j5d {
    public final ed1 a;

    public j5d(ed1 ed1Var) {
        this.a = ed1Var;
    }

    public final void a() {
        ed1 ed1Var = this.a;
        f8d f8dVar = ed1Var.e;
        if (f8dVar != null) {
            try {
                i69 i69Var = ed1Var.j;
                if (i69Var != null) {
                    i69Var.u();
                }
                u7d u7dVar = (u7d) f8dVar;
                Parcel R = u7dVar.R();
                int i = jgd.a;
                R.writeInt(0);
                u7dVar.V(R, 1);
            } catch (RemoteException e) {
                ed1.m.a(e, "Unable to call %s on %s.", "onConnected", f8d.class.getSimpleName());
            }
            e6e e6eVar = ed1Var.l;
            if (e6eVar != null) {
                gl2.S((gl2) e6eVar.b, new xhf(new ab8(3)));
            }
        }
    }
}
