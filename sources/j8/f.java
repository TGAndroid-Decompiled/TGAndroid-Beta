package j8;

import android.os.Parcel;
import android.os.RemoteException;
import ii.n4;
import n6.l;
import s7.i;
public final class f {
    public final s7.a f14045a;

    public f(s7.a aVar) {
        l.h(aVar);
        this.f14045a = aVar;
    }

    public final void a(n4 n4Var) {
        try {
            i iVar = (i) this.f14045a;
            Parcel O0 = iVar.O0();
            s7.b.c(O0, (x6.a) n4Var.f12544b);
            iVar.S0(O0, 18);
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
            s7.a aVar = this.f14045a;
            s7.a aVar2 = ((f) obj).f14045a;
            i iVar = (i) aVar;
            Parcel O0 = iVar.O0();
            s7.b.c(O0, aVar2);
            Parcel N0 = iVar.N0(O0, 16);
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
            i iVar = (i) this.f14045a;
            Parcel N0 = iVar.N0(iVar.O0(), 17);
            int readInt = N0.readInt();
            N0.recycle();
            return readInt;
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }
}
