package h8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import f7.t0;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new t0(23);
    public final byte[] f14279a;

    public f(byte[] bArr) {
        this.f14279a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.c(parcel, 1, this.f14279a);
        xb.s(parcel, r10);
    }
}
