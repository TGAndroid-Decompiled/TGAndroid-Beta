package f8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.ArrayList;
public final class m extends y5.a {
    public static final Parcelable.Creator<m> CREATOR = new r(2);
    public ArrayList f5962a;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.n(parcel, 1, this.f5962a);
        p8.r(parcel, q10);
    }
}
