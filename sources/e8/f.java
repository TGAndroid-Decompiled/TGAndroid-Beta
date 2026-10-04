package e8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new e6.i(5);
    public final byte[] f8710a;

    public f(byte[] bArr) {
        this.f8710a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.c(parcel, 1, this.f8710a);
        g0.r(parcel, q6);
    }
}
