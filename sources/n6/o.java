package n6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
public final class o extends o6.a {
    public static final Parcelable.Creator<o> CREATOR = new m8.h(13);
    public final int f15317a;
    public List f15318b;

    public o(int i10, List list) {
        this.f15317a = i10;
        this.f15318b = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.f15317a);
        w7.f0.p(parcel, 2, this.f15318b);
        w7.f0.r(parcel, q6);
    }
}
