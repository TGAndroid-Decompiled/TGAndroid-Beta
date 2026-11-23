package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class p0 extends r6.a {
    public static final Parcelable.Creator<p0> CREATOR = new o0(1);
    public final String f3061a;
    public final String f3062b;
    public final long f3063c;

    public p0(long j3, String str, String str2) {
        this.f3061a = str;
        this.f3062b = str2;
        this.f3063c = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f3061a);
        bc.l(parcel, 3, this.f3062b);
        bc.q(parcel, 4, 8);
        parcel.writeLong(this.f3063c);
        bc.s(parcel, r10);
    }
}
