package l8;

import android.os.Parcel;
import android.os.RemoteException;
import p6.m;
public final class a {
    public final u7.h f18096a;

    public a(u7.h hVar) {
        m.g(hVar);
        this.f18096a = hVar;
    }

    public final boolean equals(Object obj) {
        boolean z10 = false;
        if (!(obj instanceof a)) {
            return false;
        }
        try {
            u7.h hVar = this.f18096a;
            u7.h hVar2 = ((a) obj).f18096a;
            u7.f fVar = (u7.f) hVar;
            Parcel P0 = fVar.P0();
            u7.b.c(P0, hVar2);
            Parcel O0 = fVar.O0(P0, 17);
            if (O0.readInt() != 0) {
                z10 = true;
            }
            O0.recycle();
            return z10;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final int hashCode() {
        try {
            u7.f fVar = (u7.f) this.f18096a;
            Parcel O0 = fVar.O0(fVar.P0(), 18);
            int readInt = O0.readInt();
            O0.recycle();
            return readInt;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
