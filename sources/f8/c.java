package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new b9.e(24);
    public String f6169a;
    public String f6170b;
    public String f6171c;
    public String d;
    public String f6172e;
    public b f6173f;
    public b h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f6169a);
        g5.l(parcel, 3, this.f6170b);
        g5.l(parcel, 4, this.f6171c);
        g5.l(parcel, 5, this.d);
        g5.l(parcel, 6, this.f6172e);
        g5.k(parcel, 7, this.f6173f, i10);
        g5.k(parcel, 8, this.h, i10);
        g5.r(parcel, q10);
    }
}
