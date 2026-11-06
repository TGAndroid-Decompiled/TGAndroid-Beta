package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.ArrayList;
import java.util.List;
public final class d1 extends r6.a {
    public static final Parcelable.Creator<d1> CREATOR = new n0(11);
    public final int f3037a;
    public final List f3038b;
    public final a1 f3039c;

    public d1(int i7, ArrayList arrayList, a1 a1Var) {
        this.f3037a = i7;
        this.f3038b = arrayList;
        this.f3039c = a1Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f3037a);
        xb.p(parcel, 2, this.f3038b);
        xb.k(parcel, 3, this.f3039c, i7);
        xb.s(parcel, r10);
    }
}
