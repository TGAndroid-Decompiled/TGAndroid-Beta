package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class o0 extends r6.a {
    public static final Parcelable.Creator<o0> CREATOR = new n0(1);
    public final String f3007a;
    public final String f3008b;
    public final long f3009c;

    public o0(long j3, String str, String str2) {
        this.f3007a = str;
        this.f3008b = str2;
        this.f3009c = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f3007a);
        cc.l(parcel, 3, this.f3008b);
        cc.q(parcel, 4, 8);
        parcel.writeLong(this.f3009c);
        cc.s(parcel, r10);
    }
}
