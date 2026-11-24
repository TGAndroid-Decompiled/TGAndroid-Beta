package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
public final class ti2 {
    public final kye a;

    public ti2(kye kyeVar) {
        ite.h(kyeVar);
        this.a = kyeVar;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof ti2)) {
            return false;
        }
        try {
            kye kyeVar = this.a;
            kye kyeVar2 = ((ti2) obj).a;
            roe roeVar = (roe) kyeVar;
            Parcel R = roeVar.R();
            tid.c(R, kyeVar2);
            Parcel Q = roeVar.Q(R, 17);
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
            roe roeVar = (roe) this.a;
            Parcel Q = roeVar.Q(roeVar.R(), 18);
            int readInt = Q.readInt();
            Q.recycle();
            return readInt;
        } catch (RemoteException e) {
            i2d.h(e);
            return 0;
        }
    }
}
