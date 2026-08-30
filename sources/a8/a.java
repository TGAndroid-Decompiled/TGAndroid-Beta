package a8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(3);
    public final String f127a;
    public final byte[] f128b;
    public final int f129c;

    public a(String str, byte[] bArr, int i10) {
        this.f127a = str;
        this.f128b = bArr;
        this.f129c = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f127a);
        f5.c(parcel, 3, this.f128b);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.f129c);
        f5.r(parcel, q10);
    }
}
