package o7;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import o5.p;
public final class e extends y5.a {
    public static final Parcelable.Creator<e> CREATOR = new p(3);
    public final byte[] f19013a;

    public e(byte[] bArr) {
        this.f19013a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.c(parcel, 2, this.f19013a);
        p8.r(parcel, q10);
    }
}
