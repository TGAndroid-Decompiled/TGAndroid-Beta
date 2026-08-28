package g8;

import android.os.Parcel;
import android.os.Parcelable;
import f8.r;
import g7.p8;
public final class h extends y5.a {
    public static final Parcelable.Creator<h> CREATOR = new r(28);
    public String f7442a;
    public String f7443b;
    public f f7444c;
    public g d;
    public g f7445e;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f7442a);
        p8.l(parcel, 3, this.f7443b);
        p8.k(parcel, 4, this.f7444c, i9);
        p8.k(parcel, 5, this.d, i9);
        p8.k(parcel, 6, this.f7445e, i9);
        p8.r(parcel, q10);
    }
}
