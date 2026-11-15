package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.ArrayList;
import java.util.List;
public final class e1 extends r6.a {
    public static final Parcelable.Creator<e1> CREATOR = new o0(11);
    public final int f2998a;
    public final List f2999b;
    public final b1 f3000c;

    public e1(int i7, ArrayList arrayList, b1 b1Var) {
        this.f2998a = i7;
        this.f2999b = arrayList;
        this.f3000c = b1Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f2998a);
        yb.p(parcel, 2, this.f2999b);
        yb.k(parcel, 3, this.f3000c, i7);
        yb.s(parcel, r10);
    }
}
