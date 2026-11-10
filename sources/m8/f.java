package m8;

import android.os.Parcel;
import android.os.RemoteException;
import q6.m;
import v7.i;
public final class f {
    public final v7.a f19947a;

    public f(v7.a aVar) {
        m.g(aVar);
        this.f19947a = aVar;
    }

    public final void a(k8.a aVar) {
        v7.a aVar2 = this.f19947a;
        try {
            a7.a aVar3 = aVar.f17230a;
            i iVar = (i) aVar2;
            Parcel p12 = iVar.p1();
            v7.b.c(p12, aVar3);
            iVar.t1(p12, 18);
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
            v7.a aVar = this.f19947a;
            v7.a aVar2 = ((f) obj).f19947a;
            i iVar = (i) aVar;
            Parcel p12 = iVar.p1();
            v7.b.c(p12, aVar2);
            Parcel o12 = iVar.o1(p12, 16);
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
            i iVar = (i) this.f19947a;
            Parcel o12 = iVar.o1(iVar.p1(), 17);
            int readInt = o12.readInt();
            o12.recycle();
            return readInt;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
