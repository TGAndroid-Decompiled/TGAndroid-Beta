package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class t0 extends c6.a {
    public static final Parcelable.Creator<t0> CREATOR = new o0(5);
    public final int f13859a;
    public final int f13860b;
    public final byte[] f13861c;

    public t0(int i10, int i11, byte[] bArr) {
        this.f13859a = i10;
        this.f13860b = i11;
        this.f13861c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f13859a);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13860b);
        f5.c(parcel, 3, this.f13861c);
        f5.r(parcel, q10);
    }
}
