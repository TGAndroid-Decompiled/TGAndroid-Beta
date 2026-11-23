package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class s0 extends r6.a {
    public static final Parcelable.Creator<s0> CREATOR = new n0(5);
    public final int f3024a;
    public final int f3025b;
    public final byte[] f3026c;

    public s0(int i7, int i10, byte[] bArr) {
        this.f3024a = i7;
        this.f3025b = i10;
        this.f3026c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f3024a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3025b);
        cc.c(parcel, 3, this.f3026c);
        cc.s(parcel, r10);
    }
}
