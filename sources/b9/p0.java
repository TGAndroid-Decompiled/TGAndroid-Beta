package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class p0 extends r6.a {
    public static final Parcelable.Creator<p0> CREATOR = new o0(1);
    public final String f3012a;
    public final String f3013b;
    public final long f3014c;

    public p0(long j3, String str, String str2) {
        this.f3012a = str;
        this.f3013b = str2;
        this.f3014c = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f3012a);
        cc.l(parcel, 3, this.f3013b);
        cc.q(parcel, 4, 8);
        parcel.writeLong(this.f3014c);
        cc.s(parcel, r10);
    }
}
