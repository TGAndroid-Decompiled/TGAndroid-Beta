package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class k extends c6.a {
    public static final Parcelable.Creator<k> CREATOR = new o(2);
    public String f6075a;
    public String f6076b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f6075a);
        f5.l(parcel, 3, this.f6076b);
        f5.r(parcel, q10);
    }
}
