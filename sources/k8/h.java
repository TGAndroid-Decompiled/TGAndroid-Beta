package k8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import j8.t;
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new t(24);
    public String f10062a;
    public String f10063b;
    public f f10064c;
    public g d;
    public g e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f10062a);
        f5.l(parcel, 3, this.f10063b);
        f5.k(parcel, 4, this.f10064c, i10);
        f5.k(parcel, 5, this.d, i10);
        f5.k(parcel, 6, this.e, i10);
        f5.r(parcel, q10);
    }
}
