package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class o0 extends r6.a {
    public static final Parcelable.Creator<o0> CREATOR = new n0(1);
    public final String f3084a;
    public final String f3085b;
    public final long f3086c;

    public o0(long j3, String str, String str2) {
        this.f3084a = str;
        this.f3085b = str2;
        this.f3086c = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f3084a);
        xb.l(parcel, 3, this.f3085b);
        xb.q(parcel, 4, 8);
        parcel.writeLong(this.f3086c);
        xb.s(parcel, r10);
    }
}
