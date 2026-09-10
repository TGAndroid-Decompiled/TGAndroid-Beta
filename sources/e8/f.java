package e8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new e6.i(5);
    public final byte[] f7346a;

    public f(byte[] bArr) {
        this.f7346a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.c(parcel, 1, this.f7346a);
        e0.r(parcel, q6);
    }
}
