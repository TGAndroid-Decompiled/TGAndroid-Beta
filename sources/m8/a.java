package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.g0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(28);
    public final String f15703a;
    public final byte[] f15704b;
    public final int f15705c;

    public a(int i10, String str, byte[] bArr) {
        this.f15703a = str;
        this.f15704b = bArr;
        this.f15705c = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f15703a);
        g0.c(parcel, 3, this.f15704b);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.f15705c);
        g0.r(parcel, q6);
    }
}
