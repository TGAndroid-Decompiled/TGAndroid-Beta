package o8;

import android.os.Parcel;
import android.os.Parcelable;
public final class a extends q6.a {
    public static final Parcelable.Creator<a> CREATOR = new n8.g(4);
    public final String f20926a;
    public final byte[] f20927b;
    public final int f20928c;

    public a(int i3, String str, byte[] bArr) {
        this.f20926a = str;
        this.f20927b = bArr;
        this.f20928c = i3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f20926a);
        j8.a.d(parcel, 3, this.f20927b);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.f20928c);
        j8.a.t(parcel, s6);
    }
}
