package a9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class d1 extends q6.a {
    public static final Parcelable.Creator<d1> CREATOR = new n0(11);
    public final int f184a;
    public final List f185b;
    public final a1 f186c;

    public d1(int i3, ArrayList arrayList, a1 a1Var) {
        this.f184a = i3;
        this.f185b = arrayList;
        this.f186c = a1Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f184a);
        j8.a.q(parcel, 2, this.f185b);
        j8.a.l(parcel, 3, this.f186c, i3);
        j8.a.t(parcel, s6);
    }
}
