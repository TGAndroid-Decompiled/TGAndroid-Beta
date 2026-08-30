package m6;

import android.os.Parcel;
public final class k extends a7.a {
    public final l6.a U0(l6.b bVar, String str, int i10, l6.b bVar2) {
        Parcel M0 = M0();
        a7.d.c(M0, bVar);
        M0.writeString(str);
        M0.writeInt(i10);
        a7.d.c(M0, bVar2);
        Parcel K0 = K0(M0, 2);
        l6.a J0 = l6.b.J0(K0.readStrongBinder());
        K0.recycle();
        return J0;
    }

    public final l6.a V0(l6.b bVar, String str, int i10, l6.b bVar2) {
        Parcel M0 = M0();
        a7.d.c(M0, bVar);
        M0.writeString(str);
        M0.writeInt(i10);
        a7.d.c(M0, bVar2);
        Parcel K0 = K0(M0, 3);
        l6.a J0 = l6.b.J0(K0.readStrongBinder());
        K0.recycle();
        return J0;
    }
}
