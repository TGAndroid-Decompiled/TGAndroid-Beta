package k6;

import android.os.Parcel;
public final class j extends com.google.android.gms.internal.cast.a {
    public final j6.a U0(j6.b bVar, String str, int i10) {
        Parcel M0 = M0();
        y6.a.c(M0, bVar);
        M0.writeString(str);
        M0.writeInt(i10);
        Parcel K0 = K0(M0, 2);
        j6.a J0 = j6.b.J0(K0.readStrongBinder());
        K0.recycle();
        return J0;
    }

    public final j6.a V0(j6.b bVar, String str, int i10, j6.b bVar2) {
        Parcel M0 = M0();
        y6.a.c(M0, bVar);
        M0.writeString(str);
        M0.writeInt(i10);
        y6.a.c(M0, bVar2);
        Parcel K0 = K0(M0, 8);
        j6.a J0 = j6.b.J0(K0.readStrongBinder());
        K0.recycle();
        return J0;
    }

    public final j6.a W0(j6.b bVar, String str, int i10) {
        Parcel M0 = M0();
        y6.a.c(M0, bVar);
        M0.writeString(str);
        M0.writeInt(i10);
        Parcel K0 = K0(M0, 4);
        j6.a J0 = j6.b.J0(K0.readStrongBinder());
        K0.recycle();
        return J0;
    }

    public final j6.a X0(j6.b bVar, String str, boolean z10, long j10) {
        Parcel M0 = M0();
        y6.a.c(M0, bVar);
        M0.writeString(str);
        M0.writeInt(z10 ? 1 : 0);
        M0.writeLong(j10);
        Parcel K0 = K0(M0, 7);
        j6.a J0 = j6.b.J0(K0.readStrongBinder());
        K0.recycle();
        return J0;
    }
}
