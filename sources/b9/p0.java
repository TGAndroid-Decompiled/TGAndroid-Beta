package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class p0 extends r6.a {
    public static final Parcelable.Creator<p0> CREATOR = new o0(1);
    public final String f3042a;
    public final String f3043b;
    public final long f3044c;

    public p0(long j3, String str, String str2) {
        this.f3042a = str;
        this.f3043b = str2;
        this.f3044c = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f3042a);
        bc.l(parcel, 3, this.f3043b);
        bc.q(parcel, 4, 8);
        parcel.writeLong(this.f3044c);
        bc.s(parcel, r10);
    }
}
