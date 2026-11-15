package h8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import f7.t0;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new t0(21);
    public final byte[] f13639a;

    public d(byte[] bArr) {
        this.f13639a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.c(parcel, 2, this.f13639a);
        yb.s(parcel, r10);
    }
}
