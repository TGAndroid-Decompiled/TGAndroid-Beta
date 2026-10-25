package k8;

import android.os.Parcel;
import android.os.RemoteException;
import o6.l;
public final class a {
    public final t7.h f16431a;

    public a(t7.h hVar) {
        l.h(hVar);
        this.f16431a = hVar;
    }

    public final boolean equals(Object obj) {
        boolean z10 = false;
        if (!(obj instanceof a)) {
            return false;
        }
        try {
            t7.h hVar = this.f16431a;
            t7.h hVar2 = ((a) obj).f16431a;
            t7.f fVar = (t7.f) hVar;
            Parcel N0 = fVar.N0();
            t7.b.c(N0, hVar2);
            Parcel M0 = fVar.M0(N0, 17);
            if (M0.readInt() != 0) {
                z10 = true;
            }
            M0.recycle();
            return z10;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final int hashCode() {
        try {
            t7.f fVar = (t7.f) this.f16431a;
            Parcel M0 = fVar.M0(fVar.N0(), 18);
            int readInt = M0.readInt();
            M0.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
