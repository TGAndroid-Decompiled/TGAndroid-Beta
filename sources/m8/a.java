package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.e0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(28);
    public final String f14747a;
    public final byte[] f14748b;
    public final int f14749c;

    public a(String str, byte[] bArr, int i10) {
        this.f14747a = str;
        this.f14748b = bArr;
        this.f14749c = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f14747a);
        e0.c(parcel, 3, this.f14748b);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.f14749c);
        e0.r(parcel, q6);
    }
}
