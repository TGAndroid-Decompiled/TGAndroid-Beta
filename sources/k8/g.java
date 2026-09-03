package k8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import j8.t;
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new t(23);
    public String f10040a;
    public String f10041b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f10040a);
        f5.l(parcel, 3, this.f10041b);
        f5.r(parcel, q10);
    }
}
