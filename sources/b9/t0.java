package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class t0 extends r6.a {
    public static final Parcelable.Creator<t0> CREATOR = new o0(5);
    public final int f3061a;
    public final int f3062b;
    public final byte[] f3063c;

    public t0(int i7, int i10, byte[] bArr) {
        this.f3061a = i7;
        this.f3062b = i10;
        this.f3063c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f3061a);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3062b);
        yb.c(parcel, 3, this.f3063c);
        yb.s(parcel, r10);
    }
}
