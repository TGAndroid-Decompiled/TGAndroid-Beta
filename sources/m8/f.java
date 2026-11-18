package m8;

import android.os.Parcel;
import android.os.RemoteException;
import hi.u5;
import q6.m;
import v7.i;
public final class f {
    public final v7.a f20900a;

    public f(v7.a aVar) {
        m.h(aVar);
        this.f20900a = aVar;
    }

    public final void a(u5 u5Var) {
        try {
            i iVar = (i) this.f20900a;
            Parcel p12 = iVar.p1();
            v7.b.c(p12, (a7.a) u5Var.f15536b);
            iVar.t1(p12, 18);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final boolean equals(Object obj) {
        boolean z10 = false;
        if (!(obj instanceof f)) {
            return false;
        }
        try {
            v7.a aVar = this.f20900a;
            v7.a aVar2 = ((f) obj).f20900a;
            i iVar = (i) aVar;
            Parcel p12 = iVar.p1();
            v7.b.c(p12, aVar2);
            Parcel o12 = iVar.o1(p12, 16);
            if (o12.readInt() != 0) {
                z10 = true;
            }
            o12.recycle();
            return z10;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final int hashCode() {
        try {
            i iVar = (i) this.f20900a;
            Parcel o12 = iVar.o1(iVar.p1(), 17);
            int readInt = o12.readInt();
            o12.recycle();
            return readInt;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
