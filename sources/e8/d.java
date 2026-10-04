package e8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new e6.i(3);
    public final byte[] f8708a;

    public d(byte[] bArr) {
        this.f8708a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.c(parcel, 2, this.f8708a);
        g0.r(parcel, q6);
    }
}
