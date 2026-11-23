package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.ArrayList;
import java.util.List;
public final class d1 extends r6.a {
    public static final Parcelable.Creator<d1> CREATOR = new n0(11);
    public final int f2960a;
    public final List f2961b;
    public final a1 f2962c;

    public d1(int i7, ArrayList arrayList, a1 a1Var) {
        this.f2960a = i7;
        this.f2961b = arrayList;
        this.f2962c = a1Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f2960a);
        cc.p(parcel, 2, this.f2961b);
        cc.k(parcel, 3, this.f2962c, i7);
        cc.s(parcel, r10);
    }
}
