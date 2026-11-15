package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.ArrayList;
import java.util.List;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new c(10);
    public final int f3033a;
    public final List f3034b;

    public m(int i7, ArrayList arrayList) {
        this.f3033a = i7;
        this.f3034b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3033a);
        yb.p(parcel, 3, this.f3034b);
        yb.s(parcel, r10);
    }
}
