package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class t0 extends c6.a {
    public static final Parcelable.Creator<t0> CREATOR = new o0(5);
    public final int f13577a;
    public final int f13578b;
    public final byte[] f13579c;

    public t0(int i10, int i11, byte[] bArr) {
        this.f13577a = i10;
        this.f13578b = i11;
        this.f13579c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f13577a);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13578b);
        g5.c(parcel, 3, this.f13579c);
        g5.r(parcel, q10);
    }
}
