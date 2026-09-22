package e8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new e6.i(4);
    public final byte[] f8044a;

    public e(byte[] bArr) {
        this.f8044a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.c(parcel, 2, this.f8044a);
        f0.r(parcel, q6);
    }
}
