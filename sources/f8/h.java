package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new b9.e(27);
    public String f6195a;
    public String f6196b;
    public String f6197c;
    public String d;
    public String f6198e;
    public String f6199f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f6195a);
        g5.l(parcel, 3, this.f6196b);
        g5.l(parcel, 4, this.f6197c);
        g5.l(parcel, 5, this.d);
        g5.l(parcel, 6, this.f6198e);
        g5.l(parcel, 7, this.f6199f);
        g5.l(parcel, 8, this.h);
        g5.r(parcel, q10);
    }
}
