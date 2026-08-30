package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class p0 extends c6.a {
    public static final Parcelable.Creator<p0> CREATOR = new o0(1);
    public final String f13842a;
    public final String f13843b;
    public final long f13844c;

    public p0(long j10, String str, String str2) {
        this.f13842a = str;
        this.f13843b = str2;
        this.f13844c = j10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f13842a);
        f5.l(parcel, 3, this.f13843b);
        f5.s(parcel, 4, 8);
        parcel.writeLong(this.f13844c);
        f5.r(parcel, q10);
    }
}
