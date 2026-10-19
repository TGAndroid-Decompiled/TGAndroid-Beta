package j8;

import android.os.Parcel;
import android.os.RemoteException;
import n6.l;
import s7.i;
public final class f {
    public final s7.a f14308a;

    public f(s7.a aVar) {
        l.h(aVar);
        this.f14308a = aVar;
    }

    public final void a(z2.b bVar) {
        try {
            i iVar = (i) this.f14308a;
            Parcel N0 = iVar.N0();
            s7.b.c(N0, (x6.a) bVar.f50628a);
            iVar.R0(N0, 18);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        boolean z10 = false;
        if (!(obj instanceof f)) {
            return false;
        }
        try {
            s7.a aVar = this.f14308a;
            s7.a aVar2 = ((f) obj).f14308a;
            i iVar = (i) aVar;
            Parcel N0 = iVar.N0();
            s7.b.c(N0, aVar2);
            Parcel M0 = iVar.M0(N0, 16);
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
            i iVar = (i) this.f14308a;
            Parcel M0 = iVar.M0(iVar.N0(), 17);
            int readInt = M0.readInt();
            M0.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
