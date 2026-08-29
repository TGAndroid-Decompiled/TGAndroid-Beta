package k8;

import android.os.Parcel;
import android.os.Parcelable;
public final class q0 extends a6.a {
    public static final Parcelable.Creator<q0> CREATOR = new p0(1);
    public final String f13547a;
    public final String f13548b;
    public final long f13549c;

    public q0(long j10, String str, String str2) {
        this.f13547a = str;
        this.f13548b = str2;
        this.f13549c = j10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.f13547a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f13548b);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 8);
        parcel.writeLong(this.f13549c);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
