package e8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new e6.i(4);
    public final byte[] f8700a;

    public e(byte[] bArr) {
        this.f8700a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.c(parcel, 2, this.f8700a);
        c0.r(parcel, q6);
    }
}
