package g8;

import android.os.Parcel;
import android.os.Parcelable;
import f8.r;
import g7.p8;
public final class d extends y5.a {
    public static final Parcelable.Creator<d> CREATOR = new r(23);
    public int f7431a;
    public String f7432b;
    public double f7433c;
    public String d;
    public long f7434e;
    public int f7435f;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        int i10 = this.f7431a;
        p8.s(parcel, 2, 4);
        parcel.writeInt(i10);
        p8.l(parcel, 3, this.f7432b);
        double d = this.f7433c;
        p8.s(parcel, 4, 8);
        parcel.writeDouble(d);
        p8.l(parcel, 5, this.d);
        long j10 = this.f7434e;
        p8.s(parcel, 6, 8);
        parcel.writeLong(j10);
        int i11 = this.f7435f;
        p8.s(parcel, 7, 4);
        parcel.writeInt(i11);
        p8.r(parcel, q10);
    }
}
