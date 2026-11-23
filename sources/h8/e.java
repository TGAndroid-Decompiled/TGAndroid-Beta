package h8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import f7.t0;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new t0(22);
    public final byte[] f13949a;

    public e(byte[] bArr) {
        this.f13949a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.c(parcel, 2, this.f13949a);
        cc.s(parcel, r10);
    }
}
