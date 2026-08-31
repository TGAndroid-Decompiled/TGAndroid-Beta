package k8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import j8.t;
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new t(17);
    public String f10778a;
    public String f10779b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f10778a);
        g5.l(parcel, 3, this.f10779b);
        g5.r(parcel, q10);
    }
}
