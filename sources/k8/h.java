package k8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import j8.t;
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new t(24);
    public String f10042a;
    public String f10043b;
    public f f10044c;
    public g d;
    public g e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f10042a);
        f5.l(parcel, 3, this.f10043b);
        f5.k(parcel, 4, this.f10044c, i10);
        f5.k(parcel, 5, this.d, i10);
        f5.k(parcel, 6, this.e, i10);
        f5.r(parcel, q10);
    }
}
