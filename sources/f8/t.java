package f8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class t extends y5.a {
    public static final Parcelable.Creator<t> CREATOR = new r(4);
    public String f5982a;
    public Bundle f5983b;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f5982a);
        p8.b(parcel, 3, this.f5983b);
        p8.r(parcel, q10);
    }
}
