package n6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
public final class o extends o6.a {
    public static final Parcelable.Creator<o> CREATOR = new m8.h(11);
    public final int f17286a;
    public List f17287b;

    public o(int i10, List list) {
        this.f17286a = i10;
        this.f17287b = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.f17286a);
        w7.f0.p(parcel, 2, this.f17287b);
        w7.f0.r(parcel, q6);
    }
}
