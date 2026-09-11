package j8;

import android.os.Parcel;
import android.os.RemoteException;
import n6.l;
public final class a {
    public final s7.h f13558a;

    public a(s7.h hVar) {
        l.h(hVar);
        this.f13558a = hVar;
    }

    public final boolean equals(Object obj) {
        boolean z10 = false;
        if (!(obj instanceof a)) {
            return false;
        }
        try {
            s7.h hVar = this.f13558a;
            s7.h hVar2 = ((a) obj).f13558a;
            s7.f fVar = (s7.f) hVar;
            Parcel O0 = fVar.O0();
            s7.b.c(O0, hVar2);
            Parcel N0 = fVar.N0(O0, 17);
            if (N0.readInt() != 0) {
                z10 = true;
            }
            N0.recycle();
            return z10;
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    public final int hashCode() {
        try {
            s7.f fVar = (s7.f) this.f13558a;
            Parcel N0 = fVar.N0(fVar.O0(), 18);
            int readInt = N0.readInt();
            N0.recycle();
            return readInt;
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }
}
