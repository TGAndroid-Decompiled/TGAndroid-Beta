package n6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
public final class p extends o6.a {
    public static final Parcelable.Creator<p> CREATOR = new m8.h(11);
    public final int f16133a;
    public List f16134b;

    public p(int i10, List list) {
        this.f16133a = i10;
        this.f16134b = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 4);
        parcel.writeInt(this.f16133a);
        w7.g0.p(parcel, 2, this.f16134b);
        w7.g0.r(parcel, q6);
    }
}
