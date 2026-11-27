package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
public final class xh2 {
    public final z0f a;

    public xh2(z0f z0fVar) {
        xve.h(z0fVar);
        this.a = z0fVar;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof xh2)) {
            return false;
        }
        try {
            z0f z0fVar = this.a;
            z0f z0fVar2 = ((xh2) obj).a;
            fre freVar = (fre) z0fVar;
            Parcel R = freVar.R();
            jld.c(R, z0fVar2);
            Parcel Q = freVar.Q(R, 17);
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
            fre freVar = (fre) this.a;
            Parcel Q = freVar.Q(freVar.R(), 18);
            int readInt = Q.readInt();
            Q.recycle();
            return readInt;
        } catch (RemoteException e) {
            p3d.i(e);
            return 0;
        }
    }
}
