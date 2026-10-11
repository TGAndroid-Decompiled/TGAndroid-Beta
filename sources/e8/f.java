package e8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new e6.i(5);
    public final byte[] f8703a;

    public f(byte[] bArr) {
        this.f8703a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.c(parcel, 1, this.f8703a);
        d0.r(parcel, q6);
    }
}
