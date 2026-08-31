package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new t(5);
    public String f9876a;
    public String f9877b;
    public int f9878c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f9876a);
        g5.l(parcel, 3, this.f9877b);
        int i11 = this.f9878c;
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            i11 = 0;
        }
        g5.s(parcel, 4, 4);
        parcel.writeInt(i11);
        g5.r(parcel, q10);
    }
}
