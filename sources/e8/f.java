package e8;

import android.os.Parcel;
import android.os.Parcelable;
import e6.p;
import w7.h0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new p(4);
    public final byte[] f6316a;

    public f(byte[] bArr) {
        this.f6316a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.c(parcel, 1, this.f6316a);
        h0.r(parcel, q6);
    }
}
