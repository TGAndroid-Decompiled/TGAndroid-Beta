package n6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
public final class o extends o6.a {
    public static final Parcelable.Creator<o> CREATOR = new m8.h(13);
    public final int f15048a;
    public List f15049b;

    public o(int i10, List list) {
        this.f15048a = i10;
        this.f15049b = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f15048a);
        w7.e0.p(parcel, 2, this.f15049b);
        w7.e0.r(parcel, q6);
    }
}
