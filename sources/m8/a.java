package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.d0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(28);
    public final String f16332a;
    public final byte[] f16333b;
    public final int f16334c;

    public a(int i10, String str, byte[] bArr) {
        this.f16332a = str;
        this.f16333b = bArr;
        this.f16334c = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f16332a);
        d0.c(parcel, 3, this.f16333b);
        d0.s(parcel, 4, 4);
        parcel.writeInt(this.f16334c);
        d0.r(parcel, q6);
    }
}
