package j8;

import android.os.Parcel;
import android.os.RemoteException;
import n6.m;
import s7.i;
public final class f {
    public final s7.a f14081a;

    public f(s7.a aVar) {
        m.h(aVar);
        this.f14081a = aVar;
    }

    public final void a(xa.c cVar) {
        try {
            i iVar = (i) this.f14081a;
            Parcel N0 = iVar.N0();
            s7.b.c(N0, (x6.a) cVar.f51194b);
            iVar.R0(N0, 18);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    public final boolean equals(Object obj) {
        boolean z10 = false;
        if (!(obj instanceof f)) {
            return false;
        }
        try {
            s7.a aVar = this.f14081a;
            s7.a aVar2 = ((f) obj).f14081a;
            i iVar = (i) aVar;
            Parcel N0 = iVar.N0();
            s7.b.c(N0, aVar2);
            Parcel M0 = iVar.M0(N0, 16);
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
            i iVar = (i) this.f14081a;
            Parcel M0 = iVar.M0(iVar.N0(), 17);
            int readInt = M0.readInt();
            M0.recycle();
            return readInt;
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }
}
