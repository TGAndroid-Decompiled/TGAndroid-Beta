package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class f extends c6.a {
    public static final Parcelable.Creator<f> CREATOR = new b9.e(25);
    public int f6062a;
    public String f6063b;
    public String f6064c;
    public String d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        int i11 = this.f6062a;
        f5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f5.l(parcel, 3, this.f6063b);
        f5.l(parcel, 4, this.f6064c);
        f5.l(parcel, 5, this.d);
        f5.r(parcel, q10);
    }
}
