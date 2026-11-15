package h8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import f7.t0;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new t0(23);
    public final byte[] f13641a;

    public f(byte[] bArr) {
        this.f13641a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.c(parcel, 1, this.f13641a);
        yb.s(parcel, r10);
    }
}
