package e8;

import android.os.Parcel;
import android.os.Parcelable;
import e6.p;
import w7.h0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new p(2);
    public final byte[] f6314a;

    public d(byte[] bArr) {
        this.f6314a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.c(parcel, 2, this.f6314a);
        h0.r(parcel, q6);
    }
}
