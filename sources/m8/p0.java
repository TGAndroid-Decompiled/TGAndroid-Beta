package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class p0 extends c6.a {
    public static final Parcelable.Creator<p0> CREATOR = new o0(1);
    public final String f13560a;
    public final String f13561b;
    public final long f13562c;

    public p0(long j10, String str, String str2) {
        this.f13560a = str;
        this.f13561b = str2;
        this.f13562c = j10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f13560a);
        g5.l(parcel, 3, this.f13561b);
        g5.s(parcel, 4, 8);
        parcel.writeLong(this.f13562c);
        g5.r(parcel, q10);
    }
}
