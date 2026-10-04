package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.g0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(28);
    public final String f16329a;
    public final byte[] f16330b;
    public final int f16331c;

    public a(String str, byte[] bArr, int i10) {
        this.f16329a = str;
        this.f16330b = bArr;
        this.f16331c = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f16329a);
        g0.c(parcel, 3, this.f16330b);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.f16331c);
        g0.r(parcel, q6);
    }
}
