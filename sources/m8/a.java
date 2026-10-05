package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.g0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(28);
    public final String f16334a;
    public final byte[] f16335b;
    public final int f16336c;

    public a(String str, byte[] bArr, int i10) {
        this.f16334a = str;
        this.f16335b = bArr;
        this.f16336c = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f16334a);
        g0.c(parcel, 3, this.f16335b);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.f16336c);
        g0.r(parcel, q6);
    }
}
