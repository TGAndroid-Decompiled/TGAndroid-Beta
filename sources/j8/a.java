package j8;

import android.os.Parcel;
import android.os.RemoteException;
import n6.m;
public final class a {
    public final s7.h f14068a;

    public a(s7.h hVar) {
        m.h(hVar);
        this.f14068a = hVar;
    }

    public final boolean equals(Object obj) {
        boolean z10 = false;
        if (!(obj instanceof a)) {
            return false;
        }
        try {
            s7.h hVar = this.f14068a;
            s7.h hVar2 = ((a) obj).f14068a;
            s7.f fVar = (s7.f) hVar;
            Parcel N0 = fVar.N0();
            s7.b.c(N0, hVar2);
            Parcel M0 = fVar.M0(N0, 17);
            if (M0.readInt() != 0) {
                z10 = true;
            }
            M0.recycle();
            return z10;
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    public final int hashCode() {
        try {
            s7.f fVar = (s7.f) this.f14068a;
            Parcel M0 = fVar.M0(fVar.N0(), 18);
            int readInt = M0.readInt();
            M0.recycle();
            return readInt;
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }
}
