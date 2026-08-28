package i6;

import android.os.Parcel;
public final class j extends b7.a {
    public final h6.a U0(h6.b bVar, String str, int i9) {
        Parcel M0 = M0();
        w6.a.c(M0, bVar);
        M0.writeString(str);
        M0.writeInt(i9);
        Parcel K0 = K0(M0, 2);
        h6.a J0 = h6.b.J0(K0.readStrongBinder());
        K0.recycle();
        return J0;
    }

    public final h6.a V0(h6.b bVar, String str, int i9, h6.b bVar2) {
        Parcel M0 = M0();
        w6.a.c(M0, bVar);
        M0.writeString(str);
        M0.writeInt(i9);
        w6.a.c(M0, bVar2);
        Parcel K0 = K0(M0, 8);
        h6.a J0 = h6.b.J0(K0.readStrongBinder());
        K0.recycle();
        return J0;
    }

    public final h6.a W0(h6.b bVar, String str, int i9) {
        Parcel M0 = M0();
        w6.a.c(M0, bVar);
        M0.writeString(str);
        M0.writeInt(i9);
        Parcel K0 = K0(M0, 4);
        h6.a J0 = h6.b.J0(K0.readStrongBinder());
        K0.recycle();
        return J0;
    }

    public final h6.a X0(h6.b bVar, String str, boolean z10, long j10) {
        Parcel M0 = M0();
        w6.a.c(M0, bVar);
        M0.writeString(str);
        M0.writeInt(z10 ? 1 : 0);
        M0.writeLong(j10);
        Parcel K0 = K0(M0, 7);
        h6.a J0 = h6.b.J0(K0.readStrongBinder());
        K0.recycle();
        return J0;
    }
}
