package n6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
public final class p extends o6.a {
    public static final Parcelable.Creator<p> CREATOR = new m8.h(13);
    public final int f16749a;
    public List f16750b;

    public p(int i10, List list) {
        this.f16749a = i10;
        this.f16750b = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 1, 4);
        parcel.writeInt(this.f16749a);
        w7.d0.p(parcel, 2, this.f16750b);
        w7.d0.r(parcel, q6);
    }
}
