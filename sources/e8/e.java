package e8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new e6.i(4);
    public final byte[] f8709a;

    public e(byte[] bArr) {
        this.f8709a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.c(parcel, 2, this.f8709a);
        g0.r(parcel, q6);
    }
}
