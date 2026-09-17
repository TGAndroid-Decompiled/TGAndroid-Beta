package e8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new e6.i(4);
    public final byte[] f8908a;

    public e(byte[] bArr) {
        this.f8908a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.c(parcel, 2, this.f8908a);
        e0.r(parcel, q6);
    }
}
