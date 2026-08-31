package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class k extends c6.a {
    public static final Parcelable.Creator<k> CREATOR = new f8.o(25);
    public int f9913a;
    public String f9914b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        int i11 = this.f9913a;
        g5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g5.l(parcel, 3, this.f9914b);
        g5.r(parcel, q10);
    }
}
