package m8;

import android.os.Parcel;
import android.os.RemoteException;
import q6.m;
public final class a {
    public final v7.h f19925a;

    public a(v7.h hVar) {
        m.g(hVar);
        this.f19925a = hVar;
    }

    public final boolean equals(Object obj) {
        boolean z9 = false;
        if (!(obj instanceof a)) {
            return false;
        }
        try {
            v7.h hVar = this.f19925a;
            v7.h hVar2 = ((a) obj).f19925a;
            v7.f fVar = (v7.f) hVar;
            Parcel P0 = fVar.P0();
            v7.b.c(P0, hVar2);
            Parcel O0 = fVar.O0(P0, 17);
            if (O0.readInt() != 0) {
                z9 = true;
            }
            O0.recycle();
            return z9;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final int hashCode() {
        try {
            v7.f fVar = (v7.f) this.f19925a;
            Parcel O0 = fVar.O0(fVar.P0(), 18);
            int readInt = O0.readInt();
            O0.recycle();
            return readInt;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
