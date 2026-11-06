package h8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import f7.t0;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new t0(21);
    public final byte[] f14277a;

    public d(byte[] bArr) {
        this.f14277a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.c(parcel, 2, this.f14277a);
        xb.s(parcel, r10);
    }
}
