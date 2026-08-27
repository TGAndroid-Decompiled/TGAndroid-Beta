package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class t0 extends z5.a {
    public static final Parcelable.Creator<t0> CREATOR = new o0(5);

    public final int f12836a;

    public final int f12837b;

    public final byte[] f12838c;

    public t0(int i10, int i11, byte[] bArr) {
        this.f12836a = i10;
        this.f12837b = i11;
        this.f12838c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f12836a);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12837b);
        r8.c(parcel, 3, this.f12838c);
        r8.r(parcel, iQ);
    }
}
