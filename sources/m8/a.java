package m8;

import android.os.Parcel;
import android.os.RemoteException;
import q6.m;
public final class a {
    public final v7.h f19933a;

    public a(v7.h hVar) {
        m.g(hVar);
        this.f19933a = hVar;
    }

    public final boolean equals(Object obj) {
        boolean z9 = false;
        if (!(obj instanceof a)) {
            return false;
        }
        try {
            v7.h hVar = this.f19933a;
            v7.h hVar2 = ((a) obj).f19933a;
            v7.f fVar = (v7.f) hVar;
            Parcel p12 = fVar.p1();
            v7.b.c(p12, hVar2);
            Parcel o12 = fVar.o1(p12, 17);
            if (o12.readInt() != 0) {
                z9 = true;
            }
            o12.recycle();
            return z9;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final int hashCode() {
        try {
            v7.f fVar = (v7.f) this.f19933a;
            Parcel o12 = fVar.o1(fVar.p1(), 18);
            int readInt = o12.readInt();
            o12.recycle();
            return readInt;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
