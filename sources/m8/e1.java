package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.ArrayList;
import java.util.List;
public final class e1 extends c6.a {
    public static final Parcelable.Creator<e1> CREATOR = new o0(11);
    public final int f13518a;
    public final List f13519b;
    public final b1 f13520c;

    public e1(int i10, ArrayList arrayList, b1 b1Var) {
        this.f13518a = i10;
        this.f13519b = arrayList;
        this.f13520c = b1Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f13518a);
        g5.p(parcel, 2, this.f13519b);
        g5.k(parcel, 3, this.f13520c, i10);
        g5.r(parcel, q10);
    }
}
