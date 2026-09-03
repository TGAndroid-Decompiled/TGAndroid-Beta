package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class i extends c6.a {
    public static final Parcelable.Creator<i> CREATOR = new o(0);
    public int f6071a;
    public String f6072b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        int i11 = this.f6071a;
        f5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f5.l(parcel, 3, this.f6072b);
        f5.r(parcel, q10);
    }
}
