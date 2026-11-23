package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class t0 extends r6.a {
    public static final Parcelable.Creator<t0> CREATOR = new o0(5);
    public final int f3029a;
    public final int f3030b;
    public final byte[] f3031c;

    public t0(int i7, int i10, byte[] bArr) {
        this.f3029a = i7;
        this.f3030b = i10;
        this.f3031c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f3029a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3030b);
        cc.c(parcel, 3, this.f3031c);
        cc.s(parcel, r10);
    }
}
