package h8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import f7.t0;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new t0(23);
    public final byte[] f13950a;

    public f(byte[] bArr) {
        this.f13950a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.c(parcel, 1, this.f13950a);
        cc.s(parcel, r10);
    }
}
