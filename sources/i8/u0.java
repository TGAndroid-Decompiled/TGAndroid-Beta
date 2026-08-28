package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class u0 extends y5.a {
    public static final Parcelable.Creator<u0> CREATOR = new p0(5);
    public final int f11041a;
    public final int f11042b;
    public final byte[] f11043c;

    public u0(int i9, int i10, byte[] bArr) {
        this.f11041a = i9;
        this.f11042b = i10;
        this.f11043c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f11041a);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f11042b);
        p8.c(parcel, 3, this.f11043c);
        p8.r(parcel, q10);
    }
}
