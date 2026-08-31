package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class p0 extends c6.a {
    public static final Parcelable.Creator<p0> CREATOR = new o0(1);
    public final String f13558a;
    public final String f13559b;
    public final long f13560c;

    public p0(long j10, String str, String str2) {
        this.f13558a = str;
        this.f13559b = str2;
        this.f13560c = j10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f13558a);
        g5.l(parcel, 3, this.f13559b);
        g5.s(parcel, 4, 8);
        parcel.writeLong(this.f13560c);
        g5.r(parcel, q10);
    }
}
