package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
public final class yi6 {
    public final i5d a;

    public yi6(i5d i5dVar) {
        fre.h(i5dVar);
        this.a = i5dVar;
    }

    public final void a(lj9 lj9Var) {
        try {
            rhf rhfVar = (rhf) this.a;
            Parcel R = rhfVar.R();
            sgd.c(R, (yi5) lj9Var.b);
            rhfVar.V(R, 18);
        } catch (RemoteException e) {
            fvc.g(e);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof yi6)) {
            return false;
        }
        try {
            i5d i5dVar = this.a;
            i5d i5dVar2 = ((yi6) obj).a;
            rhf rhfVar = (rhf) i5dVar;
            Parcel R = rhfVar.R();
            sgd.c(R, i5dVar2);
            Parcel Q = rhfVar.Q(R, 16);
            if (Q.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            Q.recycle();
            return z;
        } catch (RemoteException e) {
            fvc.g(e);
            return false;
        }
    }

    public final int hashCode() {
        try {
            rhf rhfVar = (rhf) this.a;
            Parcel Q = rhfVar.Q(rhfVar.R(), 17);
            int readInt = Q.readInt();
            Q.recycle();
            return readInt;
        } catch (RemoteException e) {
            fvc.g(e);
            return 0;
        }
    }
}
