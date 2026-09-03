package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class l extends c6.a {
    public static final Parcelable.Creator<l> CREATOR = new o(1);
    public String f6077a;
    public String f6078b;
    public int f6079c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f6077a);
        f5.l(parcel, 3, this.f6078b);
        int i11 = this.f6079c;
        f5.s(parcel, 4, 4);
        parcel.writeInt(i11);
        f5.r(parcel, q10);
    }
}
