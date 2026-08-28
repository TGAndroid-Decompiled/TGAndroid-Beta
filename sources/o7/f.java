package o7;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import o5.p;
public final class f extends y5.a {
    public static final Parcelable.Creator<f> CREATOR = new p(4);
    public final byte[] f19014a;

    public f(byte[] bArr) {
        this.f19014a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.c(parcel, 1, this.f19014a);
        p8.r(parcel, q10);
    }
}
