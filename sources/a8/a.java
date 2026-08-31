package a8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(3);
    public final String f138a;
    public final byte[] f139b;
    public final int f140c;

    public a(String str, byte[] bArr, int i10) {
        this.f138a = str;
        this.f139b = bArr;
        this.f140c = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f138a);
        g5.c(parcel, 3, this.f139b);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.f140c);
        g5.r(parcel, q10);
    }
}
