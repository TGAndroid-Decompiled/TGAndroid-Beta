package e8;

import android.os.Parcel;
import android.os.Parcelable;
import e6.p;
import w7.h0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new p(3);
    public final byte[] f6315a;

    public e(byte[] bArr) {
        this.f6315a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.c(parcel, 2, this.f6315a);
        h0.r(parcel, q6);
    }
}
