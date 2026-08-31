package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class f extends c6.a {
    public static final Parcelable.Creator<f> CREATOR = new b9.e(25);
    public int f6190a;
    public String f6191b;
    public String f6192c;
    public String d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        int i11 = this.f6190a;
        g5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g5.l(parcel, 3, this.f6191b);
        g5.l(parcel, 4, this.f6192c);
        g5.l(parcel, 5, this.d);
        g5.r(parcel, q10);
    }
}
