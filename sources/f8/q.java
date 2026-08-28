package f8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class q extends y5.a {
    public static final Parcelable.Creator<q> CREATOR = new r(5);
    public String f5970a;
    public String f5971b;
    public String f5972c;
    public String d;
    public String f5973e;
    public String f5974f;
    public String h;
    public String f5975n;
    public String f5976r;
    public boolean f5977s;
    public String v;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f5970a);
        p8.l(parcel, 3, this.f5971b);
        p8.l(parcel, 4, this.f5972c);
        p8.l(parcel, 5, this.d);
        p8.l(parcel, 6, this.f5973e);
        p8.l(parcel, 7, this.f5974f);
        p8.l(parcel, 8, this.h);
        p8.l(parcel, 9, this.f5975n);
        p8.l(parcel, 10, this.f5976r);
        boolean z10 = this.f5977s;
        p8.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        p8.l(parcel, 12, this.v);
        p8.r(parcel, q10);
    }
}
