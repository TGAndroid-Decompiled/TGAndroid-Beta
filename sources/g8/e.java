package g8;

import android.os.Parcel;
import android.os.Parcelable;
import f8.r;
import g7.p8;
public final class e extends y5.a {
    public static final Parcelable.Creator<e> CREATOR = new r(25);
    public String f7436a;
    public String f7437b;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f7436a);
        p8.l(parcel, 3, this.f7437b);
        p8.r(parcel, q10);
    }
}
