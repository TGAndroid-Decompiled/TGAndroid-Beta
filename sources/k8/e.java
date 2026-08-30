package k8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import j8.t;
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new t(21);
    public String f10056a;
    public String f10057b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f10056a);
        f5.l(parcel, 3, this.f10057b);
        f5.r(parcel, q10);
    }
}
