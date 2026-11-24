package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
public final class bl6 {
    public final k7d a;

    public bl6(k7d k7dVar) {
        ite.h(k7dVar);
        this.a = k7dVar;
    }

    public final void a(nl9 nl9Var) {
        try {
            sjf sjfVar = (sjf) this.a;
            Parcel R = sjfVar.R();
            tid.c(R, (xk5) nl9Var.b);
            sjfVar.V(R, 18);
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof bl6)) {
            return false;
        }
        try {
            k7d k7dVar = this.a;
            k7d k7dVar2 = ((bl6) obj).a;
            sjf sjfVar = (sjf) k7dVar;
            Parcel R = sjfVar.R();
            tid.c(R, k7dVar2);
            Parcel Q = sjfVar.Q(R, 16);
            if (Q.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            Q.recycle();
            return z;
        } catch (RemoteException e) {
            i2d.h(e);
            return false;
        }
    }

    public final int hashCode() {
        try {
            sjf sjfVar = (sjf) this.a;
            Parcel Q = sjfVar.Q(sjfVar.R(), 17);
            int readInt = Q.readInt();
            Q.recycle();
            return readInt;
        } catch (RemoteException e) {
            i2d.h(e);
            return 0;
        }
    }
}
