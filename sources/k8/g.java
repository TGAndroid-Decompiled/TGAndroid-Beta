package k8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import j8.t;
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new t(23);
    public String f10795a;
    public String f10796b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f10795a);
        g5.l(parcel, 3, this.f10796b);
        g5.r(parcel, q10);
    }
}
