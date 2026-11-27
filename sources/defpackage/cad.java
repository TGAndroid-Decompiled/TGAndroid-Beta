package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
public final class cad {
    public final md1 a;

    public cad(md1 md1Var) {
        this.a = md1Var;
    }

    public final void a() {
        md1 md1Var = this.a;
        ycd ycdVar = md1Var.e;
        if (ycdVar != null) {
            try {
                v99 v99Var = md1Var.j;
                if (v99Var != null) {
                    v99Var.u();
                }
                ncd ncdVar = (ncd) ycdVar;
                Parcel R = ncdVar.R();
                int i = ald.a;
                R.writeInt(0);
                ncdVar.V(R, 1);
            } catch (RemoteException e) {
                md1.m.a(e, "Unable to call %s on %s.", "onConnected", ycd.class.getSimpleName());
            }
            uae uaeVar = md1Var.l;
            if (uaeVar != null) {
                am2.R((am2) uaeVar.b, new nmf(new pe8(3)));
            }
        }
    }
}
