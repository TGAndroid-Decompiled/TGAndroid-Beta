package m8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new g8.g(27);
    public final String f13019a;
    public final byte[] f13020b;
    public final int f13021c;

    public a(int i10, String str, byte[] bArr) {
        this.f13019a = str;
        this.f13020b = bArr;
        this.f13021c = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f13019a);
        h0.c(parcel, 3, this.f13020b);
        h0.s(parcel, 4, 4);
        parcel.writeInt(this.f13021c);
        h0.r(parcel, q6);
    }
}
