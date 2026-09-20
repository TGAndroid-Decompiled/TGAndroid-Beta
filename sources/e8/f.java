package e8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new e6.i(5);
    public final byte[] f8046a;

    public f(byte[] bArr) {
        this.f8046a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.c(parcel, 1, this.f8046a);
        f0.r(parcel, q6);
    }
}
