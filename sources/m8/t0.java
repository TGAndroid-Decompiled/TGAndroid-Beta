package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class t0 extends c6.a {
    public static final Parcelable.Creator<t0> CREATOR = new o0(5);
    public final int f13575a;
    public final int f13576b;
    public final byte[] f13577c;

    public t0(int i10, int i11, byte[] bArr) {
        this.f13575a = i10;
        this.f13576b = i11;
        this.f13577c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f13575a);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13576b);
        g5.c(parcel, 3, this.f13577c);
        g5.r(parcel, q10);
    }
}
