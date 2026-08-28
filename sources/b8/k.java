package b8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class k extends y5.a {
    public static final Parcelable.Creator<k> CREATOR = new w.a(29);
    public String f1638a;
    public String f1639b;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f1638a);
        p8.l(parcel, 3, this.f1639b);
        p8.r(parcel, q10);
    }
}
