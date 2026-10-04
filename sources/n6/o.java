package n6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
public final class o extends o6.a {
    public static final Parcelable.Creator<o> CREATOR = new m8.h(13);
    public final int f16725a;
    public List f16726b;

    public o(int i10, List list) {
        this.f16725a = i10;
        this.f16726b = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 4);
        parcel.writeInt(this.f16725a);
        w7.g0.p(parcel, 2, this.f16726b);
        w7.g0.r(parcel, q6);
    }
}
