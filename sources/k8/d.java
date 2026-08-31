package k8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import j8.t;
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new t(19);
    public int f10786a;
    public String f10787b;
    public double f10788c;
    public String d;
    public long f10789e;
    public int f10790f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        int i11 = this.f10786a;
        g5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g5.l(parcel, 3, this.f10787b);
        double d = this.f10788c;
        g5.s(parcel, 4, 8);
        parcel.writeDouble(d);
        g5.l(parcel, 5, this.d);
        long j10 = this.f10789e;
        g5.s(parcel, 6, 8);
        parcel.writeLong(j10);
        int i12 = this.f10790f;
        g5.s(parcel, 7, 4);
        parcel.writeInt(i12);
        g5.r(parcel, q10);
    }
}
