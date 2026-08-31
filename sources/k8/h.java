package k8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import j8.t;
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new t(24);
    public String f10797a;
    public String f10798b;
    public f f10799c;
    public g d;
    public g f10800e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f10797a);
        g5.l(parcel, 3, this.f10798b);
        g5.k(parcel, 4, this.f10799c, i10);
        g5.k(parcel, 5, this.d, i10);
        g5.k(parcel, 6, this.f10800e, i10);
        g5.r(parcel, q10);
    }
}
