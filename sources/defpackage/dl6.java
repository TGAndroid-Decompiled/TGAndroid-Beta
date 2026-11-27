package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
public final class dl6 {
    public final bad a;

    public dl6(bad badVar) {
        xve.h(badVar);
        this.a = badVar;
    }

    public final void a(zm9 zm9Var) {
        try {
            hmf hmfVar = (hmf) this.a;
            Parcel R = hmfVar.R();
            jld.c(R, (al5) zm9Var.b);
            hmfVar.V(R, 18);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof dl6)) {
            return false;
        }
        try {
            bad badVar = this.a;
            bad badVar2 = ((dl6) obj).a;
            hmf hmfVar = (hmf) badVar;
            Parcel R = hmfVar.R();
            jld.c(R, badVar2);
            Parcel Q = hmfVar.Q(R, 16);
            if (Q.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            Q.recycle();
            return z;
        } catch (RemoteException e) {
            p3d.i(e);
            return false;
        }
    }

    public final int hashCode() {
        try {
            hmf hmfVar = (hmf) this.a;
            Parcel Q = hmfVar.Q(hmfVar.R(), 17);
            int readInt = Q.readInt();
            Q.recycle();
            return readInt;
        } catch (RemoteException e) {
            p3d.i(e);
            return 0;
        }
    }
}
