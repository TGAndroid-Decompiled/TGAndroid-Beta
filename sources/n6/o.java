package n6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
public final class o extends o6.a {
    public static final Parcelable.Creator<o> CREATOR = new m8.h(13);
    public final int f16609a;
    public List f16610b;

    public o(int i10, List list) {
        this.f16609a = i10;
        this.f16610b = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f16609a);
        w7.e0.p(parcel, 2, this.f16610b);
        w7.e0.r(parcel, q6);
    }
}
