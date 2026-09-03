package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class j extends c6.a {
    public static final Parcelable.Creator<j> CREATOR = new b9.e(29);
    public String f6073a;
    public String f6074b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f6073a);
        f5.l(parcel, 3, this.f6074b);
        f5.r(parcel, q10);
    }
}
