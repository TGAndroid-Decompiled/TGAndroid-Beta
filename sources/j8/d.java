package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new t(5);
    public String f9232a;
    public String f9233b;
    public int f9234c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f9232a);
        f5.l(parcel, 3, this.f9233b);
        int i11 = this.f9234c;
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            i11 = 0;
        }
        f5.s(parcel, 4, 4);
        parcel.writeInt(i11);
        f5.r(parcel, q10);
    }
}
