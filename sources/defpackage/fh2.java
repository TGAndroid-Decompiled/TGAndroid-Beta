package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
public final class fh2 {
    public final iwe a;

    public fh2(iwe iweVar) {
        fre.h(iweVar);
        this.a = iweVar;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof fh2)) {
            return false;
        }
        try {
            iwe iweVar = this.a;
            iwe iweVar2 = ((fh2) obj).a;
            ome omeVar = (ome) iweVar;
            Parcel R = omeVar.R();
            sgd.c(R, iweVar2);
            Parcel Q = omeVar.Q(R, 17);
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
            ome omeVar = (ome) this.a;
            Parcel Q = omeVar.Q(omeVar.R(), 18);
            int readInt = Q.readInt();
            Q.recycle();
            return readInt;
        } catch (RemoteException e) {
            fvc.g(e);
            return 0;
        }
    }
}
