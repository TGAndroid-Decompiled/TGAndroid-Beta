package n6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
public final class o extends o6.a {
    public static final Parcelable.Creator<o> CREATOR = new m8.h(13);
    public final int f13903a;
    public List f13904b;

    public o(int i10, List list) {
        this.f13903a = i10;
        this.f13904b = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f13903a);
        w7.e0.p(parcel, 2, this.f13904b);
        w7.e0.r(parcel, q6);
    }
}
