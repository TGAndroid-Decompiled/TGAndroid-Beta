package f8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class k extends y5.a {
    public static final Parcelable.Creator<k> CREATOR = new c.c(29);
    public int f5958a;
    public String f5959b;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        int i10 = this.f5958a;
        p8.s(parcel, 2, 4);
        parcel.writeInt(i10);
        p8.l(parcel, 3, this.f5959b);
        p8.r(parcel, q10);
    }
}
