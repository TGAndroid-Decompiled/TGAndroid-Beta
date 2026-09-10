package e8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new e6.i(3);
    public final byte[] f7344a;

    public d(byte[] bArr) {
        this.f7344a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.c(parcel, 2, this.f7344a);
        e0.r(parcel, q6);
    }
}
