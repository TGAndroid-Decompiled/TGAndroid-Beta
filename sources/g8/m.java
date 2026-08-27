package g8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.ArrayList;

public final class m extends z5.a {
    public static final Parcelable.Creator<m> CREATOR = new f4.e(15);

    public ArrayList f6763a;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.n(parcel, 1, this.f6763a);
        r8.r(parcel, iQ);
    }
}
