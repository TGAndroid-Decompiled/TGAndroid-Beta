package g8;

import android.os.Parcel;
import android.os.Parcelable;
import f8.r;
import g7.p8;
public final class c extends y5.a {
    public static final Parcelable.Creator<c> CREATOR = new r(24);
    public String f7428a;
    public d f7429b;
    public f f7430c;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f7428a);
        p8.k(parcel, 3, this.f7429b, i9);
        p8.k(parcel, 5, this.f7430c, i9);
        p8.r(parcel, q10);
    }
}
