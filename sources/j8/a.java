package j8;

import android.os.Parcel;
import android.os.RemoteException;
import n6.l;
import s7.h;
public final class a {
    public final h f9707a;

    public a(h hVar) {
        l.g(hVar);
        this.f9707a = hVar;
    }

    public final boolean equals(Object obj) {
        boolean z10 = false;
        if (!(obj instanceof a)) {
            return false;
        }
        try {
            h hVar = this.f9707a;
            h hVar2 = ((a) obj).f9707a;
            s7.f fVar = (s7.f) hVar;
            Parcel P0 = fVar.P0();
            s7.b.c(P0, hVar2);
            Parcel O0 = fVar.O0(P0, 17);
            if (O0.readInt() != 0) {
                z10 = true;
            }
            O0.recycle();
            return z10;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final int hashCode() {
        try {
            s7.f fVar = (s7.f) this.f9707a;
            Parcel O0 = fVar.O0(fVar.P0(), 18);
            int readInt = O0.readInt();
            O0.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
