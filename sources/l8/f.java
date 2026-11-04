package l8;

import android.os.Parcel;
import android.os.RemoteException;
import gi.v5;
import p6.m;
import u7.i;
public final class f {
    public final u7.a f18110a;

    public f(u7.a aVar) {
        m.g(aVar);
        this.f18110a = aVar;
    }

    public final void a(v5 v5Var) {
        try {
            i iVar = (i) this.f18110a;
            Parcel P0 = iVar.P0();
            u7.b.c(P0, (z6.a) v5Var.f13688b);
            iVar.T0(P0, 18);
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
            u7.a aVar = this.f18110a;
            u7.a aVar2 = ((f) obj).f18110a;
            i iVar = (i) aVar;
            Parcel P0 = iVar.P0();
            u7.b.c(P0, aVar2);
            Parcel O0 = iVar.O0(P0, 16);
            if (O0.readInt() != 0) {
                z10 = true;
            }
            O0.recycle();
            return z10;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final int hashCode() {
        try {
            i iVar = (i) this.f18110a;
            Parcel O0 = iVar.O0(iVar.P0(), 17);
            int readInt = O0.readInt();
            O0.recycle();
            return readInt;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }
}
