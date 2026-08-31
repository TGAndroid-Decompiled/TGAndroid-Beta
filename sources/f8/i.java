package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class i extends c6.a {
    public static final Parcelable.Creator<i> CREATOR = new o(0);
    public int f6200a;
    public String f6201b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        int i11 = this.f6200a;
        g5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g5.l(parcel, 3, this.f6201b);
        g5.r(parcel, q10);
    }
}
