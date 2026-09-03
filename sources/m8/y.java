package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.ArrayList;
import java.util.List;
public final class y extends c6.a {
    public static final Parcelable.Creator<y> CREATOR = new c(20);
    public final int f13596a;
    public final List f13597b;

    public y(int i10, ArrayList arrayList) {
        this.f13596a = i10;
        this.f13597b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13596a);
        g5.p(parcel, 3, this.f13597b);
        g5.r(parcel, q10);
    }
}
