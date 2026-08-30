package k8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import j8.t;
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new t(19);
    public int f10052a;
    public String f10053b;
    public double f10054c;
    public String d;
    public long e;
    public int f10055f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        int i11 = this.f10052a;
        f5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f5.l(parcel, 3, this.f10053b);
        double d = this.f10054c;
        f5.s(parcel, 4, 8);
        parcel.writeDouble(d);
        f5.l(parcel, 5, this.d);
        long j10 = this.e;
        f5.s(parcel, 6, 8);
        parcel.writeLong(j10);
        int i12 = this.f10055f;
        f5.s(parcel, 7, 4);
        parcel.writeInt(i12);
        f5.r(parcel, q10);
    }
}
