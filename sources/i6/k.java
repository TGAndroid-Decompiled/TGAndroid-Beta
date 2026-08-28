package i6;

import android.os.Parcel;
public final class k extends b7.a {
    public final h6.a U0(h6.b bVar, String str, int i9, h6.b bVar2) {
        Parcel M0 = M0();
        w6.a.c(M0, bVar);
        M0.writeString(str);
        M0.writeInt(i9);
        w6.a.c(M0, bVar2);
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
        Parcel K0 = K0(M0, 3);
        h6.a J0 = h6.b.J0(K0.readStrongBinder());
        K0.recycle();
        return J0;
    }
}
