package j6;

import android.os.Parcel;

public final class j extends c7.a {
    public final i6.a U0(i6.b bVar, String str, int i10) {
        Parcel parcelM0 = M0();
        x6.a.c(parcelM0, bVar);
        parcelM0.writeString(str);
        parcelM0.writeInt(i10);
        Parcel parcelK0 = K0(parcelM0, 2);
        i6.a aVarJ0 = i6.b.J0(parcelK0.readStrongBinder());
        parcelK0.recycle();
        return aVarJ0;
    }

    public final i6.a V0(i6.b bVar, String str, int i10, i6.b bVar2) {
        Parcel parcelM0 = M0();
        x6.a.c(parcelM0, bVar);
        parcelM0.writeString(str);
        parcelM0.writeInt(i10);
        x6.a.c(parcelM0, bVar2);
        Parcel parcelK0 = K0(parcelM0, 8);
        i6.a aVarJ0 = i6.b.J0(parcelK0.readStrongBinder());
        parcelK0.recycle();
        return aVarJ0;
    }

    public final i6.a W0(i6.b bVar, String str, int i10) {
        Parcel parcelM0 = M0();
        x6.a.c(parcelM0, bVar);
        parcelM0.writeString(str);
        parcelM0.writeInt(i10);
        Parcel parcelK0 = K0(parcelM0, 4);
        i6.a aVarJ0 = i6.b.J0(parcelK0.readStrongBinder());
        parcelK0.recycle();
        return aVarJ0;
    }

    public final i6.a X0(i6.b bVar, String str, boolean z10, long j10) {
        Parcel parcelM0 = M0();
        x6.a.c(parcelM0, bVar);
        parcelM0.writeString(str);
        parcelM0.writeInt(z10 ? 1 : 0);
        parcelM0.writeLong(j10);
        Parcel parcelK0 = K0(parcelM0, 7);
        i6.a aVarJ0 = i6.b.J0(parcelK0.readStrongBinder());
        parcelK0.recycle();
        return aVarJ0;
    }
}
