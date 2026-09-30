package e8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new e6.i(3);
    public final byte[] f8026a;

    public d(byte[] bArr) {
        this.f8026a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.c(parcel, 2, this.f8026a);
        f0.r(parcel, q6);
    }
}
