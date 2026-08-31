package k8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import j8.t;
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new t(21);
    public String f10791a;
    public String f10792b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f10791a);
        g5.l(parcel, 3, this.f10792b);
        g5.r(parcel, q10);
    }
}
