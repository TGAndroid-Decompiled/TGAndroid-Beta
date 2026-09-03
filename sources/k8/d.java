package k8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import j8.t;
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new t(19);
    public int f10032a;
    public String f10033b;
    public double f10034c;
    public String d;
    public long e;
    public int f10035f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        int i11 = this.f10032a;
        f5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f5.l(parcel, 3, this.f10033b);
        double d = this.f10034c;
        f5.s(parcel, 4, 8);
        parcel.writeDouble(d);
        f5.l(parcel, 5, this.d);
        long j10 = this.e;
        f5.s(parcel, 6, 8);
        parcel.writeLong(j10);
        int i12 = this.f10035f;
        f5.s(parcel, 7, 4);
        parcel.writeInt(i12);
        f5.r(parcel, q10);
    }
}
