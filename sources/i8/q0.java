package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class q0 extends y5.a {
    public static final Parcelable.Creator<q0> CREATOR = new p0(1);
    public final String f11024a;
    public final String f11025b;
    public final long f11026c;

    public q0(long j10, String str, String str2) {
        this.f11024a = str;
        this.f11025b = str2;
        this.f11026c = j10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f11024a);
        p8.l(parcel, 3, this.f11025b);
        p8.s(parcel, 4, 8);
        parcel.writeLong(this.f11026c);
        p8.r(parcel, q10);
    }
}
