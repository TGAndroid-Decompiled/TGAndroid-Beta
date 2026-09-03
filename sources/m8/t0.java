package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class t0 extends c6.a {
    public static final Parcelable.Creator<t0> CREATOR = new o0(5);
    public final int f13843a;
    public final int f13844b;
    public final byte[] f13845c;

    public t0(int i10, int i11, byte[] bArr) {
        this.f13843a = i10;
        this.f13844b = i11;
        this.f13845c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f13843a);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13844b);
        f5.c(parcel, 3, this.f13845c);
        f5.r(parcel, q10);
    }
}
