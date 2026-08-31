package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.ArrayList;
public final class m extends c6.a {
    public static final Parcelable.Creator<m> CREATOR = new f8.o(28);
    public ArrayList f9917a;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.n(parcel, 1, this.f9917a);
        g5.r(parcel, q10);
    }
}
