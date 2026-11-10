package h8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import f7.t0;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new t0(22);
    public final byte[] f14280a;

    public e(byte[] bArr) {
        this.f14280a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.c(parcel, 2, this.f14280a);
        xb.s(parcel, r10);
    }
}
