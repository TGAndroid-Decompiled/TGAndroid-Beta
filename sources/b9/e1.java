package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.ArrayList;
import java.util.List;
public final class e1 extends r6.a {
    public static final Parcelable.Creator<e1> CREATOR = new o0(11);
    public final int f2996a;
    public final List f2997b;
    public final b1 f2998c;

    public e1(int i7, ArrayList arrayList, b1 b1Var) {
        this.f2996a = i7;
        this.f2997b = arrayList;
        this.f2998c = b1Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f2996a);
        bc.p(parcel, 2, this.f2997b);
        bc.k(parcel, 3, this.f2998c, i7);
        bc.s(parcel, r10);
    }
}
