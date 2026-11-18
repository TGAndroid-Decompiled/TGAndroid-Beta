package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class p0 extends r6.a {
    public static final Parcelable.Creator<p0> CREATOR = new o0(1);
    public final String f3041a;
    public final String f3042b;
    public final long f3043c;

    public p0(long j3, String str, String str2) {
        this.f3041a = str;
        this.f3042b = str2;
        this.f3043c = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f3041a);
        bc.l(parcel, 3, this.f3042b);
        bc.q(parcel, 4, 8);
        parcel.writeLong(this.f3043c);
        bc.s(parcel, r10);
    }
}
