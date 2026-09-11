package j8;

import a6.i;
import android.os.Parcel;
import android.os.RemoteException;
import n6.l;
public final class f {
    public final s7.a f13571a;

    public f(s7.a aVar) {
        l.h(aVar);
        this.f13571a = aVar;
    }

    public final void a(i iVar) {
        try {
            s7.i iVar2 = (s7.i) this.f13571a;
            Parcel O0 = iVar2.O0();
            s7.b.c(O0, (x6.a) iVar.f312b);
            iVar2.S0(O0, 18);
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
            s7.a aVar = this.f13571a;
            s7.a aVar2 = ((f) obj).f13571a;
            s7.i iVar = (s7.i) aVar;
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
            s7.i iVar = (s7.i) this.f13571a;
            Parcel N0 = iVar.N0(iVar.O0(), 17);
            int readInt = N0.readInt();
            N0.recycle();
            return readInt;
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }
}
