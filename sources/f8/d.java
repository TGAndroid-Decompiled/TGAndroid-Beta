package f8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class d extends y5.a {
    public static final Parcelable.Creator<d> CREATOR = new r(9);
    public String f5921a;
    public String f5922b;
    public int f5923c;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f5921a);
        p8.l(parcel, 3, this.f5922b);
        int i10 = this.f5923c;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            i10 = 0;
        }
        p8.s(parcel, 4, 4);
        parcel.writeInt(i10);
        p8.r(parcel, q10);
    }
}
