package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
public final class l7d {
    public final me1 a;

    public l7d(me1 me1Var) {
        this.a = me1Var;
    }

    public final void a() {
        me1 me1Var = this.a;
        had hadVar = me1Var.e;
        if (hadVar != null) {
            try {
                k89 k89Var = me1Var.j;
                if (k89Var != null) {
                    k89Var.u();
                }
                w9d w9dVar = (w9d) hadVar;
                Parcel R = w9dVar.R();
                int i = kid.a;
                R.writeInt(0);
                w9dVar.V(R, 1);
            } catch (RemoteException e) {
                me1.m.a(e, "Unable to call %s on %s.", "onConnected", had.class.getSimpleName());
            }
            fkd fkdVar = me1Var.l;
            if (fkdVar != null) {
                sm2.R((sm2) fkdVar.b, new yjf(new dd8(3)));
            }
        }
    }
}
