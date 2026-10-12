package e8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new e6.i(5);
    public final byte[] f8701a;

    public f(byte[] bArr) {
        this.f8701a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.c(parcel, 1, this.f8701a);
        c0.r(parcel, q6);
    }
}
