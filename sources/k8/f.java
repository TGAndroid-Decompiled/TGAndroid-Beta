package k8;

import android.os.Parcel;
import android.os.RemoteException;
import jg.i;
import o6.l;
public final class f {
    public final t7.a f16443a;

    public f(t7.a aVar) {
        l.h(aVar);
        this.f16443a = aVar;
    }

    public final void a(i iVar) {
        try {
            t7.i iVar2 = (t7.i) this.f16443a;
            Parcel N0 = iVar2.N0();
            t7.b.c(N0, (y6.a) iVar.f15726a);
            iVar2.R0(N0, 18);
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
            t7.a aVar = this.f16443a;
            t7.a aVar2 = ((f) obj).f16443a;
            t7.i iVar = (t7.i) aVar;
            Parcel N0 = iVar.N0();
            t7.b.c(N0, aVar2);
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
            t7.i iVar = (t7.i) this.f16443a;
            Parcel M0 = iVar.M0(iVar.N0(), 17);
            int readInt = M0.readInt();
            M0.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
