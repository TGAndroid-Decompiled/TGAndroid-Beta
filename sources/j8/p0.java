package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class p0 extends z5.a {
    public static final Parcelable.Creator<p0> CREATOR = new o0(1);

    public final String f12819a;

    public final String f12820b;

    public final long f12821c;

    public p0(long j10, String str, String str2) {
        this.f12819a = str;
        this.f12820b = str2;
        this.f12821c = j10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f12819a);
        r8.l(parcel, 3, this.f12820b);
        r8.s(parcel, 4, 8);
        parcel.writeLong(this.f12821c);
        r8.r(parcel, iQ);
    }
}
