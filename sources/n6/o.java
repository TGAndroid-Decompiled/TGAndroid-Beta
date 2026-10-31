package n6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
public final class o extends o6.a {
    public static final Parcelable.Creator<o> CREATOR = new m8.i(10);
    public final int f13624a;
    public List f13625b;

    public o(int i10, List list) {
        this.f13624a = i10;
        this.f13625b = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 1, 4);
        parcel.writeInt(this.f13624a);
        w7.h0.p(parcel, 2, this.f13625b);
        w7.h0.r(parcel, q6);
    }
}
