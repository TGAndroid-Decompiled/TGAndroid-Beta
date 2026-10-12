package n6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
public final class p extends o6.a {
    public static final Parcelable.Creator<p> CREATOR = new m8.h(13);
    public final int f16453a;
    public List f16454b;

    public p(int i10, List list) {
        this.f16453a = i10;
        this.f16454b = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 1, 4);
        parcel.writeInt(this.f16453a);
        w7.c0.p(parcel, 2, this.f16454b);
        w7.c0.r(parcel, q6);
    }
}
