package m8;

import android.os.Parcel;
import android.os.RemoteException;
import q6.m;
import v7.i;
public final class f {
    public final v7.a f19939a;

    public f(v7.a aVar) {
        m.g(aVar);
        this.f19939a = aVar;
    }

    public final void a(k8.a aVar) {
        v7.a aVar2 = this.f19939a;
        try {
            a7.a aVar3 = aVar.f17227a;
            i iVar = (i) aVar2;
            Parcel P0 = iVar.P0();
            v7.b.c(P0, aVar3);
            iVar.T0(P0, 18);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final boolean equals(Object obj) {
        boolean z9 = false;
        if (!(obj instanceof f)) {
            return false;
        }
        try {
            v7.a aVar = this.f19939a;
            v7.a aVar2 = ((f) obj).f19939a;
            i iVar = (i) aVar;
            Parcel P0 = iVar.P0();
            v7.b.c(P0, aVar2);
            Parcel O0 = iVar.O0(P0, 16);
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
            i iVar = (i) this.f19939a;
            Parcel O0 = iVar.O0(iVar.P0(), 17);
            int readInt = O0.readInt();
            O0.recycle();
            return readInt;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
