package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.ArrayList;
import java.util.List;
public final class e1 extends r6.a {
    public static final Parcelable.Creator<e1> CREATOR = new o0(11);
    public final int f3001a;
    public final List f3002b;
    public final b1 f3003c;

    public e1(int i7, ArrayList arrayList, b1 b1Var) {
        this.f3001a = i7;
        this.f3002b = arrayList;
        this.f3003c = b1Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f3001a);
        yb.p(parcel, 2, this.f3002b);
        yb.k(parcel, 3, this.f3003c, i7);
        yb.s(parcel, r10);
    }
}
