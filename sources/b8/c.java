package b8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class c extends y5.a {
    public static final Parcelable.Creator<c> CREATOR = new w.a(21);
    public String f1603a;
    public String f1604b;
    public String f1605c;
    public String d;
    public String f1606e;
    public b f1607f;
    public b h;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f1603a);
        p8.l(parcel, 3, this.f1604b);
        p8.l(parcel, 4, this.f1605c);
        p8.l(parcel, 5, this.d);
        p8.l(parcel, 6, this.f1606e);
        p8.k(parcel, 7, this.f1607f, i9);
        p8.k(parcel, 8, this.h, i9);
        p8.r(parcel, q10);
    }
}
