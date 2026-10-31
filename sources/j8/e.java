package j8;

import android.os.Parcel;
import android.os.RemoteException;
import k6.h;
import n6.l;
import s7.i;
public final class e {
    public final s7.a f9715a;

    public e(s7.a aVar) {
        l.g(aVar);
        this.f9715a = aVar;
    }

    public final void a(h hVar) {
        try {
            i iVar = (i) this.f9715a;
            Parcel P0 = iVar.P0();
            s7.b.c(P0, (x6.a) hVar.f10943b);
            iVar.T0(P0, 18);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        boolean z10 = false;
        if (!(obj instanceof e)) {
            return false;
        }
        try {
            s7.a aVar = this.f9715a;
            s7.a aVar2 = ((e) obj).f9715a;
            i iVar = (i) aVar;
            Parcel P0 = iVar.P0();
            s7.b.c(P0, aVar2);
            Parcel O0 = iVar.O0(P0, 16);
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
            i iVar = (i) this.f9715a;
            Parcel O0 = iVar.O0(iVar.P0(), 17);
            int readInt = O0.readInt();
            O0.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
