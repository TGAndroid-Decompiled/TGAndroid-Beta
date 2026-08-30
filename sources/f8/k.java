package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class k extends c6.a {
    public static final Parcelable.Creator<k> CREATOR = new o(2);
    public String f6086a;
    public String f6087b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f6086a);
        f5.l(parcel, 3, this.f6087b);
        f5.r(parcel, q10);
    }
}
