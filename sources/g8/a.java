package g8;

import android.os.Parcel;
import android.os.Parcelable;
import f8.r;
import g7.p8;
public final class a extends y5.a {
    public static final Parcelable.Creator<a> CREATOR = new r(21);
    public String f7423a;
    public String f7424b;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f7423a);
        p8.l(parcel, 3, this.f7424b);
        p8.r(parcel, q10);
    }
}
