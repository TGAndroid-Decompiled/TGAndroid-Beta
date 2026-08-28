package g8;

import android.os.Parcel;
import android.os.Parcelable;
import f8.r;
import g7.p8;
import java.util.ArrayList;
public final class b extends y5.a {
    public static final Parcelable.Creator<b> CREATOR = new r(22);
    public String f7425a;
    public String f7426b;
    public ArrayList f7427c;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f7425a);
        p8.l(parcel, 3, this.f7426b);
        p8.p(parcel, 4, this.f7427c);
        p8.r(parcel, q10);
    }
}
