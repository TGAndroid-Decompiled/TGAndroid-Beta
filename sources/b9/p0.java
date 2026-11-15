package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class p0 extends r6.a {
    public static final Parcelable.Creator<p0> CREATOR = new o0(1);
    public final String f3044a;
    public final String f3045b;
    public final long f3046c;

    public p0(long j3, String str, String str2) {
        this.f3044a = str;
        this.f3045b = str2;
        this.f3046c = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f3044a);
        yb.l(parcel, 3, this.f3045b);
        yb.q(parcel, 4, 8);
        parcel.writeLong(this.f3046c);
        yb.s(parcel, r10);
    }
}
